package ar.edu.unlp.info.bd2.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

@Service
public class MLServiceImpl implements MLService {
	
	@Autowired
	private MLRepository repository;

	public MLServiceImpl(MLRepository repository) {
		this.repository = repository;
	}

    @Transactional
    public Category createCategory(String name) throws MLException {
//		Category category = repository.getCategoryByName(name);
		Category category = new Category(name);
		return repository.storeCategory(category);
	}

	@Override
	public Product createProduct(String name, Float weight, Category category) throws MLException {
		Optional<Product> p = repository.getProductByName(name);
		if (!p.isPresent()) {
			Product pro = new Product(name, weight, category);
			return repository.storeProduct(pro);
		}else
			throw new MLException("Constraint Violation");
	}

	@Override
	public User createUser(String email, String fullname, String password, Date dayOfBirth) throws MLException {
		Optional <User> user = repository.getUserByUsername(email);
		if (!user.isPresent()) {
			User u = new User();
			u.setEmail(email);
			u.setFullname(fullname);
			u.setPassword(password);
			//user.setDayOfBirth((java.sql.Date) dayOfBirth);
			u.setDayOfBirth((java.util.Date) dayOfBirth);
			return repository.storeUser(u);
		}
		throw new MLException("Constraint Violation");
	}

	@Override
	public Provider createProvider(String name, Long cuit) throws MLException {
		
		Optional<Provider> p = Optional.ofNullable(repository.getProviderByCuit(cuit));
		if (!p.isPresent()) {
			Provider provider = new Provider(name, cuit);
			return repository.storeProvider(provider);
		}else {
			throw new MLException("Constraint Violation");
		}
	}

	@Override
	public DeliveryMethod createDeliveryMethod(String name, Float cost, Float startWeight, Float endWeight) throws MLException {
		Optional<DeliveryMethod> dm = repository.getDeliveryMethodByName(name);
		DeliveryMethod deliveryMethod = new DeliveryMethod(name, cost, startWeight, endWeight);
		
		if (!dm.isPresent()) {
			return repository.storeDeliveryMethod(deliveryMethod);
		}else {
			if(dm.get().getEndWeight() == deliveryMethod.getEndWeight()) {
				throw new MLException("método de delivery no válido");
			}else {
				return repository.storeDeliveryMethod(deliveryMethod);
			}
		}
	}

    @Transactional
    /* returns an user by a given email, null otherwise */
    public Optional<User> getUserByUsername(String email) {
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
	@Override
	public Optional<Category> getCategoryByName(String name) {
		return Optional.of(repository.getCategoryByName(name));
	}

	@Override
	public Optional<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		return repository.getProductByName(name);
	}

	@Override
	public Optional<DeliveryMethod> getDeliveryMethodByName(String name) {
		return repository.getDeliveryMethodByName(name);
	}

	@Override
	public Optional<OnDeliveryPayment> getOnDeliveryPaymentByName(String name) {
		// TODO Auto-generated method stub
		return repository.getOnDeliveryPaymentByName(name);
	}

	@Override
	public Optional<Purchase> getPurchaseById(Long id) {
		// TODO Auto-generated method stub
		return repository.getPurchaseById(id);
	}

	@Override
	public Purchase createPurchase(ProductOnSale productOnSale, Integer quantity, User client, DeliveryMethod deliveryMethod, PaymentMethod paymentMethod, String address, Float coordX, Float coordY, Date dateOfPurchase) throws MLException {
		
		Optional<Purchase> p = repository.getPurchaseByAddress(address);
		if (p.isPresent()) {
			throw new MLException("método de delivery no válido");
		}else {
			Purchase pur = new Purchase(productOnSale, quantity, client, deliveryMethod,paymentMethod, address, coordX, coordY, dateOfPurchase);
			return repository.storePurchase(pur);
		}

	}

	@Override
	public CreditCardPayment createCreditCardPayment(String name, String brand, Long number, Date expiry, Integer cvv, String owner) throws MLException {
			Optional<CreditCardPayment> ccp = repository.getCreditCardPaymentByNumber(number);
			if (!ccp.isPresent()) {
				CreditCardPayment credit = new CreditCardPayment(name, brand, number, expiry, cvv, owner);
				return repository.storeCreditCardPayment(credit);
			}else
				throw new MLException("Credit Cart Payment exists!");
	}

	@Override
	public OnDeliveryPayment createOnDeliveryPayment(String name, Float promisedAmount) throws MLException {
		Optional<OnDeliveryPayment> odp = repository.getOnDeliveryPaymentByName(name);
		if (!odp.isPresent()) {
			OnDeliveryPayment o = new OnDeliveryPayment(name, promisedAmount);
			return repository.storeOnDeliveryPayment(o);
		}else
			throw new MLException("Credit Cart Payment exists!");
	}

	@Override
	public ProductOnSale createProductOnSale(Product product, Provider provider, Float price, Date initialDate) throws MLException {
		
		List<ProductOnSale> p = repository.getProductsOnSaleByProduct(product);
		
		if (p.isEmpty() || (initialDate.after(p.get(p.size()-1).getInitialDate())) ) { //Es nuevo
			ProductOnSale pos = new ProductOnSale(product, provider, price, initialDate);
			return repository.storeProductOnSale(pos);
		}else {
				throw new MLException("Ya existe un precio para el producto con fecha de inicio de vigencia posterior a la fecha de inicio dada");}
	
	
	}

	@Override
	public Optional<ProductOnSale> getProductOnSaleById(Long id) {
		return repository.getProductOnSaleById(id);
	}

	@Override
	public Optional<User> getUserByEmail(String email) {
		return this.getUserByUsername(email);
	}

	@Override
	public Optional<CreditCardPayment> getCreditCardPaymentByName(String name) {
		return repository.getCreditCardPaymentByName(name);
	}
	
	

}
