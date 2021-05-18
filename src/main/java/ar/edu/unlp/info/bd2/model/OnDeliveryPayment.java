package ar.edu.unlp.info.bd2.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("1")
public class OnDeliveryPayment extends PaymentMethod {
	
	@Column(name="promisedAmount")
	private Float promisedAmount;
	
	public OnDeliveryPayment(String name, Float promisedAmount) {
		super(name);
		this.name = name;
		this.promisedAmount = promisedAmount;
	}

	public Float getPromisedAmount() {
		return promisedAmount;
	}

	public void setPromisedAmount(Float promisedAmount) {
		this.promisedAmount = promisedAmount;
	}
	
}
