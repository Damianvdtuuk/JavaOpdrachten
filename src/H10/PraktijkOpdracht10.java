package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht10 extends Applet {
    TextField tv1;
    Button OkKnop;
    int cijfer;
    String s, tekst;

    @Override
    public void init() {
        tv1 = new TextField("", 5);
        OkKnop = new Button("Ok");
        OkKnop.addActionListener(new PraktijkOpdracht10.OkKnopListener());

        add(tv1);
        add(OkKnop);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + tekst, 50, 50);
    }

    private class OkKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tv1.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer) {
                case 1:
                    tekst = "slecht";
                    break;
                case 2:
                    tekst = "slecht";
                    break;
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                    tekst = "voldoende";
                    break;
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                    tekst = "goed";
                    break;
                case 9:
                    tekst = "goed";
                    break;
                case 10:
                    tekst = "goed";
                    break;
                default:
                    tekst = "Dit cijfer bestaat niet";
                    break;
            }
            repaint();
        }
    }
}
