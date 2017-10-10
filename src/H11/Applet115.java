package H11;

import java.applet.Applet;
import java.awt.*;

public class Applet115 extends Applet {
    public void init() {}

    @Override
    public void paint(Graphics g) {
        g.drawLine(10, 10, 20, 10);
        g.drawLine(10, 20, 10, 10);
        g.drawLine(20, 20, 20, 10);
        g.drawLine(10, 20, 20, 20);

        g.drawLine(20, 20, 30, 20);
        g.drawLine(20, 30, 20, 20);
        g.drawLine(30, 30, 30, 20);
        g.drawLine(20, 30, 30, 30);

        g.drawLine(30, 30, 40, 30);
        g.drawLine(30, 40, 30, 30);
        g.drawLine(40, 40, 40, 30);
        g.drawLine(30, 40, 40, 40);

        g.drawLine(40, 40, 50, 40);
        g.drawLine(40, 50, 40, 40);
        g.drawLine(50, 50, 50, 40);
        g.drawLine(40, 50, 50, 50);

        g.drawLine(50, 50, 60, 50);
        g.drawLine(50, 60, 50, 50);
        g.drawLine(60, 60, 60, 50);
        g.drawLine(50, 60, 60, 60);
    }
}
