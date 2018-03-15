import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//I stylistically prefer extending JFrame rather than creating a JFrame
//inside the class
public class Counter extends JFrame {
	
	private JLabel numbers;
	
	public Counter() {
		setTitle("Counter");
		setSize(200, 100);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//button is not changed or accessed outside of the constructor
		//and the actionPerformed event (which also has access to it through
		//e.getSource()
		JButton adder = new JButton("Count");
		numbers = new JLabel("1");
		
		adder.addActionListener(new ButtonListener());
		
		add(adder);
		add(numbers);
		
		
	}
	
	//Inner Class as the ActionListener rather than the class itself
	//You can have as many as you like this way
	//Inner classes can see the instance variables of the class
	//they're in.
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num = Integer.parseInt(numbers.getText());
			num++;
			numbers.setText(num + "");
		}
	}
	
	public static void main(String args[]) {
		Counter c = new Counter();
		c.setVisible(true);
	}
}






