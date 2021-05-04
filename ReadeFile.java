package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile  {
	public  void readFile(String fileName) throws FileNotFoundException {
	 
		//Create file input and Scanner
	File file = new File(fileName);
	
	Scanner in = new Scanner(file);
	
	// Read through file and find lines
	while(in.hasNextLine()) {
		String line = in.nextLine();
		System.out.println(line);
			
	}
	    //Close
		in.close();
	}
	
}


