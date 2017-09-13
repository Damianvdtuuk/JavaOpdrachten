import java.applet.Applet;
import java.awt.*;


public class Stoplicht46 extends Applet{
    public void init(){

    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(240, 420, 40, 200);
        g.fillRect(200, 140, 110, 320);
        g.setColor(Color.red);
        g.fillArc(205, 150, 100, 100, 50, 500);
        g.setColor(Color.orange);
        g.fillArc(205, 250, 100, 100, 50, 500);
        g.setColor(Color.GREEN);
        g.fillArc(205, 350, 100, 100, 50, 500);
    }

}
