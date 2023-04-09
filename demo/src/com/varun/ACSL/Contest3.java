package ACSL;

import java.util.ArrayList;
import java.util.List;

public class Contest3 extends Alphabet {
	public Contest3(String input) {
		super(input);
	}

	public static void main(String[] args) {
		String input = "BINARYSEARCHTREE";
		Contest3 contest = new Contest3(input);
		System.out.println(contest.solve());
	}

	@Override
	public int findAlphabeticalOrderIndex(Character c) {

		if (this.alphabet.isEmpty()) {
			return 0;
		}

		for (int i = 0; i < this.alphabet.size(); i++) {
			if (c <= this.alphabet.get(i)) {
				return i;
			}
		}

		return this.alphabet.size();
	}

	@Override
	public int findInsertValue(int index) {

		// rule 1
		if (this.alphabet.size() <= 1) {
			return 0;
		}
		// rule 2
		else if (index == 0) {
			return this.values.get(index + 1) + 1;
		} else if (index == this.alphabet.size() - 1) {
			return this.values.get(index - 1) + 1;
		}
		// rule 3
		else {
			return Math.max(this.values.get(index - 1), this.values.get(index + 1)) + 1;
		}
	}

	@Override
	public String orderedStringByValue() {
		StringBuilder output = new StringBuilder();

		for (int count = 0; count <= 80; count++) {
			for (int i = 0; i < this.alphabet.size(); i++) {
				if (this.values.get(i) == count) {
					output.append(this.alphabet.get(i));
				}
			}
		}

		return output.toString();
	}

}

abstract class Alphabet {

	List<Character> alphabet = new ArrayList<>();
	List<Integer> values = new ArrayList<>();
	String input;

	/**
	 * Creates alphabet object with given string
	 * 
	 * @param input
	 */

	public Alphabet(String input) {
		this.input = input;
	}

	/**
	 * Returns the insert point of character C into the known alphabet
	 * 
	 * @param c
	 * @return Insertion point
	 */
	public abstract int findAlphabeticalOrderIndex(Character c);

	/**
	 * Returns the value of the character at insertion index at time of insertion
	 * 
	 * @param index
	 * @return Value of the character at index at time of insertion
	 */
	public abstract int findInsertValue(int index);

	/**
	 * Ordered string by lowest value in left to right order from alphabet
	 * 
	 * @return
	 */
	public abstract String orderedStringByValue();

	public String solve() {

		for (Character c : input.toCharArray()) {
			// Find the alphabetical index we want to insert at
			int index = findAlphabeticalOrderIndex(c);

			// Insert the character
			alphabet.add(index, c);
			values.add(index, 0);

			// Find the value of the inserted character at inserted index
			int value = findInsertValue(index);

			// Insert the value
			values.set(index, value);
		}

		return orderedStringByValue();
	}
}
