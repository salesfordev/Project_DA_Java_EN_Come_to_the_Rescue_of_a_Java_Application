package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;



public interface ISymptomReader {
	/**
	 * Lis un fichier et retourne une liste de symptomes
	 * 
	 * @param path Le chemin vers le fichier
	 * @return une liste de symptomes
	 * @throws IOException
	 */
	List<String> readSymptomData(String path) throws IOException;
	
}
