package H11;

import java.applet.Applet;
import java.awt.*;

public class Applet119 extends Applet {
    int breedte = 10;
    int hoogte = 10;

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            for (int row = 0; row < 8; row++) {
                x = 50 + (10 * kolom);
                y = 50 + (10 * row);
                if ((kolom % 2 == 0 && row % 2 == 0) || (kolom % 2 == 1 && row % 2 == 1)) {
                    g.setColor(Color.black);
                } else {
                    g.setColor(Color.white);
                }
                g.fillRect(x, y, breedte, hoogte);
                g.setColor(Color.black);
                g.drawRect(x, y, breedte, hoogte);
            }
        }
    }
}