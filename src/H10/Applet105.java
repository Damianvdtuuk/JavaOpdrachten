package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet105 extends Applet {
    Double Totaal = 0.00;
    int Count;
    TextField tv1;
    Button OkKnop;
    String result, Geslaagd;

    @Override
    public void init() {
        tv1 = new TextField("", 5);
        OkKnop = new Button("Ok");
        OkKnop.addActionListener(new Applet105.OkKnopListener());

        add(tv1);
        add(OkKnop);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + result, 50, 50);
        g.drawString("" +(Totaal/Count) , 50, 70);
        g.drawString("" + Geslaagd, 50, 90);
    }

    private class OkKnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int text = (int) Integer.parseInt(tv1.getText());
            if (text < 5.5) {
                result = "onvoldoende";
            } else {
                result = "voldoende";
            }
            Totaal = Totaal + text;
            Count++;
            if ((Totaal/Count) >= 5.5){
                Geslaagd = "Geslaagd";
            }else{
                Geslaagd = "Niet geslaagd";
            }
            repaint();
        }
    }
}
