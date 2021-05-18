package ar.edu.unlp.info.bd2.model;

import java.util.ArrayList;
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
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="product_id")
	private List<PriceHistory> priceHistories;
	
	@OneToMany(targetEntity=ProductOnSale.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="product_id")
	private List<ProductOnSale> productOnSales = new ArrayList<>();
	
	@ManyToMany(mappedBy = "products")
	private List<Purchase>purchases;
	
	@ManyToMany
	private List<Provider>providers;
	
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
		return this.productOnSales;
	}
	
	public void setProductOnSales(List<ProductOnSale> pos) {
		this.productOnSales = pos;
	}
	
	public void addProductOnSales(ProductOnSale p) {
		this.productOnSales.add(p);
		p.setProduct(this);
	}
	
	public void removeProductOnSales(ProductOnSale p) {
		this.productOnSales.remove(p);
		p.setProduct(null);
	}


}
