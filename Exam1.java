

class ReadingGlasses {
	private double magnification;
	private String frameStyle;
	private String lensType;
	
	public ReadingGlasses(String fs) {
		frameStyle = fs;
	}
	
	public ReadingGlasses(String fs, String lt, double m) {
		frameStyle = fs;
		lensType = lt;
		setMagnification(m);
	}
	
	public void setLensType(String lt) {
		lensType = lt;
	}
	
	public void setMagnification(double m) {
		if (m < .75) m = .75;
		if (m > 4) m = 4;
		m *= 4;
		int temp = (int)m;
		m = temp * .25;
		magnification = m;
	}
	
	public String getFrameStyle() {return frameStyle;}
	public String getLensType() {return lensType;}
	public double getMagnification() {return magnification;}
	
	public String toString() {
		return frameStyle + " glasses with " + magnification 
			+ " power " + lensType + " lenses.";
	}
}

//number 25
import java.util.Scanner;

class number2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int input, total = 0, count = 0;
		double average;
		
		System.out.print("Enter a number: ");
		input = kb.nextInt();
		while(input>= 0) {
			total += input;
			count++;
			System.out.print("Enter another number: ");
			input = kb.nextInt();
		}
		average = (double)total/count;
		System.out.println("Total: " + total + "\nNumber of values entered: "
			+count + "\nAverage: " + average;)	
	}
}

//1: int: 32-bit signed integer type.
//2: javac: program to compile Java source code into Java bytecode
//3: public: access modifier granting universal access to the modified item
//4: private: access modifier restricting access to methods in the same class
//5: .class: file extension of compiled Java files (bytecode)
	
	
	
	
	
	
	
	
	