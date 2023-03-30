package week3practice;

import java.util.Arrays;

public class Week3_4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Coding Steps — Arrays and Methods
//	    1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 80, 100, 122};
		
//	        a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		
		int results = ages[ages.length - 1]	- ages[0];
		System.out.println(results);
		
//	        b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
		//,80
		
//	        c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		//int sum = 0 
		
		
		//create sum variable to hold sum value
		int sum = 0;
		for (int i = 0; i < ages.length; i++)	{
			sum += ages[i];
		}
		
		//divide sum into average variable/value
		System.out.println(sum);
		double average = (double) sum / ages.length;
		System.out.println(average);
		
		
//	    2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//	        a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		int sum1 = 0;
		for (String name : names)	{
			sum1 += name.length();
		}
		System.out.println(sum1);
		double average1 = (double) sum1 / names.length;
		System.out.println(average1);
		
//	        b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		StringBuilder concatNames = new StringBuilder();
		for (String name : names)	{
			concatNames.append(name).append(" ");
		}
		
		System.out.println("Names: " + concatNames.toString());
		
		
		
//	    3. How do you access the last element of any array?
		
		String lastElement = names[names.length - 1];
		
		System.out.println(lastElement);
	
		
		
//	    4. How do you access the first element of any array?
		
		String firstElement = names[0];
		System.out.println(firstElement);
		
		
//	    5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length];
		for(int i  = 0; i < names.length; i++)	{
			nameLengths[i] = names[i].length();
		}
		
		System.out.println(Arrays.toString(nameLengths));
		
		//We then loop through each element in the names array using a for loop. For each name, we use the length() method to get its length, and store it in the corresponding element of the nameLengths array using the loop index i. After the loop completes, we print the nameLengths array to the console using Arrays.toString().
		
//	    6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		int sum2 = 0; 
		
		for (int i = 0; i  < nameLengths.length; i++)	{
			sum2 += nameLengths[i];
		}
		
		System.out.println(sum2);
		
//		We then initialize an integer variable sum to 0, which we'll use to accumulate the sum of all the elements in the nameLengths array. We then loop through each element in the nameLengths array using a for loop. For each element, we add its value to the sum variable.
		
//	    7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		
		String repeatedWord = repeatString("Hello", 3);
		System.out.println(repeatedWord);
		
// input values listed here
		
		
//	    8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		
		String getFullName = fullName("Julie", "House");
		System.out.println(getFullName);
		//input values not left null
		
		
//	    9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		int[] arr = {11, 25, 30, 40};
		boolean isSumGreater100 = sum100(arr);
		System.out.println(isSumGreater100);
		
//	    10. Write a method that takes an array of double and returns the average of all the elements in the array.
			
		double[] arr1 = { 10.5, 20.3, 30.1, 40.7 };
		double average2 = getAverage(arr1);
		System.out.println(average2);
		
//	    11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		
//		created two arrays arr1 and arr2, and called the isAverageGreater method passing these arrays as arguments. The method returns a boolean value indicating whether the average of the elements in the first array is greater than the average of the elements in the second array, which we store in the result variable.
		
		double[] arr3 = {2.0, 4.0, 6.0};
	    double[] arr2 = {1.0, 3.0, 5.0};

	    boolean result = isAverageGreater(arr3, arr2);

	    System.out.println(result);
		
		
//	    12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	    
//	    In this example, we have called the willBuyDrink method with the hot boolean set to true and money set to 15.0. The method returns true because it is hot outside and the person has more than $10.50 in their pocket.
	    
	    boolean hot = true;
	    double money = 9.0;
	    
	    boolean result1 = willBuyDrink(hot, money);
	    
	    System.out.println("Buy a drink? " + result1);
		
		
//	    13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	    
	    int result2 = square(5);
	    System.out.println(result2);
	    

	}
	
	//Method 7. 
//	first create a StringBuilder object to construct the resulting string, then use a for loop to concatenate word to the StringBuilder n times. Finally, we convert the StringBuilder to a String using the toString() method and return it.
	public static String repeatString(String word, int n)	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++)	{
			sb.append(word);
		}
		
		return sb.toString();
	}
	
	//Method 8.
//	concatenate the firstName and lastName strings using the + operator and add a space character in between them. The resulting string is then returned as the full name.
	public static String fullName(String firstName, String lastName)	{
		return firstName + " " + lastName;
	}
	
	//Method 9.
//	first initialize a variable sum to zero to store the sum of all the integers in the array. I then use a for loop to iterate over each element in the array and add it to sum. Finally, I compare sum to 100 and return true if it is greater than 100.
	
	public static boolean sum100(int[] arr)	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++)	{
			sum += arr[i];
		}
		
		return sum > 100;
	}
	
	//Method 10.
//	we initialize a variable sum to zero to store the sum of all the elements in the array. We then use a for loop to iterate over each element in the array and add it to sum. Finally, we calculate the average by dividing sum by the length of the array and return the result.
	
	public static double getAverage(double[] arr) {
	    if (arr == null || arr.length == 0) {
	        return 0;
	    }
	    double sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    return sum / arr.length;
	}
	
//	Method 11
//	first initializes two variables sum1 and sum2 to zero to store the sum of the elements in the first and second arrays, respectively. It then computes the lengths of the two arrays and uses two for loops to iterate through the elements of each array and add them to their corresponding sums. After the loop, it calculates the averages of each array by dividing the sums by their respective lengths. Finally, it compares the two averages and returns a boolean value indicating whether the average of the elements in the first array is greater than the average of the elements in the second array.
	
	public static boolean isAverageGreater(double[] arr1, double[] arr2) {
	    double sum1 = 0.0;
	    double sum2 = 0.0;
	    int n1 = arr1.length;
	    int n2 = arr2.length;

	    for (int i = 0; i < n1; i++) {
	        sum1 += arr1[i];
	    }

	    for (int i = 0; i < n2; i++) {
	        sum2 += arr2[i];
	    }

	    double avg1 = sum1 / n1;
	    double avg2 = sum2 / n2;

	    return avg1 > avg2;
	}
	
//	Method 12
//	takes two parameters, a boolean isHotOutside and a double moneyInPocket. If it is hot outside and the person has more than $10.50 in their pocket, the method will return true, otherwise it will return false.The method first checks if isHotOutside is true and moneyInPocket is greater than 10.50 using an if statement. If both conditions are true, it returns true, otherwise it returns false.
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    if (isHotOutside && moneyInPocket > 10.50) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
//	Method 13
//	

	public static int square(int n)	{
		return n * n;
	}
	
}
