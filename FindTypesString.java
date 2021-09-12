package week2.day1.assignment;

public class FindTypesString {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0, space = 0, number = 0, splchar = 0;

		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (Character.isLetter(charArray[i])) {
				letter++;
			} else if (Character.isSpaceChar(charArray[i])) {
				space++;
			} else if (Character.isDigit(charArray[i])) {
				number++;
			} else {
				splchar++;
			}

		}

		System.out.println("Total characters in the given string : "+charArray.length);
		System.out.println("Count of Letters in given text: " + letter);
		System.out.println("Count of Space in given text: " + space);
		System.out.println("Count of Numbers in given text" + number);
		System.out.println("Coung of SpecialCharcter in given text: " + splchar);

	}

}
