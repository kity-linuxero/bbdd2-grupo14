package ar.edu.unlp.info.bd2.model;

import javax.persistence.*;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private float weight;
	private Category category;
	
	public Product(String aName, float weight, Category aCategory) {
		this.setName(aName);
		this.setWeight(weight);
		this.setCategory(aCategory);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Long getId() {
		return id;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category aCategory) {
		category = aCategory;
	}

}
