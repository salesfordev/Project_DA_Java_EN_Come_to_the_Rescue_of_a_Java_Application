package com.hemebiotech.analytics;

import java.util.Map;

public class AnalyticsCounter2 {
	
	
	
	
	public static void main(String args[]) throws Exception {
		
		ISymptomReader reader = new ReadSymptomDataFromFile(); 
		ISymptomWriter writer = new WriteSymptomDataToFile();
		Map<String, Integer> symptoms = reader.readSymptomData("Project02Eclipse/symptoms.txt");// Lecture des symptome depuis le fichier.
		writer.writeSymptoms(symptoms);// Ecriture des symptômes dans le fichier résult.out.
		
		
		
	}
}
