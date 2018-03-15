import java.util.Arrays;


public class ShapeTester {
	public static void funct(Shape s) throws ClassNotFoundException {
		if (s.getClass() == Class.forName("Rectangle")) { //EXACTLY Rectangle (not, say, Square)
			Rectangle r = (Rectangle)s;
			System.out.println("Rectangle Cast");
		}
		if (s instanceof Triangle) { //Anything that isa Triangle: RightTriangle, AcuteTriangle, what have you
			Triangle t = (Triangle)s;
			System.out.println("Triangle Cast");
		}
		s.draw();
	}
	public static void main(String args[]) throws ClassNotFoundException {
		Point p = new Point(5,9);
		try {
			Rectangle r1 = new Rectangle (4, 5, 270, new Point(3,4), "Blue");
			Rectangle r2 = new Rectangle(r1);
			
			Shape [] sarr = new Shape[4];
			sarr[0] = new Rectangle(r1);
			sarr[1] = new Triangle(4, 5, 270, new Point(3,4), "Blue");
			sarr[2] = new Triangle(3, 8, 90, new Point(9,4), "Green");
			sarr[3] = new Rectangle(1,7,45,p,"Yellow");
			
			Shape [] sarr2 = new Shape[4];
			
			for(int i = 0; i < 4; i++) {
				sarr2[i] = sarr[i].clone();
			}
			
			
			Shape s1 = new Rectangle(3, 7, 80, p, "Green");
			
			Rectangle r3 = (Rectangle)s1;
			
			Triangle t1 = new Triangle (4, 5, 270, new Point(3,4), "Blue");
			funct(r1);
			funct(t1);
			
			s1 = t1;
			funct(s1);
			s1.draw();
			s1.move(2, 4);
			s1.draw();
			System.out.println(p.toString());
			
			System.out.println(sarr[1].getArea() + ", " + sarr[2].getArea() + ", " + sarr[1].compareTo(sarr[2]));
			for (int i = 0; i < sarr.length; i++) 
				System.out.println(sarr[i].getArea());
			System.out.println();
			Arrays.sort(sarr);
			for (int i = 0; i < sarr.length; i++) 
				System.out.println(sarr[i].getArea());
			
			Shape s21 = new Rectangle(3,7,180, new Point(4,4), "Magenta");
				
			Shape s10 = null;
			try {
				System.out.println("Before null call.");
				System.out.println(s1.compareTo(sarr[2]));
				System.out.println("After null call.");
				//System.out.println(s1.compareTo("Beetle"));
				//int a = 15 / 0;
			}
			catch(NullPointerException e) {
				System.out.println("NullPointerException thrown:");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			catch(ClassCastException e) {
				System.out.println("ClassCastException thrown:");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			finally {
				System.out.println("Inner try block may or may not have had an exception.");
			}
		}
		catch (BadColorException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Outer try block may or may not have had an exception.");
		}
	
	System.out.println("Reached end of program.");
	}
}










