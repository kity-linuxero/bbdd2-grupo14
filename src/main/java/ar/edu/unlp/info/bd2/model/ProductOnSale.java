package ar.edu.unlp.info.bd2.model;

import java.sql.Date;

import javax.persistence.*;


@Entity
public class ProductOnSale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Product product;
	private Provider provider;
	private float price;
	private Long id;
	private Date initialDate;
	
	public ProductOnSale(Product product, Provider provider, float price, Date id) {
		super();
		this.product = product;
		this.provider = provider;
		this.price = price;
		//this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}
	
}
