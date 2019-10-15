import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class proverkaMetodaNext {
    public static void main(String[] args) {
       List<Dog> d = new ArrayList<Dog>();
       Dog dog = new Dog("aiko");
       d.add(dog);
       d.add(new Dog("clover"));
       d.add(new Dog("magnolia"));
        Iterator<Dog> i3 = d.iterator();
        while (i3.hasNext()){
            Dog d2 = i3.next();
            System.out.println(d2.name);
        }

        for (Dog x : d)
            System.out.println(x.name + "  ");

    }
}
