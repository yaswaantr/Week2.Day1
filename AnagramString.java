package week2.day1.assignment;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1 = "posts";
		String str2 = "stops";

		if (str1.length() == str2.length()) {

			System.out.println("Length of the strings are equal : " + str1.length());

			char[] arr1 = str1.toCharArray();
			char[] arr2 = str1.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			str1 = String.valueOf(arr1); 
			str2 = String.valueOf(arr2);

			System.out.println("Sorted String 1: " + str1);
			System.out.println("Sorted String 2: " + str2);

			if (str1.equals(str2)) {
				System.out.println("Given Strings are Equal");
			} else {
				System.out.println("Given Strings are NOT Equal");
			}
		} else {
			System.out.println("Length of the strings are not equal. ");
		}

	}

}
