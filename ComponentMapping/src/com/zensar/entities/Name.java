package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Gayatri Sinnarkar
 * @creation_date 26 sept 2019 2:45 pm
 * @modification_date 26 sept 2019 2:46 pm
 * @copyright Zensar Technologies
 * @version 1.0
 * @description It is a persistent class
 * 				It is a POJO class
 * 
 */
@Embeddable
public class Name 
{
	@Column(name="first",length = 30)
	private String firstName;
	@Column(name="middle",length = 30)
	private String middleName;
	private String lastName;
	
	public Name()
	{
		// TODO Auto-generated constructor stub
	}
	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
	
}
