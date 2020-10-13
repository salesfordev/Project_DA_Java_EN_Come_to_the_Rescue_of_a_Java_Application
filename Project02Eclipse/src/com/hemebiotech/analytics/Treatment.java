package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
/**
 * This class is an implementation of the ITreatment interface, it allows the sorting and counting of symptoms,
 * 
 * @author SALAM
 *
 */
public class Treatment implements ITreatment { 

	/**
	 *  Implementation of the count method of the ITreatment interface
	 *  @return A TreedMap because the data is sorted alphabetically at the output.
	 */
	@Override
	public TreeMap<String, Integer> count(List<String> symptoms) { 
		TreeMap<String, Integer> counter=new TreeMap<>();		// We create a map that will have as key the name of the symptom and in value the number of occurrences.
			for (String symptom : symptoms) {
			Integer currentCount=counter.get(symptom);
			if (currentCount != null) { 						// If the counter exists it is incremented
				currentCount++;
				counter.put(symptom, currentCount);
			} else {											// ITrf the counter does not exist, we add the value 1 in the Map
				counter.put(symptom, 1);
			}
			
		}
		return counter; 
	}

	

}
