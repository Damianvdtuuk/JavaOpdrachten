package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet141 extends Applet {
    String kleuren[];
    String kaarten[];
    Button knop;
    String string;
    double randomGetal1;
    double randomGetal2;
    int randomGetalInt1;
    int randomGetalInt2;

    public void init() {
        knop = new Button("Deel Kaart");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        string = "";
        kleuren = new String[4];
        kaarten = new String[13];
        kleuren[0] = "Schoppen";
        kleuren[1] = "Harten";
        kleuren[2] = "Klaver";
        kleuren[3] = "Ruiten";
        kaarten[0] = "Aas";
        kaarten[1] = "Twee";
        kaarten[2] = "Drie";
        kaarten[3] = "Vier";
        kaarten[4] = "Vijf";
        kaarten[5] = "Zes";
        kaarten[6] = "Zeven";
        kaarten[7] = "Acht";
        kaarten[8] = "Negen";
        kaarten[9] = "Tien";
        kaarten[10] = "Boer";
        kaarten[11] = "Vrouw";
        kaarten[12] = "Heer";
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 70;
        g.drawString(string, x, y);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            randomGetal1 = Math.random();
            randomGetal2 = Math.random();
            randomGetalInt1 = (int) (randomGetal1 * 4);
            randomGetalInt2 = (int) (randomGetal1 * 13);
            string = kleuren[randomGetalInt1] + " " + kaarten[randomGetalInt2];
            repaint();
        }
    }
}