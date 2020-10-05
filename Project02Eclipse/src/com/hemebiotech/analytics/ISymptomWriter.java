package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {
	/**
	 * Ecriture des symptomes 
	 * 
	 * @param symptoms Correspond au décompte des symptomes
	 * @throws IOException 
	 */
	void writeSymptoms (Map<String, Integer> symptoms) throws IOException;

}
