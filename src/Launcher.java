import Rules.Board;

import java.io.FileNotFoundException;

public class Launcher {

    public static void main(String[] args) throws FileNotFoundException {
        Board b = new Board(20, 20, args[0]);
        char[] znaki = {'_', 'H', 'T', '#'};
        for(int i=0; i<20; i++) {
            for(int j=0; j<20; j++) {
                System.out.print(znaki[b.getPixel(i, j).getStan()]);
            }
            System.out.println();
        }
    }
}
