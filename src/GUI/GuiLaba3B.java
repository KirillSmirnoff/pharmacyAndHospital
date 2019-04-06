package GUI;

import Methods.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLaba3B extends JFrame implements Action {
//public class GuiLaba3B extends JFrame implements DocumentListener {

    private int x, y, maxBoundary, arr, minBoundary;
    public static JTextArea textArea = new JTextArea();
    private JTextField stroka = new JTextField(7);
    private JTextField stolbec = new JTextField(7);
    private JTextField textmax = new JTextField(5);
    private JTextField textmin = new JTextField(5);
    private JButton button = new JButton("Расчитать");

    GuiLaba3B() {
        setTitle("Лабораторнка 3B");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(500, 100, 700, 670);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);

//        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(textArea);
        JLabel opisanie1 = new JLabel("Дана целочисленная прямоугольная матрица. Определить:");
        JLabel opisanie2 = new JLabel("1. Количество отрицательных элеметнов в тех строках, которые содержат хотя ");
        JLabel opisanie3 = new JLabel(" бы один нулевой элемент");
        JLabel opisanie4 = new JLabel("2. Номера строк и столбцов всех седловых точек элементов матрицы");

        JLabel lstroka = new JLabel("Введите количество строк в массиве");
        JLabel lstolbec = new JLabel("Введите количество столбцов в массиве");
        JLabel label1 = new JLabel("Введите минимальное значение массива");
        JLabel label2 = new JLabel("Введите максимальное значение  массива");


        panel.add(opisanie1);
        panel.add(opisanie2);
        panel.add(opisanie3);
        panel.add(opisanie4);
        panel.add(lstroka);
        panel.add(stroka);
        panel.add(lstolbec);
        panel.add(stolbec);
        panel.add(label1);
        panel.add(label2);
        panel.add(textmin);
        panel.add(textmax);
        panel.add(scrollPane);
        panel.add(button);

        opisanie1.setBounds(150, 10, 610, 25);
        opisanie2.setBounds(70, 30, 610, 25);
        opisanie3.setBounds(200, 50, 610, 25);
        opisanie4.setBounds(70, 70, 610, 25);
        lstroka.setBounds(130, 100, 310, 25);
        stroka.setBounds(450, 100, 100, 25);
        stroka.getDocument().addDocumentListener(this);
        lstolbec.setBounds(130, 130, 310, 25);
        stolbec.setBounds(450, 130, 100, 25);
        stolbec.getDocument().addDocumentListener(this);
        label1.setBounds(130, 160, 300, 25);
        textmin.setBounds(450, 160, 100, 25);
        textmin.getDocument().addDocumentListener(this);
        label2.setBounds(130, 190, 310, 25);
        textmax.setBounds(450, 190, 100, 25);
        textmax.getDocument().addDocumentListener(this);
        button.setBounds(300, 230, 110, 25);
        button.setEnabled(false);
        scrollPane.setBounds(28, 270, 650, 350);

        getContentPane().add(panel);

        button.addActionListener(e -> {
            x = Integer.parseInt(stroka.getText());
            y = Integer.parseInt(stolbec.getText());
            maxBoundary = Integer.parseInt(textmax.getText());
            minBoundary = Integer.parseInt(textmin.getText());
            calculate();
        });

        setVisible(true);
    }

    private void calculate() {
        MyRandom random = new MyRandom(maxBoundary, minBoundary);
        NegativeNumber negative = new NegativeNumber();
        SaddlePoint saddle = new SaddlePoint();

        int[][] matrix = new int[x][y];      //инициализация массива
        random.randomToArray(matrix, x, y);      //метод записи в  масив значений с помошью RANDOM

        textArea.append("\n Содержимое массива\n");

        for (int f = 0; f < x; f++) {
            for (int h = 0; h < y; h++) {
                arr = matrix[f][h];
                textArea.append(String.format("%5d", arr));
            }
            textArea.append("\n");
        }

        negative.negativeNumberWithZeroGui(matrix, x, y);
        saddle.saddlePointGui(matrix, x, y);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        action(button,stroka,stolbec,textmax,textmin);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        action(button,stroka,stolbec,textmax,textmin);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }

//    void action() {
//        if (!(stroka.getText().equals("") || stolbec.getText().equals("") ||
//                textmax.getText().equals("") || textmin.getText().equals("")))
//            button.setEnabled(true);
//        else
//            button.setEnabled(false);
//    }
}