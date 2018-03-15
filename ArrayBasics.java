

public class ArrayBasics {
	
	
	public static void populateArray(int [][] arr) {
		for(int i = 0; i < arr.length; i++) {
			//populateArray(arr[i]);
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i*j;
			}
		}
	}
	
	public static void populateArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i*3;
		}
	}
	
	public static void main(String args[]) {
		int size = 10;
		int size2 = 5;
		int [] myInts = new int[size];
		populateArray(myInts);
		
		IceCreamTruck [] trucks = new IceCreamTruck[size];
		
		//IceCreamTruck truck1;
		//System.out.println(truck1.toString());
		//System.out.println(trucks[0].toString());
		//without the loop below, both of these cause the same NullPointerException
		for(int i = 0; i < trucks.length; i++) {
			trucks[i] = new IceCreamTruck();
		}
		trucks[2].transferIceCreamSandwiches(40);
		System.out.println(trucks[2]);
		
		int [][] intStuff = new int[size][];
		for(int i = 0; i < intStuff.length; i++) {
			intStuff[i] = new int[(i+1) * 2];
		}
		
		populateArray(intStuff);
		
		//The for-each loop (no "each" in the syntax) goes through each element
		// in an array and acts on it.  Each iteration has no information
		//about where in the loop it is or what's before or after it.
		for(int [] i : intStuff) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		int arr[] = {3, 5, 2, 7, 8, 6, 5, 7, 9};
		//9-element int array containing the specified values
		int arr2[][] = {{1,2,3,4},{4,5,6,7,8,9,0},{1,2,3}};
		//Array of 3 int arrays of sizes 4, 7, and 3 respectively, with the given values
		
		System.out.println(arr.length);
		for(int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		//for-each in one dimension
		for(int el: arr) {
			System.out.print(el + " ");
		}
		System.out.println();
		
		int [][] arr4 = new int[4][8];//illegal in C++ for dynamic arrays
		//Legal in Java for arrays.
		//My apologies for writing C++ equivalent code in the first
		//version of this file.
	
	}
}






