package Input;

import Rules.Board;

public class DIODE extends Gates {

    public DIODE() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
        fileToTable(b, 8, 0);
        b.setPixel(8, 0, 2);
        b.setPixel(8, 1, 1);
    }
    @Override
    public void fileToTable(Board b, int x, int y) {
        try {
            try {
                b.setPixel(x - 1, y + 6, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
            try {
                b.setPixel(x - 1, y + 7, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
            try {
                b.setPixel(x + 1, y + 6, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
            try {
                b.setPixel(x + 1, y + 7, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
            for (int i = 2; i < 11; i++) {
                if (i == 7) {
                    continue;
                } else {
                    try {
                        b.setPixel(x, y + i, 3);
                    } catch (ArrayIndexOutOfBoundsException ignored) {}
                }
            }
            try {
                b.setPixel(x, y, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
            try {
                b.setPixel(x, y + 1, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        } catch (ArrayIndexOutOfBoundsException ignored) {};
    }
}