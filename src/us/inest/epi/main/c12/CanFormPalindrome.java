package us.inest.epi.main.c12;

import java.util.HashSet;
import java.util.Set;

public class CanFormPalindrome {
	public boolean canFormPalindrome(String s) {
		//charsWithOddFrequency contains characters in s that have odd frequency
		Set<Character> charsWithOddFrequency = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (charsWithOddFrequency.contains(c)) {
				//c now has even frequency
				charsWithOddFrequency.remove(c);
			} else {
				//c now has odd frequency
				charsWithOddFrequency.add(c);
			}
		}
		
		/*
		 * if a string has even length, each character in the string must have an even frequency
		 * if a string has odd length, all but one character in the string must have an even frequency
		 */
		return charsWithOddFrequency.size() <= 1;
	}
}
