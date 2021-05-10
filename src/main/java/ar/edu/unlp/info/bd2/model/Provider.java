package ar.edu.unlp.info.bd2.model;

import javax.persistence.*;

@Entity
@Table(name="provider")
public class Provider {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="cuit")
	private Long cuit;
	
	public Provider(String name, Long cuit) {
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

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}
	
}
