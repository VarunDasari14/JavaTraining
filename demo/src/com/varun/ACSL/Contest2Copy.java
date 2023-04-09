package ACSL;

import java.util.Scanner;

public class Contest2Copy {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 
	    String str = myObj.nextLine();
	    myObj.close();
		
		byte[] numbers = str.getBytes();

		// convert ascii to binary
		String[] arr = new String[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = String.format("%8s", Integer.toBinaryString(numbers[i])).replace(" ", "0");
		}
		
		// turn the array of binary numbers into a string
		String binStr = String.join("", arr);
		
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
