package fr.fms.entities;

import fr.fms.city.City;

public class Capital extends City{
	
	public String monument;

	
	public Capital (String country, String city, int nbInhabitant, String monument) {
		super(country,city,nbInhabitant);
		this.monument=monument;
		
	}

}
//classe fille