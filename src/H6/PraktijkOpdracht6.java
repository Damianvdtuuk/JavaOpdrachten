package H6;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht6 extends Applet {
    double a;
    double b;
    double c;
    double uitkomst;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a + b + c) / 3;
        uitkomst = uitkomst * 10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;
    }

    public void paint(Graphics g) {
        g.drawString("uitkomst is " + uitkomst, 100, 100);
    }


}

