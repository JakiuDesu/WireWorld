package Rules;

import Cell.Pixel;
import Input.Gates;

public class Board {

    private Pixel[][] tab;
    private Pixel[][] history;

    public Board(int x, int y, Gates g) {
        tab = new Pixel[y][x];
        history = new Pixel[y][x];
        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                tab[i][j] = new Pixel(0);
                history[i][j] = new Pixel(0);
            }
        }
        g.fileToTable(this);
    }

    public Pixel getPixel(int x, int y) {
        return tab[x][y];
    }
    private Pixel getHPixel(int x, int y) {
        return history[x][y];
    }

    public void setPixel(int x, int y, int stan) {
        tab[x][y].setStan(stan);
    }
    private void setHPixel(int x, int y, int stan) {
        history[x][y].setStan(stan);
    }

    public void update() {
        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                if(getPixel(i,j).getStan() == 0) {
                    setHPixel(i,j, 0);
                }
                else if(getPixel(i,j).getStan() == 1) {
                    checkSurr(i, j);
                    setHPixel(i, j, 2);
                }
                else if(getPixel(i,j).getStan() == 2) {
                    setHPixel(i,j, 3);
                }
                else if(getPixel(i,j).getStan() == 3 && getHPixel(i,j).getStan() != 1 ) {
                    setHPixel(i,j, (getPixel(i,j).getStan()));
                }
            }
        }
        for(int i=0; i<tab.length; i++) {
            for(int j=0; j<tab[i].length; j++) {
                setPixel(i,j, getHPixel(i,j).getStan());
                setHPixel(i, j, 0);
            }
        }
    }

    private void checkSurr(int x, int y) {

        for(int i = x-1; i <= x+1; i++) {
            for(int j = y-1; j <= y+1; j++) {
                try{
                    if(getPixel(i,j).getStan() == 3)
                        changeSurr(i, j);
                    else if(getPixel(i,j).getStan() == 2)
                        setHPixel(i,j, 3);
                } catch (IndexOutOfBoundsException ignored) {}
            }
        }
    }

    private void changeSurr(int x, int y) {
        int sum = 0;
        for(int j = y-1; j <= y+1; j++) {
            for(int i = x-1; i <= x+1; i++) {
                try{
                    if(getPixel(i, j).getStan() == 1)
                        sum++;
                } catch (IndexOutOfBoundsException ignored) {}
            }
        }
        if(sum == 2 || sum == 1) {
            setHPixel(x, y, 1);
        }
    }

}
