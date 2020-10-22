package practice;

import java.util.*;

public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		// 0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
		int a = 0, b = 0;
		
		if (n % 2 == 0) {
			for( int i = 1; i<= n-2; i= i+2) {
				a = a + 2;
				b = a / 2;
			}
			
			System.out.print(b);
		} else {
			for(int i = 1 ; i < (n-2) ; i = i+2)
		       {
		         a = a + 2;
		         b = a / 2;
		       }
		       a = a + 2;	
			
			
			System.out.print(a);
		}
		
		sc.close();
	}
}
