package com.hemebiotech.analytics;

import java.io.*;
/**
 * 
 * @author adil_
 *
 */
public class WriteInTheFile {
	/**
	 * 
	 * @param s
	 * @param f
	 * @throws IOException
	 */
	public void write(String s,File f) throws IOException{
		
		FileWriter fw = new FileWriter(f,true);
		fw.write(s);
		fw.close();
		// see above
	}
}
