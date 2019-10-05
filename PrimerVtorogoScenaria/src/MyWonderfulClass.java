public class MyWonderfulClass {
    void go () {
        Bar b = new Bar();
        b.doStuff(new Foo() {
            @Override
            public void foof() {
                System.out.println("All ok");
            }
        });
    }
}
interface Foo {
    void foof();
}
class Bar {
    void doStuff(Foo f){
        f.foof();
    }
}