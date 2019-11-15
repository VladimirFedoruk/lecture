import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		int n = 0;
		try {
			int guess = Integer.parseInt(guessText);
			if (guess < theNumber) 
				message = "Ты шо? " + guess + " это маловато. Давай шэ разок";
			else if (guess > theNumber)
				message = " Э не "+ guess + " то слишком много. А ну, шэ раз";
			else 
			{message = " Да ты шо! Вгадав: " + guess + "! Чувак, ты выиграл! C " + n + "-го раза. А давай шэ раз";
			newGame();
			n++;}
		} catch (Exception e) {
			message = "э надо вводить число 1 до 100.";
		}finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}}
	public void newGame() {
		theNumber = (int)(Math.random() * 100 + 1);
	}
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MAX Evaluation 01");
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Привет, чувачек, ну шо, угадаеш чысло?");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 12, 468, 15);
		getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("Я загадав от 1 до 100:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(66, 49, 295, 15);
		getContentPane().add(label);

		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkGuess();
			}
		});
		txtGuess.setBounds(366, 39, 114, 25);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(12);

		JButton button = new JButton("Ввести");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkGuess();
			}
		});
		button.setBounds(366, 171, 114, 25);
		getContentPane().add(button);

		lblOutput = new JLabel("Введите число и нажмите кнопку");
		lblOutput.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOutput.setBounds(24, 176, 337, 20);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(600,400));
		theGame.setVisible(true);
	}
}
