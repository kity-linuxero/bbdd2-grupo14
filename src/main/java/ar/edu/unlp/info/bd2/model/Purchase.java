package ar.edu.unlp.info.bd2.model;

import java.sql.Date;

import javax.persistence.*;


@Entity
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private ProductOnSale productOnSale;
	private Integer quantity;
	private User client;
	private DeliveryMethod deliveryMethod;
	private PaymentMethod paymentMethod;
	private String address;
	private float coordX;
	private float coordY;
	private Date dateOfPurchase;
	//private float shipping;
	
	public Purchase(ProductOnSale productOnSale, Integer quantity, User client, DeliveryMethod deliveryMethod,
			PaymentMethod paymentMethod, String address, float coordX, float coordY, Date dateOfPurchase) {
		super();
		this.productOnSale = productOnSale;
		this.quantity = quantity;
		this.client = client;
		this.deliveryMethod = deliveryMethod;
		this.paymentMethod = paymentMethod;
		this.address = address;
		this.coordX = coordX;
		this.coordY = coordY;
		this.dateOfPurchase = dateOfPurchase;
	}

	public ProductOnSale getProductOnSale() {
		return productOnSale;
	}

	public void setProductOnSale(ProductOnSale productOnSale) {
		this.productOnSale = productOnSale;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public DeliveryMethod getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getCoordX() {
		return coordX;
	}

	public void setCoordX(float coordX) {
		this.coordX = coordX;
	}

	public float getCoordY() {
		return coordY;
	}

	public void setCoordY(float coordY) {
		this.coordY = coordY;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public Long getId() {
		return id;
	}
	
	public float getAmount(){
		return (this.getProductOnSale().getPrice()*this.getQuantity()) + this.deliveryMethod.getCost();
	}
	

}
