package main;

import java.util.ArrayList;

public class EmailFinder {
	
	public String emailFinder(ArrayList<String> cardArray) {

		for(String string : cardArray) {
			
			//if string contains the @ character it is assumed to be an email
			if (string.contains("@")){
				return string;
			}

		}
		return null;
	}

}
