import java.util.ArrayList;
import java.util.Iterator;



public class primerIteratora {


    public static void main(String[] args) {

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
