package practice;
import java.util.*;
public class RemoveSpaces {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		sentence  = sentence.replaceAll("\\s", "");
		System.out.print(sentence);
		
		sc.close();
	}
}
