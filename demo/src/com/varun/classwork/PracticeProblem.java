package com.varun.classwork;

public class PracticeProblem {
	
 
	public static void main(String[] args) {
		
		WordMatch game = new WordMatch("mississippi");
		String[] guesses = new String[] {"i", "iss", "issipp", "mississippi"};
		for(String guess : guesses) {
			System.out.println(game.scoreGuess(guess));
		}
		WordMatch game1 = new WordMatch("aaaabb");
		String[] guesses1 = new String[] {"a", "aa", "aaa", "aabb", "c"};
		for(String guess : guesses1) {
			System.out.println(game1.scoreGuess(guess));
		}
		WordMatch game2 = new WordMatch("concatenation");
		System.out.println(game2.findBetterGuess("ten", "nation"));
		
	}
}

class WordMatch {
	/** The secret string. */
	private String secret;

	/**
	 * Constructs a WordMatch object with the given secret string of lowercase
	 * letters.
	 */
	public WordMatch(String word) {
		this.secret = word;
	}

	
	
	
	
	
	/**
	 * Returns a score for guess, as described in part (a). Precondition: 0 <
	 * guess.length() <= secret.length()
	 */
	/*
	 * Write the WordMatch method scoreGuess. To determine the score to be returned,
	 * scoreGuess finds the number of times that guess occurs as a substring of
	 * secret and then multiplies that number by the square of the length of guess.
	 * Occurrences of guess may overlap within secret. Assume that the length of
	 * guess is less than or equal to the length of secret and that guess is not an
	 * empty string.
	 */
	public int scoreGuess(String guess) {
		int counter = 0;
		int guessLength = guess.length();
		for(int i = 0; i + guessLength <= this.secret.length(); i++) {
			String secretSubString = this.secret.substring(i, i + guessLength);
			if(secretSubString.equals(guess)) {
				counter++;
			}
		}
		return counter * (guessLength * guessLength);
	}

	
	
	/**
	 * Returns the better of two guesses, as determined by scoreGuess and the rules
	 * for a tie-breaker that are described in part (b). Precondition: guess1 and
	 * guess2 contain all lowercase letters. guess1 is not the same as guess2.
	 */
	/**
	 * Write the WordMatch method findBetterGuess, which returns the better guess of
	 * its two String parameters, guess1 and guess2. If the scoreGuess method
	 * returns different values for guess1 and guess2, then the guess with the
	 * higher score is returned. If the scoreGuess method returns the same value for
	 * guess1 and guess2, then the alphabetically greater guess is returned. The
	 * following example shows a declaration of a WordMatch object and the outcomes
	 * of some possible calls to the scoreGuess and findBetterGuess methods.
	 */
	public String findBetterGuess(String guess1, String guess2) {
		int x = scoreGuess(guess1);
		int y = scoreGuess(guess2);
		
		if(x > y) {
			return guess1;
		} else if(y > x) {
			return guess2;
		} else {
			if(guess1.compareTo(guess2) < 0) {
				return guess2;
			} else {
				return guess1;
			}
		}
	}
	
	public int compare(String x, String y) {
		
		if(x.equals(y)) {
			return 0;
		}
		
		byte[] a = x.getBytes();
		byte[] b = y.getBytes();
		
		for(int i = 0, j = 0; i < x.length() && j < y.length(); i++, j++) {
			if(a[i] < b[i]) {
				return -1;
			} else if(a[i] > b[i]) {
				return 1;
			}
		}
		if(x.length() < y.length()) {
			return -1;
		} else {
			return 1;
		}
	}
}