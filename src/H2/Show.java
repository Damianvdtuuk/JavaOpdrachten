package H2;

import java.applet.Applet;
import java.awt.*;

import static javax.swing.text.StyleConstants.setBackground;


public class Show extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 50);
        g.fillRect(20, 80, 100, 50);


    }

    public void setBackground(Color blue) {
    }
}
