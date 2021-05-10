package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 * 
 * @author adil_
 *
 */
public class AnalyticsCounter {

	/**
	 * 
	 * 
	 * @param fileName
	 * @param words
	 * @throws FileNotFoundException
	 */
	// create function to count words
	public void countEachWord(String fileName, Map<String, Integer> words) throws FileNotFoundException {
		
		// Read Files
		   ReadFile reader = new ReadFile();
		List<String>symptoms = reader.readFile("symptoms.txt");
		for(String symptom : symptoms)
		{
			String word = symptom;
			Integer count = words.get(word);

			// Determine if the word is in the Map
			if (count != null)
				count++;

			else
				count = 1;

			// putting values in the Map
			words.put(word, count);
		}
		// Create file input and Scanner
		
		//Scanner file = new Scanner(new File(fileName));

		// Read through file and find words
		//while (file.hasNext()) {
			
		//}

		// Close
		//file.close();

	}

	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String args[]) throws FileNotFoundException {

		Map<String, Integer> words = new HashMap<String, Integer>();

		// Calling the function countEachWord
		
          AnalyticsCounter counter = new AnalyticsCounter();
          counter.countEachWord("symptoms.txt", words);
		// Create a TreeMap
		Map<String, Integer> sortedWords = new TreeMap<>(words);

		// sorting the map
		sortedWords.entrySet().forEach(System.out::println);
		
	
		// Write in the java File
		WriteInTheFile wr = new WriteInTheFile();
				
			File f = new File("text.txt");
			try {
				wr.write("Hello World.\n",f);
			}
	         catch(IOException e) {
	        	 
	         }
		
	
		
		
        //Determine the path
		
		

		
	}

}
