package fr.fms.city;

public class TestCity {
	
	public static void main (String [] args){
		
		
		City toulouse = new City ("France", "Toulouse", 450000);
		/*
		 * City city1 = new City ("Espagne", "Murcia", 447000); City city2 = new City
		 * ("Japon", "Nara", 360310);
		 */
		City city = new City();
	
		 city.display();
		 
		//toulouse.setCountry("France");
		//toulouse.setCity ("Toulouse");
		//toulouse.setInhabitants(-200);
		
		
		//System.out.println(toulouse.getCountry() + " " + toulouse.getCity() + " " + toulouse.getNbInhabitants()); 
		
		
		/*toulouse.nbInhabitants += 20000;	
		toulouse.display();*/
		
	}
}
//ajouter une classe - ok
//tester avec plusieurs villes - ok
//ajouter 20 000 a l'attribut nbInhabitants - ok
//empêcher l'user de mettre -200 habitants en l'informant avec un message - ok
//permettre que l'user puisse décrémenter une population