package week4Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * List
		 * Allows duplicates 
		 * Keeps elements ordered by index
		 * Allows null values
		 * Common implementations: ArrayList, LinkedList, Vector
		 * best if you like to keep order
		 */
		
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
		
		
		
		
		for(String student : students)	{
			System.out.println(student);
		}
		
		System.out.println(students.get(2));
		System.out.println(students.get(0));
		
		/*
		 * Set
		 * 
		 * No duplicates
		 * Unordered
		 * Allows null value 
		 * Common Implementations: HashSet, LinkedHashSet, TreeSet
		 * you dont care what order they are
		 */
		
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansa");
		states.add("California");
		states.add(null);
		
		System.out.println(states.size());
		System.out.println(states.contains("Delaware"));
		if (states.contains("Alabama"))	{
			states.remove("Alabama");
		}
		
		
		
		for (String state : states)	{
			System.out.println(state);
		}
		
		/*
		 * Map
		 * 
		 * Map<K,V> K is the key, and V is the value
		 * 
		 * Key value pairs (dictionary)
		 * Values can be duplicate, but not keys
		 * Common Implementations: HashMap, LinkedHashMap, TreeMap, HashTable
		 * when you need to associate key value pairs
		 */
			
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		racerPlacements.remove(1);
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key : racerKeys)	{
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers)	{
			System.out.println(racer);
		}
		
		Map<String, String> dictionary =  new HashMap< String, String>();
		dictionary.put("Augment", "Make (something) greater by adding to it; increase.");
		dictionary.put("Diminish", "make or become less.");
		dictionary.put("Ostentatious", "Characterized by vulgar or pretentious display.");
		
		
		
		
			

	}

}
