package ar.edu.unlp.info.bd2.model;

import java.sql.Date;

import javax.persistence.*;
import org.springframework.context.annotation.Bean;


@Entity
//@Table(name="priceHistories")
public class PriceHistory {

	@Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateFrom;
	private Date dateTo;
	private Provider provider;
	
	@Column(name="products")
    @OneToOne
    @JoinColumn(name = "cantProducto")
	private Product product;
	
	public PriceHistory(Date dateFrom, Date dateTo, Provider provider, Product product) {
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
