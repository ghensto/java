

public class Rectangle extends Shape {
	double length, width, orientation;
	
	public Rectangle(double l, double w, double o, Point p, String c) throws BadColorException {
		super(p, c);
		while (o < 0)
			o = o + 360;
		while (o >= 360)
			o = o - 360;
		length = Math.abs(l);
		width = Math.abs(w);
		orientation = o;
	}
	
	public Rectangle() throws BadColorException {
		this(1, 1, 0, new Point(0,0), "White");
	/*	
		super();
		length = 1;
		width = 1;
		orientation = 0;
	*/
	}
	
	public Rectangle(Rectangle r) {
		super(r);
		length = r.length;
		width = r.width;
		orientation = r.orientation;
	}
	
	public void erase() {
		System.out.println(length + " by " + width + " Rectangle erased at " + getCenter().toString());
	}
	public void draw(){
		System.out.println(length + " by " + width + " Rectangle drawn at " + getCenter().toString());
	}
	
	public void rotate(double d) {
		orientation += d;
		while (orientation < 0)
			orientation += 360;
		while (orientation >= 360)
			orientation -= 360;
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if(o.getClass() != this.getClass()) return false; //Rectangles won't equal squares
		if(!(o instanceof Rectangle)) return false; // Rectangles will equal squares
		Rectangle r = (Rectangle)o;
		
		return super.equals(o) && (
				(length == r.length && width == r.width && orientation == r.orientation) ||
				(length == r.width && width == r.length && (orientation == (r.orientation + 90) % 360 ||
															orientation == (r.orientation - 90) % 360 + 360)));
		
	}
	
	public double getArea() {return length*width;}
	
	/*public int compareTo(Object o) {
		Rectangle t = (Rectangle)o;
		if(length*width > t.length*t.width) return 1;
		if(length*width < t.length*t.width) return -1;
		return 0;
		//it doesn't matter *what* negative or positive value is returned
		//if we're comparing int values here, you can just subtract.
	}*/
	//Implemented in Shape to work on all shapes
		
	public Rectangle clone() {
		return new Rectangle(this);
	}
	
}






