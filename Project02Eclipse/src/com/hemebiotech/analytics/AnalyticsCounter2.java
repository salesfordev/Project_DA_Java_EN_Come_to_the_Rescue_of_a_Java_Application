package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
/**
 * This class is the main class that calls the different methods.
 * @author SALAM
 *
 */

public class AnalyticsCounter2 {
	
	
	
	/**
	 * The main method
	 * @param args List of arguments
	 * @throws Exception - An exception can be raised if there is a read or write error in the file.
	 */
	public static void main(String args[]) throws Exception {
		
		ISymptomReader reader = new ReadSymptomDataFromFile(); 
		ITreatment treatment = new Treatment();
		ISymptomWriter writer = new WriteSymptomDataToFile();
		
		
		List<String> symptoms = reader.readSymptomData("Project02Eclipse/symptoms.txt");	// Reading the symptoms from the file.
		Map<String, Integer> counters = treatment.count(symptoms);
		writer.writeSymptoms(counters);		// Write the symptoms in the result.out file.
		
		
		
		
	}
}
