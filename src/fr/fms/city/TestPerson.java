package fr.fms.city;

public class TestPerson {
	
	public static void main (String[] args) {

	Person manu = new Person ("Macron", "Manu", 43, "Elysée à Paris"); 
	Person vladimir = new Person ("Poutine", "Vladimir", 68, "unknown");
	Person biden = new Person ("Biden", "Joe", 0, "unknown");
	
	System.out.println(manu);
	System.out.println(vladimir);
	System.out.println(biden);
	
	}
}


