package H4;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen47 extends Applet{
    public void init(){

    }
    public void paint(Graphics g) {
        g.drawRoundRect(100, 100, 150, 150, 30, 31);
        g.fillArc(190, 190, 50, 50, 50, 500);
        g.fillArc(110, 190, 50, 50, 50, 500);
        g.fillArc(110, 110, 50, 50, 50, 500);
        g.fillArc(190, 110, 50, 50, 50, 500);

    }

}
