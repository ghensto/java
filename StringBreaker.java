import java.util.Scanner;


public class StringBreaker {
	public static void main(String []args) {
		Scanner kb = new Scanner(System.in);
		String input;
		String word;
		int start = 0;
		int end = 0;
		
		System.out.print("Gimme words! ");
		input = kb.nextLine();
		
		while(end > -1 && start != input.length()) {
			end = input.indexOf(' ', start);
			if (end > -1) {
				word = input.substring(start, end);
				start = end + 1;
			}
			else
				word = input.substring(start);
			if(word.length() > 0) {
				System.out.println(word);
			}	
		}
	
	
	}
}