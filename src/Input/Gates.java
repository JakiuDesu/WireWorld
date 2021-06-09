package Input;

import Rules.Board;

public abstract class Gates {

    public Gates() {}

    public abstract void fileToTable(Board b);

    public abstract void fileToTable(Board b, int x, int y);
}



