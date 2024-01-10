package fr.fms.city;

public class City {
	
	//atributs
	private String country;
	private String city;
	private double nbInhabitants;
	
	public static final double Min_City_nbInhabitants = 450000;
	
	//constructeur encapsulation forte
	public City (String country, String city, double nbInhabitants) {
		setCountry(country);
		setCity(city);
		setNbInhabitants(nbInhabitants);
	}

	//accesseur

	public double  getNbInhabitants (){
		return nbInhabitants;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setNbInhabitants(double nbInhabitants) {
		this.nbInhabitants = nbInhabitants;
	}
	//accesseur
	public void setInhabitants (double i) {
		
		if (i <= 0) {
			System.out.println("il est impossible qu'une ville dispose de moins de 0 habitants !");
		}else {
			this.nbInhabitants = Min_City_nbInhabitants;
	
	
		/*
		 * public City (String country, String city, int nbInhabitants) { this.country=
		 * country; this.city=city; this.nbInhabitants= nbInhabitants;
		 */
	}

	
	//methodes
		/*public void display() {
			System.out.println("pays : " + this.country + "\n" + "ville :"  + this.city + "\n" + "nombre d'habitants : " + this.nbInhabitants); 
			*/
	}
							
}


//ajouter première classe city avec nom de ville nb habitant et pays -ok
//définir un constructeur - ok
//définir des accesseurs permettant à user de modifier le nombre de personne dans uen ville -ok