import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GameProject extends JFrame implements ActionListener {
    JButton ticTacToeButton;
    JButton pingpong;
    JButton numberguessing;
    JButton quitButton;


    public GameProject() {
        super("Game Project");

        ticTacToeButton = new JButton("Tic-Tac-Toe");
        pingpong = new JButton("Ping-Pong");
        numberguessing =new JButton("Number-Guessing");


        quitButton = new JButton("Quit");

        Font buttonFont = new Font("Arial", Font.PLAIN, 80);
        ticTacToeButton.setFont(buttonFont);
        pingpong.setFont(buttonFont);
        numberguessing.setFont(buttonFont);
        quitButton.setFont(buttonFont);

        ticTacToeButton.addActionListener(this);
        pingpong.addActionListener(this);
        numberguessing.addActionListener(this);
        quitButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(ticTacToeButton);
        panel.add(pingpong);
        panel.add(numberguessing);
        panel.add(quitButton);

        getContentPane().add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ticTacToeButton) {
            TicTacToe game = new TicTacToe();
        } else if (e.getSource() == pingpong) {
            PongGame game = new PongGame();
            GameFrame frame = new GameFrame();

        }
        else if (e.getSource()==numberguessing){
            NumberGuessingGame game=new NumberGuessingGame();

        }
         else if (e.getSource() == quitButton) {
            System.exit(0);
        }
    }
        public static void main(String[] args) {
        GameProject project =new GameProject();
    }
}