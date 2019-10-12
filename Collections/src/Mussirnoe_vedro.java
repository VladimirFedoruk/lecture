import java.util.ArrayList;

class Cat {
    public String toString(){
        return (" ^^\n" +
                ">oo<" );
    }
 };

public class Mussirnoe_vedro {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(7);
        list.add(new int[10]);
        list.add(new Object());
        list.add(new Cat());
        list.add(new int[8]);
        for(Object o : list) {
            System.out.println(o);
        }
    }
}
