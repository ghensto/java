//import javax.naming.InvalidNameException //if you found this which I didn't know existed

//What I intended, and if you didn't notice and use the above

import java.util.Scanner;

class InvalidNameException extends Exception {
	public InvalidNameException() {
	}
	
	public InvalidNameException(String m) {
		super(m);
	}	
}



public abstract class Employee {
	private String name;
	private double payRate;
	
	public Employee(String name, double payRate) throws InvalidNameException {
		if (name.equals("")) // (name.length() == 0), name.isEmpty()
			throw new InvalidNameException();
		this.name = name;
		this.payRate = payRate;
	}
	
	public Employee(String name) throws InvalidNameException {
		if (name.equals("")) // (name.length() == 0), name.isEmpty()
			throw new InvalidNameException();
		this.name = name;
		this.payRate = 0;
	}
	
	public String getName() {return name;}
	public void setName(String s) throws InvalidNameException {
		if (s.equals("")) // (s.length() == 0), s.isEmpty()
			throw new InvalidNameException();
		name = s;
	}
	public double getRate() {return payRate;}
	public void setRate(double rate) {payRate = rate;}
	
	public abstract double calculatePay();
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if(o.getClass() != this.getClass()) {return false;}
		//Class objects will be compared to see if this and o are exactly the same class.
		Employee temp = (Employee)o;
		return (payRate == temp.payRate);
	}
	
}
	
class HourlyEmployee extends Employee {
	private double hours;
	
	public HourlyEmployee(String name, double rate) throws InvalidNameException  {
		super(name, rate);
		if (rate < 15) setRate(15);
		
		//super(name, rate < 15 ? 15 : rate);
		
		//super(name);
		//setRate(r); //once you have setRate overridden in HourlyEmployee
	}
	
	public HourlyEmployee(String name) throws InvalidNameException {
		super(name, 15);
	}
	
	public void addHours(double d) {
		hours += d;
	}
	
	public double getHours() {return hours;}
	
	public double calculatePay() {
		double pay = hours * getRate();
		hours = 0;
		return pay;
	}
	
	public void setRate(double r) {
		if (r < 15) super.setRate(15);
		else super.setRate(r);
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if(o.getClass() != this.getClass()) {return false;}
		HourlyEmployee temp = (HourlyEmployee)o;
		//These three lines could be ommitted as super.equals will return false if the cast
		//would fail.  Therefore, the cast can be made inline in the second half of the and.
		return super.equals(temp) && this.hours == temp.hours;
	
	}
	
}
	
class SalariedEmployee extends Employee {
	public SalariedEmployee(String name, double rate) throws InvalidNameException{
		super(name, rate < 0 ? 0 : rate);
		//or any other way as in Hourly
	}
	
	public SalariedEmployee(String name) throws InvalidNameException {
		super(name);
	}
	
	public double calculatePay(){
		return getRate() / 12;
	}
}

class EmployeeTest {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		Employee [] ems = new Employee[6]; 
		int sorh;
		double rate;
		String name;
		for (int i = 0; i < ems.length; i++) {
			System.out.print("Hourly or Salaried (1 or 2): ");
			sorh = kb.nextInt();
			kb.nextLine();
			try {
				switch(sorh) {
					case 1:
						System.out.print("Name: ");
						name = kb.nextLine();
						System.out.print("Hourly Wage: ");
						rate = kb.nextDouble();
						ems[i] = new HourlyEmployee(name, rate);
						break;
					case 2: 
						System.out.print("Name: ");
						name = kb.nextLine();
						System.out.print("Annual Salary: ");
						rate = kb.nextDouble();
						ems[i] = new SalariedEmployee(name, rate);
						break;
					default:
						System.out.println("Invalid employee type.");
						i--;
				}
			}
			catch(InvalidNameException e) {
				System.out.println("Employee names cannot be empty. Please re-enter this employee.");
				i--;
			}
		}
		
		
		for(int i = 0; i < 6; i ++) {
			if(ems[i] instanceof HourlyEmployee) {
			//instanceof is an operator that returns true if the object referred to by the 
			//reference on the left "is a" the class on the right -- of that class or
			//any descendant of it.
				((HourlyEmployee)ems[i]).addHours((int)(Math.random() * 20 +30));
				//or
				//HourlyEmployee temp = (HourlyEmployee)ems[i];
				//temp.addHours((int)(Math.random() * 20 +30)));
			}
		}
		
		for (int i = 0; i < 6; i ++) {
			System.out.println("Name: " + ems[i].getName() + ", pay rate: " 
							+ ems[i].getRate() + ", Pay: " + ems[i].calculatePay());
		}



	}
}

















