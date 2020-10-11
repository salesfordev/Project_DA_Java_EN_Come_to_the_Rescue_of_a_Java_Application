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
		
				FileWriter writer = new FileWriter ("result.out");				// ouverture du fichier en �criture
				for(Entry<String, Integer> count: symptoms.entrySet()) {		// la m�thode entryset permet de convertir la Map en liste pour pouvoir boucler dessus
				writer.write( count.getKey() +"="+ count.getValue() + "\n");	// pour chaque symptome on �crit le nom du sympt�me et le nombre d'occurence
					
				}
				writer.close(); // fermeture de la ressource writer				// fermeture de la ressource writer
		
	}
	
	

}
