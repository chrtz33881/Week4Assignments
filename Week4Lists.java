package week4Collections;

import java.util.ArrayList;
import java.util.List;

public class Week4Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//traditional array
		String[] cars = new String[3];
		cars[0] = "Camero";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		//Array List example
		//List<String> reads a list of String
		//List<E> list of E where E is the generic that will be replaced with the type 
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1);
		
		//print out array list on console
		for(int i = 0; i < sports.size(); i++)	{
			System.out.println(sports.get(i));
		}
		
		for (String sport: sports)	{
			System.out.println(sport);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		

	}

}
