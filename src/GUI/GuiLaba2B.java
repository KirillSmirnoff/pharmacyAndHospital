package GUI;

import Methods.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.Arrays;

public class GuiLaba2B extends JFrame implements DocumentListener {

    private static JTextArea textArea = new JTextArea();
    private JButton button = new JButton("Расчитать");
    private JTextField textField2 = new JTextField();
    private JTextField textField1 = new JTextField();
    private JTextField textField = new JTextField();
    private int x, maxBoundary, minBoundary;

    public GuiLaba2B() {

        setTitle("Лабораторная 2B");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(1000, 100, 640, 480);
        setResizable(false);
        setLayout(null);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JLabel opisanie = new JLabel("Найти количество совершенных  и простых чисел в массиве");
        add(opisanie);
        opisanie.setBounds(90, 10, 610, 25);

        JLabel opisanie3 = new JLabel("Введите количество элементов  массива");
        add(opisanie3);
        opisanie3.setBounds(90, 60, 300, 25);

        JLabel opisanie4 = new JLabel("Введите минимальное значение  массива");
        add(opisanie4);
        opisanie4.setBounds(90, 90, 300, 25);

        JLabel opisanie5 = new JLabel("Введите максимальное значение  массива");
        add(opisanie5);
        opisanie5.setBounds(90, 125, 350, 25);

        add(textField);
        textField.getDocument().addDocumentListener(this);
        textField.setBounds(450, 60, 100, 25);

        add(textField1);
        textField1.getDocument().addDocumentListener(this);
        textField1.setBounds(450, 90, 100, 25);

        add(textField2);
        textField2.getDocument().addDocumentListener(this);
        textField2.setBounds(450, 120, 100, 25);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        scrollPane.setBounds(25, 220, 590, 220);

        add(button);
        button.setEnabled(false);
        button.setBounds(250, 175, 110, 25);

        button.addActionListener(e -> {
            x = Integer.parseInt(textField.getText());
            maxBoundary = Integer.parseInt(textField2.getText());
            minBoundary = Integer.parseInt(textField1.getText());
            calculate();
        });

        setVisible(true);
    }

    void calculate() {

        MyRandom rdm = new MyRandom(maxBoundary, minBoundary);
        int[] array = new int[x];
        rdm.randomToArray(array, x);

        textArea.append("\nЭлементы массива" + Arrays.toString(array) + "\n");

        CompositeNumbers composite = new CompositeNumbers();
        PrimeNumbers prime = new PrimeNumbers();
        PerfectNumbers perfect = new PerfectNumbers();

        composite.CompositeNumbersCalculate(array);
        perfect.perfectNumbersCalculate(array);
        prime.PrimeNumbersCalculate(array);

        textArea.append(composite.toString());
        textArea.append(prime.toString());
        textArea.append(perfect.toString());
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
        if (!(textField.getText().equals("") || textField1.getText().equals("") || textField2.getText().equals("")))
            button.setEnabled(true);
        else
            button.setEnabled(false);
    }
}


/*
 * Вводится последовательность целых чисел, 0 - конец последлвательности. Найти количество совершенных  и простых чисел
 */