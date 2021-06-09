package Input;

import Rules.Board;

public class HEAD extends Gates{

    public HEAD() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
        b.setPixel(0,0, 1);
    }
    @Override
    public void fileToTable(Board b, int x, int y) {
        b.setPixel(x,y, 1);
    }
}