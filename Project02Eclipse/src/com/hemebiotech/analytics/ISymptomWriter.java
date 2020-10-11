package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {
	/**
	 * Symptom Writing 
	 * 
	 * @param symptoms Corresponds to the symptom count, c'est une map qui a pour clé le nom du symptome et le nombre d'occurences.
	 * @throws IOException 
	 */
	void writeSymptoms (Map<String, Integer> symptoms) throws IOException;

}
