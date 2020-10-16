package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ITreatment {

	/**
	 * this method counts the occurrence of symptoms
	 * 
	 * @param symptoms A list of symptoms that have been read
	 * @return A Map that corresponds to the count of each symptom
	 */
	Map<String, Integer> count(List<String> symptoms);

}
