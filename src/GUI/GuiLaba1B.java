package GUI;

import Methods.Fraction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLaba1B extends JFrame {

    private int fr1num, fr1den, fr2num, fr2den, fr3num, fr3den;
    JTextArea textArea = new JTextArea();

    public GuiLaba1B() {

        setTitle("Лабораторная 1А");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(1000, 100, 640, 480);
        setResizable(false);
        setLayout(null);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JLabel opisanie = new JLabel("ОПРЕДЕЛИТЬ КАКАЯ ИЗ ТРЕХ ДРОБЕЙ НАИБОЛЬШАЯ");
        add(opisanie);
        opisanie.setBounds(120, 10, 610, 25);

        JLabel opisanie1 = new JLabel("Введите числители и знаменатели дробей");
        add(opisanie1);
        opisanie1.setBounds(160, 50, 610, 25);

        JLabel fraction1 = new JLabel("Дробь 1");
        add(fraction1);
        fraction1.setBounds(40, 110, 100, 25);
        JTextField textField = new JTextField();
        add(textField);
        textField.setBounds(120, 100, 40, 25);

        JTextField textField1 = new JTextField();
        add(textField1);
        textField1.setBounds(120, 130, 40, 25);

        JLabel fraction2 = new JLabel("Дробь 2");
        add(fraction2);
        fraction2.setBounds(220, 110, 100, 25);
        JTextField textField2 = new JTextField();
        add(textField2);
        textField2.setBounds(300, 100, 40, 25);

        JTextField textField3 = new JTextField();
        add(textField3);
        textField3.setBounds(300, 130, 40, 25);


        JLabel fraction3 = new JLabel("Дробь 3");
        add(fraction3);
        fraction3.setBounds(410, 110, 100, 25);
        JTextField textField4 = new JTextField();
        add(textField4);
        textField4.setBounds(490, 100, 40, 25);

        JTextField textField5 = new JTextField();
        add(textField5);
        textField5.setBounds(490, 130, 40, 25);

        JButton button = new JButton("Расчитать");
        add(button);
        button.setBounds(260, 170, 110, 25);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        scrollPane.setBounds(25, 220, 590, 220);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr1num = Integer.parseInt(textField.getText());
                fr1den = Integer.parseInt(textField1.getText());
                fr2num = Integer.parseInt(textField2.getText());
                fr2den = Integer.parseInt(textField3.getText());
                fr3num = Integer.parseInt(textField4.getText());
                fr3den = Integer.parseInt(textField5.getText());
                calculate();
            }
        });

        setVisible(true);
    }

    private void calculate() {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction f3 = new Fraction();

        double a = f1.guiFractionToDecimal(fr1num, fr1den);
        double b = f2.guiFractionToDecimal(fr2num, fr2den);
        double c = f3.guiFractionToDecimal(fr3num, fr3den);

        textArea.append("\nвы ввели дроби\n" + a + "\n" + b + "\n" + c + "\n");

        if ((a >= b) && (a >= c))
            textArea.append("\nНаибольшая дробь " + a);
        else if ((b >= a) && (b >= c))
            textArea.append("\nНаибольшая дробь " + b);
        else if ((c >= b) && (c >= a))
            textArea.append("\nНаибольшая дробь " + c);
    }

}
