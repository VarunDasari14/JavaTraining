package com.varun.homework;

public class Calculator {
	
	public static String add(String num1, String num2) {
		int carry = 0;		
		String answer = "";
		int i = 0, j = 0;
		for(; i < num1.length() && j < num2.length(); i++, j++) {
			int temp = num1.charAt(num1.length() - 1 - i) - 48 + num2.charAt(num2.length() - 1 - i) - 48 + carry;
			if(temp > 9) {
				carry = 1;
				temp = temp - 10;
			} else {
				carry = 0;
			}
			answer = temp + answer;
		}
		if(num1.length() != num2.length()) {
			if(num1.length() > num2.length()) {
				for(; i < num1.length(); i++) {
					int temp = num1.charAt(num1.length() - 1 - i) - 48 + carry;
					if(temp > 9) {
						carry = 1;
						temp = temp - 10;
					} else {
						carry = 0;
					}
					answer = temp + answer;
				}
			} else {
				for(; i < num2.length(); i++) {
					int temp = num2.charAt(num2.length() - 1 - i) - 48 + carry;
					if(temp > 9) {
						carry = 1;
						temp = temp - 10;
					} else {
						carry = 0;
					}
					answer = temp + answer;
				}
			}
		}
		if(carry != 0) {
			answer = carry + answer;
		}
		return answer;
	}
	
	public static String subtract(String num1, String num2) {
		return "";
	}
	
	public static String multiply(String num1, String num2) {
		return "";
	}
	
	public static void main(String[] args) {
		System.out.println(Calculator.add("1111111113333", "9349859213124134311765"));
	}

}
