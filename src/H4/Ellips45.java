package H4;

import java.applet.Applet;
import java.awt.*;

public class Ellips45 extends Applet {

    public void init() {
        setBackground(Color.blue);

    }

    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillArc(100, 125, 220, 110, 50, 500);
    }

}
