import java.applet.Applet;
import java.awt.*;

public class NLVlag extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(50, 50, 50, 100);
        g.setColor(Color.red);
        g.fillRect(50, 50, 30, 10);
        g.setColor(Color.white);
        g.fillRect(50, 60, 30, 10);
        g.setColor(Color.blue);
        g.fillRect(50, 70, 30, 10);
    }
}
