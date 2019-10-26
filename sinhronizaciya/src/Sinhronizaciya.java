import java.sql.SQLOutput;

class Account {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

public class Sinhronizaciya implements Runnable {
    private Account acct = new Account();
    synchronized private void makeWithdrawal(int amt) throws InterruptedException {
        if(acct.getBalance()>=amt){
            System.out.println(Thread.currentThread().getName()+ " is going to withdraw");
            Thread.sleep(10);
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName()+ " completes the withdrawal");
        }
        else {
            System.out.println("Not enought in account for " + Thread.currentThread().getName()+ " to withdraw " + acct.getBalance());

        }
    }


    public static void main(String[] args) {
        Sinhronizaciya r = new Sinhronizaciya();
        Thread one = new Thread(r);
        one.setName("Fred");

        Thread two = new Thread(r);
        two.setName("Lucy");


        one.start();
        two.start();
    }

    public void run() {
        for (int x = 0; x < 5; x++) {
            try {
                makeWithdrawal(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }

        }
    }
}
