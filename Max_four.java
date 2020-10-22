package practice;
import java.util.*;
public class Max_four 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int[] scores = new int[range];
		
		
		for (int i = 0 ; i < range; i++) {
			scores[i] = sc.nextInt();
		}
		
		
		/*for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
			
		}
		*/
		Arrays.sort(scores);
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
			
		}
		
		sc.close();
		
		

	}

}
