class MyRunnable implements Runnable {
    public void run() {

        for (int i = 0; i < 100; i++) {

            System.out.println(Thread.currentThread().getName() + " поток притормозил на  " + "c. и сделал " + i + "-й шаг");
        }
    }

}

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        t.join();
        System.out.println("Thread  main"); // это подход рекомендуется использовать
    }
}
