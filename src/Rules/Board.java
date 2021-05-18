package Rules;

import Cell.Pixel;

import java.io.FileNotFoundException;

public class Board {

    private static Pixel[][] tab;

    public Board(int x, int y, String path) throws FileNotFoundException {
        tab = new Pixel[y][x];
        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                tab[i][j] = new Pixel(0);
            }
        }
        Gates g = new Gates(path);
        g.fileToTable();
    }

    public Pixel getPixel(int x, int y) {
        return tab[y][x];
    }


    public static void setPixel(int x, int y, int stan) {
        tab[y][x].setStan(stan);
    }

}
