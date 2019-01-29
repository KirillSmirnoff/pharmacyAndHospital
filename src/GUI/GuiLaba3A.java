package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import Methods.*;

public class GuiLaba3A extends JFrame {

    private int x, maxBoundary, minBoundary;
    private MaxEvenNumberMinOddNumber maxMin = new MaxEvenNumberMinOddNumber();
    private JTextArea textArea = new JTextArea();

    public GuiLaba3A() {

        setTitle("Лабораторная 3А");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(1000, 100, 640, 480);
        setResizable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        //        this.setLocationRelativeTo(null);
//        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(textArea);
        JPanel panel1 = new JPanel();
        JLabel opisanie = new JLabel(" В целочисленном массиве X(N) найти номера и значение максимального четного");
        JLabel opisanie2 = new JLabel("и минимального нечетного элементов массива");
        JLabel opisanie3 = new JLabel("Введите количество элементов  массива");
        JLabel opisanie4 = new JLabel("Введите минимальное значение  массива");
        JLabel opisanie5 = new JLabel("Введите максимальное значение  массива");

        JTextField textField = new JTextField();
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();

        JButton button = new JButton("Расчитать");

        panel1.setBackground(Color.lightGray);
        panel1.setLayout(null);

        panel1.add(opisanie);
        panel1.add(opisanie2);
        panel1.add(opisanie3);
        panel1.add(opisanie4);
        panel1.add(opisanie5);
        panel1.add(textField);
        panel1.add(textField1);
        panel1.add(textField2);
        panel1.add(scrollPane);
        panel1.add(button);

        opisanie.setBounds(28, 10, 610, 25);
        opisanie2.setBounds(130, 27, 400, 25);
        opisanie3.setBounds(90, 60, 300, 25);
        opisanie4.setBounds(90, 90, 300, 25);
        opisanie5.setBounds(90, 125, 350, 25);
        textField.setBounds(450, 60, 100, 25);
        textField1.setBounds(450, 90, 100, 25);
        textField2.setBounds(450, 120, 100, 25);
        scrollPane.setBounds(25, 220, 590, 220);
        button.setBounds(250, 175, 110, 25);

        getContentPane().add(panel1);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Integer.parseInt(textField.getText());
                maxBoundary = Integer.parseInt(textField2.getText());
                minBoundary = Integer.parseInt(textField1.getText());
                calculate();
            }
        });

        setVisible(true);
    }

    private void calculate() {

        MyRandom rdm = new MyRandom(maxBoundary, minBoundary);
        int[] mass = new int[x];
        rdm.randomToArray(mass, x);
        textArea.append("\nЦелочисленный массив X(N):  " + Arrays.toString(mass) + "\n\n");
        maxMin.maxEvenNumberMinOddNumberGui(mass);
        textArea.append(maxMin.toString());

    }

}