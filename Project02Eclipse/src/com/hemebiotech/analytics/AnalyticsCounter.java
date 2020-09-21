package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;		//- Importation des bibliothèques necessaires : "java.util.Map"
import java.util.TreeMap;	//- java.util.TreeMap"

public class AnalyticsCounter {
	
		
		
		private static Map<String,Integer> counter = new TreeMap<>(); //-Création d’un nouvel objet de type TreeMap nomé "counter"
	 	
		public static void main(String args[]) throws Exception {
			
		// first get input
			
		// Création d'un objet reader(BufferedReader) / Mise en mémoire Tampon du fichier symptoms.txt
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse/symptoms.txt"));//-Rectification chemin d'accès au fichier-l'appli ne se lance pas.
		String line = reader.readLine(); // Lecture ligne par ligne 

<<<<<<< HEAD
		// int i = 0;	// set i to 0   ----commentaire inutile--- comme on utilise une boucle while, je suprime cette ligne.
		int headCount = 0;	// counts headaches --- supression de cette initialisation, les symptomes seront lus automatiquement dans le fichier (symptoms.txt)
		while (line != null) {
			i++;	// increment i 											  // cette ligne sera supprimée
=======
		int i = 0;	// set i to 0 ---Aucun besoin de commentaires pour savoir que le i est initialisé à 0----
		
		//
		int headCount = 0;	// counts headaches ////commentaire inutile, initialisation variable headCount.....//////
		while (line != null) {
			i++;	// increment i  /////On sait que i est incrémenté//// commentaire inutile.
>>>>>>> modif_comment
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) { 								      // Cette ligne sera suprimée
				headCount++; 												  // Cette ligne sera suprimée
				System.out.println("number of headaches: " + headCount); 	  // Cette ligne sera suprimée
			}
			else if (line.equals("rush")) {								 	  // Cette ligne sera suprimée
				rashCount++;
			}
			else if (line.contains("pupils")) {							  	  // Cette ligne sera suprimée
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}
		reader.close();
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
