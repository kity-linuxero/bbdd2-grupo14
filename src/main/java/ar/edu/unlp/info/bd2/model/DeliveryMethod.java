package ar.edu.unlp.info.bd2.model;

public class DeliveryMethod {
	private Integer id;
	private String name;
	private Integer cost;
	private float startWeight;
	private float endWeight;
	
	public DeliveryMethod(String name, Integer cost, float startWeight, float endWeight) {
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

	public float getStartWeight() {
		return startWeight;
	}

	public void setStartWeight(float startWeight) {
		this.startWeight = startWeight;
	}

	public float getEndWeight() {
		return endWeight;
	}

	public void setEndWeight(float endWeight) {
		this.endWeight = endWeight;
	}

	public Integer getId() {
		return id;
	}
	
}
