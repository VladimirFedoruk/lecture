import java.util.Arrays;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //генерация случайного числа которую будет угадывать пользователь
        int theNamber = (int)(Math.random()*100 +1);
        System.out.println(theNamber);
        int guess = 0;
        System.out.println("Guess a number between 1 and 100:");
        guess = scan.nextInt();
        System.out.println("You entered " + guess + ".");
    }
}
