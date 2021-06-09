package Input;

import Rules.Board;

public class DIODEREV extends Gates {

    public DIODEREV() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
        b.setPixel(14, 9, 3);
        b.setPixel(14, 10, 3);
        b.setPixel(16, 9, 3);
        b.setPixel(16, 10, 3);
        for(int i = 5; i < 18; i++) {
            if(i==9) {
                continue;
            } else {
                b.setPixel(15, i, 3);
            }
        }
        b.setPixel(15, 3, 2);
        b.setPixel(15, 4, 1);
    }
    @Override
    public void fileToTable(Board b, int x, int y) {
        b.setPixel(x, y+6, 3);
        b.setPixel(x, y+7, 3);
        b.setPixel(x+2, y+6, 3);
        b.setPixel(x+2, y+7, 3);
        for(int i = 2; i < 15; i++) {
            if(i==6) {
                continue;
            } else {
                b.setPixel(x+1, y+i, 3);
            }
        }
/*
        b.setPixel(x+1, y, 2);
        b.setPixel(x+1, y+1, 1);
*/
    }
}