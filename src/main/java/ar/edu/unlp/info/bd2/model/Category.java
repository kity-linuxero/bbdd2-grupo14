package ar.edu.unlp.info.bd2.model;

public class Category {

	@Id
	@GeneratedValue
    private Integer id;
	private String name;
	
	public Category(String name) {
		this.name = name;
	}
	
	public void setName(String aName) {
		// TODO Auto-generated method stub
		name = aName;
	}

	public getCategoryByName(){
		return this;
	}
	
	public getId() {
		return id;
	}
	
	public getName() {
		return name;
	}
	
	
	
	

}
