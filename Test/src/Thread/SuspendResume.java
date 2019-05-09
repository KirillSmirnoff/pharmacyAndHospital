package Thread;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока one");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока one");
            ob2.mysuspend();
            System.out.println("Приостановка потока two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобновление потока two");
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        try {
            System.out.println("ожидание завершение потков");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
