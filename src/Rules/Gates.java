package Rules;

import Cell.Pixel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gates {
    private String[][] dane = new String[4][4];
    private int l = 0;

    public Gates(String path) throws FileNotFoundException {
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

    public void fileToTable(Board b) {
        for(int i=0; i<l; i++) {
            switch (dane[i][0]) {
                case "Diode":
                    int parsedj = Integer.parseInt(dane[i][2]);
                    int parsedk = Integer.parseInt(dane[i][1]);
                    for (int j = parsedj - 1; j <= parsedj + 1; j++) {
                        for (int k = parsedk; k <= parsedk + 14; k++) {
                            try {
                                if ((j == parsedj - 1 || j == parsedj + 1) && (k == parsedk + 6 || k == parsedk + 7)) {
                                    b.setPixel(j, k, 3);
                                } else if (j == parsedj && (k != parsedk + 6 && k != parsedk + 7)) {
                                    b.setPixel(j, k, 3);
                                } else if (j == parsedj && k == parsedk + 6 && dane[i][3].equals("Normal")) {
                                    b.setPixel(j, k, 3);
                                } else if (j == parsedj && k == parsedk + 7 && dane[i][3].equals("Reversed")) {
                                    b.setPixel(j, k, 3);
                                }
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println(j + " " + k + " są poza zakresem");
                            }
                        }
                    }
                    break;
                case "ElectronHead":
                    b.setPixel(Integer.parseInt(dane[i][2]), Integer.parseInt(dane[i][1]), 1);
                    break;
                case "ElectronTail":
                    b.setPixel(Integer.parseInt(dane[i][2]), Integer.parseInt(dane[i][1]), 2);
                    break;
            }
        }
    }
}
