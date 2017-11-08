package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet126 extends Applet {

    boolean gevonden;
    int[] getallen = {1, 1, 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10};
    TextField textField;
    Button Okbutton;
    int index;

    @Override
    public void init() {
        textField = new TextField("", 5);
        Okbutton = new Button("Ok");
        Okbutton.addActionListener(new OkKnopListener());
        add(textField);
        add(Okbutton);
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint start");
        if (gevonden == true) {
            g.drawString("Dit getal is gevonden in de Index", 20, 50);
            g.drawString("Aantal x gevonden = " + index, 20, 70);
        } else {
            g.drawString("Dit getal bestaat niet in de Index", 100, 50);
        }
    }

    class OkKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            gevonden = false;
            String s = textField.getText();
            int invoer = Integer.parseInt(s);
            int count =0;
            for (int i = 0; i < getallen.length; i++) {
                if (invoer == getallen[i]) {
                    gevonden = true;
                    count++;
                }
            }
            index = count;
            repaint();
        }
    }
}