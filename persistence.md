## [Persistence](https://edabit.com/challenge/4JMgg8Fbmb3qnzS8B)

![challenge](https://user-images.githubusercontent.com/49681380/130704805-5024d0f5-b493-44a3-8a54-976d729a9b3f.png)


## [**SOURCE CODE**](https://github.com/reness0/totalcross-challenges/blob/master/src/Persistence.java)


## Breaking down this challenge:


In this math problem, you'll have to find the persistence of a number

> The persistence of a number is the number of steps that it takes multiplying its digits to reach a one single digit number <br>
> Check the example out in the picture above

### The most important thing to do in this code is to find how to calculate the prod of the digits: 

```java
  private static long getProdOfDigits(long number) {
		long prod = 1;

		while (number != 0) {
     
     // While your number is different of 0
     // It'll get the digit and multiply by the variable prod and store into itself
			prod *= number % 10;
      
      // This line is responsible to remove the last digit of the current number
			number /= 10;
		}

		return prod;
	}
  ```
  ### The second step, is to find the number of persistence: 
  
  ```java
  public static int persistence(long number) {

		int persistence = 0;
    //  It'll repeat until the number is lesser than 9 (so it's only one digit) 
		while (number > 9) {
			number = getProdOfDigits(number);
			persistence++;

		}

		return persistence;

	}
  ``` 

 
 #### With this code, you can solve this particular math problem with programming :heavy_check_mark:

