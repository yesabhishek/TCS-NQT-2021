package practice;

import java.util.*;

public class SeriesA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 0,0,7,6,14,12,21,18, 28
		int n = sc.nextInt();
		int a = 0, b = 0;
		if (n % 2 == 0) 
		{
			for (int i=0; i<=n-2; i=i+2)
			{
				a += i*2;
			}
			System.out.print(a);
		}
		else 
		{
			
			for (int i=1;i <n; i=i+2) {
				b = b*7;
			}
			System.out.print(b);
		}

		sc.close();

	}
}
