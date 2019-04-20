package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;


public class Gui extends JFrame  {

    private static final String ABOUT = "src/Files/about.txt";

    public Gui() {
        setTitle("Лабораторные задачи");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 200, 400, 270);
        setResizable(false);
        setLayout(new FlowLayout());

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("src/Files/politeh.png"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Not found background picture",
                    "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        if (image != null) {
            JLabel label = new JLabel(new ImageIcon(image));
            add(label);
        }

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);
        menuBar.add(file);
        exit.addActionListener(a -> System.exit(1));

        JMenu laboratories = new JMenu("Laboratories");
        JMenu laba1 = new JMenu("Laboratory 1");
        JMenuItem laba1A = new JMenuItem("A");
        JMenuItem laba1B = new JMenuItem("B");

        laba1.add(laba1A);
        laba1A.addActionListener(a -> new GuiLaba1A());

        laba1.add(laba1B);
        laba1B.addActionListener(a -> new GuiLaba1B());

        laboratories.add(laba1);

        JMenu laba2 = new JMenu("Laboratory 2");
        JMenuItem laba2A = new JMenuItem("A");
        JMenuItem laba2B = new JMenuItem("B");

        laba2.add(laba2A);
        laba2A.addActionListener(a -> JOptionPane.showMessageDialog(null, "Runtime error!",
                "", JOptionPane.ERROR_MESSAGE));

        laba2.add(laba2B);
        laba2B.addActionListener(a -> new GuiLaba2B());

        laboratories.add(laba2);

        JMenu laba3 = new JMenu("Laboratory 3");
        JMenuItem laba3A = new JMenuItem("A");
        JMenuItem laba3B = new JMenuItem("B");

        laba3.add(laba3A);
        laba3A.addActionListener(a -> new GuiLaba3A());

        laba3.add(laba3B);
        laba3B.addActionListener(a -> new GuiLaba3B());

        laboratories.add(laba3);

        menuBar.add(laboratories);

        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");
        help.add(about);
        menuBar.add(help);

        about.addActionListener( a -> JOptionPane.showMessageDialog(null, printAbout()));

        setJMenuBar(menuBar);

        setVisible(true);
    }

    private StringBuilder printAbout(){
        String s;
        StringBuilder x = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(ABOUT))) {
            while ((s = reader.readLine()) != null) {
                x.append(s).append("\n");
//                x += s + "\n";
            }
        }catch (IOException e){
        JOptionPane.showMessageDialog(null,"Not Found description");
        }
        return x;
    }

}