import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class ToDos{
    String day;
    ToDos(String d){
        day = d;
    }
    public boolean equals(Object o){
        return ((ToDos)o).day==this.day;
    }
    public int hashCode(){return 9;}

    @Override
    public String toString() {
        return "ToDos{" +
                "day='" + day + '\'' +
                '}';
    }
}
public class CollectionMap {
    public static void main(String[] args) {
       Map<ToDos, String>m = new HashMap<ToDos, String>();
       ToDos t1 = new ToDos("Monday");
       ToDos t2 = new ToDos("Monday");
       ToDos t3 = new ToDos("Tuesday");
       m.put(t1, "doLaundry");
       m.put(t2, "payBills");
       m.put(t3, "cleanAttic");
        System.out.println(m.size());
        System.out.println(m);

        ArrayList<ToDos> states = new ArrayList<ToDos>();
        ToDos dog = new ToDos("cklj");
        states.add(new ToDos("Germany"));
        states.add(new ToDos("France"));
        states.add(new ToDos("Italy"));
        states.add(new ToDos("Spain"));

        Iterator<ToDos> iter = states.iterator();
        while (iter.hasNext()) {

            System.out.println(iter.next());
        }

    }
}
