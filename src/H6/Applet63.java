package H6;

import java.applet.Applet;
import java.awt.*;

public class Applet63 extends Applet {
    int a;
    int b;
    double uitkomst;


    public void init() {
        a = 2147483647;
        b = 1;
        uitkomst = (a+b);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("uitkomst is " + uitkomst, 100, 100 );
    }
}
