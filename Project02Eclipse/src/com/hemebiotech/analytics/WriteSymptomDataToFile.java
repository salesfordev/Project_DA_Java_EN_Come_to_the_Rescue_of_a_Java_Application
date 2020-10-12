package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter {

	/**
	 * This method writes the symptoms in a file
	 */
	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) throws IOException {
		
				FileWriter writer = new FileWriter ("result.out");				// Opening the write file
				for(Entry<String, Integer> count: symptoms.entrySet()) {		// The entryset method allows to convert the map into a list to be able to loop on it
				writer.write( count.getKey() +"="+ count.getValue() + "\n");	// For each symptom we write the name of the symptom and the number of occurrences
					
				}
				writer.close();		// Closing the writer resource
		
	}
	
	

}
