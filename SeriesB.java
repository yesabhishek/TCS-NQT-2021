package practice;
import java.util.*;
public class SeriesB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
		int a = 0, b= 0;
		if(n%2 == 0) {
			for (int i = 0; i<n-2; i+=2) {
				a += 1;
			}
			
			System.out.print(a);
		}
		else {
			for (int i = 0; i<=n-2; i+=2) {
				b += 2;
			}
			
			
			System.out.print(b);
		}
		
		sc.close();
	}
}
