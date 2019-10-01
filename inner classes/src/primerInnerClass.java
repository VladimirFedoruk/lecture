import java.security.spec.RSAOtherPrimeInfo;

class MyOuter{
    private int x = 7;
    class MyInner{
        public void seeOuter() {
            System.out.println("Outer x is " + x);
            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + MyOuter.this.x);
        }

    }
    void newMyInner(){
        MyInner m = new MyInner();
        m.seeOuter();
    }
}
public class primerInnerClass {


    public static void main(String[] args) {
        MyOuter mo = new MyOuter();
        mo.newMyInner();   // первый вариант
        MyOuter.MyInner inner = mo.new MyInner(); // второй вариант
        inner.seeOuter();
        MyOuter.MyInner inner2 = new MyOuter().new MyInner(); // третий вариант
        inner2.seeOuter();
    }
}
