package practice;

import java.util.*;

public class RemoveComma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String paragraph = "This is a pincode"; // We took the String

		String[] arr = paragraph.split("//s"); // We Split it over Spaces and copied it to an Array of Strings
		String why = ""; // We took an extra string value in hand

		for (String a : arr) { // We copied the Array of String to an actual string value
			why += a;

		}

//		for(String a: arr) {
//			System.out.println(a);
//		}

		String n = Arrays.toString(arr); // Directly moving the format to Arrays to String
		System.out.print(why); // Printing the value, depending on mood!!
		sc.close();
	}
}
