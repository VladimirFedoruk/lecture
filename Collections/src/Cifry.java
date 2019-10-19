import java.util.HashMap;
import java.util.Map;

public class Cifry {
    public static void main(String[] args) {
        Map<String, Integer> a = new HashMap<>();
        String a1 = "jl2lkj3kl45klj5j6ljk121l8j8j";
        for (int i = 0; i < a1.length(); i++) {
            if (Character.isDigit(a1.charAt(i))) {
                String digit = a1.substring(i,i+1);

                System.out.println(digit);
                a.put(digit, i+1);
            }
        }
        System.out.println(a);
        System.out.println(a.size()); // добавить значение  = сколько раз встречается значение в строке
    }
}
