## [Remove Repeated Characters](https://edabit.com/challenge/mtrBW4w2Bkum4bGt5)

![challenge](https://user-images.githubusercontent.com/49681380/130701168-dd3f872d-6521-46df-87fe-79eceb11e6d0.png)



## [**SOURCE CODE**](https://github.com/reness0/totalcross-challenges/blob/master/src/RemoveRepeatedCharacters.java) 


## Breaking down this challenge:


This challenge is pretty self explanatory, you've to check what chars are repeated (it can be one or more), and remove them.

The way this challenge was solved, it was the most clean and easy way to do it.

### **The first and unique step** was to create a ```String variable``` without any content, and start to complete it char by char from the input string

```java
public static String unrepeated(String string) {
		String stringWithoutDuplicates = "";

		for (int i = 0; i < string.length(); i++) {

			// Checking if the string already contains the given char

			if (!stringWithoutDuplicates.contains(String.valueOf(string.charAt(i)))) {

				// concatenating the string with the the char in the position [i]
				stringWithoutDuplicates += String.valueOf(string.charAt(i));

			}
		}
		return stringWithoutDuplicates;
	}
  ```
  ### The ace in the hole of this challenge is the fact that you don't need to remove the repeated chars, you just don't add them.

 
 #### With this code, you can remove repeated chars from any string :heavy_check_mark:


