package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;


public class Gui extends JFrame {

    private GuiLaba1A guiLaba1A;
    private GuiLaba1B guiLaba1B;
    private GuiLaba2B guiLaba2B;
    private GuiLaba3A guiLaba3A;
    private GuiLaba3B guiLaba3B;

    private static final String ABOUT = "about.txt";

    public Gui() {
        setTitle("Лабораторные задачи");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 200, 400, 270);
        setResizable(false);
        setLayout(new FlowLayout());

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("politeh.png"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Not found background picture",
                    "MESSAGE",JOptionPane.INFORMATION_MESSAGE );
        }
        if (image!=null) {
            JLabel label = new JLabel(new ImageIcon(image));
            this.add(label);
        }

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);
        menuBar.add(file);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });

        JMenu laboratories = new JMenu("Laboratories");
        JMenu laba1 = new JMenu("Laboratory 1");
        JMenuItem laba1A = new JMenuItem("A");
        JMenuItem laba1B = new JMenuItem("B");
        laba1.add(laba1A);
        laba1A.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiLaba1A = new GuiLaba1A();
            }
        });
        laba1.add(laba1B);
        laba1B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiLaba1B = new GuiLaba1B();
            }
        });
        laboratories.add(laba1);

        JMenu laba2 = new JMenu("Laboratory 2");
        JMenuItem laba2A = new JMenuItem("A");
        JMenuItem laba2B = new JMenuItem("B");
        laba2.add(laba2A);
        laba2A.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // not do work
            }
        });
        laba2.add(laba2B);
        laba2B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiLaba2B = new GuiLaba2B();
            }
        });
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
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, printAbout());
                }
        });

        this.setJMenuBar(menuBar);

        setVisible(true);
    }

    private StringBuilder printAbout(){
        String s;
        StringBuilder x = new StringBuilder();
        try(BufferedReader about = new BufferedReader(new FileReader(ABOUT))) {
            while ((s = about.readLine()) != null) {
                x.append(s+"\n");
//                x += s + "\n";
            }
        }catch (IOException e){
        JOptionPane.showMessageDialog(null,"Not Found description");
        }
        return x;
    }

}