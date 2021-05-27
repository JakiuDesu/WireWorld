package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondWindow {
    private JButton ZAPISZButton;
    private JButton POPRZEDNIAButton;
    private JButton NASTĘPNAButton;
    private JPanel SecondWindowRoot;
    private JLabel numerIteracji;
    private int count = 1;


    public SecondWindow(String iterNum) {
        int iter = Integer.parseInt(iterNum);
        NASTĘPNAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if( count <= iter)
                    numerIteracji.setText(String.valueOf(count));
                else
                    count = iter;
            }
        });
        POPRZEDNIAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                if( count >= 1)
                    numerIteracji.setText(String.valueOf(count));
                else
                    count = 1;
            }
        });
    }


    public Container getSecondWindowRoot(){
        return this.SecondWindowRoot;
    }
}
