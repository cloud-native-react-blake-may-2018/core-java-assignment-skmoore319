package com.revature.eval.java.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	// COMPLETED
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	// COMPLETED
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		// Add a character to the output string IF
		//		It's the first letter in the string
		//		It's preceded by a space or a hyphen
		// Convert the string to uppercase
		StringBuilder workspace = new StringBuilder("");
		for(int i = 0, j = i - 1; i < phrase.length(); i++, j++) {
			if (i == 0) {
				workspace.append(phrase.charAt(i));
			}
			else {
				if (phrase.charAt(j) == ' ' || phrase.charAt(j) == '-') {
					workspace.append(phrase.charAt(i));
				}
			}
		}
		return workspace.toString().toUpperCase();
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	// COMPLETED
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			// return side1 == side2 and side2 == side3
			return sideOne == sideTwo && sideTwo == sideThree;
		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration
			//return side1 == side2 or side2 == side3
			return sideOne == sideTwo || sideTwo == sideThree || sideThree == sideOne;
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			// return side1 != side2 and side2 != side3 and side3 != side1
			return sideOne != sideTwo && sideTwo != sideThree && sideThree != sideOne;
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	// COMPLETED
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		// Start a score. Set it at zero
		// For each character in the input string:
		//		Determine the letter score with a switch statement
		//		Add that score to the total
		// Return the total
		int score = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'A' || string.charAt(i) == 'a' || string.charAt(i) == 'E' || string.charAt(i) == 'e' || 
					string.charAt(i) == 'I' || string.charAt(i) == 'i' || string.charAt(i) == 'O' || string.charAt(i) == 'o' || 
					string.charAt(i) == 'U' || string.charAt(i) == 'u' || string.charAt(i) == 'L' || string.charAt(i) == 'l' || 
					string.charAt(i) == 'N' || string.charAt(i) == 'n' || string.charAt(i) == 'R' || string.charAt(i) == 'r' || 
					string.charAt(i) == 'S' || string.charAt(i) == 's' || string.charAt(i) == 'T' || string.charAt(i) == 't') {
				score++;
			}
			else if (string.charAt(i) == 'D' || string.charAt(i) == 'd' || string.charAt(i) == 'G' || string.charAt(i) == 'g') {
				score += 2;
			}
			else if (string.charAt(i) == 'B' || string.charAt(i) == 'b' || string.charAt(i) == 'C' || string.charAt(i) == 'c' || 
					string.charAt(i) == 'M' || string.charAt(i) == 'm' || string.charAt(i) == 'P' || string.charAt(i) == 'p') {
				score += 3;
			}
			else if (string.charAt(i) == 'F' || string.charAt(i) == 'f' || string.charAt(i) == 'H' || string.charAt(i) == 'h' || 
					string.charAt(i) == 'V' || string.charAt(i) == 'v' || string.charAt(i) == 'W' || string.charAt(i) == 'w' || 
					string.charAt(i) == 'Y' || string.charAt(i) == 'y') {
				score += 4;
			}
			else if (string.charAt(i) == 'K' || string.charAt(i) == 'k') {
				score += 5;
			}
			else if (string.charAt(i) == 'J' || string.charAt(i) == 'j' || string.charAt(i) == 'X' || string.charAt(i) == 'x') {
				score += 8;
			}
			else if (string.charAt(i) == 'Q' || string.charAt(i) == 'q' || string.charAt(i) == 'Z' || string.charAt(i) == 'z') {
				score += 10;
			}
		}
		return score;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	// COMPLETED
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		// Throw exceptions for any inputs that have non-numeric characters or do not have 10 characters
		// Remove parentheses, dots, dashes, and spaces from the input
		String[] noDirt = string.split(" |\\-|\\(|\\)|\\.");
		String cleanString = "";
		for (String e: noDirt) {
			cleanString = cleanString + e;
		}
		
		System.out.println(cleanString);
		
		if (cleanString.length() > 10) {
			throw new IllegalArgumentException();
		}
		else {
			for (int i = 0; i < cleanString.length(); i++) {
				if (!Character.isDigit(cleanString.charAt(i))) {
					throw new IllegalArgumentException();
				}
			}
		}
		return cleanString;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		// Determine how words might be separated (by spaces, commas, or new line characters)
		
		// Split the string with multiple delimters: " " "," "\n" ",\n", using the regex "or" sequence "|\\"
		String[] words = string.split(" |\\,|\\|\\,\n");
		
		System.out.println(Arrays.toString(words));
		// Create an empty map
		Map<String, Integer> wordList = new HashMap<>();
		
		// For every word in the words array
		for (int i = 0; i < words.length; i++) {
			
			// If the key doesn't exist in the Map,
			if (!wordList.containsKey(words[i])) {
				// Add the word to the map, and set the value equal to 1
				wordList.put(words[i], 1);
				
			}
			else {
				// Increment the count of that word by 1
				int newVal = Integer.valueOf(wordList.get(words[i])) + 1;
				// Technically, this overwrites the entry, but the value will update as it needs to.
				wordList.put(words[i], newVal);
			}
			
		}
		
		System.out.println(wordList.toString());
		
		// Return the Map
		return wordList;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			// Set the index = 0
			int index = 0;
			// If the list only has one element
			
				// If the element - input = 0
					// Return the index
				// Else
					// Return not found
			// Else
				// Set the index = length/2
				// If the element - input = 0
					// Return the index
				// Else if the element - input < 0
					// Save old index, set index /= 2
					// Run indexOf on an array from 0 to old index
				// Else
					// Save old index, set index /= 2
					// Run indexOf on an array from old index to the end of the array
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	// COMPLETED
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
		// Split String into an array of words, separated by spaces
		String[] words = string.split(" ");
		
		String answer = "";
		
		// For each String in the array
		for (int i = 0; i < words.length; i++) {
			String tail = "ay";
			if (words[i].toLowerCase().charAt(0) == 'a' || words[i].toLowerCase().charAt(0) == 'e' ||
					words[i].toLowerCase().charAt(0) == 'i' || words[i].toLowerCase().charAt(0) == 'o' ||
					words[i].toLowerCase().charAt(0) == 'u') {
				words[i] = words[i] + tail;
			}
			else {
				int endPoint = 0;
				String vowels = "aeiou";
				for (int j = 0; j < words[i].length(); j++) {
					// If the above list of vowels contains the character at the specified index of the current string:
					if (vowels.contains(String.valueOf(words[i].toLowerCase().charAt(j)))) {
						// Watch out for "qu"! That's considered a consonant
						if (j > 0) {
							if (words[i].toLowerCase().charAt(j) == 'u' && words[i].toLowerCase().charAt(j-1) == 'q') {
								continue;
							}
						}
						
						// Then the for loop has reached the first character that is a vowel in the string.
						endPoint = j;
						break;
					}
				}
				String header = words[i].substring(0, endPoint);
				words[i] = words[i].substring(endPoint, words[i].length()) + header + tail;
			}
			answer = answer + words[i] + " ";
		}
			// Select all leading consonants before the first value (including zero characters)
			// Move any leading consonants to the end of the String, and add "ay"
		// Return the elements to a new String, separated by spaces
		answer = answer.substring(0, answer.length()-1);
		System.out.println(answer);
		return answer;
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	// COMPLETE
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		// The number of digits should be the length of a string containing the input
		String inputString = Integer.toString(input);
		
		int numDigits = inputString.length();
		
		int total = 0;
		// Iterate using the input string to raise and sum the numbers
		for (int i = 0; i < numDigits; i++) {
			total += Math.pow(Double.parseDouble(Character.toString(inputString.charAt(i))), numDigits);
		}
		
		// Return true if input = sum of the elements in this array.
		
		return total == input;
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	// COMPLETED
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		List<Long> factors = new ArrayList<>();
		boolean done = false;
		while (!done) {
			// Divide the input by every number up to that input
			for (long i = 2l; i <= l; i++) {
				// Method is finished when dividing results in 1
				if (i == l) {
					factors.add(i);
					done = true;
				}
				else {
					// If the input is divisible by the current counted number:
					if (l % i == 0) {
						// Add this divisor to the list of factors
						factors.add(i);
						// Set the new dividend equal to the quotient
						l /= i;
						break;
					}
				}
			}
		}
		
		
		return factors;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	// COMPLETED
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
			// TODO Write an implementation for this method declaration
			// For each alphabetic character in the String:
			System.out.println(Character.getNumericValue('A'));
			System.out.println(Character.getNumericValue('a'));
			String lowerTargets = "abcdefghijklmnopqrstuvwxyz";
			String upperTargets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String finalAnswer = "";
			
			int lowerStart = Character.valueOf('a');
			int lowerLimit = Character.valueOf('z') + 1;
			int upperStart = Character.valueOf('A');
			int upperLimit = Character.valueOf('Z') + 1;
			
			for (int i = 0; i < string.length(); i++) {
				
				String active = string.substring(i, i + 1);
				char activeChar = active.charAt(0);
				
				if (lowerTargets.contains(active)) {
					if (Character.valueOf(string.charAt(i)) + key >= lowerLimit) {
						
						int distance = Math.abs(Character.valueOf(string.charAt(i)) - lowerLimit);
						int difference = Math.abs(distance - key);
						activeChar = (char) (lowerStart + difference);
						
					}
					else {
						activeChar =  (char) (Character.valueOf(activeChar) + key);
					}
					
				} else if (upperTargets.contains(active)) {
					
					if (Character.valueOf(string.charAt(i)) + key >= upperLimit) {
						
						int distance = Math.abs(Character.valueOf(string.charAt(i)) - upperLimit);
						int difference = Math.abs(distance - key);
						activeChar = (char) (upperStart + difference);
						
					}
					else {
						activeChar =  (char) (Character.valueOf(activeChar) + key);
					}
					
				}
				finalAnswer = finalAnswer + Character.toString(activeChar);
				
			}
				// Add the value of the key to the letter.
				// If the key goes beyond a letter value:
					// Get the distance from the letter to the end of the alphabet
					// Get the difference between this distance and the cipher
					// Start from "a" and use the difference to reset.
			// Return the encrypted String
			
			return finalAnswer;
		}

	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	// COMPLETED
	public int calculateNthPrime(int i) {
		// TODO Write an implementation for this method declaration
		// Consider the following: THREE for loops
		// The first one counts how many primes have been found so far.
		// The second counts up beyond the maximum current prime.
		// The third loop counts up, dividing the current value in the second loop by every number (brut force)

		int lastPrimeFound = 2;
		// Simple case. Just return 2 as the first prime
		if (i < 1) {
			throw new IllegalArgumentException();
		}
		else {
			
			int tracer = 3;
			// The nth prime number we're searching for
			for (int primeSearch = 2; primeSearch <= i; primeSearch++) {
				
				// System.out.println("Searching for prime #" + primeSearch);
				
				boolean isPrime = true; // Assume that tracer is a prime number.
				while (isPrime) {
					int start = 2; // Always start from 2
					do {
						
						//System.out.println("Dividing " + tracer + " by " + start);
						isPrime = tracer % start != 0;
						//System.out.println("isPrime = " + isPrime);
						if (!isPrime) {
							start += tracer;
						}
						start++;
					} while (start <= (tracer/2));
					
					// If the isPrime flag survived the divisions above
					if (isPrime) {
						lastPrimeFound = tracer;
						//System.out.println("Set lastPrimeFound equal to " + tracer);
						tracer++;
						break;
					}
					else {
						tracer++;
						isPrime = true;
					}
					
				}
				// System.out.println("Last prime found: " + lastPrimeFound);
			}
			
		}

		return lastPrimeFound;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	// COMPLETED
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			// Destroy all spaces and punctuation
			
			// Run decode on the string. Now it just needs to be formatted
			String toFormat = AtbashCipher.decode(string);
			String finalAnswer = "";
			
			// Encoding was easy. Formatting it is the tricky part
			List<String> segments = new ArrayList<>();
			int listCounter = 0;
			
			for (int i = 0; i < toFormat.length(); i += 5) {
				if (toFormat.length() - i < 5) {
					segments.add(toFormat.substring(i, toFormat.length()));
					finalAnswer = finalAnswer + segments.get(listCounter);
					break;
				}
				else {
					segments.add(toFormat.substring(i, i + 5));
					// Add a space the end of every entry except the last one
					segments.set(listCounter, segments.get(listCounter) + " ");
					finalAnswer = finalAnswer + segments.get(listCounter);
				}
				listCounter++;
			}
			if (finalAnswer.charAt(finalAnswer.length() - 1) == ' ') {
				finalAnswer = finalAnswer.substring(0, finalAnswer.length() - 1);
			}
			
			return finalAnswer;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			// Same as above, but don't bother formatting.
			
			// Destroy all spaces and punctuation
			String clean = string.replaceAll(" |\\,|\\.", "").toLowerCase();
			
			// For loop output will go here
			String finalAnswer = "";
			
			// Use this string to identify acceptable characters for alteration
			String targets = "abcdefghijklmnopqrstuvwxyz";
			
			// Figure out the Unicode value of the middle character (13th in the alphabet)
			char middle = 'm';
			
			// For every letter in the string
			for (int i = 0; i < clean.length(); i++) {
				char activeChar = clean.charAt(i);
				if (targets.contains(Character.toString(activeChar))) {
					
					// If letter is less than 13
					if (activeChar < middle) {
						// New value += 2*(13 - value) + 1
						activeChar = (char) (activeChar + (2*(middle - activeChar)) + 1);
					}
					else {
						// New value -= 2*(value - 13) + 1
						activeChar = (char) (activeChar - (2*(activeChar - middle)) + 1);
					}
				
				}
				finalAnswer = finalAnswer + Character.toString(activeChar);
			}
			
			return finalAnswer;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	// COMPLETED
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
		// Eliminate dashes
		String noDashes = string.replaceAll("-", "");
		
		int[] digits = new int[noDashes.length()];
		int total = 0;
		for (int j = 0; j < noDashes.length(); j++) {
			if (!Character.isDigit(noDashes.charAt(j))) {
				if (j == noDashes.length()-1) {
					if (noDashes.charAt(j) == 'X') {
						digits[j] = 10;
						total += digits[j]*(10 - j);
					}
					else { return false;}
				}
				else { return false;}
			}
			else {
				digits[j] = Integer.parseInt(Character.toString(noDashes.charAt(j)));
				total += digits[j]*(10 - j);
			}
		}
		// If any character is not a number or an X, the ISBN is invalid
		// Add v1*10 + v2*9 + ... and X on the end will be 10
		// Modulo result by 11. If it's 0, the ISBN number is valid
		return total % 11 == 0;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: Ï€Î±Î½ Î³Ï�Î¬Î¼Î¼Î±, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	// COMPLETED
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		// If the String is less than 26 characters long, return false.
		
		if (string.length() < 26) {
			
			return false;
		}
		// Create a character array of the alphabet
		String refString = "abcdefghijklmnopqrstuvwxyz";
		
		// Create an array of 26 booleans.
		boolean[] hits = new boolean[26];
		boolean result = true;
		// For each entry in the alphabet array:
		for(int alphaNum = 0; alphaNum < refString.length(); alphaNum++) {
			// Search the String for that letter. Log the result in the boolean array.
			String key = refString.substring(alphaNum, alphaNum + 1);
			hits[alphaNum] = string.indexOf(key) != -1;
			result = result && hits[alphaNum];
		}
			
		// All booleans must be true for the String to be a pangram
		
		return result;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	// COMPLETED
	public Temporal getGigasecondDate(Temporal given) {
		
		// This return type is an interface! This means you need to return
		// an object of any type that implements the Temporal interface!
		
		// TODO Write an implementation for this method declaration
		
		int startSec = 1000000000;
		
		// Determine if the object passed in is of type LocalDate
		// If false, we can safely assume the object is of type LocalDateTime
		boolean hasOnlyDate = given.getClass().getName() == "java.time.LocalDate";
		
		int initYear;
		Month initMonth;
		int initDay;
		int initHour;
		int initMinute;
		int initSecond;
		
		if (hasOnlyDate) {
			// Assume the time is midnight for LocalDate
			given = (LocalDate) given;
			initHour = 0;
			initMinute = 0;
			initSecond = 0;
			
			initYear = ((LocalDate) given).getYear();
			initMonth = ((LocalDate) given).getMonth();
			initDay = ((LocalDate) given).getDayOfMonth();
			System.out.println(initDay);
		}
		else {
			initYear = ((LocalDateTime) given).getYear();
			initMonth = ((LocalDateTime) given).getMonth();
			initDay = ((LocalDateTime) given).getDayOfMonth();
			
			initHour = ((LocalDateTime) given).getHour();
			initMinute = ((LocalDateTime) given).getMinute();
			initSecond = ((LocalDateTime) given).getSecond();
		}
		
		// Create a new LocalDateTime object, and populate it with the input fields
		Temporal formatted = LocalDateTime.of(initYear, initMonth, initDay, initHour, initMinute, initSecond);
		
		return ((LocalDateTime) formatted).plusSeconds(startSec);
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		// TODO Write an implementation for this method declaration
		// Create an array for the multiples
		List<Integer> multiples = new ArrayList<>();
		int total = 0;
		// For each entry in set:
		for (int num: set) {
			
			// Initially, you will multiply by 1
			int factor = 1;
			boolean overflow = false;
			
			while (!overflow) {
				
				int mult = factor * num;
				if (!multiples.toString().contains(Integer.toString(mult))) {
					if (mult >= i) {
						overflow = true;
						break;
					}
					multiples.add(mult);
					
					total += mult;
				}
				factor++;
			}
		}
			// Enter multiples of that number in the master array, stopping before the cutoff.
			// Do not enter any multiples that already exist in the master array
		// Sum the master array. Return the result.
		return total;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	// COMPLETED
	public boolean isLuhnValid(String string) {
		// TODO Write an implementation for this method declaration
		// Test for punctuation and return false if any is present.
		if (string.contains("-") || string.contains(".") || string.contains(",")) {
			return false;
		}
		
		// Test for letters. Return false if any are present
		String valid = "1234567890 ";
		for (int i = 0; i < string.length(); i++) {
			// If the current character is not also contained somewhere in the string of valid characters
			if (!valid.contains(string.substring(i, i+1))) {
				System.out.println("Letter tripped");
				return false;
			}
		}
		
		// Destroy all spaces
		String clean = string.replaceAll(" ", "");
		System.out.println(clean);
		
		int[] digits = new int[clean.length()];
		int total = 0;
		
		// Start from the right end
		for (int j = clean.length()-1; j >= 0; j--) {
			// Place the current digit in the corresponding index of our array of ints
			digits[j] = Integer.parseInt(Character.toString(clean.charAt(j)));
			// If the digit is one of every other digit from the right
			if (((clean.length() - 1) - j) % 2 == 1) {
				// Double that digit
				digits[j] *= 2;
				// And if the result is greater than 9...
				if (digits[j] > 9) {
					// The subtract 9
					digits[j] -= 9;
				}
			}
			// Add the current digit to the running total
			total += digits[j];
		}
		
		// Return true if the result % 10 == 0
		return total % 10 == 0;
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	// COMPLETED
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		// Start paying attention at the first number in the question.
		String[] words = string.split(" |\\?");
		int distance;
		if (words[3].substring(0, 2).equals("mu") || words[3].charAt(0) == 'd') {
			distance = 3;
		}
		else {
			distance = 2;
		}
		// Parse each number to num1 and num2
		int num1 = Integer.parseInt(words[2]);
		int num2 = Integer.parseInt(words[2 + distance]);
		
		// Parse the operation command.
		String operation = words[3];
		int answer;
		
		// Use switch to determine what to do with the two numbers, based on the parsed command.
		switch (operation) {
		
		case "plus":
			answer = num1 + num2;
			// System.out.println(num1 + " + " + num2 + " = " + answer);
			break;
		case "minus":
			answer = num1 - num2;
			// System.out.println(num1 + " - " + num2 + " = " + answer);
			break;
		case "multiplied":
			answer = num1 * num2;
			// System.out.println(num1 + " * " + num2 + " = " + answer);
			break;
		case "divided":
			answer = num1 / num2;
			// System.out.println(num1 + " / " + num2 + " = " + answer);
			break;
		default:
			answer = 0;
		}
		return answer;
	}

}
