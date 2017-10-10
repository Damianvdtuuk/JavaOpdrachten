package H11;

import java.applet.Applet;
import java.awt.*;

public class Applet117 extends Applet {
    @Override
    public void init() {}

    @Override
    public void paint(Graphics g) {
        for(int count = 0; count <51; count++){
            g.drawArc(250-(5*count), 250-(5*count), 10*count, 10* count, 10, 500);
        }
    }
}
