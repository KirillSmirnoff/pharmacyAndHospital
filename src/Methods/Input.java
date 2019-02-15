package Methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int input(String s) {

        boolean loop = true;
        int i = 0;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(s);
                i = sc.nextInt();
                loop= false;

            } catch (InputMismatchException e) {
                System.out.println("Try again");
            }
        } while (loop);

        return i;
    }

}
