package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author adil_
 *
 */
public class ReadFile {
	/**
	 * Anything that will read symptom data from a source The important part is, the
	 * return value from the operation, which is a list of strings, that may contain
	 * many duplications
	 * 
	 * The implementation does not need to order the list
	 * 
	 * @param fileName
	 * @return
	 * @throws FileNotFoundException
	 */
	public List<String> readFile(String fileName) throws FileNotFoundException {

		// Create file input and Scanner
		File file = new File(fileName);

		Scanner in = new Scanner(file);
		List<String> symptomsList = new ArrayList<String>();

		// Read through file and find lines
		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
			symptomsList.add(line);
		}
		// Close
		in.close();
		return symptomsList;
	}

}
