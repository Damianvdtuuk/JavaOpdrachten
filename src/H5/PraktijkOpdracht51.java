package H5;

import javafx.scene.paint.Color;

import java.applet.Applet;
import java.awt.*;

import static java.awt.Color.BLACK;
import static java.awt.Color.magenta;

public class PraktijkOpdracht51 extends Applet {
    java.awt.Color opvulkleur;
    java.awt.Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {

        opvulkleur = magenta;
        lijnkleur = BLACK;
        hoogte = 100;
        breedte = 200;
    }
    public void paint(Graphics g){
        g.drawLine(50, 50, 250, 50);
        g.drawString("Lijn", 160, 65);
        g.drawRect(50, 75, breedte, hoogte);
        g.drawString("Rechthoek", 150, 200);
        g.drawRoundRect(50, 225, breedte, hoogte, 40, 40);
        g.drawString("Afgeronde rechthoek", 125, 350);
        g.setColor(opvulkleur);
        g.fillArc(520, 75, breedte, hoogte, 0, 45);
        g.fillRect(290, 75, breedte, hoogte);
        g.fillArc(290, 225, breedte, hoogte, 10, 500);
        g.setColor(lijnkleur);
        g.drawArc(290, 75, breedte, hoogte, 50, 500);
        g.drawString("Gevulde rechthoek met ovaal", 310, 200);
        g.drawString("Gevulde ovaal", 350, 350);
        g.drawArc(520, 75, 200, 100, 50, 500);
        g.drawString("Taartpunt met een ovaal eromheen", 530, 200);
        g.drawArc(560, 220, 100, 100, 10, 500);
        g.drawString("Cirkel", 590, 350);
    }

}