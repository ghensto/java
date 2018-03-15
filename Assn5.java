//Number 1
import java.util.Scanner;


class Num1 {
	public static void main(String args[]) {
		int times;
		String phrase;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Int? ");
		times = kb.nextInt();
		System.out.print("Phrase? ");
		kb.nextLine();
		phrase = kb.nextLine();
		
		for(int i = 0; i < times; i++) {
			System.out.println(phrase);
		}
	
	}
}

class RightTriangle {
	private double base, height;
	public RightTriangle() {
		base = 1;
		height = 1;
	}
	
	public RightTriangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {return base;}
	public double getHeight() {return height;}
	
	public void setBase(double in) {
		if (in > 0)
			base = in;
	}
	public void setHeight(double in) {
		if (in > 0)
			height = in;
	}
	
	public double getArea() {
		return base*height/2;
	}
	
	public String toString() {
		return "Right triangle with a base of " + base + " and a height of " + height+ ".";
	}
}
	
	
	
	
	
	
	
	
	
	
	
	