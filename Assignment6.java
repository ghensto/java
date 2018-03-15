import java.util.Scanner;

public class Assignment6 {
	private static Scanner kb = new Scanner(System.in);
	
	public static void main(String [] args) {
		int dim1, dim2;
		
		do {
			System.out.print("Dim 1: ");
			dim1 = kb.nextInt();
		}while (dim1 < 1);
		do {
			System.out.print("Dim 2: ");
			dim2 = kb.nextInt();
		}while (dim2 < 1);
		int [][] arr = new int[dim1][dim2];
		populate(arr);
		System.out.println("Total: " + total(arr));
		System.out.println("Average: " + average(arr));
		output(arr);
	
	}
	
	public static int total(int [][] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {	
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		return total;
	}
	
	public static void populate(int [][] arr) {
		int outer = 1, inner = 1; //using these rather than i and j to refer to the location in the arrays
		for(int [] a: arr) { //int [] is a REFERENCE type, so a refers to each of the arrays in arr.
			//the value in a is a memory address
			System.out.println("Array " + outer++ + ": ");
			inner = 1;
			//for(int b: a) int, however, is a primitive and java has no primitive reference types, 
			//so b is a separate int from the elements of a
			for (int j = 0; j < a.length; j++) {
				System.out.print("Value " + inner++ +": ");
				 a[j] = kb.nextInt();
			}
		}
	}
	
	public static double average(int [][] arr) {
		double total = 0;
		int number = 0;

		for(int [] a: arr) {
			for(int b: a) {
				total += b;
				number++;
			}
		}
		return total/number;
	}
	
	public static void output(int [][] arr) {
		double total = 0;
		int number = 0;
		for(int i = 0; i < arr.length; i++) {//I need i to use it in the output below
			total = 0;
			number = 0;
			for (int b: arr[i]) { //I have no need to know where I am in the array here, so a for-each is fine
				total += b;
				number++;
			}
			System.out.println("Array " + (i+1) + " total = " + total + ", average = " + total/number);
		}
	}
	
	//for vs for each
	/*
	for(int [] a: arr) is equivalent to
	for(int i = 0; i < arr.length; i++) {
		int [] a = arr[i];
		...
	*/
}











