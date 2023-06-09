package com.prowings.collection.map;

import java.util.Comparator;

public class BikeModelComparator implements Comparator<Bike>{

	@Override
	public int compare(Bike o1, Bike o2) {
		if(o1.model == o2.model)
			return 0;
		else if(o1.model > o2.model)
			return 2;
		else 
			return -1;
	}

}
