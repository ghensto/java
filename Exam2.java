

abstract class Shape {
	private Point center;
	
	public Shape() {
		center = new Point(0,0);
	}
	
	public Shape(Point p) {
		center = new Point(p);
	}
	
	public Shape(Shape s) {
		center = new Point(s.center);
	}
	
	public void move(double x, double y) {
		center.setPoint(center.getX()+x, center.getY()+y);
	}
	
	public Point getCenter() {
		return new Point(center);
	}
	
	public boolean equals(Object o) {
		if (o == null) return false; // null check is needed before getClass call
		if (this.getClass() != o.getClass()) return false;
		Shape s = (Shape)o;
		return center.equals(s.center);
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}

class Circle extends Shape {
	private double radius;
	
	public Circle() {
		super(); // optional
		radius = 1;
	}
	
	public Circle(Point p, double r) {
		super(p);
		radius = r;
	}
	
	public Circle(Circle c) {
		super(c);
		radius = c.radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getArea() {
		return Math.pi*radius*radius;
	}
	
	public double getPerimeter() {
		return Math.pi*radius*2;
	}
	
	public boolean equals(Object o) {
		if (super.equals(o)) {
			if (this.getClass() == o.getClass() && radius == ((Circle)o).radius)
				return true;
			else
				return false;
		}
		else
			return false;
	}
}

public static double totalCircleArea(Shape[] s) {
	double total = 0;
	for (int i = 0; i < s.length; i++) {
		if(s[i] != null && s[i] instanceof Circle) // != null is redundant with instance of
			total += s[i].getArea();
	}	
	return total;
}
















