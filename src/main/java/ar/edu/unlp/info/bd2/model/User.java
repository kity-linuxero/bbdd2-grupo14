package ar.edu.unlp.info.bd2.model;

import java.sql.Date;
import javax.persistence.*;
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String password;
	private String fullname;
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
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullName) {
		this.fullname = fullName;
	}
	public Date getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public Long getId() {
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
