package com.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="employeeDetail" )
public class employee {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iDString; 
	private String nameString ; 
	private String addressString;
	private String emailString;
	private int number ; 
	private int salary ;
	
	
	public Integer getiDString() {
		return iDString;
	}
	public void setiDString(Integer iDString) {
		this.iDString = iDString;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(Integer iDString, String nameString, String addressString, String emailString, int number,
			int salary) {
		super();
		this.iDString = iDString;
		this.nameString = nameString;
		this.addressString = addressString;
		this.emailString = emailString;
		this.number = number;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [iDString=" + iDString + ", nameString=" + nameString + ", addressString=" + addressString
				+ ", emailString=" + emailString + ", number=" + number + ", salary=" + salary + "]";
	}
	
	
}
