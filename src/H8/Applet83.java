package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Applet83 extends Applet {
    TextField tv1;
    Button OkKnop;


    @Override
    public void init() {
        tv1 = new TextField("", 5);
        OkKnop = new Button("Ok");
        OkKnop.addActionListener(new OkKnopListener());

        add(tv1);
        add(OkKnop);

    }


    public class OkKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer = tv1.getText();
            double input = Double.parseDouble(invoer);
            double uitkomst = input * 1.21;
            tv1.setText(String.valueOf(uitkomst));
        }
    }
}


