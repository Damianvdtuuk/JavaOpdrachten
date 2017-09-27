package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PORekenMachine extends Applet {
    TextField tv1;
    TextField tv2;

    Button plusKnop;
    Button minKnop;
    Button keerKnop;
    Button deelKnop;

    @Override
    public void init() {
        tv1 = new TextField("", 5);
        tv2 = new TextField("", 5);
        plusKnop = new Button("+");
        plusKnop.addActionListener(new PlusKnopListener());
        minKnop = new Button("-");
        minKnop.addActionListener(new MinKnopListener());
        keerKnop = new Button("X");
        keerKnop.addActionListener(new KeerKnopListener());
        deelKnop = new Button("/");
        deelKnop.addActionListener(new DeelKnopListener());

        add(tv1);
        add(tv2);
        add(plusKnop);
        add(minKnop);
        add(keerKnop);
        add(deelKnop);
    }

    class PlusKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText();
            double input1 = Double.parseDouble(invoer1);
            String invoer2 = tv2.getText();
            double input2 = Double.parseDouble(invoer2);
            double uitkomst = input1 + input2;
            tv1.setText(String.valueOf(uitkomst));
            tv2.setText("");
        }
    }

    class MinKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText();
            double input1 = Double.parseDouble(invoer1);
            String invoer2 = tv2.getText();
            double input2 = Double.parseDouble(invoer2);
            double uitkomst = input1 - input2;
            tv1.setText(String.valueOf(uitkomst));
            tv2.setText("");
        }
    }

    class KeerKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText();
            double input1 = Double.parseDouble(invoer1);
            String invoer2 = tv2.getText();
            double input2 = Double.parseDouble(invoer2);
            double uitkomst = input1 * input2;
            tv1.setText(String.valueOf(uitkomst));
            tv2.setText("");
        }
    }

    class DeelKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tv1.getText();
            double input1 = Double.parseDouble(invoer1);
            String invoer2 = tv2.getText();
            double input2 = Double.parseDouble(invoer2);
            double uitkomst = input1 / input2;
            tv1.setText(String.valueOf(uitkomst));
            tv2.setText("");
        }
    }
}

