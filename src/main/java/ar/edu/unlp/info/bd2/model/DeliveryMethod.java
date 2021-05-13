package ar.edu.unlp.info.bd2.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="deliveryMethod")
public class DeliveryMethod {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="cost")
	private Integer cost;
	
	@Column(name="startWeight")
	private Float startWeight;
	
	@Column(name="endWeight")
	private Float endWeight;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="deliveryMethod_id")
	private Set<Purchase> purchases;
	
	public DeliveryMethod(String name, Integer cost, Float startWeight, Float endWeight) {
		this.name = name;
		this.cost = cost;
		this.startWeight = startWeight;
		this.endWeight = endWeight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Float getStartWeight() {
		return startWeight;
	}

	public void setStartWeight(Float startWeight) {
		this.startWeight = startWeight;
	}

	public Float getEndWeight() {
		return endWeight;
	}

	public void setEndWeight(Float endWeight) {
		this.endWeight = endWeight;
	}

	public Long getId() {
		return id;
	}
	
}
