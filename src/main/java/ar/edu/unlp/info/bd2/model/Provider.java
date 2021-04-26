package ar.edu.unlp.info.bd2.model;

public class Provider {
	
	private int id;
	private String name;
	private String cuit;
	
	public Provider(String name, String cuit) {
		this.name = name;
		this.cuit = cuit;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
}
