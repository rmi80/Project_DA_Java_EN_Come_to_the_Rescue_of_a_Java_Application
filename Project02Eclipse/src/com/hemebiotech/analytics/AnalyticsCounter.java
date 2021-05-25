package com.hemebiotech.analytics;

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
	 * The drive code allows to call methods from all the classes to execute the
	 * code and get an order list with number of occurrences saved in the
	 * "result.out" file
	 * 
	 * @param fileName
	 * @param words
	 * @throws FileNotFoundException
	 */
	// create function to count words
	public void countEachWord(String fileName, Map<String, Integer> words) throws FileNotFoundException {

		// Read Files
		
		ReadFile reader = new ReadFile();
		
		List<String> symptoms = reader.readFile("symptoms.txt");
		
		for (String symptom : symptoms) {
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

	}

	/**
	 * Here we can call methods and execute the code
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[])  {

		Map<String, Integer> words = new HashMap<String, Integer>();

		// Calling the function countEachWord

		AnalyticsCounter counter = new AnalyticsCounter();
		try {
			counter.countEachWord("symptoms.txt", words);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		// Create a TreeMap
		Map<String, Integer> sortedWords = new TreeMap<>(words);

		// sorting the map

		// sortedWords.entrySet().forEach(System.out::println);

		WriteFile wr = new WriteFile();
		wr.writeFile(sortedWords);

	}

}
