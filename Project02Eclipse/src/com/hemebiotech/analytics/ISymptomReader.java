package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public interface ISymptomReader {
	/**
	 * Reads a file and returns a list of symptoms
	 * 
	 * @param path, The path to the file
	 * @return a list of symptoms
	 * @throws IOException Input and Output Exexptions
	 */
	List<String> readSymptomData(String path) throws IOException;

}
