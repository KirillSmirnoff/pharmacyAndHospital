package Methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int input(String s) {

        boolean loop = true;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print(s);
                i = sc.nextInt();
                loop= false;
//                sc.close();

            } catch (InputMismatchException e) {
                System.out.println("Try again");
            }
        } while (loop);

        return i;
    }

}
