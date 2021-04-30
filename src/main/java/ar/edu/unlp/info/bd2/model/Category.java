package ar.edu.unlp.info.bd2.model;

import javax.persistence.*;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String name;
	
	public Category(String name) {
		this.name = name;
	}
	
	public void setName(String aName) {
		// TODO Auto-generated method stub
		name = aName;
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	

}
