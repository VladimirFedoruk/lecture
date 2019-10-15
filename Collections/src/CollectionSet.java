import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class CollectionSet {

        public static void main(String[] args) {

            boolean[] ba = new boolean[5];
            Set s = new HashSet();
            ba[0] = s.add("Бел");
            ba[1] = s.add("Рус");
            ba[2] = s.add("Укр");
            ba[3] = s.add("Пол");
            ba[4] = s.add("Лат");
            for(int x = 0; x<ba.length; x++)
                System.out.println(ba[x]+ " ");
            System.out.println("\n");
            for (Object o : s)
                System.out.println(o + " ");

            Set treeSet = new TreeSet();
            Set l = new LinkedHashSet();
            treeSet.add("Беларусь1");
            treeSet.add("Россия2");
            treeSet.add("Украина3");
            treeSet.add("Польша4");
            treeSet.add("Латвия5");
            for (Object o : treeSet)
                System.out.println(o + " ");
            l.add("Беларусь1");
            l.add("Россия2");
            l.add("Украина3");
            l.add("Польша4");
            l.add("Латвия5");
            for (Object o : l)
                System.out.println(o + " ");
        }
    }

