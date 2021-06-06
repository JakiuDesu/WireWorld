package Rules;

import java.io.FileNotFoundException;

public class Logic {

    public static void run(String[] args) throws FileNotFoundException {
        Board b = new Board(20, 20, args[0]);
        char[] znaki = {'_', 'H', 'T', '#'};
        for(int k=0; k<20;k++) {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print(znaki[b.getPixel(i, j).getStan()]);
                }
                System.out.println();
            }
            b.update();
            System.out.println();
        }
    }
}
