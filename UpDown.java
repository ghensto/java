import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout; 


public class UpDown extends JFrame implements ActionListener{
	private final int HEIGHT = 200, WIDTH = 200;
	private JLabel topLabel;
	private JLabel bottomLabel;
	
	public static void main(String args[]) {
		UpDown ud = new UpDown();
		ud.setVisible(true);
	}
		
	public UpDown() {
		setSize(WIDTH, HEIGHT);
		setTitle("UpDown!");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		JButton downButton = new JButton("v");
		JButton upButton = new JButton("^");
		topLabel = new JLabel("On Top");
		bottomLabel = new JLabel();
		//bottomLabel = new JLabel("On Bottom");
		//bottomLabel.setVisible(false);
		
		downButton.addActionListener(this);
		upButton.addActionListener(this);
		
		topPanel.add(topLabel);
		bottomPanel.add(bottomLabel);
		centerPanel.add(downButton);
		centerPanel.add(upButton);
		
		add(topPanel, BorderLayout.NORTH);
		add(bottomPanel, BorderLayout.SOUTH);
		add(centerPanel, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		if (ac.equals("v")) {
			topLabel.setText(" ");
			bottomLabel.setText("On Bottom");
			//topLabel.setVisible(false);
			//bottomLabel.setVisible(true);
			//this works differently in making North lose width. And extra empty label in North
			//will fix that.
			
		}
		else if (ac.equals("^")) {
			topLabel.setText("On Top");
			bottomLabel.setText(" ");
			//topLabel.setVisible(true);
			//bottomLabel.setVisible(false);
		}
	}
}




