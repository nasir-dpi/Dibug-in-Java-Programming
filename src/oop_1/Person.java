package oop_1;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private int ageInyear;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddlename() {
		return middleName;
	}
	public void setMiddlename(String middlename) {
		this.middleName = middlename;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		lastName = lastname;
	}
	public int getAgeInyear() {
		return ageInyear;
	}
	public void setAgeInyear(int ageInyear) {
		this.ageInyear = ageInyear;
	}
	
	
	public String getFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	
}
