
public class DeadLockRisk {
    private class Resource {
        public int value;
    }

    class ResourceA implements Runnable {
        public void run() {

            for (int i = 0; i < 100; i++) {
                read();
                System.out.println(Thread.currentThread().getName()+i);
            }
        }

    }

    class ResourceB implements Runnable {
        public void run() {

            for (int i = 0; i < 100; i++) {
                write(1,2);
                System.out.println(Thread.currentThread().getName()+i);
            }
        }


    }


    private Resource resourceA = new Resource();
    private Resource resourceB = new Resource();

    public int read() {
        synchronized (resourceA) {
            synchronized (resourceB) {
                return resourceB.value + resourceA.value;
            }
        }
    }

    public void write(int a, int b) {
        synchronized (resourceB) {
            synchronized (resourceA) {
                resourceA.value = a;
                resourceB.value = b;
            }
        }
    }


    public static void main(String[] args) {
        DeadLockRisk d = new DeadLockRisk();

        ResourceA resourceA = d.new ResourceA();
        Thread A = new Thread(resourceA);
        A.setName("Первый поток");


        ResourceB resourceB = d.new ResourceB();
        Thread B = new Thread(resourceB);
        B.setName("Второй поток");

        A.start();
        B.start();

        System.out.println("Thread  main");
    }


}
