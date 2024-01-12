package fr.fms.people;

import java.util.ArrayList;


public class TestPeople {




	public static void main (String[] args) {

		ArrayList<People>ListPeople=new ArrayList<>();


		ListPeople.add(new People("Macron","Manu",43,"Paris","Amiens","France"));
		ListPeople.add(new People("Sarkozy","Nicolas", 66, "Paris", "Paris","France",20)); 
		ListPeople.add(new People("Jonhson", "Boris",56, "London", "New York" , "Etats-Unis"));
		ListPeople.add(new People("Noah","Yannick",63, "Sedan","Etoudi","Cameroun"));
		ListPeople.add(new People("Kravitz" ,"Lenny", 56 ,"Paris","New-York","France"));
		ListPeople.add(new People("Lawrence","Jennifer",30,"Lousiville", "Indian Hlls", "USA"));
		

		for (People person :ListPeople) {
			if (person.getBornCity()==("Paris") || person.getCountryOfResidence()==("France") ||person.getAddress()==("Paris"))
			{
				System.out.println(person);
				//System.out.println(person.getCountryOfResidence());
			}

		}
	}
}
