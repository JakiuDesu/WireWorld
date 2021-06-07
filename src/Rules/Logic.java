package Rules;

import Cell.Pixel;

public class Logic {
    private Pixel[][][] history;
    private Board b;

    public Logic(Gates g, int iter) {
        b = new Board(20, 20, g);
        history = new Pixel[iter + 1][20][20];
        for(int i = 0; i < iter + 1; i++) {
            for(int j = 0; j < 20; j++) {
                for(int k = 0; k < 20; k++) {
                    history[i][j][k] = new Pixel(0);
                }
            }
        }
        for(int i = 0; i < history[0].length; i++) {
            for(int j = 0; j < history[0][i].length; j++) {
                history[0][i][j].setStan(b.getPixel(i,j).getStan());
                System.out.print(history[0][i][j].getStan());
            }
            System.out.println();
        }
        System.out.println();
        for(int k = 0; k < iter; k++) {
            b.update();
            for(int i = 0; i < history[k+1].length; i++) {
                for(int j = 0; j < history[k+1][i].length; j++) {
                    history[k+1][i][j].setStan(b.getPixel(i,j).getStan());
                    System.out.print(history[k+1][i][j].getStan());
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public Pixel[][] getIter(int iter) {
        return history[iter];
    }
}
