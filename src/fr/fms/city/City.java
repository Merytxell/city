package fr.fms.city;

public class City {
	
	//atributs
	public String country;
	public String city;
	public int nbInhabitants;
	
	// constructeurs 
	
	public City (String country, String city, int nbInhabitants) {
		this.country= country; 
		this.city=city;
		this.nbInhabitants= nbInhabitants;
		
	}
	public City (int nbInhabitants) {
		this.country= ""; 
		this.city="";
		this.nbInhabitants= nbInhabitants;
	}
	
	//methodes
		public void display() {
			System.out.println("pays : " + this.country + "\n" + "ville :"  + this.city + "\n" + "nombre d'habitants : " + this.nbInhabitants); 
			
	}
							
}


		


//ajouter première classe city avec nom de ville nb habitant et pays -ok
//définir un constructeur - ok