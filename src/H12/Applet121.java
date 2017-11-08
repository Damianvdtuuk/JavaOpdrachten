package H12;

import java.applet.Applet;
import java.awt.*;
import java.text.DecimalFormat;

public class Applet121 extends Applet {
    double a1;
    double a2;
    double a3;
    double a4;
    double a5;
    double a6;
    double a7;
    double a8;
    double a9;
    double a10;
    double uitkomst;
    double DecimalFormat;

    @Override
    public void init() {
        a1 = 6.3;
        a2 = 7.6;
        a3 = 5.1;
        a4 = 8.8;
        a5 = 3.3;
        a6 = 6.7;
        a7 = 9.1;
        a8 = 7.7;
        a9 = 5.5;
        a10 = 8.1;

        uitkomst = (a1+a2+a3+a4+a5+a6+a7+a8+a9+a10 / 10);
        uitkomst = uitkomst / 10;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString( a1 +"",100, 100);
        g.drawString( a2 +"",100, 110);
        g.drawString( a3 +"",100, 120);
        g.drawString( a4 +"",100, 130);
        g.drawString( a5 +"",100, 140);
        g.drawString( a6 +"",100, 150);
        g.drawString( a7 +"",100, 160);
        g.drawString( a8 +"",100, 170);
        g.drawString( a9 +"",100, 180);
        g.drawString( a10 +"",100, 190);
        DecimalFormat df = new DecimalFormat("#.#");
        String s = df.format(uitkomst);
        g.drawString( "Gemiddelde is:" + s, 150, 150 );
    }
}
