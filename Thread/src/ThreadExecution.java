// первый подход на базе класса Thread
class MyThread extends Thread {
    @Override
    public void run() {
                System.out.println("Important job running in MyThread");
    }
}


public class ThreadExecution {
    public static void main(String[] args) {
        // 2-й этап
        MyThread t = new MyThread();
        // 3-й этап
        t.start(); // Все приложение многопоточное
        System.out.println("Thread  main");
    }
}
