package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Applet123 extends Applet {
    TextField[] textFields;
    Button button;
    int aantalVelden = 5;

    @Override
    public void init() {
        textFields = new TextField[5];
        for (int i = 0; i < aantalVelden; i++) {
            textFields[i] = new TextField();
            add(textFields[i]);



        }
        button = new Button("Ok");
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] input = new int[aantalVelden];
                for (int i = 0; i < aantalVelden; i++) {
                    input[i] = Integer.parseInt(textFields[i].getText());
                }
                Arrays.sort(input);
                for (int i = 0; i <aantalVelden ; i++) {
                    textFields[i].setText(String.valueOf(input[i]));
                }
            }
        });
    }
}
