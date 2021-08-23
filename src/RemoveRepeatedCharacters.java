import java.util.Scanner;

public class RemoveRepeatedCharacters {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		String string = "";

		string = e.next();

		System.out.print(removeDuplicates(string));

	}

	private static String removeDuplicates(String string) {
		
		String stringWithoutDuplicates = "";
		
		for (int i = 0; i < string.length(); i++) {
			
			// Checking if the string already contains the given char

			if (!stringWithoutDuplicates.contains(String.valueOf(string.charAt(i)))) {
			
			// concatenating the string with the the char in the position [i]
				stringWithoutDuplicates += String.valueOf(string.charAt(i));
				
			}
		}
		return stringWithoutDuplicates;
	}
}
