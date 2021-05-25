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
	 * 
	 */
	public List<String> readFile(String fileName)  {

		// Create file input and Scanner
		File file = new File(fileName);
		List<String> symptomsList = new ArrayList<String>();
		Scanner in = null;
		try {
			in = new Scanner(file);
			

			// Read through file and find lines
			while (in.hasNextLine()) {
				String line = in.nextLine();
				System.out.println(line);
				symptomsList.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			in.close();
		}
		
	
		
	
		// Close
		
	
		
		return symptomsList;
		
		}
}

