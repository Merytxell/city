package fr.fms.city;

import java.util.Scanner;

public class TestCity {
	
	public static void main (String [] args){
		
		
		City toulouse = new City ();
		/*
		 * City city1 = new City ("Espagne", "Murcia", 447000); City city2 = new City
		 * ("Japon", "Nara", 360310);
		 */
		
		/*
		 * city1.display(); city2.display();
		 */
		toulouse.country = "France";
		toulouse.city ="Toulouse";
		toulouse.setInhabitants(-200);
		
		
		System.out.println(toulouse.country + " " + toulouse.city + " " + toulouse.getNbInhabitants()); 
		
		
		/*toulouse.nbInhabitants += 20000;	
		toulouse.display();*/
		
	}
}
//ajouter une classe - ok
//tester avec plusieurs villes - ok
//ajouter 20 000 a l'attribut nbInhabitants - ok
//empêcher l'user de mettre -200 habitants en l'informant avec un message - ok
//permettre que l'user puisse décrémenter une population