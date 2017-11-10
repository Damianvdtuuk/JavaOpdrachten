package H13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht13 extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        drawtreerows(g, 20, 0, 5, 2);
    }

    public void drawtree(Graphics g, int startx, int starty) {
        g.setColor(new Color(128, 64, 7));
        g.fillRect(startx, starty, 20, 50);
        g.setColor(new Color(45, 153, 4));
        g.fillOval(startx - 15, starty - 30, 50, 50);
    }

    public void drawtreerows(Graphics g, int startx, int starty, int amount, int rows) {
        for (int count = 1; count < rows + 1; count++) {
            for (int count2 = 0; count2 < amount; count2++) {
                drawtree(g, startx + 90 * count2, starty + 90 * count);
            }
        }
    }
    }