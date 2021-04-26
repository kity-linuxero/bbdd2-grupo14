package ar.edu.unlp.info.bd2.model;

public class Provider {
	
	private Integer id;
	private String name;
	private String cuit;
	
	public Provider(Integer id, String name, String cuit) {
		this.id = id;
		this.name = name;
		this.cuit = cuit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
