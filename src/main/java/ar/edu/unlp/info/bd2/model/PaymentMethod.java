package ar.edu.unlp.info.bd2.model;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="paymentMethod")
public abstract class PaymentMethod {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	protected String name;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="paymentMethod_id")
	private List<Purchase> purshases;

	public PaymentMethod(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

}
