package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet103 extends Applet {

    TextField tv1;
    TextField tv2;
    Button OkKnop;
    String  tekst;
    String s, tekst2;
    int maand;


    @Override
    public void init() {
        tv1 = new TextField("",5);
        tv2 = new TextField("",5);
        OkKnop = new Button("Ok");
        OkKnop.addActionListener(new Applet103.OkKnopListener());

        add(tv1);
        add(tv2);
        add(OkKnop);

    }

    @Override
    public void paint(Graphics g) {
 g.drawString(tekst, 50, 50);
 g.drawString(tekst2, 50,70);
    }

    class OkKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tv1.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "Januari 31";
                    break;
                case 2:
                    tekst = "Februari 28";
                    break;
                case 3:
                    tekst = "Maart 31";
                    break;
                case 4:
                    tekst = "April 30";
                    break;
                case 5:
                    tekst = "Mei 31";
                    break;
                case 6:
                    tekst = "Juni 30";
                    break;
                case 7:
                    tekst = "Juli 31";
                    break;
                case 8:
                    tekst = "Augustus 31";
                    break;
                case 9:
                    tekst = "September 30";
                    break;
                case 10:
                    tekst = "Oktober 31";
                    break;
                case 11:
                    tekst = "November 30";
                    break;
                case 12:
                    tekst = "December 31";
                    break;
                default:
                    tekst = "U heeft een verkeerde maand ingetikt ..!";
                    break;
            }
            s = tv2.getText();
            int jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst2 = "\n"+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst2 = "\n"+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}
