package ar.edu.unlp.info.bd2.model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="productOnSale")
public class ProductOnSale {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne//(targetEntity=Product.class, fetch = FetchType.LAZY)
	@JoinColumn(name="product_id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="provider_os")
	private Provider provider;
	
	@Column(name="price")
	private Float price;
	
	@Column(name="initialDate")
	private Date initialDate;
	
	@Column(name="finalDate")
	private Date finalDate;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="productOnSale_id")
	private List<Purchase> purchases;
	
	public ProductOnSale(Product product, Provider provider, Float price, Date initialDate) {
		super();
		this.product = product;
		this.provider = provider;
		this.price = price;
		this.initialDate = initialDate;
		product.addProductOnSales(this);
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
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

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}
	
}
