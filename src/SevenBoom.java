
public class SevenBoom {

	public static String sevenBoom(int[] arr) {

		String result = "there is no 7 in the array";

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 10) {
				
				// If the number is greater than 10, then it's gonna 
				// verify if any of its digits is equal to 7
				int temp;
				temp = arr[i] % 10;
				if (temp == 7) {
					result = "Boom!";
					break;
				}

				arr[i] = arr[i] / 10;
			}

			if (arr[i] == 7) {
				result = "Boom!";
				break;
			}

		}

		return result;
	}

}