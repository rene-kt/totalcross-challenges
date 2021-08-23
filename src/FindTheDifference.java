import java.util.Scanner;

public class FindTheDifference {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		String s1, s2;
		s1 = e.next();
		s2 = e.next();
		System.out.println(find_the_difference(s1, s2));

	}

	private static char find_the_difference(String s1, String s2) {

		char difference = 0;

		for (int i = 0; i <= s1.length() - 1; i++) {

			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
		
			if (ch1 != ch2) {
				difference = ch2;
				break;
			}
				
			if (difference == 0)
				difference = s2.charAt(s2.length() - 1);

		}
		return difference;
	}

}
