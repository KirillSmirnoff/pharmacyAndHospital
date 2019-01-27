package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLaba2B extends JFrame {

   private JTextArea textArea = new JTextArea();
    private int x,maxBoundary, minBoundary;

    public GuiLaba2B() {

        setTitle("Лабораторная 2B");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(1000, 100, 640, 480);
        setResizable(false);
        setLayout(null);
        textArea.setLineWrap(true);


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

        JTextField textField = new JTextField();
        add(textField);
        textField.setBounds(450, 60, 100, 25);

        JTextField textField1 = new JTextField();
        add(textField1);
        textField1.setBounds(450, 90, 100, 25);

        JTextField textField2 = new JTextField();
        add(textField2);
        textField2.setBounds(450, 120, 100, 25);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        scrollPane.setBounds(25, 220, 590, 220);

        JButton button = new JButton("Расчитать");
        add(button);
        button.setBounds(250, 175, 110, 25);
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

    void calculate(){
        textArea.append("GOOOOOOOL");
    }
}



/*
 * Вводится последовательность целых чисел, 0 - конец последлвательности. Найти количество совершенных  и простых чисел
 */