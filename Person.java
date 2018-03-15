


public class Person {
	private String fName;
	private String lName;
	private int age;
	
	public void setFirstName (String fn) { //mutator, "setter"
		fName = fn;
	}
	
	public void setLastName (String ln) { 
		lName = ln;
	}
	
	public void setAge(int a) {
		if (a >= 0)
			age = a;
	}
	
	public String getFirstName() {
		return fName;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return fName + ' ' + lName;
	}
	
	public String getNameLNF() {
		return lName + ", " + fName;
	}
	
	public String toString() {
		return fName + ' ' + lName + ", age: " + age;
	}
}
	
class PersonTester {
	public static void main(String args[]) {
		Person p1 = new Person();
		p1.setFirstName("Fred");
		p1.setLastName("Flintstone");
		p1.setAge(43000000);
		
		Person p2 = p1;
		p2.setFirstName("Wilma");
		
		System.out.println(p1.toString());
	}
}
	
	