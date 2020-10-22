package practice;
import java.util.*;
public class SeriesC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1,1,2,3,4,9,8,27,16,81,32,243,….
		
		int n = sc.nextInt();
		int a = 1, b = 1;
		if (n % 2 == 0) {
			for (int i = 0; i<n-2; i+=2) {
				a = a*3;
			}
			System.out.print(a);
		}
		else {
			for (int i = 0; i<=n-2; i+=2) {
				b = b*2;
			}
			System.out.print(b);
		}
		
		sc.close();
	}

}
