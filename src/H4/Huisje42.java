package H4;

import java.applet.Applet;
import java.awt.*;

public class Huisje42 extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(50, 50, 100, 50);
        g.drawLine(100, 50, 75, 15);
        g.drawLine(75, 15, 50, 50);
        g.drawLine(50, 50, 50, 100);
        g.drawLine(50, 100, 100, 100);
        g.drawLine(100, 100, 100, 50);
        g.drawRect(68, 30, 15, 15);
        g.drawRect(70, 70, 20, 30);
    }
}
