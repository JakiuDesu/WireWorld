package Input;

import Rules.Board;

public class AND extends Gates{

    public AND() {
        super();
    }

    @Override
    public void fileToTable(Board b) {
        fileToTable(b, 8, 0);

        b.setPixel(8, 0, 2);
        b.setPixel(8, 1, 1);
        b.setPixel(11, 0, 2);
        b.setPixel(11, 1, 1);
    }
    @Override
    public void fileToTable(Board b, int x, int y) {
        for (int i = 0; i < 10; i++) {
            try {
                b.setPixel(x, y + i, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        for (int i = 10; i < 13; i++) {
            try {
                b.setPixel(x + 1, y + i, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        try {
            b.setPixel(x + 2, y + 7, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y + 9, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y + 13, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y + 1, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y + 2, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y + 6, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y + 7, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y + 8, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y + 13, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        for (int i = 17; i < 20; i++) {
            try {
                b.setPixel(x + 3, y + i, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        try {
            b.setPixel(x + 4, y + 3, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 4, y + 5, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 4, y + 7, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 4, y + 9, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 4, y + 11, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 4, y + 13, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 4, y + 16, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 5, y + 3, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 5, y + 5, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 5, y + 10, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 5, y + 11, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 5, y + 12, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 5, y + 15, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 6, y + 3, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 6, y + 5, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 6, y + 11, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 6, y + 13, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 6, y + 14, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 7, y + 4, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x, y, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x, y + 1, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y + 1, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
    }
}
