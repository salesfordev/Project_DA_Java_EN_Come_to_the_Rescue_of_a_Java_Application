package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class Treatment implements ITreatment {

	
	@Override
	public TreeMap<String, Integer> count(List<String> symptoms) {
		TreeMap<String, Integer> counter=new TreeMap<>();
			for (String symptom : symptoms) {
			Integer currentCount=counter.get(symptom);
			if (currentCount != null) {
				currentCount++;
				counter.put(symptom, currentCount);
			} else {
				counter.put(symptom, 1);
			}
			
		}
		return counter;
	}

	

}
