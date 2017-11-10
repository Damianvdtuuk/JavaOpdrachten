package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet133 extends Applet {
    Button RodeBakSteen;
    Button GrijzeMuur;
    boolean baksteen;
    boolean beton;

    @Override
    public void init() {
        RodeBakSteen = new Button("Rode Bakstenen");
        RodeBakSteen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                baksteen = true;
                beton = false;
                repaint();
            }
        });
        GrijzeMuur = new Button("Grijs Beton");
        GrijzeMuur.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                baksteen = false;
                beton = true;
                repaint();
            }
        });
        add(RodeBakSteen);
        add(GrijzeMuur);
    }

    @Override
    public void paint(Graphics g) {
        if (baksteen) drawredwall(g, 50, 50, 300, 200);
        if (beton) drawbetonwall(g, 50, 50, 300, 200);
    }


    public void drawredwall(Graphics g, int startx, int starty, int width, int height) {
        g.setColor(Color.red);
        g.fillRect(startx, starty, width, height);
        g.setColor(Color.BLACK);
        for (int count = 0; count < height / 10; count++) {
            g.drawLine(startx, starty + 10 * count, startx + width, starty + 10 * count);
            for (int count2 = 0; count2 < width / 15; count2++) {
                g.drawLine(startx + 15 * count2, starty + (10 * count), startx + 15 * count2, starty + (10 * count) + 10);
            }
        }
    }

    public void drawbetonwall(Graphics g, int startx, int starty, int width, int height) {
        g.setColor(Color.gray);
        g.fillRect(startx, starty, width, height);
        g.setColor(Color.BLACK);
        for (int count = 0; count < height / 20; count++) {
            g.drawLine(startx, starty + 20 * count, startx + width, starty + 20 * count);
            for (int count2 = 0; count2 < width / 30; count2++) {
                g.drawLine(startx + 30 * count2, starty + (20 * count), startx + 30 * count2, starty + (20 * count) + 20);
            }
        }
    }
}
