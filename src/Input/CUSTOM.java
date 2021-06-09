package Input;

import Rules.Board;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CUSTOM extends Gates {
    private int l = 0;
    private String[][] dane = new String[4][4];
    private Gates[] g;

    public CUSTOM(String path) throws FileNotFoundException {

        Scanner s = new Scanner(new File(path));
        while(s.hasNext()) {
            if (l == dane.length) {
                dane = resize(dane);
            }
            dane[l++] = s.nextLine().split(" ");
            for (int i = 0; i < dane.length; i++) {
                for(int j = 0; j < dane[i].length; j++) {
                    try {
                        dane[i][j] = dane[i][j].replace(":", "");
                        dane[i][j] = dane[i][j].replace(",", "");
                    } catch (Exception ignored) {

                    }
                }
            }
        }
        g = new Gates[l];
        for(int i=0; i<l; i++) {
            switch (dane[i][0]){
                case "Diode":
                    if(dane[i][3].equals("Normal")) {
                        g[i] = new DIODE();
                    } else {
                        g[i] = new DIODEREV();
                    }
                    break;
                case "ElectronHead":
                    g[i] = new HEAD();
                    break;
                case "ElectronTail":
                    g[i] = new TAIL();
                    break;
                case "Conductor":
                    g[i] = new CONDUCTOR();
                    break;
                case "AND":
                    g[i] = new AND();
                    break;
                case "OR":
                    g[i] = new OR();
                    break;
                case "NOT":
                    g[i] = new NOT();
                    break;
                case "XOR":
                    g[i] = new XOR();
                    break;
            }
        }
    }

    private String[][] resize(String[][] tab) {
        String[][] temp = new String[tab.length * 2][4];
        for(int i=0; i<tab.length; i++) {
            for(int j=0; j<tab[i].length; j++) {
                temp[i][j] = tab[i][j];
            }
        }
        return temp;
    }

    @Override
    public void fileToTable(Board b) {
        int x, y, len = g.length;
        for(int i=0; i<len; i++) {
            x = Integer.parseInt(dane[i][2]);
            y = Integer.parseInt(dane[i][1]);
            if((dane[i][0].equals("ElectronHead") || dane[i][0].equals("ElectronTail")) && b.getPixel(x, y).getStan() == 0) {
                Gates[] temp = new Gates[g.length + 1];
                for(int j=0; j<g.length; j++) {
                    temp[j] = g[j];
                }
                temp[g.length] = new CONDUCTOR();
                g = temp;
                if (l == dane.length) {
                    dane = resize(dane);
                }
                dane[l++] = new String[]{"Conductor",dane[i][1], dane[i][2], };
            }
            g[i].fileToTable(b, x, y);
        }
    }

    @Override
    public void fileToTable(Board b, int x, int y) {
        //NEVER USED
    }

    public String[][] getDane() {
        return dane;
    }
}