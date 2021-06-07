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

    private List<Point> fillCables;
    private List<Point> fillVoids;
    private List<Point> fillHeads;
    private List<Point> fillTails;

    public Animation(int iteration) {
        fillCables = new ArrayList<>(400);
        fillVoids = new ArrayList<>(400);
        fillHeads = new ArrayList<>(400);
        fillTails = new ArrayList<>(400);

        if(iteration ==2) {
            for (int i = 0; i < 20; i++) {
                fillCable(6, i);
            }
        }
        if (iteration ==3) {
            for (int i = 0; i < 20; i++) {
                fillVoid(7, i);
                fillCable(6, i);
            }
        }
        if (iteration ==4) {
            for (int i = 0; i < 20; i++) {
                fillVoid(7, i);
                fillCable(6, i);
                fillHead(8,i);
            }
        }
        if (iteration ==5) {
            for (int i = 0; i < 20; i++) {
                fillVoid(7, i);
                fillCable(6, i);
                fillHead(8,i);
                fillTail(9,i);
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Point fillCable : fillCables) {
            int cellX = 10 + (fillCable.x * 19);
            int cellY = 10 + (fillCable.y * 19);
            g.setColor(Color.yellow);
            g.fillRect(cellX, cellY, 20, 20);
        }
        for (Point fillVoid : fillVoids) {
            int cellX = 10 + (fillVoid.x * 19);
            int cellY = 10 + (fillVoid.y * 19);
            g.setColor(Color.black);
            g.fillRect(cellX, cellY, 20, 20);
        }
        for (Point fillHead : fillHeads) {
            int cellX = 10 + (fillHead.x * 19);
            int cellY = 10 + (fillHead.y * 19);
            g.setColor(Color.blue);
            g.fillRect(cellX, cellY, 20, 20);
        }
        for (Point fillTail : fillTails) {
            int cellX = 10 + (fillTail.x * 19);
            int cellY = 10 + (fillTail.y * 19);
            g.setColor(Color.red);
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
    public void fillCable(int x, int y) {
        fillCables.add(new Point(x, y));
        repaint();
    }
    public void fillVoid(int x, int y) {
        fillVoids.add(new Point(x, y));
        repaint();
    }
    public void fillHead(int x, int y) {
        fillHeads.add(new Point(x, y));
        repaint();
    }
    public void fillTail(int x, int y) {
        fillTails.add(new Point(x, y));
        repaint();
    }

}

