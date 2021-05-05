package ar.edu.unlp.info.bd2.repositories;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unlp.info.bd2.model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
	    String stmt = "SELECT u FROM User u WHERE u.username = :username";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<User> query = session.createQuery(stmt, User.class);
	    query.setParameter("username", username);
	    List<User> results = query.getResultList();
	    return results.isEmpty();
	  }
	  
	  /* Retorna un usuario existente por mail, nulo de otra forma. */
	  public User getUserByUsername(String email) {
	    String stmt = "SELECT u FROM User u WHERE u.username = :email";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<User> query = session.createQuery(stmt, User.class);
	    query.setParameter("email", email);
	    return ((Query<User>) query).uniqueResult();
	  }
	  
	  /* saves a category and returns it */
	  public Category store(Category category){
	    sessionFactory.getCurrentSession().save(category);
	    return category;
	  }
	  
	  

}
