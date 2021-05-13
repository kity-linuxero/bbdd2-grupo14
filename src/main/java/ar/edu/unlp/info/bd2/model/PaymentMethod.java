package ar.edu.unlp.info.bd2.model;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="paymentMethod")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "payment_type",
discriminatorType = DiscriminatorType.CHAR)
public abstract class PaymentMethod {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	protected String name;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="paymentMethod_id")
	private Set<Purchase> purshases;

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
