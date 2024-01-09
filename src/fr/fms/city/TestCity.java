package fr.fms.city;

public class TestCity {
	
	public static void main (String [] args){
		City toulouse = new City ("France","Toulouse",450000);
		City city1 = new City ("Espagne", "Murcia", 447000);
		City city2 = new City ("Japon", "Nara", 360310);
		
		toulouse.display();
		/*
		 * city1.display(); city2.display();
		 */
		
		toulouse.nbInhabitants += 20000;	
		toulouse.display();
		
	}
}
//ajouter une classe - ok
//tester avec plusieurs villes - ok
//ajouter 20 000 a l'attribut nbInhabitants - ok