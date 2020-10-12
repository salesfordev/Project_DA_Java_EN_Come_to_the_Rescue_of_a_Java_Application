package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author SALAM
 *
 */


public class ReadSymptomDataFromFile implements ISymptomReader {

	/**
	 * Reads a file and returns a list of symptoms
	 * 
	 * @param path, The path to the file
	 * @return a list of symptoms
	 * @throws IOException
	 */
	@Override
	public List<String> readSymptomData(String path) throws IOException {  // An exception can be raised if there is a read or write error in the file.
		
		
		List<String> symptoms = new ArrayList<>();		// Creation of a list to store symptoms.
		
		
		
				
				BufferedReader reader = new BufferedReader (new FileReader(path));		// Creating a reader object (BufferedReader) / Buffering the symptoms.txt file
				
				String line = reader.readLine(); // Reading line by line

				
				while (line != null) {		// Loop while - reading symptoms / storing values in memory.
					System.out.println("symptom from file: " + line);
					symptoms.add(line);
					
					
					line = reader.readLine();		// Get another symptom	
				}
				
				reader.close();			// Closing the reader resource
				return symptoms;		// Returns the list of symptoms
				
				
	}

	
	
	
	

}
