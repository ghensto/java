import java.util.Random;
import java.text.NumberFormat;
public class Misc {
	
	public static void main(String [] args) {
		//Random Numbers
		/*
			Method 1 is to use Math.random(). This method returns a double 
			in the range >= 0 and < 1. This value covers the entire 53 bits
			of precision that a double contains.  This, naturally, results
			in an astronomically greater range of values than one gets from
			the simple rand() function in C++ (15 bits).
			To get values in a particular range, multiply this result by the 
			size of the range and then add the starting value of the range.
		*/
		//random double >= 10 and < 100;
		double rd1 = Math.random() * 90 + 10; 
		//random int 10 - 89
		int ri1 = (int)(Math.random() * 90 + 10); 
		//a standard die roll
		int ri2 = (int)(Math.random() * 6) + 1; //Parens have to go around the multiplication, but not the addition.
		
		/*
			Method two is to use the Random class -- java.util.Random(). In this case 
			you create a Random object using
			Random rnd = new Random();
			Using this creates a Random that is "very likely to be distinct 
			from any other invocation of this constructor". You may also use the
			Random(long) constructor if for some reason you think you can do better.
			Once you have a Random object, you have the following methods for generating
			a single random value:
			nextBoolean()
			nextDouble() -- This is what Math.random() actually uses
			nextFloat() -- The same as nextDouble, but with Float precision.
			nextInt() -- The full range of int
			nextInt(int bound) -- int between 0 (inclusive) and bound (exclusive)
			nextLong() -- The full range of long
			It also supports random numbers in a normal distribution around 0 with a
			standard deviation of 1.0.  This is nextGausian.
			It can also produce streams of random numbers, but I've never used them and don't 
			know how they work.
			protected int next(int) is the method underlying the rest of them, and can't be called directly
			in normal circumstances.
		*/
		Random rnd = new Random();
		//standard die roll
		int ri3 = rnd.nextInt(6) + 1;
		
		//output formatting
		/*
			Since Java 5, Java has a printf() method -- System.out.printf()
			for the console, but works on any PrintStream.
			printf() is modeled after the same function in other languages, 
			such as C, C++, and Perl. It takes a formatting string as a 
			first parameter and then an additional number of arguments
			to match the format specifiers in the format string. I'll be 
			uploading a summary to d2l, but a simple example would be:
		*/
		
		System.out.printf("rd1 =%7.3f\nri1 =%3d\nri2 =%3d\n", rd1, ri1, ri2);
		
		/*
			The same syntax can be used with String.format() to generate a 
			string rather than sending the content to a stream. This is done
			with the sprintf() function in C.
		*/
		System.out.print(String.format("rd1 =%7.3f\nri1 =%3d\nri2 =%3d\n", rd1, ri1, ri2));
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println(money.format(1234567890.478));
		System.out.println(String.format("$%,1.2f",1234567890.478));
	
	
	}
}