import java.applet.Applet;
import java.awt.*;

public class GelijkbenigeDriehoek extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(50, 50, 100, 50);
        g.drawLine(100, 50, 75, 15);
        g.drawLine(75, 15, 50, 50);
    }
}
