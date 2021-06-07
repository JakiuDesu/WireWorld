package Input;

import Rules.Board;

public class AND extends Gates{

    public AND() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
        for(int i = 0; i < 10; i++) {
            b.setPixel(6, i, 3);
        }
        for(int i = 10; i < 13; i++) {
            b.setPixel(7, i, 3);
        }
        b.setPixel(8,7, 3);
        b.setPixel(8,9, 3);
        b.setPixel(8,13, 3);
        b.setPixel(9,0, 3);
        b.setPixel(9,1, 3);
        b.setPixel(9,2, 3);
        b.setPixel(9,6, 3);
        b.setPixel(9,7, 3);
        b.setPixel(9,8, 3);
        b.setPixel(9,13, 3);
        for(int i = 17; i < 20; i++) {
            b.setPixel(9, i, 3);
        }
        b.setPixel(10,3, 3);
        b.setPixel(10,5, 3);
        b.setPixel(10,7, 3);
        b.setPixel(10,9, 3);
        b.setPixel(10,11, 3);
        b.setPixel(10,13, 3);
        b.setPixel(10,16, 3);
        b.setPixel(11,3, 3);
        b.setPixel(11,5, 3);
        b.setPixel(11,10, 3);
        b.setPixel(11,11, 3);
        b.setPixel(11,12, 3);
        b.setPixel(11,15, 3);
        b.setPixel(12,3, 3);
        b.setPixel(12,5, 3);
        b.setPixel(12,11, 3);
        b.setPixel(12,13, 3);
        b.setPixel(12,14, 3);
        b.setPixel(13,4, 3);

        b.setPixel(6, 0, 2);
        b.setPixel(6, 1, 1);
        b.setPixel(9, 0, 2);
        b.setPixel(9, 1, 1);

    }
}
