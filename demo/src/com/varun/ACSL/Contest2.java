package ACSL;

import java.util.Scanner;

public class Contest2 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 
	    String str = myObj.nextLine();
	    myObj.close();
		
		// split each character
		String[] arr = str.split("");
		char[] ch = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch[i] = arr[i].charAt(0);
		}
		// convert each to character ascii
		int[] numbers = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			numbers[i] = (int) ch[i];
		}

		// convert ascii to binary
		for (int i = 0; i < str.length(); i++) {
			arr[i] = Integer.toBinaryString(numbers[i]);
		}

		// make the binary numbers all 8 digits
		for (int i = 0; i < str.length(); i++) {
			while (arr[i].length() != 8) {
				arr[i] = "0" + arr[i];
			}
		}

		// turn the array of binary numbers into a string
		String binStr = "";
		for (int i = 0; i < arr.length; i++) {
			binStr = binStr + arr[i];
		}
		
		// search for last binary number in ascending sequence
		int num = 0;
		while (binStr.contains(String.valueOf(num))) {
			num = binaryToDecimal(num);
			num += 1;
			num = Integer.parseInt(Integer.toBinaryString(num));
		}

		System.out.println(binaryToDecimal(num) - 1);
	}

	public static int binaryToDecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int temp = binary % 10;
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		return decimal;
	}
}
