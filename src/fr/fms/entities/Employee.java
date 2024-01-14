package fr.fms.entities;
import fr.fms.person.*;
import fr.fms.city.City;
import fr.fms.entities.*;
import fr.fms.person.Person;

public class Employee extends Person{

	public String enterprise;
	public int salary;


	public Employee (String firstname, String lastname, int age, String country, City city, String monument, String enterprise, int salary) {
		super(firstname,lastname,age);
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
	
	public String getCountry() {
		return getCity().getCountry();
	}
	
	public String getMonument() {
		return getCity().getMonument();
	}
	public String toString() {

		return	"L'employé" + this.getFirstname() + this.getLastname() 
		+ "de " + this.getAge() + "ans "
		+ "résidant à" + this.getCity() 
		+ "en " +  this.getCountry() 
		+ "de " + "habitants "
		+ "avec pour monument" + this.getMonument() 
		+ "travaillant pour " + this.enterprise 
		+ "a pour salaire " + this.salary;
	}

}

