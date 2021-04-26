package ar.edu.unlp.info.bd2.model;

public class OnDeliveryPayment extends Payment {
	
	private int id;
	private String name;
	private float promisedAmount;
	
	public OnDeliveryPayment(String name, float promisedAmount) {
		super();
		this.name = name;
		this.promisedAmount = promisedAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPromisedAmount() {
		return promisedAmount;
	}

	public void setPromisedAmount(float promisedAmount) {
		this.promisedAmount = promisedAmount;
	}

	public Integer getId() {
		return id;
	}
	
	
}
