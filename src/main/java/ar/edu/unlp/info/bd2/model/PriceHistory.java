package ar.edu.unlp.info.bd2.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="priceHistory")
public class PriceHistory {

	@Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="price")
	private  float price;
	
	@Column(name="DateFrom")
	private Date dateFrom;
	
	@Column(name="dateTo")
	private Date dateTo;
		
	@ManyToOne
	@JoinColumn(name="provider_id")
	private Provider provider;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	public PriceHistory(float price, Date dateFrom, Date dateTo, Provider provider, Product product) {
		super();
		this.price = price;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.provider = provider;
		this.product = product;
	}
	
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Long getId() {
		return id;
	}
	
}
