import java.util.Scanner;
class MyOuter {
    private  String x = "Outer2";
    void doStuff(){
        class MyInner {
            public  void seeOuter() {
                System.out.println("Outer x is " + x);
            }
        }
        MyInner ml = new MyInner();
        ml.seeOuter();
    }
}

public class primerInnerLocalClasses {

}
