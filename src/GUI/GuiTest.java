package GUI;

import javax.swing.*;
import java.awt.*;


public class GuiTest {

    // Создать новый контейнер JFrarne



        JFrame jFrame = new JFrame("Laboratory Work");
        JButton laba1 = new JButton("Laboratory 1");
        JButton laba2 = new JButton("Laboratory 2");
        JButton laba3 = new JButton("Laboratory 3");
        JLabel jLabel = new JLabel("what");

       public void gui() {
           jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
           jFrame.setSize(500, 150);
        jFrame.setResizable(false);

//           jFrame.setBounds(1000, 100, 450, 200);
           jFrame.setLayout(new FlowLayout());
//            jFrame.add(jLabel);
           jFrame.add(laba1);
           jFrame.add(laba2);
           jFrame.add(laba3);
           jFrame.setVisible(true);
       }




/*// Задать объект FlowLayout для менеджера компоновки
jfrrn.setLayout(new FlowLayout());
// Задать исходные размеры фрейма
jfrrn.setSize(220, 90);
// Прекратить работу программы, если
// пользователь закрывает приложение
jfrrn.setDefaultCloseOperation(JFrarne.EXIT_ON_CLOSE);
    // Создать две кнопки
    JButton jbtnUp = new JButton("Up"); ..... 1-------�
    f- Соэданне двух кнопок
    JButton jЬtnDown = new JButton("Down"); ..... о-----�-
// Добавить слушатели действий
            jЬtnUp. add.ActionListener (this); ..... 1--------,� д�авn ннесnуwотеnей
!
    j btnDown. add.ActionListener ( this) ; ..
    деистами дпя кнопок
    // Добавить кнопки в панель содержимого
    j frrn. add (jЬtnUp) ; ..... 1-------�f- Добавnение кнопок
    j f rm . а dd ( j Ьtn Down) ; ..
            • панеnь содержнмоrо
// Создать метку
    jlab = new JLabel("Press а button.");
// Добавить метку во фрейм
jfrm.add(jlaЬ);
// Отобразить фрейм
jfrm.setVisiЫe(true);
// Обработать события кнопки
-4---- Об ра ботка событий кнопки
    puЬlic void actionPerformed(ActionEvent ае)
if (ае. getActionCommand () . equals ( "Up")) -4---- Исnоnьзованне команды действия
    дпя опредеnения нажатой кнопки
jlab.setText("You pressed Up.");
else
        jlab.setText("You pressed down. ");*/
}
