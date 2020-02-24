package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.util.Span;

public class NameFinder {

	public String nameFinder(ArrayList<String> cardArray) {


		try {
			//load english OpenNLP name finder model
			InputStream inputStreamNameFinder = new FileInputStream("resources/en-ner-person.bin");

			TokenNameFinderModel model = null;

			model = new TokenNameFinderModel(inputStreamNameFinder);

			NameFinderME nameFinder = new NameFinderME(model);

			//go through business card lines to find names
			for(String s : cardArray) {

				String[] sentence = s.split("\\s+");

				//Find the names in the sentence 
				Span nameSpans[] = nameFinder.find(sentence);

				//Create a stringbuilder to convert the span from namefinder into a string
				StringBuilder builder = new StringBuilder(); 
				for (Span span : nameSpans) {

					for (int i = span.getStart(); i < span.getEnd(); i++) {

						builder.append(sentence[i]).append(" "); 
						
					}
					String name = builder.toString(); 
					return name;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
