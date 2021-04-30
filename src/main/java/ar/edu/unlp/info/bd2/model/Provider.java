package ar.edu.unlp.info.bd2.model;

import javax.persistence.*;

@Entity
public class Provider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cuit;
	
	public Provider(String name, String cuit) {
		this.name = name;
		this.cuit = cuit;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
}
