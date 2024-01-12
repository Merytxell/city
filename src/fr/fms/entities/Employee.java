package fr.fms.entities;

import fr.fms.person.CityStr;
import fr.fms.person.Person;

public class Employee extends Person{

	public String enterprise;
	public double salary;
	
	
public Employee (String firstname, String lastname, int age, String address, CityStr city, String enterprise, double salary) {
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


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}

}
