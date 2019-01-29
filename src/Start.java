import GUI.Gui;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Laboratory lab1a = new Laboratory();
        Gui gui;

        System.out.println("\nДЛЯ РАБОТЫ ПРОГРАММЫ В КОНСОЛЬНОМ РЕЖИМЕ НАЖМИТЕ 1\n" +
                "\nДЛЯ РАБОТЫ ПРОГРАММЫ В ГРАФИЧЕСКОМ РЕЖИМЕ НАЖМИТЕ 2");

        int mode = sc.nextInt();

        if (mode == 2)
            gui = new Gui();
        if (mode == 1)
            System.out.println("\nВЫБЕРИТЕ ЛАБОРАТОРУЮ РАБОТУ ОТ 1-3\nДЛЯ ВЫХОДА НАЖМИТЕ 0");
            int choiceLab = sc.nextInt();

        exit:
        for (; ; ) {
            switch (choiceLab) {
                case 1:
                    System.out.println("ЛАБОРАТОРНАЯ РАБОТА 1 СОСТОИТ ИЗ 2 ЗАДАЧ\n ВЫБЕРИТЕ 1 ИЛИ 2");
//        Scanner sc = new Scanner(System.in);
                    int choice1 = sc.nextInt();
                    if (choice1 == 1)
                        lab1a.laba1A();
                    else if (choice1 == 2)
                        lab1a.laba1B();
                    break exit;
                case 2:
                    System.out.println("ЛАБОРАТОРНАЯ РАБОТА 2 СОСТОИТ ИЗ 2 ЗАДАЧ\n ВЫБЕРИТЕ 1 ИЛИ 2");
//        Scanner sc = new Scanner(System.in);
                    int choice2 = sc.nextInt();
                    if (choice2 == 1)
                        lab1a.laba2A();
                    else if (choice2 == 2)
                        lab1a.laba2B();
                    break exit;
                case 3:
                    System.out.println("ЛАБОРАТОРНАЯ РАБОТА 3 СОСТОИТ ИЗ 2 ЗАДАЧ\n ВЫБЕРИТЕ 1 ИЛИ 2");
//        Scanner sc = new Scanner(System.in);
                    int choice3 = sc.nextInt();
                    if (choice3 == 1)
                        lab1a.laba3A();
                    else if (choice3 == 2)
                        lab1a.laba3B();
                    break exit;
                case 0:
                    break exit;
            }

        }
    }
}
