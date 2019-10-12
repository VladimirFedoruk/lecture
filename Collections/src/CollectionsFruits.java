import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFruits {
    public static void main(String[] args) {
        List<String> CollectionsFruits = new ArrayList<>();
        CollectionsFruits.add("Apple");
        CollectionsFruits.add("Grusha");
        CollectionsFruits.add("Bananna");
        CollectionsFruits.add("Апельсин");
        CollectionsFruits.add("топор");
        Collections.sort(CollectionsFruits);
        System.out.println(CollectionsFruits);

    }
}
