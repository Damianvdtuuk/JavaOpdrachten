package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet101 extends Applet {

    TextField tv1;
    Button OkKnop;
    int highest;
    int lowest;


    @Override
    public void init() {
        tv1 = new TextField("", 5);
        OkKnop = new Button("Ok");
        OkKnop.addActionListener(new Applet101.OkKnopListener());

        add(tv1);
        add(OkKnop);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("hoogste: "+ highest, 50, 50);
        g.drawString("laagste: "+ lowest, 50, 70);
    }

    class OkKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer = tv1.getText();
            int input = Integer.parseInt(invoer);
            if (input > highest) {
                highest = input;
            }
            if (input < lowest || (lowest == 0)) {
                lowest = input;
            }
            repaint();
        }
    }
}

