
public class Persistence {

	public static int persistence(long number) {

		int persistence = 0;

		while (number > 9) {
			number = getProdOfDigits(number);

			persistence++;

		}

		return persistence;

	}

	private static long getProdOfDigits(long number) {
		long prod = 1;

		while (number != 0) {

			prod *= number % 10;
			number /= 10;
		}

		return prod;
	}

}
