package fr.fms.entities;
import fr.fms.city.*;



public class TestEmployee {



	public static void main(String[] args) {
		
		City washington = new City ("USA", "Washington", 760000);
		Employee bill = new Employee ("Gate", "Bill", 65, "USA", washington, "W-M","google", 10000);
	
	System.out.println(bill);
		
	
	// Gate BILL 65, USA , Washington, USA, 760000 habitants, W-M, Fondation B&M, salaire 10000

	}
}


