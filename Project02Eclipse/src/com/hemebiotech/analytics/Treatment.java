package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
/**
 * Cette classe est une impl�mentation de l'interface ITreatment,elle permet de faire le tri et le d�compte des sympt�mes,
 * 
 * @author SALAM
 *
 */
public class Treatment implements ITreatment { 

	/**
	 *  impl�mentation de la m�thode count de l'interface ITreatment
	 *  @return A TreedMap car les donn�s sont tri�s par orde alphab�tique en sortie.
	 */
	@Override
	public TreeMap<String, Integer> count(List<String> symptoms) { 
		TreeMap<String, Integer> counter=new TreeMap<>(); 	//on cr�er une map qui aura pour cl� le nom du symptome et en valeur le nombre d'occurences.
			for (String symptom : symptoms) {
			Integer currentCount=counter.get(symptom);
			if (currentCount != null) { 					//si le compteur existe on l'incr�mente
				currentCount++;
				counter.put(symptom, currentCount);
			} else {										//si le compteur n'existe pas, on ajoute la valeur 1 dans la Map
				counter.put(symptom, 1);
			}
			
		}
		return counter; 
	}

	

}
