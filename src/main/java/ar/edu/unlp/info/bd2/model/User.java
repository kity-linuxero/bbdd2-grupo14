package ar.edu.unlp.info.bd2.model;

import java.sql.Date;

import javax.persistence.Entity;
@Entity
public class User {
//	@Id
//	@GeneratedValue
	private int id;
	private String email;
	private String password;
	private String fullName;
	private Date dayOfBirth;
	//private Purchase[] purchases; //Por ahora parece que no lo pide
	// private Payment payment;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public Integer getId() {
		return id;
	}
	
	/*public Purchase[] getPurchases() {
		return purchases;
	}
	public void setPurchases(Purchase[] purchases) {
		this.purchases = purchases;
	}
	*/

}
