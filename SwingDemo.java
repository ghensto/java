import javax.swing.*; 
  
public class SwingDemo extends JFrame { 
  private JLabel jlab;
  SwingDemo() { 
 
    // Create a new JFrame container. 
    setTitle("A Simple Swing Application"); 
 
    // Give the frame an initial size. 
    setSize(275, 100); 
 
    // Terminate the program when the user closes the application. 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
    // Create a text-based label. 
    jlab = new JLabel(" Swing defines the modern Java GUI."); 
 
    // Add the label to the content pane. 
    add(jlab); 
 
    // Display the frame. 
    setVisible(true); 
  } 
 
  public static void main(String args[]) { 
    // Create the frame on the event dispatching thread. 
    SwingDemo s = new SwingDemo();
  } 
}