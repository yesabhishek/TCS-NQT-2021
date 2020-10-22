package practice;
import java.util.*;

public class MoveArrangement {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[] {-1, -4, -2, -6, 4, 6};
	
	for (int i = 0; i<arr.length; i++) {
		for (int j = 0; j<arr.length; j++) {
			if (arr[i] > arr[j] ) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
	for (int i = 0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	}
}


