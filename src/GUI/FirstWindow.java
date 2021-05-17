package GUI;

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


    public FirstWindow() {

        DIODYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(DIODYButton.getBackground()!=Color.BLUE){
                    DIODYButton.setBackground(Color.BLUE);
                    DIODYButton.setOpaque(true);}
                else{
                    DIODYButton.setBackground(null);
                }
            }
        });

        BRAMKAXORButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(BRAMKAXORButton.getBackground()!=Color.BLUE){
                    BRAMKAXORButton.setBackground(Color.BLUE);
                    BRAMKAXORButton.setOpaque(true);}
                else{
                    BRAMKAXORButton.setBackground(null);
                }
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String LiczbaIteracji = textField1.getText();
            }
        });
        gENEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondWindow window2 = new SecondWindow();
                JFrame frame2 = new JFrame("Animacja");
                frame2.setContentPane(window2.getSecondWindowRoot());
                frame2.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
                frame2.setPreferredSize(new Dimension(1024,576));
                frame2.pack();
                frame2.setVisible(true);
            }
        });
    }

    public Container getFirstWindowRoot(){
        return this.FirstWindowRoot;
    }


}
