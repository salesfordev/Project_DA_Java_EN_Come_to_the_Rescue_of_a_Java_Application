package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
/**
 * Cette classe est la classe principale qui appelle les différentes méthodes.
 * @author SALAM
 *
 */

public class AnalyticsCounter2 {
	
	
	
	
	public static void main(String args[]) throws Exception {
		
		ISymptomReader reader = new ReadSymptomDataFromFile(); 
		ITreatment treatment = new Treatment();
		ISymptomWriter writer = new WriteSymptomDataToFile();
		
		
		List<String> symptoms = reader.readSymptomData("Project02Eclipse/symptoms.txt");// Lecture des symptome depuis le fichier.
		Map<String, Integer> counters = treatment.count(symptoms);
		writer.writeSymptoms(counters);// Ecriture des symptômes dans le fichier résult.out.
		
		
		
		
	}
}
