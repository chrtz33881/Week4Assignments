package week4Collections;

public class Week4StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String firstName = "Julez";
//		String lastName = "Casa";
//		System.out.println(firstName + " " + lastName);
//		
//		String tripleHi = multiplyString("Hi", 3);
//		System.out.println(tripleHi);
//		
//		System.out.println(firstName.concat(lastName));
//		firstName = firstName.concat(lastName);
//		System.out.println(firstName);
//		
//		//String Builder
//		StringBuilder fullName = new StringBuilder("Sam");
//		fullName.append(" Smith");	
//		System.out.println(fullName.toString());
//		
//		//String Builder method examples
//		System.out.println(fullName.charAt(5));
////		System.out.println(fullName.deleteCharAt(5));
////		System.out.println(fullName.delete(1, 3));
//		System.out.println(fullName.indexOf("it"));
//		System.out.println(fullName.replace(4, 9, "Thompson"));
//		System.out.println(fullName.reverse());
//		
//
		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";

		System.out.println(firstName);
		System.out.println(lastName);

		StringBuilder sb = new StringBuilder();

		// use append() to dynamically create a String using StringBuilder 
		sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println(sb.toString());

		// Add a middle Initial
		sb.insert(firstName.length()+1, middleInitial + " ");
		System.out.println(sb.toString());
		System.out.println(sb.reverse());

	}
	
	public static String multiplyString(String str, int num)	{
		StringBuilder result = new StringBuilder();
		for (int i = 0 ; i < num; i++)	{
			result.append(str);
		}
		
		return result.toString();

	}

}
