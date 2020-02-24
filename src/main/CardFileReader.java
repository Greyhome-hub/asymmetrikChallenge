package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CardFileReader {

	public ArrayList<String> readTxtFile(String filename) {

		//create arraylist to put business card lines in
		ArrayList<String> cardLines = new ArrayList<>();
		//create buffered reader
		BufferedReader fileReader = null;

		try {
			//assign input file to reader
			fileReader = new BufferedReader(new FileReader(filename));
			//read first line
			String line = fileReader.readLine();
			
			//add line strings to arraylist and read next line for each line
			while(line != null) {
				cardLines.add(line);
				line = fileReader.readLine();
			}



		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

		return cardLines;

	}

}
