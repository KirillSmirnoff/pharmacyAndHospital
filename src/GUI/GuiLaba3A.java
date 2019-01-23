package GUI;

import javax.swing.*;
import java.awt.*;

public class GuiLaba3A extends JFrame {

    public GuiLaba3A() {
        this.setTitle("Лабораторная 3А");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        this.setLocationRelativeTo(null);
        this.setBounds(1000, 100, 640, 480);
//        this.setSize(450, 200);
        this.setResizable(false);

        JPanel panel1 = new JPanel();
//        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(null);
        JLabel opisanie = new JLabel(" В целочисленном массиве X(N) найти номера и значение максимального четного");
        JLabel opisanie2 = new JLabel("и минимального нечетного элементов массива");
        JLabel opisanie3 = new JLabel("Введите количество элементов  массива");

        JTextField textField = new JTextField();
//        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane();
        JButton button = new JButton("Расчитать");

        panel1.add(opisanie);
        panel1.add(opisanie2);
        panel1.add(opisanie3);
        panel1.add(textField);
        panel1.add(scrollPane);
        panel1.add(button);

        opisanie.setBounds(28, 10, 610, 25);
        opisanie2.setBounds(130, 27, 400, 25);
        opisanie3.setBounds(130, 100, 300, 25);
        textField.setBounds(450, 100, 100, 25);
        scrollPane.setBounds(70,200,500,200);
        button.setBounds(270,150,110,25);

        this.getContentPane().add(panel1);

        this.setVisible(true);
    }
}