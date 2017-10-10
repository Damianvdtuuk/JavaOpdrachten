package H11;

import java.applet.Applet;
import java.awt.*;

public class Applet111 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawLine(y , 50, y, 300 );
        }
    }
}
