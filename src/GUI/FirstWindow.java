package GUI;

import Input.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class FirstWindow {
    private JButton DIODYButton;
    private JButton BRAMKAXORButton;
    private JTextField textField1;
    private JButton gENEButton;
    private JPanel FirstWindowRoot;
    private JButton ANDButton;
    private JButton ORButton;
    private JButton NOTButton;
    private JButton CUSTOMButton;
    private Gates bramka;


    public FirstWindow() {

        DIODYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(DIODYButton.getBackground()!=Color.white){
                    DIODYButton.setBackground(Color.white);
                    BRAMKAXORButton.setBackground(null);
                    ANDButton.setBackground(null);
                    ORButton.setBackground(null);
                    NOTButton.setBackground(null);
                    CUSTOMButton.setBackground(null);
                    DIODYButton.setOpaque(true);
                    bramka = new DIODE();
                }
                else{
                    DIODYButton.setBackground(null);
                    bramka = null;
                }
            }
        });


        BRAMKAXORButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(BRAMKAXORButton.getBackground()!=Color.white) {
                    DIODYButton.setBackground(null);
                    BRAMKAXORButton.setBackground(Color.white);
                    ANDButton.setBackground(null);
                    ORButton.setBackground(null);
                    NOTButton.setBackground(null);
                    CUSTOMButton.setBackground(null);
                    BRAMKAXORButton.setOpaque(true);
                    bramka = new XOR();
                }
                else{
                    BRAMKAXORButton.setBackground(null);
                    bramka = null;
                }
            }
        });

        gENEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String iterNum = textField1.getText();

                SecondWindow window2 = new SecondWindow(iterNum, bramka);
                JFrame frame2 = new JFrame("Animacja");
                frame2.setContentPane(window2.getSecondWindowRoot());
                frame2.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
                frame2.setPreferredSize(new Dimension(1024,576));
                frame2.pack();
                frame2.setVisible(true);

            }
        });
        ANDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ANDButton.getBackground()!=Color.white){
                    DIODYButton.setBackground(null);
                    BRAMKAXORButton.setBackground(null);
                    ANDButton.setBackground(Color.white);
                    ORButton.setBackground(null);
                    NOTButton.setBackground(null);
                    CUSTOMButton.setBackground(null);
                    ANDButton.setOpaque(true);
                    bramka = new AND();
                }
                else{
                    ANDButton.setBackground(null);
                    bramka = null;
                }
            }
        });
        ORButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ORButton.getBackground()!=Color.white){
                    DIODYButton.setBackground(null);
                    BRAMKAXORButton.setBackground(null);
                    ANDButton.setBackground(null);
                    ORButton.setBackground(Color.white);
                    NOTButton.setBackground(null);
                    CUSTOMButton.setBackground(null);
                    ORButton.setOpaque(true);
                    bramka = new OR();
                }
                else{
                    ORButton.setBackground(null);
                    bramka = null;
                }
            }
        });
        NOTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(NOTButton.getBackground()!=Color.white){
                    DIODYButton.setBackground(null);
                    BRAMKAXORButton.setBackground(null);
                    ANDButton.setBackground(null);
                    ORButton.setBackground(null);
                    NOTButton.setBackground(Color.white);
                    CUSTOMButton.setBackground(null);
                    NOTButton.setOpaque(true);
                    bramka = new NOT();
                }
                else{
                    NOTButton.setBackground(null);
                    bramka = null;
                }
            }
        });
        CUSTOMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(CUSTOMButton.getBackground()!=Color.white){
                    DIODYButton.setBackground(null);
                    BRAMKAXORButton.setBackground(null);
                    ANDButton.setBackground(null);
                    ORButton.setBackground(null);
                    NOTButton.setBackground(null);
                    CUSTOMButton.setBackground(Color.white);
                    CUSTOMButton.setOpaque(true);
                    try {
                        bramka = new CUSTOM("C:\\Users\\jakub\\Desktop\\Studia\\JiMP - 2\\input.txt");
                    } catch (FileNotFoundException fileNotFoundException) {
                        fileNotFoundException.printStackTrace();
                    }
                }
                else{
                    CUSTOMButton.setBackground(null);
                    bramka = null;
                }
            }
        });
    }

    public Container getFirstWindowRoot(){
        return this.FirstWindowRoot;
    }



}
