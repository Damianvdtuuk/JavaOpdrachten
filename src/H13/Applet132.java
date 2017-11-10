package H13;

import java.applet.Applet;
import java.awt.*;
public class Applet132 extends Applet {
    @Override
    public void paint(Graphics g) {
        muur(g,20,20,200,150);
    }

    public void muur(Graphics g, int startx, int starty, int width, int height) {
        g.setColor(Color.red);
        g.fillRect(startx,starty,width,height);
        g.setColor(Color.BLACK);
        for (int count = 0; count < height/10;count++){
            g.drawLine(startx,starty+10*count,startx+width, starty+10*count);
            for (int count2 = 0; count2 < width/15;count2++){
                g.drawLine(startx+15*count2,starty+(10*count),startx+15*count2, starty+(10*count)+10);
            }
        }

    }
}