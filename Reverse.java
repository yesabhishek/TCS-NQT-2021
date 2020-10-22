package practice;
import java.util.*;


public class Reverse {
	
	public static int[] reverse( int a[]) {
		int r_arr[] = new int[a.length];
		int j = 0;
		for (int i=a.length-1; i>=0; i--) {
			r_arr[j++] = a[i];
		}
		
		return r_arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int arr[] = new int[arrSize];
		// Taking Inputs
		for (int i = 0; i<arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr = reverse(arr);
		
		// Printing the array
		for (int i = 0; i<arrSize; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
