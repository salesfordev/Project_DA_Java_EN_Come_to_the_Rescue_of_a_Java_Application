package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {
	/**
	 * Symptom Writing 
	 * 
	 * @param symptoms Corresponds to the symptom count, it is a map which has for key the name of the symptom and the number of occurrences.
	 * @throws IOException 
	 */
	void writeSymptoms (Map<String, Integer> symptoms) throws IOException;

}
