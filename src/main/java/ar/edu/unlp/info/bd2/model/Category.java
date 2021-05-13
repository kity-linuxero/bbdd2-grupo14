package ar.edu.unlp.info.bd2.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="categories")
public class Category {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="name")
	private String name;
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name="category_id")
//	private List<Product> products;
	
	
	public Category(String name) {
		this.name = name;
	}
	
	public void setName(String aName) {
		// TODO Auto-generated method stub
		name = aName;
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	

}
