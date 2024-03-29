class МойПоток implements Runnable {
    int s = 0;
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(s = (5 + ((int) (Math.random() * 15 + 1)))*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " поток притормозил на  " + s/1000 + "c. и сделал " + i + "-й шаг");
        }
    }

}

public class ThreadZakreplenie {
    public static void main(String[] args) {
        МойПоток r = new МойПоток();
        Thread p = new Thread(r);
        p.setName("Первый");

        Thread p2 = new Thread(r);
        p2.setName("Второй");

        Thread p3 = new Thread(r);
        p3.setName("Третий");

        p.start();
        p2.start();
        p3.start();
        System.out.println("Thread  main"); // это подход рекомендуется использовать
    }
}
