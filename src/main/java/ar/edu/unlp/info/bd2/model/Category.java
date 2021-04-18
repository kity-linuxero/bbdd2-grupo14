package ar.edu.unlp.info.bd2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
@Entity
public class Category {

	@Id
	@GeneratedValue
    private Integer id;
	private String name;
	
	public Category(String name) {
		this.name = name;
	}
	
	public void setName(String aName) {
		// TODO Auto-generated method stub
		name = aName;
	}

	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	

}
