package GUI;

import java.awt.event.*;//для отслеживания нажатия на кнопки
import javax.swing.*;// формы надписи кнопки


 public class GUI extends JFrame {
//    Laboratory test = new Laboratory();

    private JButton button = new JButton("Расчитать");
    private JPanel panel = new JPanel();
    private JTextField input1 = new JTextField("", 5);
    private JTextField input2 = new JTextField("", 5);
    private JLabel label1 = new JLabel("Введите исходные данные");
    private JLabel label2 = new JLabel("Исходные данные первой переменной");
    private JLabel label3 = new JLabel("Исходные данные второй переменной");
    //JRadioButton radio2 = new JRadioButton("select");
    //JCheckBox checkbox = new JCheckBox("check", false);


    public GUI() {
        this.setTitle("ПРОГРАММА РАСЧЕТА");
        this.setBounds(1000, 100, 450, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel.setLayout(null);
        this.add(panel);
        this.panel.add(input1);
        this.panel.add(input2);
        this.panel.add(button);
        this.panel.add(label1);
        this.panel.add(label2);
        this.panel.add(label3);
        this.panel.add(input2);
        this.panel.add(input2);
        input1.setBounds(330,40,110,25);
        input2.setBounds(330,90,110,25);
        button.setBounds(330,140,110,25);
        label1.setBounds(230,10,250,25);
        label2.setBounds(10,40,350,25);
        label3.setBounds(10,90,350,25);




        //Container container = this.getContentPane();//forma v kotoruy my mozem pome6at wse 4to ugodno kporki polya i tomu podobnoe
        //container.setLayout(new GridLayout(3,3,2,2));
        //container.add(label);
        //container.add(input);
        //container.add(input2);
        //ButtonGroup group = new ButtonGroup();
        //group.add(radio1);
        //group.add(radio2);
        //container.add(radio1);
        //radio1.setSelected(true);
        //container.add(checkbox);*/

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int g = Integer.parseInt(input1.getText());
                int r = Integer.parseInt(input2.getText());
//               test.solve( g,r);
//               System.out.println(Arrays.toString(test.solve(g,r)));

//                JOptionPane.showMessageDialog(null, Arrays.toString(test.solve1(g,r))+"\n"+Arrays.toString(test.solve2(g,r)), "Результаты по двум формулам",JOptionPane.INFORMATION_MESSAGE );
            }

        });

    }


}
