package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Applet142 extends Applet {
    String[] kleuren;
    String[] kaarten;
    String[] deck;
    String[] speler1;
    String[] speler2;
    String[] speler3;
    String[] speler4;


    Button knop;


    public void init() {
        knop = new Button("Deel Kaarten");
        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deck = new String[52];
                fillDeck();
                fillSpelers();
                repaint();
            }
        });
        add(knop);
        kleuren = new String[4];
        kaarten = new String[13];
        deck = new String[52];
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

        fillDeck();

        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];

        fillSpelers();


    }

    private void fillDeck() {
        int indexDeck = 0;
        for (int i = 0; i < kleuren.length; i++) {

            //haal kleur uit kleuren
            String kleur = kleuren[i];
            for (int j = 0; j < kaarten.length; j++) {
                String kaart = kaarten[j];
                deck[indexDeck] = kleur + " " + kaart;
                indexDeck++;
            }
        }
    }

    private void fillSpelers() {
        for (int i = 0; i < speler1.length; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }
    }

    public void paint(Graphics g) {
        int x1 = 50;
        int x2 = 175;
        int x3 = 300;
        int x4 = 425;
        int y = 70;
        g.drawString("Speler 1", x1, y);
        g.drawString("Speler 2", x2, y);
        g.drawString("Speler 3", x3, y);
        g.drawString("Speler 4", x4, y);
        y += 20;
        g.drawLine(50, 75, 530, 75);

        for (int i = 0; i < 13; i++) {
            g.drawString(speler1[i], x1, y);
            g.drawString(speler2[i], x2, y);
            g.drawString(speler3[i], x3, y);
            g.drawString(speler4[i], x4, y);
            y += 20;
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }


}
