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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
		
	}
	public String toString() {
		return "[Personne =" + getNom() + "," +
				"prénom = " + getPrenom() + "," +
				"age =  " + getAge() + "," + 
				"adresse = " + getAdress() + "]";
	}
	} 
 
