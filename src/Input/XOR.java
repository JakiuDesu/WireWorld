package Input;

import Rules.Board;

public class XOR extends Gates{
    public XOR() {
        super();
    }
    @Override
    public void fileToTable(Board b) {
        for(int i=5; i<12; i+=6) {
            for(int j=5; j<7; j++) {
                b.setPixel(i, j, 3);
            }
        }
        for(int i=6; i<11; i+=4) {
            for(int j=4; j<8; j+=3) {
                b.setPixel(i, j, 3);
            }
        }
        for(int i=7; i<10; i+=2) {
            for(int j=0; j<4; j++) {
                b.setPixel(i, j, 3);
            }
            for(int j=6; j<10; j++) {
                b.setPixel(i, j, 3);
            }
        }
        b.setPixel(8, 6, 3);
        for(int i=8; i<20; i++) {
            b.setPixel(8, i, 3);
        }
        b.setPixel(7, 0, 2);
        b.setPixel(7, 1, 1);
        b.setPixel(9, 0, 2);
        b.setPixel(9, 1, 1);
    }
}
