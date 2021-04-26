package ar.edu.unlp.info.bd2.model;

import java.util.Date;

public class ProductOnSale {

	private Product product;
	private Provider provider;
	private float price;
	private Date id; //preguntar
	
	public ProductOnSale(Product product, Provider provider, float price, Date id) {
		super();
		this.product = product;
		this.provider = provider;
		this.price = price;
		this.id = id;
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

	public Date getId() {
		return id;
	}
	
}
