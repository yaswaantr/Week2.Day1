package week2.day1.assignment;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "madam", reverseString = "";
		System.out.println("Given String is: "+str);

		for (int i = str.length()-1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		
		System.out.println("Reversed of the given String is: "+reverseString);
		
		if(str.equals(reverseString)) {
			System.out.println("The given word is a Palindrome");
		}else {
			System.out.println("The given word is NOT a Palindrome");
		}
	}

}
