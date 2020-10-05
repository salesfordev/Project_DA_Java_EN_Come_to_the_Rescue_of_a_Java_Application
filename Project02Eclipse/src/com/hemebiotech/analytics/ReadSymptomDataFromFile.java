package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class ReadSymptomDataFromFile implements ISymptomReader {

	@Override
	public List<String> readSymptomData(String path) throws IOException {
		
		//Map<String, Integer> counter = new TreeMap<>();
		List<String> symptoms = new ArrayList<>();
		
		// first get input
		
				// Creating a reader object (BufferedReader) / Buffering the symptoms.txt file
				BufferedReader reader = new BufferedReader (new FileReader(path)); //-Correction of the path to the file-the application did not launch.
				
				String line = reader.readLine(); // Reading line by line

				// Loop while - reading symptoms / storing values in memory.
				while (line != null) {
					System.out.println("symptom from file: " + line);
					symptoms.add(line);
					
					// get another symptom
					line = reader.readLine();	
				}
				
				reader.close();
				return symptoms;
				
				
	}

	
	
	
	

}
