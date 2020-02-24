package main;

import java.io.IOException;
import java.util.ArrayList;

public class BusinessCardReaderDriver {

	public static void main(String[] args) throws IOException {
		
		CardFileReader cfr = new CardFileReader();
		PhoneFinder pf = new PhoneFinder();
		NameFinder nf = new NameFinder();
		EmailFinder ef = new EmailFinder();
		ArrayList<String> cardArray= new ArrayList<>(); 
		cardArray = cfr.readTxtFile("card.txt");

		String name = nf.nameFinder(cardArray);
		System.out.println("Name: " + name);

		String phoneNumber = pf.phoneFinder(cardArray);
		System.out.println("Phone: " + phoneNumber);

		String email = ef.emailFinder(cardArray);
		System.out.println("Email: " + email);

	}

}
