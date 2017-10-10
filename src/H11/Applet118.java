package H11;

import java.applet.Applet;
import java.awt.*;

public class Applet118 extends Applet {

    @Override
    public void paint(Graphics g) {
        for(int count = 0; count <101; count++){
            g.drawArc(250, 250, 10*count, 10* count, 10, 500);
        }
    }
}
