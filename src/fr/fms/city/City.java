package fr.fms.city;

public class City {
	
	//atributs
	public String country;
	public String city;
	private double nbInhabitants;
	
	
	
	public double  getNbInhabitants (){
		return nbInhabitants;
	}
	
	public void setInhabitants (double i) {
		this.nbInhabitants = i;
		
		
	
		/*
		 * public City (String country, String city, int nbInhabitants) { this.country=
		 * country; this.city=city; this.nbInhabitants= nbInhabitants;
		 */
	}

	
	//methodes
		public void display() {
			System.out.println("pays : " + this.country + "\n" + "ville :"  + this.city + "\n" + "nombre d'habitants : " + this.nbInhabitants); 
			
	}
							
}


//ajouter première classe city avec nom de ville nb habitant et pays -ok
//définir un constructeur - 