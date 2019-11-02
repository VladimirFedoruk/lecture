public class Barrel implements Runnable {
    private int value;
    String e = "Empty";
    String f = "full";
    synchronized public void useTank( ) {
        value= (int) (Math.random() * 10)*10;
        if (value>0){
            System.out.println(f+" "+value);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }else{
            System.out.println(e+""+value);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            useTank();
        }
    }
    public static void main(String[] args) {
        Barrel barrel= new Barrel();
        Thread tr1 = new Thread(barrel);
        Thread tr2 = new Thread(barrel);
        tr1.start();
        tr2.start();
    }
}