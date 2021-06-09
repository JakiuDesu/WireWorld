package Input;

import Rules.Board;

public class NOT extends Gates{
    public NOT() {
        super();
    }
    @Override
    public void fileToTable(Board b) {
        fileToTable(b, 8, 0);

        b.setPixel(8, 0, 2);
        b.setPixel(8, 1, 1);
        b.setPixel(6, 4, 2);
        b.setPixel(6, 5, 1);
        b.setPixel(10, 3, 1);
        b.setPixel(11, 4, 2);
    }
    @Override
    public void fileToTable(Board b, int x , int y) {
        for (int i = 4; i < 7; i++) {
            try {
                b.setPixel(x-2, y + i, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        try {
            b.setPixel(x - 1, y + 3, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x - 1, y + 7, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        for (int i = 0; i < 3; i++) {
            try {
                b.setPixel(x, y + i, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        for (int i = 6; i < 9; i++) {
            try {
                b.setPixel(x, y + i, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        for (int i = 11; i < 14; i++) {
            try {
                b.setPixel(x, y + i, 3);
            } catch (ArrayIndexOutOfBoundsException ignored) {}
        }
        try {
            b.setPixel(x + 1, y + 4, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 1, y + 7, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 1, y + 10, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y + 3, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y + 5, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y + 6, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y + 8, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y + 9, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y + 4, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x, y, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x, y + 1, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x-2, y + 4, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x-2, y + 5, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 2, y + 3, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        try {
            b.setPixel(x + 3, y + 4, 3);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
    }
}
