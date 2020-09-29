package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class ReadSymptomDataFromFile implements ISymptomReader {

	@Override
	public Map<String, Integer> readSymptomData(String path) throws IOException {
		
		Map<String, Integer> counter = new TreeMap<>();
		
		// first get input
		
				// Creating a reader object (BufferedReader) / Buffering the symptoms.txt file
				BufferedReader reader = new BufferedReader (new FileReader(path)); //-Correction of the path to the file-the application did not launch.
				
				String line = reader.readLine(); // Reading line by line

				// Loop while - reading symptoms / storing values in memory.
				while (line != null) {
					System.out.println("symptom from file: " + line);
					Integer count = counter.get(line);
					if(count==null) {
						counter.put(line, 1);
					}else {
						Integer newCount = counter.get(line)+1;
						counter.put(line, newCount);
					}

					// get another symptom
					line = reader.readLine();	
				}
				
				reader.close();
				
				return counter;
	}

	
	
	
	

}
