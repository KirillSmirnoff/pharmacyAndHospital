package GUI;

import Methods.MyRandom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLaba3B extends JFrame {

    private int x,y, maxBoundary, minBoundary;

    private JTextArea textArea = new JTextArea();

    public GuiLaba3B() {
        this.setTitle("Лабораторнка 3B");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(500, 100, 700, 670);
        this.setResizable(false);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
//        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(textArea);
        JButton button = new JButton("Расчитать");
        JLabel opisanie1 = new JLabel("Дана целочисленная прямоугольная матрица. Определить:");
        JLabel opisanie2 = new JLabel("1. Количество отрицательных элеметнов в тех строках, которые содержат хотя ");
        JLabel opisanie3 = new JLabel(" бы один нулевой элемент");
        JLabel opisanie4 = new JLabel("2. Номера строк и столбцов всех седловых точек элементов матрицы");

        JLabel lstroka = new JLabel("Введите количество строк в массиве");
        JLabel lstolbec = new JLabel("Введите количество столбцов в массиве");
        JLabel label1 = new JLabel("Введите минимальное значение массива");
        JLabel label2 = new JLabel("Введите максимальное значение  массива");

        JTextField stroka = new JTextField(7);
        JTextField stolbec = new JTextField(7);
        JTextField textmax = new JTextField(5);
        JTextField textmin = new JTextField(5);

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

        opisanie1.setBounds(150,10,610,25);
        opisanie2.setBounds(70,30,610,25);
        opisanie3.setBounds(200,50,610,25);
        opisanie4.setBounds(70,70,610,25);
        lstroka.setBounds(130,100,310,25);
        stroka.setBounds(450,100,100,25);
        lstolbec.setBounds(130,130,310,25);
        stolbec.setBounds(450,130,100,25);
        label1.setBounds(130,160,300,25);
        textmin.setBounds(450,160,100,25);
        label2.setBounds(130,190,310,25);
        textmax.setBounds(450,190,100,25);
        button.setBounds(300,230,110,25);
        scrollPane.setBounds(28,270,650,350);

        this.getContentPane().add(panel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Integer.parseInt(stroka.getText());
                y = Integer.parseInt(stolbec.getText());
                maxBoundary = Integer.parseInt(textmax.getText());
                minBoundary = Integer.parseInt(textmin.getText());
                calculate();
            }
        });

        this.setVisible(true);

    }

    private void calculate(){
        MyRandom random = new MyRandom(maxBoundary,minBoundary);

        int[][] matrix = new int[x][y];      //инициализация массива
        random.randomToArray(matrix, x, y);      //метод записи в  масив значений с помошью RANDOM

        textArea.append("\n Содержимое массива\n");

        }
    }
