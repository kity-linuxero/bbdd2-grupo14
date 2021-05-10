package ar.edu.unlp.info.bd2.model;

import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name="purchase")
public class Purchase {
	
	@Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="productOnSale")
	private ProductOnSale productOnSale;
	@Column(name="quantity")
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User client;
	
	@Column(name="deliveryMethod")
	private DeliveryMethod deliveryMethod;
	
	@ManyToOne
	@JoinColumn(name="paymentMethod_id")
	private PaymentMethod paymentMethod;
	
	@Column(name="address")
	private String address;
	@Column(name="coordX")
	private Float coordX;
	@Column(name="coordY")
	private Float coordY;
	@Column(name="dateOfPurchase")
	private Date dateOfPurchase;
	//private Float shipping;
	
	public Purchase(ProductOnSale productOnSale, Integer quantity, User client, DeliveryMethod deliveryMethod,
			PaymentMethod paymentMethod, String address, Float coordX, Float coordY, Date dateOfPurchase) {
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

	public Float getCoordX() {
		return coordX;
	}

	public void setCoordX(Float coordX) {
		this.coordX = coordX;
	}

	public Float getCoordY() {
		return coordY;
	}

	public void setCoordY(Float coordY) {
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
	
	public Float getAmount(){
		return (this.getProductOnSale().getPrice()*this.getQuantity()) + this.deliveryMethod.getCost();
	}
	

}
