package fr.fms.city;

public class TestCity {
	
	public static void main (String [] args){
		City city = new City ("France","Toulouse",450000);
		City city1 = new City ("Espagne", "Murcia", 447000);
		City city2 = new City ("Japon", "Nara", 360310);
		
		city.display();
		city1.display();
		city2.display();
		
		
	}
}
//ajouter une classe - ok
//tester avec plusieurs villes 
//ajouter 20 000 a l'attribut nbInhabitants'