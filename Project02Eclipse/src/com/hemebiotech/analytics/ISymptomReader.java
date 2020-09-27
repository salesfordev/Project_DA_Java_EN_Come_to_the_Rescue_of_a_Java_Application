package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;


public interface ISymptomReader {
	
	Map<String,Integer> readSymptomData() throws IOException;
	
}
