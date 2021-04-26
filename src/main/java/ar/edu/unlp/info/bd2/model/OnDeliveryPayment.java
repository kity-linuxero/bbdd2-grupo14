package ar.edu.unlp.info.bd2.model;

public class OnDeliveryPayment extends PaymentMethod {

	private float promisedAmount;
	
	public OnDeliveryPayment(String name, float promisedAmount) {
		super(name);
		this.name = name;
		this.promisedAmount = promisedAmount;
	}

	public float getPromisedAmount() {
		return promisedAmount;
	}

	public void setPromisedAmount(float promisedAmount) {
		this.promisedAmount = promisedAmount;
	}
<<<<<<< HEAD
=======

	public int getId() {
		return id;
	}
>>>>>>> 8123b7e9021c5fffbc9fc1a03ff524b3ecfb0154
	
	
}
