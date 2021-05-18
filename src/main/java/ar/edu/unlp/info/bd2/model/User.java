package ar.edu.unlp.info.bd2.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="fullname")
	private String fullname;
	
	@Column(name="dayOfBirth")
	private Date dayOfBirth;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private Set<Purchase> purshases;
		
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
	public void setDayOfBirth(java.util.Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public Long getId() {
		return id;
	}

}
