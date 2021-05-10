package ar.edu.unlp.info.bd2.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="creditCardPayment")
public class CreditCardPayment extends PaymentMethod{
	@Column(name="brand")
	private String brand;
	@Column(name="number")
	private String number;
	@Column(name="expiry")
	private Date expiry;
	@Column(name="cvv")
	private Integer cvv;
	@Column(name="owner")
	private String owner;
	
	public CreditCardPayment(String name, String brand, String number, Date expiry, Integer cvv, String owner) {
		super(name);
		this.name = name;
		this.brand = brand;
		this.number = number;
		this.expiry = expiry;
		this.cvv = cvv;
		this.owner = owner;
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
	
}
