package H2;

import java.applet.Applet;
import java.awt.*;

public class Naam22 extends Applet {

    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Damian", 100, 100);
        g.setColor(Color.red);
        g.drawString("van der Tuuk", 100, 140);
    }
}
