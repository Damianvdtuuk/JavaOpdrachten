package H2;

import java.applet.Applet;
import java.awt.*;

import static java.awt.Color.*;

public class Voorbeeld21 extends Applet {

    public void init(){
        setBackground(Color.blue);

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Damian",100, 100);
    }
}
