import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;


public class HiLo {
    public static void main(String[] args) {
        JFrame window = new JFrame("Игра Больше - Меньше");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me!");
        panel.add(button);
        window.add(panel);
        window.setSize(300,100);
        button.addActionListener(e -> System.out.println("Ouch! You clicked me!"));
        window.setVisible(true);

        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do {
        //генерация случайного числа которую будет угадывать пользователь
        int theNumber = (int) (Math.random() * 100 + 1);
        System.out.println(theNumber);
        int guess = 0;
        while (guess != theNumber) {
            System.out.println("Guess a number between 1 and 100:");
            guess = scan.nextInt();
            if (guess < theNumber)
                System.out.println(guess + " is too low. Try again.");
                else if (guess > theNumber)
                System.out.println(guess + " is too high. Try again.");
            else
                System.out.println(guess + " is correct. You win!");
        }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye.");
        scan.close();


    }
}
