package practice;
import java.util.*;
public class StringUpdate {

	public static String update(String joke) 
	{
		
		int len = joke.length();
		String new_joke = "";
		for (int i=0; i<len; i++) {
			if((Character.isUpperCase(joke.charAt(i)) == true)) 
			{
				new_joke += Character.toLowerCase(joke.charAt(i));
				
			}
			else {
				new_joke += Character.toUpperCase(joke.charAt(i));
			}
		}
		return new_joke;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = update(s);
		System.out.print(s);
		sc.close();
		
	}
}
