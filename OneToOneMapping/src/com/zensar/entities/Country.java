package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Gayatri Sinnarkar
 * @creation_date 27th Sept 2019 2:57pm
 * @modification_date 27th Sept 2019 2:57 pm
 * @version 1.0
 * @copyright Zensar Technologies
 * @description It is a persistence class
 * 				
 *
 */
@Entity
public class Country 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int countryId;
	private String name;
	private String language;
	private long population;
	@OneToOne
	@JoinColumn(name = "flag_id")
	private Flag flag;
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public Flag getFlag() {
		return flag;
	}
	public void setFlag(Flag flag) {
		this.flag = flag;
	}
	
	
}
