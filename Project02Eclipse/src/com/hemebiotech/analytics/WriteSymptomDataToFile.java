package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter {

	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) throws IOException {
		// next generate output
				FileWriter writer = new FileWriter ("result.out");
				for(Entry<String, Integer> count: symptoms.entrySet()) {
				writer.write( count.getKey() +"="+ count.getValue() + "\n");
					
				}
				writer.close();
		
	}
	
	

}
