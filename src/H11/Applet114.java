package H11;

import java.applet.Applet;
import java.awt.*;

public class Applet114 extends Applet {
    public void paint(Graphics g) {
        for (int count = 0; count <= 30; count++) {
            g.drawString("3X"+ count + "=" + (3*count),20,20+(20*count));
        }
    }
}
