
class MyTania implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " prygart ot radosti " + i);
        }
    }

}


class MyRicky implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " moet pol " + i);
        }

    }
}


class MyMartin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " gotovit edu " + i);
        }

    }
}

public class InterfRunnable {
    public static void main(String[] args) {
        // 2-й этап
        MyTania r = new MyTania();
        Thread t = new Thread(r);
        t.setName("Tania");

        MyRicky k = new MyRicky();
        Thread t2 = new Thread(k);
        t2.setName("Ricky");

        MyMartin s = new MyMartin();
        Thread t3 = new Thread(s);
        t3.setName("Martin");

        // 3-й этап
        t.start(); // Все приложение многопоточное
        t2.start();
        t3.start();
        System.out.println("Thread  main"); // это подход рекомендуется использовать
    }


}
