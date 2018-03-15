import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LastDemo extends JFrame {
	
	public LastDemo() {
		setTitle("Last Demo for July 2");
		setSize(600, 600);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel cPanel = new JPanel();
		JPanel nPanel = new JPanel();
		JPanel sPanel = new JPanel();
		JPanel ePanel = new JPanel();
		JPanel wPanel = new JPanel();
		
		JButton centerButton = new JButton("Center");
		JButton northButton = new JButton("North");
		JButton southButton = new JButton("South");
		JButton eastButton = new JButton("East");
		JButton westButton = new JButton("West");
		
		JButton q = null;
		
		cPanel.setLayout(new GridLayout(0,4));
		
		cPanel.add(centerButton);
		cPanel.add(northButton);
		//nPanel.add(northButton);
		sPanel.add(southButton);
		ePanel.add(eastButton);
		wPanel.add(westButton);
	
		add(cPanel, BorderLayout.CENTER);
		add(nPanel, BorderLayout.NORTH);
		add(sPanel, BorderLayout.SOUTH);
		add(ePanel, BorderLayout.EAST);
		add(wPanel, BorderLayout.WEST);
		
	}
	
	public static void main(String args[]) {
		LastDemo l = new LastDemo();
		l.setVisible(true);
	}
		
}







