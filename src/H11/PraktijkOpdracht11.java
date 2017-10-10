package H11;

import H8.Applet81;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht11 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String text = "";
    int invoer = 0;

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
        for (int count = 0; count <= 10; count++) {
            g.drawString(invoer+"X"+ count + "=" + (invoer*count),20,60+(20*count));
        }
    }

    class sendAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }

    class resetAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = "";
            tekstvak.setText("");
            repaint();
        }
    }
}

