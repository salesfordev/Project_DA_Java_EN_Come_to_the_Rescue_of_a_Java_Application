package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
/**
 * Cette classe est une implémentation de l'interface ITreatment,elle permet de faire le tri et le décompte des symptômes,
 * 
 * @author SALAM
 *
 */
public class Treatment implements ITreatment { 

	/**
	 *  implémentation de la méthode count de l'interface ITreatment
	 *  @return A TreedMap car les donnés sont triés par orde alphabétique en sortie.
	 */
	@Override
	public TreeMap<String, Integer> count(List<String> symptoms) { 
		TreeMap<String, Integer> counter=new TreeMap<>(); 	//on créer une map qui aura pour clé le nom du symptome et en valeur le nombre d'occurences.
			for (String symptom : symptoms) {
			Integer currentCount=counter.get(symptom);
			if (currentCount != null) { 					//si le compteur existe on l'incrémente
				currentCount++;
				counter.put(symptom, currentCount);
			} else {										//si le compteur n'existe pas, on ajoute la valeur 1 dans la Map
				counter.put(symptom, 1);
			}
			
		}
		return counter; 
	}

	

}
