package us.inest.epi.main.c12;

import java.util.HashMap;
import java.util.Map;

public class LetterConstruction {
	public boolean isLetterConstructibleFromMagazine(String letterText, String magazineText) {
		Map<Character, Integer> charFrequencyForLetter = new HashMap<>();
		//compute the frequencies for all char in letterText
		for (int i = 0; i < letterText.length(); i++) {
			char c = letterText.charAt(i);
			if (!charFrequencyForLetter.containsKey(c)) {
				charFrequencyForLetter.put(c, 1);
			} else {
				charFrequencyForLetter.put(c, charFrequencyForLetter.get(c) + 1);
			}
		}
		
		//check if letters in magazineText can cover characters i letterText
		for (char c : magazineText.toCharArray()) {
			if (charFrequencyForLetter.containsKey(c)) {
				charFrequencyForLetter.put(c, charFrequencyForLetter.get(c) - 1);
				if (charFrequencyForLetter.get(c) == 0) {
					//can cover letter c
					charFrequencyForLetter.remove(c);
				
					if (charFrequencyForLetter.isEmpty()) {
						//all characters for letterText are matched
						break;
					}
				}
			}
		}
		return charFrequencyForLetter.isEmpty();
	}
}
