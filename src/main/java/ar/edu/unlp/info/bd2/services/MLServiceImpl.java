package ar.edu.unlp.info.bd2.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlp.info.bd2.exceptions.MLException;
import ar.edu.unlp.info.bd2.model.Category;
import ar.edu.unlp.info.bd2.model.CreditCardPayment;
import ar.edu.unlp.info.bd2.model.DeliveryMethod;
import ar.edu.unlp.info.bd2.model.OnDeliveryPayment;
import ar.edu.unlp.info.bd2.model.PaymentMethod;
import ar.edu.unlp.info.bd2.model.Product;
import ar.edu.unlp.info.bd2.model.ProductOnSale;
import ar.edu.unlp.info.bd2.model.Provider;
import ar.edu.unlp.info.bd2.model.Purchase;
import ar.edu.unlp.info.bd2.model.User;
import ar.edu.unlp.info.bd2.repositories.MLRepository;

public class MLServiceImpl implements MLService {
	
	private MLRepository repository;

	public MLServiceImpl(MLRepository repository) {
		this.repository = repository;
	}

    @Transactional
    public Category createCategory(String name) throws MLException {
		Category category = repository.getCategoryByName(name);
		if (category == null) {
			category = new Category(name);
			return repository.storeCategory(category);
		}
		else {
			return null;
		}
	}

	@Override
	public Product createProduct(String name, Float weight, Category category) throws MLException {
		Product p = new Product(name, weight, category);
		return repository.storeProduct(p);
	}

	@Override
	public User createUser(String email, String fullname, String password, Date dayOfBirth) throws MLException {
		User user = repository.getUserByUsername(email);
		if (user == null) {
			user = new User();
			user.setEmail(email);
			user.setFullname(fullname);
			user.setPassword(password);
			user.setDayOfBirth((java.sql.Date) dayOfBirth);
			return repository.storeUser(user);
		}
		return null;
	}

	@Override
	public Provider createProvider(String name, Long cuit) throws MLException {
		Provider provider = new Provider(name, cuit);
		return repository.storeProvider(provider);
	}

	@Override
	public DeliveryMethod createDeliveryMethod(String name, Float cost, Float startWeight, Float endWeight)
			throws MLException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public CreditCardPayment createCreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv,
//			String owner) throws MLException {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public OnDeliveryPayment createOnDeliveryPayment(String name, Float promisedAmount) throws MLException {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public ProductOnSale createProductOnSale(Product product, Provider provider, Float price, Date initialDate)
//			throws MLException {
//		// TODO Auto-generated method stub
//		return null;
//	}

    @Transactional
    /* returns an user by a given email, null otherwise */
    public User getUserByUsername(String email) {
        email = email.toLowerCase();
        return repository.getUserByUsername(email);
    }
    
    @Transactional
    /* returns an user by a given id, null otherwise */
    public User getUserById(Long id) {
        return repository.getUserById(id);
    }

	@Override
	public Optional<Provider> getProviderByCuit(long cuit) {
		return Optional.of(repository.getProviderByCuit(cuit));
	}

	@Transactional
	public Optional<Category> getCategoryByName(String name) {
		// TODO Auto-generated method stub
		return Optional.of(repository.getCategoryByName(name));
	}

	@Override
	public Optional<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		return repository.getProductByName(name);
	}

//	@Override
//	public ProductOnSale getProductOnSaleById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Optional<DeliveryMethod> getDeliveryMethodByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CreditCardPayment> getCreditCardPaymentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<OnDeliveryPayment> getOnDeliveryPaymentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Purchase> getPurchaseById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public CreditCardPayment createCreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv,
//			String owner) throws MLException {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public OnDeliveryPayment createOnDeliveryPayment(String name, Float promisedAmount) throws MLException {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public ProductOnSale createProductOnSale(Product product, Provider provider, Float price, Date initialDate) throws MLException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Purchase createPurchase(ProductOnSale productOnSale, Integer quantity, User client,
			DeliveryMethod deliveryMethod, PaymentMethod paymentMethod, String address, Float coordX, Float coordY,
			Date dateOfPurchase) throws MLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreditCardPayment createCreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv,
			String owner) throws MLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OnDeliveryPayment createOnDeliveryPayment(String name, Float promisedAmount) throws MLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductOnSale createProductOnSale(Product product, Provider provider, Float price, Date initialDate)
			throws MLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductOnSale getProductOnSaleById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public ProductOnSale getProductOnSaleById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	
	

}
