package Input;

import Rules.Board;

public class DIODE extends Gates {

    public DIODE() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
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
    }
    @Override
    public void fileToTable(Board b, int x, int y) {
        b.setPixel(x, y + 6, 3);
        b.setPixel(x, y + 7, 3);
        b.setPixel(x + 2, y + 6, 3);
        b.setPixel(x + 2, y + 7, 3);
        for (int i = 2; i < 15; i++) {
            if (i == 7) {
                continue;
            } else {
                b.setPixel(x + 1, y + i, 3);
            }
        }
 /*
        b.setPixel(x + 1, y, 2);
        b.setPixel(x + 1, y + 1, 1);
*/
    }

}