

public class Point {
	public double x, y;
	
	public Point() {}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		x = p.x;
		y = p.y;
	}
	
	public String toString() {
		return "("+x+','+y+')';
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if(o.getClass() != this.getClass()) return false;
		Point p = (Point)o;
		return this.x == p.x && this.y == p.y;	
	}
	
	public Point clone() {
		return new Point(this);
	}
}







