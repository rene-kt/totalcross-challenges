## [Find the Difference](https://edabit.com/challenge/JYaLkHy8cHgCPXAvy)



![challenge](https://user-images.githubusercontent.com/49681380/130705980-7a294953-9e83-4732-8c4e-cc6bdf73db8d.png)


## Breaking down this challenge:


This is a classic string question, find the difference beetween 2 almost identicals strings. 

> What makes this challenge Very Hard is the fact that the two strings have differents length. <br>
> For example, `abc` and `abcd`, these are two almost equal strings, but the diffence is the last char.
 
### The way that this challenge was solved was quite straightforward:

```java
 public static char findTheDifference(String s, String t) {
		char difference = 0;

		for (int i = 0; i <= s.length() - 1; i++) {
      // Getting each char of each word
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);

      // If it finds difference, return the equivalent char and break the loop.
			if (ch1 != ch2) {
				difference = ch2;
				break;
			}
    
      // But if you don't find any difference, that means that the difference is located in the last char of the second word
      // Because the loop goes through the first string, and if you try to reach the last char of the second string, you're gonna get an `ArrayIndexOutOfBounds.exception`
			if (difference == 0)
				difference = t.charAt(t.length() - 1);

		}
		return difference;
	}
  ```

