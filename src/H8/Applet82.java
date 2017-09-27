package H8;

import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Applet82 extends Applet {
    TextField tekstvak;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    String text;
    int man;
    int vrouw;
    int potentiëleVrouw;
    int potentiëleMan;

    @Override
    public void init() {
        tekstvak = new TextField("", 30);
        knop1 = new Button("man");
        knop2 = new Button("vrouw");
        knop3 = new Button("potentiële man");
        knop4 = new Button("potentiële vrouw");

        knop1.addActionListener(new plusMan());
        knop2.addActionListener(new plusVrouw());
        knop3.addActionListener(new plusPotentieleMan());
        knop4.addActionListener(new plusPotentieleVrouw());
        add(tekstvak);
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("man: " + man, 50, 60);
        g.drawString("vrouw: " + vrouw, 50, 70);
        g.drawString("potentieleMan: " + potentiëleMan, 50, 80);
        g.drawString("potentieleVrouw: " + potentiëleVrouw, 50, 90);
        g.drawString("Totaal:" + (man + vrouw + potentiëleMan + potentiëleVrouw), 50, 50);
    }

    class plusMan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man++;
            repaint();
        }
    }

    class plusVrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw++;
            repaint();
        }
    }


    class plusPotentieleMan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potentiëleMan++;
            repaint();

        }
    }


    class plusPotentieleVrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potentiëleVrouw++;
            repaint();
        }
    }
}