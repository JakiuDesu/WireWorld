package Input;

import Rules.Board;

public class XOR extends Gates{
    public XOR() {
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
        for (int i = -2; i < 5; i += 6) {
            for (int j = 5; j < 7; j++) {
                try {
                    b.setPixel(x + i, y + j, 3);
                } catch (ArrayIndexOutOfBoundsException ignored) {}
            }
        }
        for (int i = -1; i < 4; i += 4) {
            for (int j = 4; j < 8; j += 3) {
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
            for (int j = 6; j < 10; j++) {
                try {
                    b.setPixel(x + i, y + j, 3);
                } catch (ArrayIndexOutOfBoundsException ignored) {}
            }
        }
        try {
            b.setPixel(x + 1, y + 6, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        for (int i = 8; i < 13; i++) {
            try {
                b.setPixel(x + 1, y + i, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        try {
            b.setPixel(x, y, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x,  y +1, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y + 1, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
    }
}
