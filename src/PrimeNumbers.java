
public class PrimeNumbers {

	public static int primeNumbers(int number) {

		int howManyPrimeNumbers = 0;

		for (int i = 1; i <= number; i++) {

			if (checkIfGivenNumberisPrime(i) == true) {
				howManyPrimeNumbers++;
			}
		}
		return howManyPrimeNumbers;
	}

	private static boolean checkIfGivenNumberisPrime(int number) {

		int numberOfDividers = 0;
		boolean check = false;

		for (int i = 1; i <= number; i++) {

			// Checking whether the number is divisible for [i];
			if (number % i == 0) {
				// If it is divisible for [i], then add one into the variable numberOfDividers
				numberOfDividers++;
			}
		}

		// Now, it's gonna verifiy if the number of dividers is equal to 2.
		// If it has only 2 dividers, then the given number is prime, otherwise, it's
		// not a prime number
		check = numberOfDividers == 2 ? true : false;

		return check;

	}

}
