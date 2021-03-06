package ar.edu.unlp.info.bd2.repositories;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unlp.info.bd2.model.*;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.hibernate.query.Query;

public class MLRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	public List<Product> getProductsOnePrice;
	
	  /* Salva un nuevo usuario y lo devuelve */
	  public User storeUser(User user){
	    sessionFactory.getCurrentSession().save(user);
	    return user;
	  }
	  
	  /* Retorna true si un usuario aún no está en uso.  */
	  public boolean uniqueUsername(String username){
	    String stmt = "from User u where u.email like :username";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<User> query = session.createQuery(stmt, User.class);
	    query.setParameter("username", username);
	    List<User> results = query.getResultList();
	    return results.isEmpty();
	  }
	  
	  /* Retorna un usuario existente por mail, nulo de otra forma. */
	  public Optional<User> getUserByUsername(String email) {
	    String stmt = "from User u where u.email like :email";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<User> query = session.createQuery(stmt, User.class);
	    query.setParameter("email", email);
	    return Optional.ofNullable(((Query<User>) query).uniqueResult());
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
	    String stmt = "from Provider p WHERE p.cuit like :cuit";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Provider> query = session.createQuery(stmt, Provider.class);
	    query.setParameter("cuit", cuit);
	    return ((Query<Provider>) query).uniqueResult();
    	
    }
    
    /* saves a provider and returns it */
    public Product storeProduct(Product p){
      sessionFactory.getCurrentSession().save(p);
      return p;
    }

	public Optional<Product> getProductByName(String name) {
	    String stmt = "FROM Product p WHERE p.name like :name";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Product> query = session.createQuery(stmt, Product.class);
	    query.setParameter("name", name);
	    return Optional.ofNullable(((Query<Product>) query).uniqueResult());
	}

	
	public Optional<CreditCardPayment> getCreditCardPaymentByNumber(Long number) {
	    String stmt = "FROM CreditCardPayment ccp WHERE ccp.number like :number";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<CreditCardPayment> query = session.createQuery(stmt, CreditCardPayment.class);
	    query.setParameter("number", number);
	    return Optional.ofNullable(((Query<CreditCardPayment>) query).uniqueResult());
	}

	public CreditCardPayment storeCreditCardPayment(CreditCardPayment credit) {
	      sessionFactory.getCurrentSession().save(credit);
	      return credit;
	}

	public Optional<DeliveryMethod> getDeliveryMethodByName(String name) {
	    String stmt = "FROM DeliveryMethod dm WHERE dm.name like :name";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<DeliveryMethod> query = session.createQuery(stmt, DeliveryMethod.class);
	    query.setParameter("name", name);
	    return Optional.ofNullable(((Query<DeliveryMethod>) query).uniqueResult());
	}

	public DeliveryMethod storeDeliveryMethod(DeliveryMethod deliveryMethod) {
	      sessionFactory.getCurrentSession().save(deliveryMethod);
	      return deliveryMethod;
	}

	public Optional<OnDeliveryPayment> getOnDeliveryPaymentByName(String name) {
	    String stmt = "FROM OnDeliveryPayment odp WHERE odp.name like :name";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<OnDeliveryPayment> query = session.createQuery(stmt, OnDeliveryPayment.class);
	    query.setParameter("name", name);
	    return Optional.ofNullable(((Query<OnDeliveryPayment>) query).uniqueResult());
	}

	public Optional<Purchase> getPurchaseById(Long id) {
	    String stmt = "FROM Purchase p WHERE p.id like :id";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Purchase> query = session.createQuery(stmt, Purchase.class);
	    query.setParameter("id", id);
	    return Optional.of(((Query<Purchase>) query).uniqueResult());
	}

	public Purchase storePurchase(Purchase pur) {
	      sessionFactory.getCurrentSession().save(pur);
	      return pur;
	}

	public OnDeliveryPayment storeOnDeliveryPayment(OnDeliveryPayment o) {
		sessionFactory.getCurrentSession().save(o);
		return o;
	}

	public ProductOnSale storeProductOnSale(ProductOnSale pos) {
		sessionFactory.getCurrentSession().save(pos);
		return pos;
	}

	public Optional<ProductOnSale> getProductOnSaleById(Long id) {
	    String stmt = "FROM ProductOnSale p WHERE p.id like :id";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<ProductOnSale> query = session.createQuery(stmt, ProductOnSale.class);
	    query.setParameter("id", id);
	    return Optional.ofNullable(((Query<ProductOnSale>) query).uniqueResult());
	}

	public Optional<CreditCardPayment> getCreditCardPaymentByName(String name) {
	    String stmt = "FROM CreditCardPayment ccp WHERE ccp.name like :name";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<CreditCardPayment> query = session.createQuery(stmt, CreditCardPayment.class);
	    query.setParameter("name", name);
	    return Optional.of(((Query<CreditCardPayment>) query).uniqueResult());
	}

	public Optional<Purchase> getPurchaseByUserName(String email) {
	    String stmt = "FROM Purchase p join p.client as c where c.email like :email";	    
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Purchase> query = session.createQuery(stmt, Purchase.class);
	    query.setParameter("email", email);
	    return Optional.ofNullable(((Query<Purchase>) query).uniqueResult());

	}
	
	public Optional<Purchase> getPurchaseByProductOnSaleId(String email) {
	    String stmt = "FROM Purchase p join p.productOnSale as c where c.email like :email";	    
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Purchase> query = session.createQuery(stmt, Purchase.class);
	    query.setParameter("email", email);
	    return Optional.ofNullable(((Query<Purchase>) query).uniqueResult());
	}

	public Optional<Purchase> getPurchaseByDate(Date dateOfPurchase) {
	    String stmt = "FROM Purchase p WHERE p.dateOfPurchase like :dateOfPurchase";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Purchase> query = session.createQuery(stmt, Purchase.class);
	    query.setParameter("dateOfPurchase", dateOfPurchase);
	    return Optional.ofNullable(((Query<Purchase>) query).uniqueResult());
	}
	
	public Optional<Purchase> getPurchaseByQuantity(Integer quantity) {
	    String stmt = "FROM Purchase p WHERE p.quantity like :quantity";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Purchase> query = session.createQuery(stmt, Purchase.class);
	    query.setParameter("quantity", quantity);
	    return Optional.ofNullable(((Query<Purchase>) query).uniqueResult());
	}
	
	public Optional<Purchase> getPurchaseByAddress(String address) {
	    String stmt = "FROM Purchase p WHERE p.address like :address";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<Purchase> query = session.createQuery(stmt, Purchase.class);
	    query.setParameter("address", address);
	    return Optional.ofNullable(((Query<Purchase>) query).uniqueResult());
	}

	public Optional<Purchase> getPurchaseByDeliveryMethod(DeliveryMethod deliveryMethod) {
	    String stmt = "FROM Purchase p join p.deliveryMethod as dm where dm.name like :deliveryMethod.name";
	    Session session = sessionFactory.getCurrentSession();
	    
	    TypedQuery<Purchase> query = session.createQuery(stmt, Purchase.class);
	    query.setParameter("deliveryMethod", deliveryMethod);
	    return Optional.ofNullable(((Query<Purchase>) query).uniqueResult());
	    
	}

	public Optional<ProductOnSale> getProductOnSaleByProduct(Product product) {
	    String stmt = "FROM ProductOnSale p where p.product like :product";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<ProductOnSale> query = session.createQuery(stmt, ProductOnSale.class);
	    query.setParameter("product", product);
	    return Optional.ofNullable(((Query<ProductOnSale>) query).uniqueResult());
	}

	public List<ProductOnSale> getProductsOnSaleByProduct(Product product) {
	    String stmt = "FROM ProductOnSale p where p.product like :product";
	    Session session = sessionFactory.getCurrentSession();
	    TypedQuery<ProductOnSale> query = session.createQuery(stmt, ProductOnSale.class);
	    query.setParameter("product", product);
	    List<ProductOnSale> results = query.getResultList();
	    return results;
	}

	public List<Product> getTop3MoreExpensiveProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Purchase> getAllPurchasesMadeByUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsersSpendingMoreThanInPurchase(Float amount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsersSpendingMoreThan(Float amount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Provider> getTopNProvidersInPurchases(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getTopNUsersMorePurchase(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Purchase> getPurchasesInPeriod(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProductForCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Purchase> getPurchasesForProvider(Long cuit) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getBestSellingProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProductWithMoreThan20percentDiferenceInPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public Provider getProviderLessExpensiveProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Provider> getProvidersDoNotSellOn(Date day) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProductOnSale> getSoldProductsOn(Date day) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProductsNotSold() {
		// TODO Auto-generated method stub
		return null;
	}

	public DeliveryMethod getMostUsedDeliveryMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	public OnDeliveryPayment getMoreChangeOnDeliveryMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	public Category getCategoryWithLessProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Category getHeaviestProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	
	  

}
