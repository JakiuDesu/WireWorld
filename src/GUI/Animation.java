package GUI;

import Cell.Pixel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;




public class Animation extends JPanel {

    private List<Point> fillCells;

    public Animation(int gate) {
        fillCells = new ArrayList<>(400);
        for(int i = 0; i<20; i++){
            fillCell(10,i);
        }
        for(int i = 0; i<20; i++){
            fillCell(7,i);
        }
        for(int i = 0; i<20; i++){
            fillCell(13,i);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Point fillCell : fillCells) {
            int cellX = 10 + (fillCell.x * 19);
            int cellY = 10 + (fillCell.y * 19);
            g.setColor(Color.RED);
            g.fillRect(cellX, cellY, 20, 20);
        }

        g.setColor(Color.BLACK);
        Graphics2D g2d = (Graphics2D) g.create();
        int size = Math.min(getWidth() - 4, getHeight() - 4) / 20;
        int width = getWidth() - (size * 2);
        int height = getHeight() - (size * 2);

        int y = (getHeight() - (size * 20)) / 2;
        for (int horz = 0; horz < 20; horz++) {
            int x = (getWidth() - (size * 20)) / 2;
            for (int vert = 0; vert < 20; vert++) {
                g.drawRect(x, y, size, size);
                x += size;
            }
            y += size;
        }
        g2d.dispose();
    }
    public void fillCell(int x, int y) {
        fillCells.add(new Point(x, y));
        repaint();
    }

}

