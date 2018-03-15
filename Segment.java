

public class Segment{
	private int x1, x2, y1, y2;
	
	public Segment() {
		x2 = 1;
		x1 = y1 = y2 = 0;
	}
	
	public Segment(int x1, int y1) {
		this(x1, y1, 0, 0); // passes values to the next constructor and defers object creation to it.
	}
	
	public Segment(int x1, int y1, int x2, int y2) {
		this.x1 = x1; //this is a reference variable that always refers to
		this.x2 = x2; //the current object
		this.y1 = y1; //It allows us to distinguish between the parameter
		this.y2 = y2; //and the instance variable of the same name (which the 
		//parameter otherwise hides)
	}
	
	public void setPoint1(int a, int b) {
		x1 = a;
		y1 = b;
	}
	
	public void setPoint2(int a, int b) {
		x2 = a;
		y2 = b;
	}
	
	public void setLine(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1; 
		this.y2 = y2;  
	}
	
	public void moveLine(int x, int y) {
		x1 = x1 + x;
		x2 = x2 + x;
		y1 = y1 + y;
		y2 = y2 + y;
	}
	
	public String getPoint1() {
		return "(" + x1 + ',' + y1 + ')';
	}
	
	public String getPoint2() {
		return "(" + x2 + ',' + y2 + ')';
	}
	
	public String toString() {
		return getPoint1() + ',' + getPoint2();
	}
	
	public double getLength() {
		double x = x1-x2;
		double y = y1-y2;
		return Math.sqrt(x*x + y*y);
	}	
}

class SegmentTest {
	public static void main(String args[]) {
		Segment s1 = new Segment();
		Segment s2 = new Segment(8, 3);
		Segment s3 = new Segment(5, 5, 2, 9);
		System.out.println("S1: " + s1 + ", Length: " + s1.getLength());
		System.out.println("S2: " + s2 + ", Length: " + s2.getLength());
		System.out.println("S3: " + s3 + ", Length: " + s3.getLength());
		
	}
}













