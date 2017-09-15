package H6;

import java.applet.Applet;
import java.awt.*;

public class Applet62 extends Applet {
    int seconden;
    double SecondenInUur;
    double SecondenInDag;
    int SecondenInJaar;


    public void init() {
        seconden = 60;
        SecondenInUur = (seconden * seconden);
        SecondenInDag = (seconden * seconden * 24);
        SecondenInJaar = (seconden * seconden * 24 * 365);
    }

    public void paint(Graphics g) {
        g.drawString("uur is " + SecondenInUur, 100, 100);
        g.drawString("dag is " + SecondenInDag, 100, 120);
        g.drawString("jaar is" + SecondenInJaar, 100, 140);
    }
}