java.sql.Connection;
java.sql.Statement;
java.scl.ResultSet;
class ThreadB extends Thread {
    int total;

    public void run() {

        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            notify();
        }
    }

}



public class Sklad {

    class Zhdun implements Runnable {
        public void run() {

            synchronized (b) {
                try {
                    System.out.println("Жди пока не закончу...");
                    b.wait();
                } catch (InterruptedException e) {

                }
                System.out.println("Итоговое значение   " + b.total);
            }
        }

    }

    ThreadB b = new ThreadB();
    public static void main(String[] args) {
        ThreadB p = new ThreadB();
        p.setName("Первый");
        p.start();

        ThreadB p2 = new ThreadB();
        p2.setName("Второй");
        p2.start();

        ThreadB p3 = new ThreadB();
        p3.setName("Третий");
        p3.start();

        Sklad Sklad = new Sklad();
        Sklad.b.start();
        Thread k = new Thread(r);
        k.setName("Runnable");
        k.start();
        //try {
        //    ThreadB.sleep(500);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        synchronized (p) {
            try {
                System.out.println("Жди пока не закончу...");
                p.wait();
            } catch (InterruptedException e) {

            }
            System.out.println("Итоговое значение   " + p.total);
        }
        System.out.println("Thread  main"); // это подход рекомендуется использовать
    }
}

