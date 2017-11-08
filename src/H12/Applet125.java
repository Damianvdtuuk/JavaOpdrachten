package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet125 extends Applet {
    Button OkKnop;
    boolean gevonden;
    int[] getallen = {1, 4, 5, 8, 10, 2};
    TextField tv1;
    int index;

    @Override
    public void init() {
        System.out.println("Init start");
        tv1 = new TextField("", 5);
        OkKnop = new Button("Ok");
        OkKnop.addActionListener(new OkKnopListener());
        add(tv1);
        add(OkKnop);
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint start");
        if (gevonden == true) {
            g.drawString("Dit getal is gevonden in de Index", 20, 50);
            g.drawString("Index is " + index, 20, 70);
        } else {
            g.drawString("Dit getal bestaat niet in de Index", 100, 50);
        }
    }

    class OkKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            gevonden = false;
            String s = tv1.getText();
            int invoer = Integer.parseInt(s);
            for (int i = 0; i < getallen.length; i++) {
                if (invoer == getallen[i]) {
                    gevonden = true;
                    index = i;
                }
            }
            repaint();
        }
    }
}
