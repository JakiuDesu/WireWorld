package GUI;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static final void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FirstWindow window = new FirstWindow();
                JFrame frame = new JFrame("Ustawienia");
                frame.setContentPane(window.getFirstWindowRoot());
                frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
                frame.setPreferredSize(new Dimension(1024,576));
                frame.pack();
                frame.setVisible(true);
            }
        });
    }


}
