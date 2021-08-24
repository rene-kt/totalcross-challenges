## [Seven Boom!](https://edabit.com/challenge/CKqfEowjmSTw2jsso)

![challenge](https://user-images.githubusercontent.com/49681380/130703771-d386d812-b618-4c90-842e-e23c43049355.png)



## [**SOURCE CODE**](https://github.com/reness0/totalcross-challenges/blob/master/src/SevenBoom.java)


## Breaking down this challenge:


The challenge consists in verify if the number `7` are present in the given array. 

> What makes this question harder, is the fact that the `7` can also be present as a digit of a number, for example: `77`, this will have to return `Boom!`

### The first thing to do, is to verify if the number `7` contains in the given array

```java

  if (arr[i] == 7) {
				result = "Boom!";
				break;
			}
	}
  
  ```
  ### After that, you'll have to check each digit of a number who is greater than 10: 
  
  ```java
 if (arr[i] > 10) {
				
				// If the number is greater than 10, then it'll
				// verify if any of its digits is equal to 7
        // This variable temp is resposible to store the digit
				int temp;
				temp = arr[i] % 10;
				if (temp == 7) {
					result = "Boom!";
					break;
				}

				arr[i] = arr[i] / 10;
			}
  ```
  
  ### Now, you just have to combine these two steps into a function: 
  
  ```java
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
  ```
  
  > Pay attention to the `break;` lines, they're very import to stop the execution of the loop when the 7 is found.
 

 #### By running this code, you're gonna know when any bomb explodes near you!:heavy_check_mark:

