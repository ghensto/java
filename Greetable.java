
public interface Greetable {
	String greeting = "Hello World";
	//variables are public static final whether indicated to be so or not;
	
	void greet();
	//methods are public abstract whether indicated to be so or not.
}

class Greeter extends Object implements Greetable {
	
	public void greet() {
		System.out.println(greeting);
	}
	
	public static void main(String args[]) {
		System.out.println(Greetable.greeting);
		
		Greetable MartyMoose = new Greeter();
		
		Greeter gr = (Greeter)MartyMoose;
		
		MartyMoose.greet();

		gr.greet();
		
		//Anonymous class -- An implementation of Greetable that we don't give a class
		//name to.  It's just a Greetable and nothing else.
		Greetable whatever = new Greetable(){
			public void greet() {
				System.out.println("I'm going through the desert with a class with no name.");
			}
		};
		
		whatever.greet();
		
	}
}








