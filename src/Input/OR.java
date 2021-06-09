package Input;

import Rules.Board;

public class OR extends Gates{
    public OR() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
        fileToTable(b, 8, 0);
        b.setPixel(8, 0, 2);
        b.setPixel(8, 1, 1);
        b.setPixel(10, 0, 2);
        b.setPixel(10, 1, 1);
    }
    @Override
    public void fileToTable(Board b, int x, int y) {
        for (int i = -1; i < 4; i += 4) {
            for (int j = 4; j < 6; j++) {
                try {
                    b.setPixel(x + i, y + j, 3);
                } catch (ArrayIndexOutOfBoundsException ignored) {}
            }
        }
        for (int i = 0; i < 3; i += 2) {
            for (int j = 0; j < 4; j++) {
                try {
                    b.setPixel(x + i, y + j, 3);
                } catch (ArrayIndexOutOfBoundsException ignored) {}
            }
            try {
                b.setPixel(x + i, y + 6, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        for (int i = 5; i < 10; i++) {
            try {
                b.setPixel(x + 1, y + i, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        try {
            b.setPixel(x, y, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x, y + 1, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y + 1, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
    }
}
