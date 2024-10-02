package calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton resetButton;

    public Calc() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double i, j;
                i = Double.parseDouble(textField1.getText());
                j = Double.parseDouble(textField2.getText());

                double resultado=0;

                switch (textField3.getText()) {
                    case "+":
                        resultado = i + j;
                        break;
                    case "-":
                        resultado = i - j;
                        break;
                    case "*":
                        resultado = i * j;
                        break;
                    case "/":
                        resultado = i / j;
                        break;
                }
                textField4.setText(String.valueOf(resultado));
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");

            }
        });
    }

    public static void main(String[] args) {
        Calc dialog = new Calc();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
