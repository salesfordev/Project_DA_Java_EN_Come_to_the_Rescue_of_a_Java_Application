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
	public List<String> readSymptomData(String path) throws IOException {  //une exeption peut etre levé s'il y a une erreur de lecture ou d'écriture dans le fichier.
		
		
		List<String> symptoms = new ArrayList<>(); //Création d'une liste pour stocker les symptômes.
		
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
				
				reader.close(); // Fermeture de la ressource reader
				return symptoms; // retourne la liste des symptomes
				
				
	}

	
	
	
	

}
