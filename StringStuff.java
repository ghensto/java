

public class StringStuff{
	
	public static void main(String [] args) {
		String s = "hello";
		String s1 = "hello";
		System.out.println(s.toUpperCase() + ' ' + s);
		System.out.println(s == s1);
		System.out.println(s == "hello");
		System.out.println(s == "h" + 'e' + 'l' + 'l' + 'o');
		//DON'T count on this == to work.  It's an accident of Java saving
		//memory by only creating one "hello", since any change to any reference
		//to that hello involves it referring to another object, not changing "hello"
		
		System.out.println(s.equals(s1)); //This is always true if they have the same
		//characters in the same order;
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.compareTo("hello"));
		System.out.println(s.compareTo("Hello"));
		System.out.println(s.compareTo("something else"));
		//Positive if the object called on is greater than the parameter
		//Negative if the object called on is less than the parameter
		//Zero if they are the same
		if (s.compareTo(s1) > 0); //s > s1 equivalent if we could do that
		/*The same for all other comparison operators.
		So for anything where compareTo is defined, 
		(a.compareTo(b) op 0) is the same as (a op b) would be for 
		all ops > < >= <= == !=
		*/
		
		System.out.println(s.compareToIgnoreCase("Hello"));
	}
}