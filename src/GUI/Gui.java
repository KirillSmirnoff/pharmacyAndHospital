package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class Gui extends JFrame {
GuiLaba3A guiLaba3A;
GuiLaba3B guiLaba3B;
GuiLaba2B guiLaba2B;

    public Gui() {
        setTitle("Лабораторные задачи");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLocationRelativeTo(null);
        setBounds(700, 200, 400, 240);
//        this.setSize(400, 240);
        setResizable(false);
        setLayout(new FlowLayout());
//        this.setBackground(g);

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);
        menuBar.add(file);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        JMenu laboratories = new JMenu("Laboratories");
        JMenu laba1 = new JMenu("Laboratory 1");
        JMenuItem laba1A = new JMenuItem("A");
        JMenuItem laba1B = new JMenuItem("B");
        laba1.add(laba1A);
        laba1.add(laba1B);
        laboratories.add(laba1);

        JMenu laba2 = new JMenu("Laboratory 2");
        JMenuItem laba2A = new JMenuItem("A");
        JMenuItem laba2B = new JMenuItem("B");
        laba2.add(laba2A);
        laba2.add(laba2B);
        laboratories.add(laba2);

        JMenu laba3 = new JMenu("Laboratory 3");
        JMenuItem laba3A = new JMenuItem("A");
        JMenuItem laba3B = new JMenuItem("B");
        laba3.add(laba3A);

        laba3A.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiLaba3A = new GuiLaba3A();
            }
        });

        laba3.add(laba3B);

        laba3B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiLaba3B = new GuiLaba3B();
            }
        });

        laboratories.add(laba3);
        menuBar.add(laboratories);



        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");
        help.add(about);
        menuBar.add(help);


        this.setJMenuBar(menuBar);

        setVisible(true);
    }

/*
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
*/

}
