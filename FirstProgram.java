

public class FirstProgram {
	public static void main(String args[]) {
		int numTimes = 5;
		for(int i = 0; i < numTimes; i++) {
			System.out.println("Hello World");
		}
		
		double /*comment in whitespace*/ a = 3.14, b = 4, c = 7.14;
		if (a+b == c) {
			System.out.println(a + " + " + b + " = " + c);
		}
		else
			System.out.println(a + " + " + b + " =/= " + c);
		System.out.println(a + b + " = " + c);
		System.out.println("Result :" + (a - b));
		/*
		+ is overloaded as String concatenation.  It has the same precedence
		as addition, and so is processed left to right with addition and
		subtraction.  Numeric types promote to String, so if one operand
		is a String, the operation is concatenation.
		*/
		//This is a to-the-end-of-a-line comment
	}
}