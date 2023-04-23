import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberGuessingGame extends JFrame implements ActionListener {
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private int randomNumber;

    public NumberGuessingGame() {
        setTitle("Number Guessing Game");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Guess a number between 1 and 100:");
        label.setFont(new Font("Arial", Font.PLAIN, 90)); 
        textField = new JTextField(10);
        textField.setFont(new Font("Arial", Font.PLAIN, 90));
        textField.setHorizontalAlignment(JTextField.CENTER);
        button = new JButton("Guess");
        button.addActionListener(this);

        randomNumber = (int) (Math.random() * 100 + 1);

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(label);
        panel.add(textField);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int guess = Integer.parseInt(textField.getText());

            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number.");
                dispose();
            } else if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Too low. Try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Too high. Try again.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 100.");
        }
    }

    public static void main(String[] args) {
        new NumberGuessingGame();
        }}
    
