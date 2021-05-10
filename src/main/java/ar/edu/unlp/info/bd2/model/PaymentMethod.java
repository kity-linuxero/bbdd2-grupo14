package ar.edu.unlp.info.bd2.model;
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
