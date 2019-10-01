import java.security.spec.RSAOtherPrimeInfo;

class MyOuter1{
    private int x = 7;
    class MyInner1{
        public void seeOuter1() {
            System.out.println("Outer x is " + x);
            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + MyOuter1.this.x);
        }

    }
    void newMyInner(){
        MyInner1 m = new MyInner1();
        m.seeOuter1();
    }
}
public class primerInnerClass {


    public static void main(String[] args) {
        MyOuter1 mo = new MyOuter1();
        mo.new MyInner1();   // первый вариант
        MyOuter1.MyInner1 inner = mo.new MyInner1(); // второй вариант
        inner.seeOuter1();
        MyOuter1.MyInner1 inner2 = new MyOuter1().new MyInner1(); // третий вариант
        inner2.seeOuter1();
    }
}
