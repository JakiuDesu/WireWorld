package Input;

import Rules.Board;

public class NOT extends Gates{
    public NOT() {
        super();
    }
    @Override
    public void fileToTable(Board b) {
        for(int i=5; i<8; i++) {
            b.setPixel(5, i, 3);
        }
        b.setPixel(6, 4, 3);
        b.setPixel(6, 8, 3);
        for(int i=0; i<4; i++) {
            b.setPixel(7, i, 3);
        }
        for(int i=7; i<10; i++) {
            b.setPixel(7, i, 3);
        }
        for(int i=12; i<20; i++) {
            b.setPixel(7, i, 3);
        }
        b.setPixel(8, 5, 3);
        b.setPixel(8, 8, 3);
        b.setPixel(8, 11, 3);
        b.setPixel(9, 4, 3);
        b.setPixel(9, 6, 3);
        b.setPixel(9, 7, 3);
        b.setPixel(9, 9, 3);
        b.setPixel(9, 10, 3);
        b.setPixel(10, 5, 3);

        b.setPixel(7, 1, 2);
        b.setPixel(7, 2, 1);
        b.setPixel(5, 5, 2);
        b.setPixel(5, 6, 1);
        b.setPixel(9, 4, 1);
        b.setPixel(10, 5, 2);
    }
}