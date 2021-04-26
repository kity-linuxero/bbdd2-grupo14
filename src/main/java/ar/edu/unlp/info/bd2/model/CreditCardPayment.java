package ar.edu.unlp.info.bd2.model;

import java.sql.Date;

public class CreditCardPayment {
	
	private int id;
	private String name;
	private String brand;
	private String number;
	private Date expiry;
	private Integer cvv;
	private String owner;
	
	public CreditCardPayment(String name, String brand, String number, Date expiry, Integer cvv, String owner) {
		this.name = name;
		this.brand = brand;
		this.number = number;
		this.expiry = expiry;
		this.cvv = cvv;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getId() {
		return id;
	}
	
}
