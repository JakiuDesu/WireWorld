package GUI;

import Cell.Pixel;
import Rules.Gates;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    public int gate = 0;


    public FirstWindow() {

        DIODYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(DIODYButton.getBackground()!=Color.white){
                    DIODYButton.setBackground(Color.white);
                    DIODYButton.setOpaque(true);
                    gate = 1;
                }
                else{
                    DIODYButton.setBackground(null);
                    gate = 0;
                }
            }
        });


        BRAMKAXORButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(BRAMKAXORButton.getBackground()!=Color.white) {
                    BRAMKAXORButton.setBackground(Color.white);
                    BRAMKAXORButton.setOpaque(true);
                    gate = 2;
                }
                else{
                    BRAMKAXORButton.setBackground(null);
                    gate = 0;
                }
            }
        });

        gENEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String iterNum = textField1.getText();

                SecondWindow window2 = new SecondWindow(iterNum, gate);
                JFrame frame2 = new JFrame("Animacja");
                frame2.setContentPane(window2.getSecondWindowRoot());
                frame2.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
                frame2.setPreferredSize(new Dimension(1024,576));
                frame2.pack();
                //frame2.add(new Animation());
                frame2.setVisible(true);

            }
        });
        ANDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ANDButton.getBackground()!=Color.white){
                    ANDButton.setBackground(Color.white);
                    ANDButton.setOpaque(true);
                    gate = 3;
                }
                else{
                    ANDButton.setBackground(null);
                    gate = 0;
                }
            }
        });
        ORButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ORButton.getBackground()!=Color.white){
                    ORButton.setBackground(Color.white);
                    ORButton.setOpaque(true);
                    gate = 4;
                }
                else{
                    ORButton.setBackground(null);
                    gate = 0;
                }
            }
        });
        NOTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(NOTButton.getBackground()!=Color.white){
                    NOTButton.setBackground(Color.white);
                    NOTButton.setOpaque(true);
                    gate = 5;
                }
                else{
                    NOTButton.setBackground(null);
                    gate = 0;
                }
            }
        });
        CUSTOMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(CUSTOMButton.getBackground()!=Color.white){
                    CUSTOMButton.setBackground(Color.white);
                    CUSTOMButton.setOpaque(true);
                    gate = 6;
                }
                else{
                    CUSTOMButton.setBackground(null);
                    gate = 0;
                }
            }
        });
    }

    public Container getFirstWindowRoot(){
        return this.FirstWindowRoot;
    }



}
