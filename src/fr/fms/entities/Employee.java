package fr.fms.entities;

import fr.fms.person.CityStr;
import fr.fms.person.Person;

public class Employee extends Person{

	public String enterprise;
	public int salary;
	
	
public Employee (String firstname, String lastname, int age, String address, CityStr city, String enterprise, int salary) {
	super(firstname,lastname,age,address,city);
	this.enterprise=enterprise;
	this.salary=salary;
	
} 


public String getEnterprise() {
	return enterprise;
}


public void setEnterprise(String enterprise) {
	this.enterprise = enterprise;
}


public void setSalary(int salary) {
	this.salary = salary;
}


public int getSalary() {
	return salary;
}
public String toString() {
	
	"L'employé " + this.getFirstname() + this.getLastname() 
	+ "de " + this.getAge() + "ans "
	+ "résidant à" + this.getCity() 
	+ this.getCountry() 
	+ "de " + "habitants "
	+ "avec pour monument" + this.getMonument 
	+ "travaillant pour " + this.enterprise 
	+ "a pour salaire " + this.salaire;
 }

}

