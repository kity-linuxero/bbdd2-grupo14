package ar.edu.unlp.info.bd2.model;

public abstract class PaymentMethod {

	private int id;
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

	public int getId() {
		return id;
	}

}
