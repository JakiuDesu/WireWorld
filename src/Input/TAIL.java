package Input;

import Rules.Board;

public class TAIL extends Gates{

    public TAIL() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
        b.setPixel(0,0, 2);
    }
    @Override
    public void fileToTable(Board b, int x, int y) {
        b.setPixel(x,y, 2);
    }
}