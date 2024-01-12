package fr.fms.people;

public class People {
public String lastname; 
public String firstname; 
public int age; 
public String address;
public String bornCity;
public String countryOfResidence;
public int nbInhabitants;


public People (String lastname,String firstname, int age, String address,String bornCity, String countryOfResidence, int nbInhabitants) {
	this.lastname=lastname;
	this.firstname=firstname;
	this.age=age;
	this.address=address;
	this.bornCity=bornCity;
	this.countryOfResidence=countryOfResidence;
	this.nbInhabitants=nbInhabitants;
}
	
	public People (String lastname,String firstname, int age, String address,String bornCity, String countryOfResidence) {
		this.lastname=lastname;
		this.firstname=firstname;
		this.age=age;
		this.address=address;
		this.bornCity=bornCity;
		this.countryOfResidence=countryOfResidence;
		this.nbInhabitants = 0;
		
	
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getBornCity() {
	return bornCity;
}

public void setBornCity(String bornCity) {
	this.bornCity = bornCity;
}

public String getCountryOfResidence() {
	return countryOfResidence;
}

public void setCountryOfResidence(String countryOfResidence) {
	this.countryOfResidence = countryOfResidence;
}

public int getNbInhabitants() {
	return nbInhabitants;
}

public void setNbInhabitants(int nbInhabitants) {
	this.nbInhabitants = nbInhabitants;
}

public String toString() {
	return getLastname() + ", " + getFirstname() +", " + getAddress() + ", " + getBornCity() + ", " + getCountryOfResidence() + "," + getNbInhabitants();
 }

}

//créer une liste de personne avec leurs infos
// trier celles qui sont nées à Paris OU vivent en france