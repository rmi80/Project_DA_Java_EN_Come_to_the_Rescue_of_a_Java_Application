package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class WriteFile {

	public void writeFile(Map<String, Integer> symptomMap) {

		File file = new File("result.out");

		BufferedWriter bf = null;
		try {
			bf = new BufferedWriter(new FileWriter(file));
			for (Entry<String, Integer> entry : symptomMap.entrySet()) {

				bf.write(entry.getKey() + " = " + entry.getValue());
				bf.newLine();

			}

			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
