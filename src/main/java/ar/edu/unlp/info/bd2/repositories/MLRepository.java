package ar.edu.unlp.info.bd2.repositories;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MLRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

}
