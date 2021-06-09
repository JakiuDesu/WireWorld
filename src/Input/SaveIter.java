package Input;

import Cell.Pixel;
import java.io.*;

public class SaveIter {

    public SaveIter(Pixel[][] iteracja, int bramka, int iterNum){
        try {
            PrintWriter myWriter = new PrintWriter("src/Input/Iteracja"+iterNum+"-"+bramka+".txt");
            if(bramka == 3){
                myWriter.println("AND: 0, 3");
            }
            if(bramka == 1){
                myWriter.println("DIODE: 0, 3");
            }
            if(bramka == 5){
                myWriter.println("NOT: 0, 3");
            }
            if(bramka == 4){
                myWriter.println("OR: 0, 3");
            }
            if(bramka == 2){
                myWriter.println("XOR: 0, 3");
            }
            for(int i=0;i<20;i++){
                for(int j=0;j<20;j++){
                    if(iteracja[i][j].getStan()==1){
                        myWriter.println("ElectronHead: "+j+", "+i);
                    }
                    if(iteracja[i][j].getStan()==2){
                        myWriter.println("ElectronTail: "+j+", "+i);
                    }
                    if(iteracja[i][j].getStan()==3 && bramka ==6){
                        myWriter.println("Cable: "+j+", "+i);
                    }
                }
            }
            myWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
