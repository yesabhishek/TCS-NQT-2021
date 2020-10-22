package practice;
import java.util.*;
public class OddlyEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int even = 0, odd = 0;
		
		even=even + num.charAt(0)-'0';
		System.out.print((even));
		for(int i = 1; i<(num).length(); i++) {
			if (i%2 == 0) {
				even += (int)num.charAt(i); 
			}
			else {
				odd += (int)num.charAt(i); 
			}
			
		}
//		System.out.print(Math.abs(odd-even));
		
		sc.close();
	}

}
// 9834698765123