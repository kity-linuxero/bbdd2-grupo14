package ar.edu.unlp.info.bd2.repositories;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unlp.info.bd2.model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.hibernate.query.Query;

public class MLRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	  /* Salva un nuevo usuario y lo devuelve */
	  public User storeUser(User user){
	    sessionFactory.getCurrentSession().save(user);
	    return user;
	  }
	  
	  /* Retorna true si un usuario aún no está en uso.  */
	  public boolean uniqueUsername(String username){
	    String stmt = "SELECT u FROM User u WHERE u.username like :username";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<User> query = session.createQuery(stmt, User.class);
	    query.setParameter("username", username);
	    List<User> results = query.getResultList();
	    return results.isEmpty();
	  }
	  
	  /* Retorna un usuario existente por mail, nulo de otra forma. */
	  public User getUserByUsername(String email) {
	    String stmt = "from User u where username like :email";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<User> query = session.createQuery(stmt, User.class);
	    query.setParameter("email", email);
	    return ((Query<User>) query).uniqueResult();
	  }
	  
	  /* saves a category and returns it */
	  public Category storeCategory(Category category){
	    sessionFactory.getCurrentSession().save(category);
	    return category;
	  }

	public Category getCategoryByName(String name) {
	    String stmt = "from Category where name like :name ";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Category> query = session.createQuery(stmt, Category.class);
	    query.setParameter("name", name);
	    return ((Query<Category>) query).uniqueResult();	
	}
	
	public Category getCategorybyId(Long id) {
		return sessionFactory.getCurrentSession().get(Category.class, id);
	}

	public User getUserById(Long id) {
		return sessionFactory.getCurrentSession().get(User.class, id);
	}
	
	public Provider getProviderById(Long id) {
		return sessionFactory.getCurrentSession().get(Provider.class, id);
	}
	
	public Product getProductById(Long id) {
		return sessionFactory.getCurrentSession().get(Product.class, id);
	}
	
  /* saves a provider and returns it */
    public Provider storeProvider(Provider provider){
      sessionFactory.getCurrentSession().save(provider);
      return provider;
    }
    
    public Provider getProviderByCuit(Long cuit) {
	    String stmt = "SELECT p FROM Providers p WHERE p.cuit = :cuit";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Provider> query = session.createQuery(stmt, Provider.class);
	    query.setParameter("cuit", cuit);
	    return ((Query<Provider>) query).uniqueResult();
    	
    }
    
    /* saves a provider and returns it */
    public Product storeProduct(Product product){
      sessionFactory.getCurrentSession().save(product);
      return product;
    }

	public Optional<Product> getProductByName(String name) {
	    String stmt = "SELECT p FROM Products p WHERE p.name = :name";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Product> query = session.createQuery(stmt, Product.class);
	    query.setParameter("namet", name);
	    return Optional.of(((Query<Product>) query).uniqueResult());
	}
	  
	  

}
