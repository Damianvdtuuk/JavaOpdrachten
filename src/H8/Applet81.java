package H8;

//Voorbeeld 8.6

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Applet81 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String text ="";

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop2 = new Button("reset");
        knop.addActionListener(new sendAction());
        knop2.addActionListener(new resetAction());
        add(tekstvak);
        add(knop);
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString(text,20,40);
    }

    class sendAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            repaint();
        }
    }class resetAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = "";
            tekstvak.setText("");
            repaint();
        }
    }
}