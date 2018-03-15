import java.util.Scanner;

public class Assignment7 {
	public static int deleteRepeats1(char [] arr, int size) {
		if (size > arr.length) size = arr.length; //to be safe

		for(int i = 0; i < size-1; i++) {
			for(int j = i+1; j < size; j++) {
				if (arr[i] == arr[j]) { // if a repeat is found
					for(int k = j+1; k < size; k++) {
						arr[k-1] = arr[k]; // shift array to the left by 1 over the repeat
					}
					size--; //reduce to indicate deleted repeat. Also, the shift moved the
					//last element to the left by one.
					//This will also stop the outer loop at the correct spot.
					j--; //in case we overwrote the repeat with another of the same repeat
				}
			}
		}
		return size;
	}


	public static int deleteRepeats2(char [] arr, int size) {
		int keep = 0, check = 1;

		while(keep < size - 1) {
			while (check < size) {
				while (arr[keep] == arr[check] && check < size) {
					arr[check] = arr[size-1];
					size--;
				}
				check++;
			}
			keep++;
			check = keep + 1;
		}
		return size;
	}

	public static String pigLatin(String s) {
		int wStart = 0, wEnd;
		String result = "";
		while(wStart < s.length()) {
			if (!Character.isLetter(s.charAt(wStart))) {
				result += s.charAt(wStart);
				wStart++;
			}
			else {
				wEnd = wStart + 1;
				while (wEnd < s.length() && Character.isLetter(s.charAt(wEnd))) {
					wEnd++;
				}
				String name = s.substring(wStart, wEnd);
				if (name.length() > 1) {
					result += Character.toUpperCase(name.charAt(1));//name.substring(1,2).toUpperCase();
					result += name.substring(2);
					result += name.substring(0,1).toLowerCase();
				}
				else {
					result += name;
				}
					result += "ay";
				wStart = wEnd;
			}
		}
		return result;
	}

	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		char [] arr = {'a','b','a','a','c','b','b',' ',' ',' '};
		int size = 7;
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		size = deleteRepeats1(arr, size);
		for (int i = 0; i < size; i++) {
					System.out.print(arr[i] + " ");
				}
		System.out.println();

		String name;
		System.out.print("Name: ");
		name = kb.nextLine();

		System.out.println("Hello, " + pigLatin(name));



	}
}