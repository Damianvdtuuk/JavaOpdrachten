package H6;

import java.applet.Applet;
import java.awt.*;

public class Applet61 extends Applet {
    int Kinders;
    int deling;
    double uitkomst;
    public void init() {
        Kinders = 113;
        deling = 4;
        uitkomst = (Kinders) / deling;

    }
    public void paint(Graphics g){

        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}