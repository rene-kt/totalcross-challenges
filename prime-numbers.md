## [How Many "Prime Numbers" Are There?](https://edabit.com/challenge/z8vvSdWjAPu5ufBuR)

![challenge](https://user-images.githubusercontent.com/49681380/130698808-4eaafce8-4bea-45fb-8b56-9eeacdbcd3c1.png)


## [**SOURCE CODE**](https://github.com/reness0/totalcross-challenges/blob/master/src/PrimeNumbers.java) 


## Breaking down this challenge:


The challenge implies in count how many prime numbers are in a given range. <br>
> For example the number `10`, you'll have to count how many primes numbers are in this range starting from 0 -> `0,1,2...10`<br>
> As the loop goes through, you're gonna save into a variable how many times you got a prime number.<br>
> Then, you'll just have to return this number in your function, it's quite straightforward<br>


**First of all** you have to identify what is a prime number, and by its definition, it's any number who has only 2 dividers, keep that in mind and take a look at the code: 

```java
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
  ```
  
  > This method returns a boolean value, it'll be necessary to do the verification in the next method:

```java

public static int primeNumbers(int number) {

		int howManyPrimeNumbers = 0;

		for (int i = 1; i <= number; i++) {

      // Checking if the value returned by the method is true (so it's prime) 
			if (checkIfGivenNumberisPrime(i) == true) {
				howManyPrimeNumbers++;
			}
		}
		return howManyPrimeNumbers;
	}
 ```
 
 #### And by doing this, you're gonna have the quantity of prime numbers between 0 and any other number. :heavy_check_mark:



