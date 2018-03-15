import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TicTacToe extends JFrame implements ActionListener
{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 350;

	private JLabel status;
	private JButton [] squares = new JButton[9];

	private int turn;
	private boolean gameOver;

	public static void main(String [] args) {
		TicTacToe run = new TicTacToe();
		run.setVisible(true);
	}

	public TicTacToe() {
		turn = 0;
		gameOver = false;

		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLayout(new BorderLayout());

		status = new JLabel("X to play");
		add(status, BorderLayout.NORTH);

		JPanel gameGrid = new JPanel();
		gameGrid.setLayout(new GridLayout(3,3));
		add(gameGrid, BorderLayout.CENTER);

		for (int i = 0; i < 9; i++) {
			squares[i] = new JButton();
			squares[i].setActionCommand(Integer.toString(i+1)); // sets the action command to something other than the button label
			squares[i].addActionListener(this);
			gameGrid.add(squares[i]);
		}

		JPanel bottom = new JPanel();
		bottom.setLayout(new FlowLayout());

		add(bottom, BorderLayout.SOUTH);

		JButton reset = new JButton("Reset");
		reset.addActionListener(this);
		bottom.add(reset);

	}

	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();

		if (actionCommand.equals("Reset")) {
			for (int i = 0; i < 9; i++) {
				squares[i].setActionCommand(Integer.toString(i+1));
				squares[i].setText("");
			}
			turn=0;
			gameOver = false;
			status.setText("X to play");
			return;
		}

		if (gameOver) return;
		if (actionCommand.equals("X")) return;
		if (actionCommand.equals("O")) return;

		int actionInt = Integer.valueOf(actionCommand);

		if(turn == 1) {
			squares[actionInt-1].setText("O");
			squares[actionInt-1].setActionCommand("O");
			turn = 0;
		}
		else {
			squares[actionInt-1].setText("X");
			squares[actionInt-1].setActionCommand("X");
			turn = 1;
		}

		int winner = checkWinner();

		if (winner == 0) {
			if (turn == 0) status.setText("X to play");
			else status.setText("O to play");
			return;
		}
		else if (winner == 1) {
			status.setText("Draw. Press reset to play again.");
			gameOver = true;
			return;
		}
		else if (winner == 2) {
			status.setText("X wins! Press reset to play again.");
			gameOver = true;
			return;
		}
		else if (winner == 3) {
			status.setText("O Wins! Press reset to play again.");
			gameOver = true;
			return;
		}



	}

	public int checkWinner() {
		boolean full = true;
		char [] v = new char[9];
		for (int i = 0; i < 9; i++){
			v[i] = squares[i].getActionCommand().charAt(0);
			if(v[i] != 'X' && v[i] != 'O')
				full = false;
		}
		if(v[0] == 'X' && v[1] == 'X' && v[2] == 'X') return 2;
		if(v[3] == 'X' && v[4] == 'X' && v[5] == 'X') return 2;
		if(v[6] == 'X' && v[7] == 'X' && v[8] == 'X') return 2;
		if(v[0] == 'X' && v[3] == 'X' && v[6] == 'X') return 2;
		if(v[1] == 'X' && v[4] == 'X' && v[7] == 'X') return 2;
		if(v[2] == 'X' && v[5] == 'X' && v[8] == 'X') return 2;
		if(v[0] == 'X' && v[4] == 'X' && v[8] == 'X') return 2;
		if(v[2] == 'X' && v[4] == 'X' && v[6] == 'X') return 2;

		if(v[0] == 'O' && v[1] == 'O' && v[2] == 'O') return 3;
		if(v[3] == 'O' && v[4] == 'O' && v[5] == 'O') return 3;
		if(v[6] == 'O' && v[7] == 'O' && v[8] == 'O') return 3;
		if(v[0] == 'O' && v[3] == 'O' && v[6] == 'O') return 3;
		if(v[1] == 'O' && v[4] == 'O' && v[7] == 'O') return 3;
		if(v[2] == 'O' && v[5] == 'O' && v[8] == 'O') return 3;
		if(v[0] == 'O' && v[4] == 'O' && v[8] == 'O') return 3;
		if(v[2] == 'O' && v[4] == 'O' && v[6] == 'O') return 3;


		if (full) return 1;


		return 0;

	}
}