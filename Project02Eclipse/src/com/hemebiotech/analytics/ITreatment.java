package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ITreatment {
	
	/**
	 * cette méthode compte l'occurence des symptomes
	 * @param symptoms Une liste de symptomes que l'on a lu.
	 * @return Une Map qui correspond au décompte de chaque symptome 
	 */
	Map<String, Integer> count(List<String> symptoms);
	

}
