package Input;

import Rules.Board;

public class OR extends Gates{
    public OR() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
        for(int i=5; i<10; i+=4) {
            for(int j=4; j<6; j++) {
                b.setPixel(i, j, 3);
            }
        }
        for(int i=6; i<9; i+=2) {
            for(int j=0; j<4; j++) {
                b.setPixel(i, j, 3);
            }
            b.setPixel(i, 6, 3);
        }

        for(int i=5; i<20; i++) {
            b.setPixel(7, i, 3);
        }
        b.setPixel(6, 0, 2);
        b.setPixel(6, 1, 1);
        b.setPixel(8, 0, 2);
        b.setPixel(8, 1, 1);
    }
    @Override
    public void fileToTable(Board b, int x, int y) {
        for(int i=0; i<5; i+=4) {
            for(int j=4; j<6; j++) {
                b.setPixel(x+i, y+j, 3);
            }
        }
        for(int i=1; i<4; i+=2) {
            for(int j=0; j<4; j++) {
                b.setPixel(x+i, y+j, 3);
            }
            b.setPixel(x+i, y+6, 3);
        }

        for(int i=5; i<20; i++) {
            b.setPixel(x+2, y+i, 3);
        }
/*
        b.setPixel(x+1, y, 2);
        b.setPixel(x+1, y+1, 1);
        b.setPixel(x+3, y, 2);
        b.setPixel(x+3, y+1, 1);
*/
    }
}
