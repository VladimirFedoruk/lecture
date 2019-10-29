import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		int guess = Integer.parseInt(guessText);
		if (guess < theNumber)
			message = + " это число меньше. Введите ещё раз";
		else if (guess > theNumber)
		    message = + " это число больше. Введите ещё раз";
		else 
			message = guess + " Ого! Правильно! Чувак, ты выиграл!";
		lblOutput.setText(message);
	}
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MAX Evaluation 01");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Введите данные автопоезда с грузом, что бы MAX все сделал правильно ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 12, 468, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Угадай число от 1 до 100:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(66, 49, 295, 15);
		getContentPane().add(label);
		
		txtGuess = new JTextField();
		txtGuess.setBounds(366, 39, 114, 25);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton button = new JButton("Ввести");
		button.setBounds(366, 171, 114, 25);
		getContentPane().add(button);
		
		lblOutput = new JLabel("Введите число и нажмите кнопку");
		lblOutput.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOutput.setBounds(72, 176, 289, 20);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
