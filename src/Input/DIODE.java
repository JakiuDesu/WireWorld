package Input;

import Rules.Board;

public class DIODE extends Gates {

    public DIODE() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
        //normal
        b.setPixel(4, 9, 3);
        b.setPixel(4, 10, 3);
        b.setPixel(6, 9, 3);
        b.setPixel(6, 10, 3);
        for(int i = 5; i < 18; i++) {
            if(i==10) {
                continue;
            } else {
                b.setPixel(5, i, 3);
            }
        }
        b.setPixel(5, 3, 2);
        b.setPixel(5, 4, 1);
        //reversed
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
}