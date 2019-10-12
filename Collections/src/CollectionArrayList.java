import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList {


    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        List<String>test = new ArrayList<String>();
        String s = "hi";
        test.add("string");
        test.add(s);
        test.add(s+s);
        System.out.println(test.size());
        System.out.println(test.contains(42));
        System.out.println(test.contains("hihi"));
        test.remove("hi");
        System.out.println(test.size());
        for(int i = 0; i<test.size(); i++) {
            System.out.println(test.get(i));
        }
        for(String value : test) {
            System.out.println(value);
        }

    }
}
