package fr.fms.entities;

import fr.fms.city.City;

public class Capital extends City{
	
	public String monument;

	
	public Capital (String country, String city, int nbInhabitant, String monument) {
		super(country,city,nbInhabitant);
		this.monument=monument;
		
	}


	public String getMonument() {
		return monument;
	}


	public void setMonument(String monument) {
		this.monument = monument;
	}

	public String toString() {
		return this.getCountry() + ", " + this.getCity() + ", " + this.getNbInhabitants() + " d'habitants" + " monument : "+ this.monument ;
	}
}
//classe fille