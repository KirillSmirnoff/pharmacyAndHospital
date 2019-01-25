package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gui extends JFrame {
GuiLaba3A guiLaba3A;
GuiLaba3B guiLaba3B;
    public Gui() {
        this.setTitle("Лабораторные задачи");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
//           this.setBounds(1000, 100, 640, 480);
        this.setSize(400, 240);
        this.setResizable(false);
//        this.setLayout(new FlowLayout());

//        JLabel label = new JLabel("Лабораторный работы состоят из трех задач в каждой по залания");

        JButton button1A = new JButton("A");
        JButton button1B = new JButton("B");
        JButton button2A = new JButton("A");
        JButton button2B = new JButton("B");
        JButton button3A = new JButton("A");
        JButton button3B = new JButton("B");

//        JPanel panel1 = new JPanel(null);


        JPanel panel2 = new JPanel(null);
        panel2.setLayout(new FlowLayout());
        panel2.add(button1A);
        panel2.add(button1B);

        JPanel panel3 = new JPanel(null);
        panel3.setLayout(new FlowLayout());
        panel3.add(button2A);
        panel3.add(button2B);

        JPanel panel4 = new JPanel(null);
        panel4.setLayout(new FlowLayout());

        panel4.add(button3A);
        button3A.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiLaba3A = new GuiLaba3A();
            }
        });

        panel4.add(button3B);
        button3B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiLaba3B = new GuiLaba3B();
            }
        });

        JTabbedPane tabbedPane1 = new JTabbedPane(JTabbedPane.BOTTOM);
//        tabbedPane1.setBounds(10,36,600,400);
        tabbedPane1.addTab("Aboat", new JLabel("Лабораторные работы состоят из трех задач в каждой\n по 2 залания"));

        tabbedPane1.addTab("Лаба 1",panel2);  // включаем панель в состав вкладки CHEAT
        tabbedPane1.addTab("Лаба 2",panel3);
        tabbedPane1.addTab("Лаба 3",panel4);

        this.add(tabbedPane1);


        this.setVisible(true);

    }


/*
// Добавить слушатели действий
            jЬtnUp. add.ActionListener (this); ..... 1--------,� д�авn ннесnуwотеnей
!
    j btnDown. add.ActionListener ( this) ; ..
    деистами дпя кнопок
    // Добавить кнопки в панель содержимого
    j frrn. add (jЬtnUp) ; ..... 1-------�f- Добавnение кнопок
    j f rm . а dd ( j Ьtn Down) ; ..

    puЬlic void actionPerformed(ActionEvent ае)
if (ае. getActionCommand () . equals ( "Up")) -4---- Исnоnьзованне команды действия
    дпя опредеnения нажатой кнопки
jlab.setText("You pressed Up.");
*/

}
