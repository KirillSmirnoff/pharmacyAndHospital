package GUI;

import Methods.Fraction;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class GuiLaba1B extends JFrame implements DocumentListener {

    private int fr1num, fr1den, fr2num, fr2den, fr3num, fr3den;
    private JTextArea textArea = new JTextArea();
    private JButton button = new JButton("Расчитать");
    private JTextField textField5 = new JTextField();
    private JTextField textField4 = new JTextField();
    private JTextField textField3 = new JTextField();
    private JTextField textField2 = new JTextField();
    private JTextField textField1 = new JTextField();
    private JTextField textField = new JTextField();

    GuiLaba1B() {

        setTitle("Лабораторная 1Б");
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

        textField.getDocument().addDocumentListener(this);
        add(textField);
        textField.setBounds(120, 100, 40, 25);

        textField1.getDocument().addDocumentListener(this);
        add(textField1);
        textField1.setBounds(120, 130, 40, 25);

        JLabel fraction2 = new JLabel("Дробь 2");
        add(fraction2);
        fraction2.setBounds(220, 110, 100, 25);

        textField2.getDocument().addDocumentListener(this);
        add(textField2);
        textField2.setBounds(300, 100, 40, 25);

        textField3.getDocument().addDocumentListener(this);
        add(textField3);
        textField3.setBounds(300, 130, 40, 25);

        JLabel fraction3 = new JLabel("Дробь 3");
        add(fraction3);
        fraction3.setBounds(410, 110, 100, 25);

        textField4.getDocument().addDocumentListener(this);
        add(textField4);
        textField4.setBounds(490, 100, 40, 25);

        textField5.getDocument().addDocumentListener(this);
        add(textField5);
        textField5.setBounds(490, 130, 40, 25);

        button.setEnabled(false);
        add(button);
        button.setBounds(260, 170, 110, 25);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        scrollPane.setBounds(25, 220, 590, 220);

        button.addActionListener(a -> {
            fr1num = Integer.parseInt(textField.getText());
            fr1den = Integer.parseInt(textField1.getText());
            fr2num = Integer.parseInt(textField2.getText());
            fr2den = Integer.parseInt(textField3.getText());
            fr3num = Integer.parseInt(textField4.getText());
            fr3den = Integer.parseInt(textField5.getText());

            calculate();
        });

        setVisible(true);
    }

    private void calculate() {
        Fraction fra1 = new Fraction(fr1num, fr1den);
        Fraction fra2 = new Fraction(fr2num, fr2den);
        Fraction fra3 = new Fraction(fr3num, fr3den);

        double f1 = fra1.fractionToDecimal();
        double f2 = fra2.fractionToDecimal();
        double f3 = fra3.fractionToDecimal();

        textArea.append(String.format("Первая дробь %,.2f %nВтороя дробь %,.2f %nТретья дробь %,.2f %n", f1, f2, f3));
        textArea.append(String.format("%nНаибольшая дробь %,.2f %n%n", Fraction.max(f1, f2, f3)));
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        action();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        action();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }

    void action() {
        if (!(textField.getText().equals("") || textField1.getText().equals("") || textField2.getText().equals("") ||
                textField3.getText().equals("") || textField4.getText().equals("") || textField5.getText().equals("")))
            button.setEnabled(true);
        else
            button.setEnabled(false);

    }
}
