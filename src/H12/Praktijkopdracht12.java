package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht12 extends Applet {
    private TextField naamtextField;
    private TextField telefoontextField;
    private Button button;
    private String[] namen;
    private String[] nummers;
    private int aantalGeklikt;

    private final static int AANTAL_INVOER = 10;

    @Override
    public void init() {
        naamtextField = new TextField(10);
        add(naamtextField);
        telefoontextField = new TextField(10);
        add(telefoontextField);
        button = new Button("Ok");
        add(button);
        namen = new String[AANTAL_INVOER];
        nummers = new String[AANTAL_INVOER];
        aantalGeklikt = 0;

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namen[aantalGeklikt] = naamtextField.getText();
                nummers[aantalGeklikt] = telefoontextField.getText();
                aantalGeklikt++;
                if (aantalGeklikt == AANTAL_INVOER) {
                    repaint();
                    aantalGeklikt = 0;
                }

            }
        });
    }

    @Override
    public void paint(Graphics g) {
        if (aantalGeklikt != 0) ;
        int x1 = 50;
        int x2 = 150;
        int y = 70;
        for (int i = 0; i < AANTAL_INVOER; i++) {
            g.drawString(namen[i], x1, y);
            g.drawString(nummers[i], x2, y);
            y += 20;
        }
    }
}
