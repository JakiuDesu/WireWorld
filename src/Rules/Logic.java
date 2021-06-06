package Rules;

import Cell.Pixel;

import java.io.FileNotFoundException;

public class Logic {

    public static void run(String[] args) throws FileNotFoundException {
        Board b = new Board( Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[0]);
        Pixel[][][] history = new Pixel[ Integer.parseInt(args[3]) + 1 ][ Integer.parseInt(args[1]) ][ Integer.parseInt(args[2]) ];
        for(int i=0; i<Integer.parseInt(args[3])+1; i++) {
            for(int j=0; j<Integer.parseInt(args[1]); j++) {
                for(int k=0; k<Integer.parseInt(args[2]); k++) {
                    history[i][j][k] = new Pixel(0);
                }
            }
        }
        int iter = 0;
        char[] znaki = {'_', 'H', 'T', '#'};
        for(int i = 0; i < history[0].length; i++) {
            for(int j = 0; j < history[0][i].length; j++) {
                history[0][i][j].setStan(b.getPixel(i,j).getStan());
            }
        }
        for(int k = 0; k < Integer.parseInt(args[3]); k++) {
            b.update();
            iter++;
            for(int i = 0; i < history[k+1].length; i++) {
                for(int j = 0; j < history[k+1][i].length; j++) {
                    history[k+1][i][j].setStan(b.getPixel(i,j).getStan());
                }
            }
        }
    }
}
