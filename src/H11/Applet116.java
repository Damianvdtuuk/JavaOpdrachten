package H11;

import java.applet.Applet;
import java.awt.*;

public class Applet116 extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {

        g.drawArc(100, 100, 100, 100, 10, 500);
        g.drawArc(110, 110, 80, 80, 10, 500);
        g.drawArc(120, 120, 60, 60, 10, 500);
        g.drawArc(130, 130, 40, 40, 10, 500);
        g.drawArc(140, 140, 20, 20, 10, 500);
    }
}

