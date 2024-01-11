package fr.fms.city;

public class TestCity {
	
	public static void main (String [] args){
		
		//exo 1.1
		//City toulouse = new City ("France", "Toulouse", 450000);
		/*toulouse.nbInhabitants += 20000;	
		toulouse.display();*/
		/*
		 * City city1 = new City ("Espagne", "Murcia", 447000); City city2 = new City
		 * ("Japon", "Nara", 360310);
		 */
		//exo 1.2
		//City rabat = new City("","Rabat",577000);
	
		// rabat.display();
		// rabat.setCountry(" Maroc");
		// rabat.display();
		
		//exo 1.3
		//toulouse.setCountry("France");
		//toulouse.setCity ("Toulouse");
		//toulouse.setInhabitants(-200);
		//exo1.4
		//City toulouse = new City ("France","Toulouse",450000);
		//System.out.println(toulouse); //ne fonctionne pas car il faut une méthode toString qui renvoit à une chaîne de caractère constitués des attributs !
		
		//exo 1.5
		//System.out.println(toulouse.getCountry() + " " + toulouse.getCity() + " " + toulouse.getNbInhabitants()); 
		
		
		//exo 1.7 : compter le nombre de villes créées
		City toulouse = new City ("France","Toulouse",45000);
		City dax = new City ("France","Toulouse",45000);
		City rabat = new City ("France","Toulouse",45000);
		City murcia = new City ("France","Toulouse",45000);
		
		System.out.println(City.counter);
		
	
		
		
		
	}
}
//ajouter une classe - ok
//tester avec plusieurs villes - ok
//ajouter 20 000 a l'attribut nbInhabitants - ok
//empêcher l'user de mettre -200 habitants en l'informant avec un message - ok
//permettre que l'user puisse décrémenter une population