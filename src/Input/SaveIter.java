package Input;

import Cell.Pixel;
import java.io.*;

public class SaveIter {

    public SaveIter(Pixel[][] iteracja, Gates bramka, int iterNum) {
        try {
            PrintWriter myWriter = new PrintWriter("src/Input/Iteracja" + iterNum + "-" + bramka + ".txt");
            if (bramka instanceof DIODE) {
                myWriter.println("Diode: 0, 8, Normal");
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (iteracja[i][j].getStan() == 1) {
                            myWriter.println("ElectronHead: " + j + ", " + i);
                        }
                        if (iteracja[i][j].getStan() == 2) {
                            myWriter.println("ElectronTail: " + j + ", " + i);
                        }
                    }
                }
            }
            if (bramka instanceof XOR) {
                myWriter.println("XOR: 0, 8");
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (iteracja[i][j].getStan() == 1) {
                            myWriter.println("ElectronHead: " + j + ", " + i);
                        }
                        if (iteracja[i][j].getStan() == 2) {
                            myWriter.println("ElectronTail: " + j + ", " + i);
                        }
                    }
                }
            }
            if (bramka instanceof AND) {
                myWriter.println("AND: 0, 8");
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (iteracja[i][j].getStan() == 1) {
                            myWriter.println("ElectronHead: " + j + ", " + i);
                        }
                        if (iteracja[i][j].getStan() == 2) {
                            myWriter.println("ElectronTail: " + j + ", " + i);
                        }
                    }
                }
            }
            if (bramka instanceof OR) {
                myWriter.println("OR: 0, 8");
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (iteracja[i][j].getStan() == 1) {
                            myWriter.println("ElectronHead: " + j + ", " + i);
                        }
                        if (iteracja[i][j].getStan() == 2) {
                            myWriter.println("ElectronTail: " + j + ", " + i);
                        }
                    }
                }
            }
            if (bramka instanceof NOT) {
                myWriter.println("NOT: 0, 8");
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (iteracja[i][j].getStan() == 1) {
                            myWriter.println("ElectronHead: " + j + ", " + i);
                        }
                        if (iteracja[i][j].getStan() == 2) {
                            myWriter.println("ElectronTail: " + j + ", " + i);
                        }
                    }
                }
            }
            if (bramka instanceof CUSTOM) {
                String[][] dane = ((CUSTOM) bramka).getDane();
                for(int k=0; k<((CUSTOM) bramka).getL(); k++) {
                    if(!dane[k][0].equals("ElectronHead") && !dane[k][0].equals("ElectronTail")) {
                        if(dane[k][0].equals("Diode")) {
                            myWriter.println(dane[k][0] + ": " + dane[k][1] + ", " + dane[k][2] + ", " + dane[k][3]);
                        } else {
                            myWriter.println(dane[k][0] + ": " + dane[k][1] + ", " + dane[k][2]);
                        }
                    }
                }
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (iteracja[i][j].getStan() == 1) {
                            myWriter.println("ElectronHead: " + j + ", " + i);
                        }
                        if (iteracja[i][j].getStan() == 2) {
                            myWriter.println("ElectronTail: " + j + ", " + i);
                        }
                    }
                }
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}




