package H11;

import java.applet.Applet;
import java.awt.*;

public class Applet112 extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;

        while (teller < 10) {
            y += 20;
            g.drawString("" + (20-teller), 50, y);
            teller++;
        }
    }
}

