import java.util.Scanner;

public class Persistence {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		int number = 0;
		number = e.nextInt();
		System.out.println(additivePersistence(number));
		System.out.println(multiplicativePersistence(number));

	}

	private static int additivePersistence(int number) {

		int persistence = 0;

		while (number > 9) {
			number = getSumOfDigits(number);
			persistence++;

		}

		return persistence;
	}

	private static int getSumOfDigits(int number) {
		int sum = 0;

		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
	
	private static int multiplicativePersistence(int number) {

		int persistence = 0;

		while (number > 9) {
			number = getProdOfDigits(number);
			persistence++;

		}

		return persistence;
	}
	
	private static int getProdOfDigits(int number) {
		int prod = 1;

		while (number != 0) {
			prod *= number % 10;
			number /= 10;
		}
		return prod;
	}

}

