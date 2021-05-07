package ar.edu.unlp.info.bd2.model;

import javax.persistence.*;


@Entity
public class DeliveryMethod {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer cost;
	private Float startWeight;
	private Float endWeight;
	
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
