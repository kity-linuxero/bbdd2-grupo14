package ar.edu.unlp.info.bd2.model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="provider")
public class Provider {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="cuit")
	private Long cuit;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="provider_id")
	private Set<PriceHistory> priceHistories;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="provider_os")
	private Set<ProductOnSale> productOnSales;
	
	@ManyToMany(mappedBy = "providers")
	private Set<Purchase>purchases;
	
	@ManyToMany(mappedBy = "providers")
	private Set<Product>products;
	
	public Provider(String name, Long cuit) {
		this.name = name;
		this.cuit = cuit;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}
	
}
