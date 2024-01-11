package fr.fms.city;

public class Person {

	public String nom;
	public String prenom;
	public int age;
	public String adress; 
	
	
	public Person (String nom, String prenom, int age, String adress) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.adress=adress; 
	}
	public void display() {   System.out.println   ("nom : " + this.nom + " " + "\t" + 
												   "prenom" + this.prenom + " " + "\t" + 
													"age" + this.age + " " + "\t" + 
												   	"adresse" + this.adress + " ");}
	} 
 
