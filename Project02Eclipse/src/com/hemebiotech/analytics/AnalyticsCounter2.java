package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;			//- Importation des bibliothèques necessaires : "java.util.Map" - java.util.TreeMap"
import java.util.Map.Entry;
import java.util.TreeMap;		

public class AnalyticsCounter2 {
	
	//-Création d’un nouvel objet de type TreeMap nomé "counter"
	private static Map<String,Integer> counter = new TreeMap<>();
	
	public static void main(String args[]) throws Exception {
		// first get input
		
		// Création d'un objet reader(BufferedReader) / Mise en mémoire Tampon du fichier symptoms.txt
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt")); //-Rectification chemin d'accès au fichier-l'appli ne se lance pas.
		
		String line = reader.readLine(); // Lecture ligne par ligne

		// Boucle while -lecture des symptômes / stockage des valeurs en mémoire.
		while (line != null) {
			System.out.println("symptom from file: " + line);
			Integer count = counter.get(line);
			if(count==null) {
				counter.put(line, 1);
			}else {
				Integer newCount = counter.get(line)+1;
				counter.put(line, newCount);
			}

			line = reader.readLine();	// get another symptom
		}
		
		reader.close();
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		for(Entry<String, Integer> count: counter.entrySet()) {
			writer.write( count.getKey() +":"+ count.getValue() + "\n");
			
		}
		writer.close();
		
	}
}
