package Input;

import Rules.Board;

public class CONDUCTOR extends Gates{

    public CONDUCTOR() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
        b.setPixel(0,0, 3);
    }
    @Override
    public void fileToTable(Board b, int x, int y) {
        b.setPixel(x,y, 3);
    }
}
