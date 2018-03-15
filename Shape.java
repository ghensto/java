


public abstract class Shape implements Comparable {
	private Point center;
	private String color;
	
	public Shape() {
		center = new Point(0,0);
		color = "White";
	}
	
	public Shape(Point p, String s) throws BadColorException {
		if (s.equalsIgnoreCase("White") || s.equalsIgnoreCase("Blue") || s.equalsIgnoreCase("Green") || s.equalsIgnoreCase("Yellow"))
			color = s;
		else
			throw new BadColorException(s + " is not a valid color.");
		center = new Point(p);
		color = s;
	}
	
	public Shape(Shape s) {
		center = new Point(s.center);
		color = s.color;
	}
	
	public void move(double x, double y) {
		erase();
		center.x += x;
		center.y += y;
		draw();
	}
	
	protected Point getCenter() {
		return new Point(center);
	}
	
	public abstract Shape clone();
	
	public abstract void erase();
	public abstract void draw();
	
	public abstract double getArea();
	
	public int compareTo(Object o) {
		Shape s = (Shape)o;
		if (this.getArea() > s.getArea()) return 1;
		if (this.getArea() < s.getArea()) return -1;
		return 0;
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if(!(o instanceof Shape)) return false;
		Shape s = (Shape)o;
		return center.equals(s.center) && color.equals(s.color);
	}
	
}

class BadColorException extends Exception {
	public BadColorException() {};
	public BadColorException(String message) {
		super(message);
	}
}













