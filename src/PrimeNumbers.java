import java.util.Scanner;

public class PrimeNumbers {
	
	
	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		int howManyPrimeNumbers = 0, range = 0;
		
		range = e.nextInt();
		
		for(int i = 1; i<=range; i++) {
			
			if(checkIfGivenNumberisPrime(i) == true) {
				howManyPrimeNumbers++;
			}
		}
		
		System.out.print(howManyPrimeNumbers);
		
		
		
		
	}
	
	private static boolean checkIfGivenNumberisPrime(int number) {
		
		int numberOfDividers = 0;
		boolean check = false;
		
		for(int i = 1; i<=number; i++) {
			
			if(number % i == 0) {
				numberOfDividers++;
			}
		}
		
		check = numberOfDividers == 2 ? true : false;
		
		return check;
		
		
	}

}
