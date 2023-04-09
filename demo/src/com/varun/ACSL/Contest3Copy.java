package ACSL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contest3Copy {

	public static void main(String[] args) {
		List<Character> alphabet = new ArrayList<>();
		List<Integer> values = new ArrayList<>();
		Scanner myObj = new Scanner(System.in);
		String input = myObj.nextLine();
		myObj.close();
		System.out.println(solve(alphabet, values, input));
	}

	public static int findAlphabeticalOrderIndex(Character c, List<Character> alphabet, List<Integer> values) {
		if (alphabet.isEmpty()) {
			return 0;
		}
		for (int i = 0; i < alphabet.size(); i++) {
			if (c <= alphabet.get(i)) {
				return i;
			}
		}
		return alphabet.size();
	}

	public static int findInsertValue(int index, List<Character> alphabet, List<Integer> values) {
		if (alphabet.size() <= 1) {
			return 0;
		} else if (index == 0) {
			return values.get(index + 1) + 1;
		} else if (index == alphabet.size() - 1) {
			return values.get(index - 1) + 1;
		} else {
			return Math.max(values.get(index - 1), values.get(index + 1)) + 1;
		}
	}

	public static String orderedStringByValue(List<Character> alphabet, List<Integer> values) {
		StringBuilder output = new StringBuilder();

		for (int count = 0; count <= 80; count++) {
			for (int i = 0; i < alphabet.size(); i++) {
				if (values.get(i) == count) {
					output.append(alphabet.get(i));
				}
			}
		}

		return output.toString();
	}

	// output
	public static String solve(List<Character> alphabet, List<Integer> values, String input) {

		for (Character c : input.toCharArray()) {
			int index = findAlphabeticalOrderIndex(c, alphabet, values);
			alphabet.add(index, c);
			values.add(index, 0);
			int value = findInsertValue(index, alphabet, values);
			values.set(index, value);
		}
		return orderedStringByValue(alphabet, values);
	}
}
