package fr.fms.person;



public class Person {

	public String firstname;
	public String lastname;
	public int age;
	public String address; 
	public CityStr city;//passer city non plus en string mais en type directement
	
	
	
	
	public Person (String firstname, String lastname, int age, String address, CityStr city) {
		this.firstname= firstname;
		this.lastname =lastname;
		this.age=age;
		this.address=address; 
		this.city=city;
		
	}
		
	public Person (String firstname, String lastname, int age) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
		this.address = "unknown"; 
		
	
		
	}
		
		
		
		//getter

	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public CityStr getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	//setter
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setPrenom(String firstname) {
		this.firstname = firstname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
		
	}
	public String toString() {
		return "[Personne =" + getLastname() + ", " +
				"prénom = " + getFirstname() + ", " +
				"age =  " + getAge() + ", " + 
				" adresse = " + getAddress() + " " +
				"ville de naissance = " + this.city.toString() + "]";//modif ici pour afficher correctement le lieu de naissance
		
	}
	} 
 
