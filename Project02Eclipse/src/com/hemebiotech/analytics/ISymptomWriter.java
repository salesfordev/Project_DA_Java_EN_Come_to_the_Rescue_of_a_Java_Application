package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {
	/**
	 * Symptom Writing 
	 * 
	 * @param symptoms Corresponds to the symptom count
	 * @throws IOException 
	 */
	void writeSymptoms (Map<String, Integer> symptoms) throws IOException;

}
