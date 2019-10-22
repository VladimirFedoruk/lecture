import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = -5; i<10; i++){
            a.add(i*2);

        }
        System.out.println(a);
        System.out.println(Collections.binarySearch(a,-9));
    }
}
