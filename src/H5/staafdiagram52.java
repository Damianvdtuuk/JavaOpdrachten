package H5;

import java.applet.Applet;
import java.awt.*;

public class staafdiagram52 extends Applet {
    int Valerie;
    int Jeroen;
    int Hans;
    public void init() {
        Valerie = 40;
        Jeroen = 120;
        Hans = 80;
    }
    public void paint(Graphics g){

        g.drawRect(100, 100, 170, 160);
        g.drawLine(100, 100, 80, 100);
        g.drawLine(100, 120, 80, 120);
        g.drawLine(100, 140, 80, 140);
        g.drawLine(100, 160, 80, 160);
        g.drawLine(100, 180, 80, 180);
        g.drawLine(100, 200, 80, 200);
        g.drawLine(100, 220, 80, 220);
        g.drawLine(100, 240, 80, 240);
        g.drawLine(100, 260, 80, 260);
        g.setColor(Color.green);
        g.drawString("Jeroen", 100, 280);
        g.fillRect(101, 260-Jeroen, 50, Jeroen);
        g.setColor(Color.red);
        g.drawString("Hans", 165, 280);
        g.fillRect(160, 260-Hans, 50, Hans);
        g.setColor(Color.blue);
        g.drawString("Valerie", 220, 280);
        g.fillRect(220, 260-Valerie, 50, Valerie);
        g.setColor(Color.black);
        g.drawString("160", 65, 100);
        g.drawString("140", 65, 120);
        g.drawString("120", 65, 140);
        g.drawString("100", 65, 160);
        g.drawString("80", 65, 180);
        g.drawString("60", 65, 200);
        g.drawString("40", 65, 220);
        g.drawString("20", 65, 240);
        g.drawString("0", 65, 260);
    }
}
