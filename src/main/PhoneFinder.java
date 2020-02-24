package main;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneFinder {

	public String phoneFinder(ArrayList<String> cardArray) {

		for(String string : cardArray) {
			//eliminate fax numbers from possible outputs by checking for lines containing "fax"
			string = string.toLowerCase();
			if(string.contains("fax") == true) {}
			//if not a fax number, convert to a character array
			else {
				char[] chars = string.toCharArray();
				
				//convert character array to character array list
				ArrayList<Character> charsList = new ArrayList<>();
				for (char c : chars) {
					charsList.add(c);
				}
				
				//designate desired characters
				ArrayList<Character> digitList = new ArrayList<>(Arrays.asList('0','1','2','3','4','5','6','7','8','9'));
				//remove all characters that are not digits
				charsList.retainAll(digitList);
				//if what is left has greater than or equal to 10 characters it is assumed to be a phone number
				if(charsList.size() >= 10) {
					//convert characters back to a string
					StringBuilder result = new StringBuilder(charsList.size());
					for (Character c : charsList) {
					  result.append(c);
					}
					String phoneNumber = result.toString();
					return phoneNumber;
				}
				
			}
			
		}
		return null;
	}

}
