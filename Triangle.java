

public class Triangle extends Shape {
	double height, base, orientation;
	
	public Triangle(double b, double h, double o, Point p, String c) throws BadColorException{
		super(p, c);
		while (o < 0)
			o = o + 360;
		while (o >= 360)
			o = o - 360;
		base = Math.abs(b);
		height = Math.abs(h);
		orientation = o;
	}
	
	public Triangle(Triangle t) {
		super(t);
		height = t.height;
		base = t.base;
		orientation = t.orientation;
	}
	
	public void erase() {
		System.out.println(base + " by " + height + " Triangle erased at " + getCenter().toString());
	}
	public void draw(){
		System.out.println(base + " by " + height + " Triangle drawn at " + getCenter().toString());
	}
	
	public Point getCenter() {
		return super.getCenter();
	}
	
	public double getArea() {return base*height/2;}
	
	/*public int compareTo(Object o) {
		Triangle t = (Triangle)o;
		if(base*height > t.base*t.height) return 1;
		if(base*height < t.base*t.height) return -1;
		return 0;
		//it doesn't matter *what* negative or positive value is returned
		//if we're comparing int values here, you can just subtract.
		//I didn't change from Rectangle because / 2 doesn't change the comparisons.
	}*/
	
	public void rotate(double d) {
		orientation += d;
		while (orientation < 0)
			orientation += 360;
		while (orientation >= 360)
			orientation -= 360;
	}
	
	public Triangle clone() {
		return new Triangle(this);
	}
	
}