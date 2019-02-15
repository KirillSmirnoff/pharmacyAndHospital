package GUI;

import Methods.Formula;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLaba1A extends JFrame {

    public static JTextArea textArea = new JTextArea();
    private int x,y;
    public GuiLaba1A(){

        setTitle("Лабораторная 1А");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(1000, 100, 640, 480);
        setResizable(false);
        setLayout(null);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JLabel opisanie = new JLabel("ПРОГРАММА РАСЧЕТА ПО ДВУМ ФОРМУЛАМ С ВВОДОМ ИСХОДНЫХ ДАННЫХ");
        add(opisanie);
        opisanie.setBounds(50, 10, 610, 25);


        JLabel opisanie3 = new JLabel("Исходные данные первой переменной");
        add(opisanie3);
        opisanie3.setBounds(90, 60, 300, 25);

        JLabel opisanie4 = new JLabel("Исходные данные второй переменной");
        add(opisanie4);
        opisanie4.setBounds(90, 90, 300, 25);

        JTextField textField = new JTextField();
        add(textField);
        textField.setBounds(450, 60, 100, 25);

        JTextField textField1 = new JTextField();
        add(textField1);
        textField1.setBounds(450, 90, 100, 25);


        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        scrollPane.setBounds(25, 180, 590, 260);

        JButton button = new JButton("Расчитать");
        add(button);
        button.setBounds(250, 135, 110, 25);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Integer.parseInt(textField.getText());
                y = Integer.parseInt(textField1.getText());
                calculate();
            }
        });

        setVisible(true);
    }

    void calculate(){
        Formula f = new Formula();
        f.solveGui(x,y);

    }
}
