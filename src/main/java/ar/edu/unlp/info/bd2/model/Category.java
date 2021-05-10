package ar.edu.unlp.info.bd2.model;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="name")
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
