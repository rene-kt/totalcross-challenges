
public class FindTheDifference {

	public static char findTheDifference(String s, String t) {
		char difference = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);

			if (ch1 != ch2) {
				difference = ch2;
				break;
			}

			if (difference == 0)
				difference = t.charAt(t.length() - 1);

		}
		return difference;
	}

}
