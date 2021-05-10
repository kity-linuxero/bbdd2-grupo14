package ar.edu.unlp.info.bd2.model;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="product")
public class Product {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="weight")
	private Float weight;
	@Column(name="category")
	private Category category;
	private List<ProductOnSale> productsOnSale;
	
	public Product(String aName, float weight, Category aCategory) {
		this.setName(aName);
		this.setWeigth(weight);
		this.setCategory(aCategory);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getWeigth() {
		return weight;
	}
	public void setWeigth(Float weight) {
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

	public List<ProductOnSale> getProductsOnSale() {
		return productsOnSale;
	}

	public void setProductsOnSale(List<ProductOnSale> productsOnSale) {
		this.productsOnSale = productsOnSale;
	}

}
