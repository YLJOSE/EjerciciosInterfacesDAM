package calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcT extends JDialog {
    private JPanel contentPane;
    private JTextField visor;
    private JButton buttonPorcent;
    private JButton converButton;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton buttonDel;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton buttonSeparator;
    private JButton buttonMult;
    private JButton buttonDiv;
    private JButton buttonRest;
    private JButton buttonSum;
    private JButton buttonEquals;
    private JButton ACButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private String textVisor = "";

    public CalcT() {

        setContentPane(contentPane);
        setModal(true);
        // control button 1
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "1";
                visor.setText(textVisor);
            }
        });
        // control button 2
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "2";
                visor.setText(textVisor);
            }
        });
        // control button 3
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "3";
                visor.setText(textVisor);
            }
        });
        // control button 4
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "4";
                visor.setText(textVisor);
            }
        });
        // control button 5
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "5";
                visor.setText(textVisor);
            }
        });
        // control button 6
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "6";
                visor.setText(textVisor);
            }
        });
        // control button 7
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "7";
                visor.setText(textVisor);
            }
        });
        // control button 8
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "8";
                visor.setText(textVisor);
            }
        });
        // control button 9
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "9";
                visor.setText(textVisor);
            }
        });
        // control button 0
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "0";
                visor.setText(textVisor);
            }
        });
        // button multiplication
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "*";
                visor.setText(textVisor);
            }
        });
        // button division
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "/";
                visor.setText(textVisor);
            }
        });
        // button rest
        buttonRest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "-";
                visor.setText(textVisor);
            }
        });
        // button suma
        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor += "+";
                visor.setText(textVisor);
            }
        });
        //button clear
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVisor = "";
                visor.setText(textVisor);
            }
        });
        //button delete
        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ayuda = "";

               for(int i =0;i<textVisor.length()-1;i++){
                   ayuda+= textVisor.charAt(i);
               }
                textVisor = ayuda;
               visor.setText(textVisor);
            }
        });
        // button eq
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        CalcT dialog = new CalcT();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
