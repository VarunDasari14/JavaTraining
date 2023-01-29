package com.varun.classwork;

public class Strings {
	public static String reverse(String x) {
		String answer = "";
		for(int i = 0; i < x.length(); i++) {
			char c = x.charAt(x.length()- 1 - i);
			answer += c;
		}
		return answer;
	}
	
	public static String reverseFast(String x) {
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < x.length(); i++) {
			char c = x.charAt(x.length()- 1 - i);
			answer.append(c);
		}
		return answer.toString();
	}
	
	public static boolean isPalindrome(String p) {
		return reverse(p).equals(p);
	}
	
	/*
	 * given an input string and a character print out 2 char to the left and 2 char to the 
	 * right of the given character 
	 * char only occurs once
	 * 
	 */
	public static void twoChar(String input, char a) {
		int index = input.indexOf(a);
		if(index > 1 && index < input.length() - 3) {
			String answer1 = input.substring(index - 2, index);
			String answer2 = input.substring(index + 1, index + 3);
			System.out.println(answer1);
			System.out.println(answer2);
		}
	}
	
	/*
	 * print input string without vowels
	 */
	public static void noVowels(String input) {
		String answer = "";
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(!"aeiou".contains(c + "")) {
				answer += c;
			}
		}
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		/*
		 * Strings are immutable
		 * immutable: can't be changed
		 * mutable: can be changed
		 */
		/*
		 * String methods
		 */
		 // how to find the length of a string
		String name = "Varun";
		int length = name.length();
		System.out.println(length);
		
		//how to find a single character in a string
		char letter = name.charAt(1); 
		System.out.println(letter);
		
		//how to check if a certain substring exists in a string
		boolean contains = name.contains("u");
		System.out.println(contains);
		
		//take a substring of a string
		String subString = name.substring(0, 3);
		System.out.println(subString);
		
		//how split strings
		String fullName = "Varun Dasari";
		String[] names = fullName.split(" ");
		System.out.println("First name is " + names[0] + " last name is " + names[1]);
		
		//how to find a index of a character in a string
		int index = name.indexOf("u");
		System.out.println(index);
		
		
		//System.out.println(reverseFast(name.repeat(100_000)));
		//System.out.println(isPalindrome(name));
		//System.out.println(isPalindrome("racecar"));
		//twoChar("abcdexyz", 'a');
		//noVowels(fullName);
		
		
	}
}
