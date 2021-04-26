package ar.edu.unlp.info.bd2.model;

import java.sql.Date;

public class Purchase {
	
	private int id;
	private Integer quantity;
	private float shipping;
	private String address;
	private Payment paymentMethod;
	private Product productOnSale;
	private User client;
	private DeliveryMethod deliveryMethod;
	private float coorX;
	private float coorY;
	private Date dateOfPurchase;
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public float getShipping() {
		return shipping;
	}
	public void setShipping(float shipping) {
		this.shipping = shipping;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Payment getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(Payment paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Product getProductOnSale() {
		return productOnSale;
	}
	public void setProductOnSale(Product productOnSale) {
		this.productOnSale = productOnSale;
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
	public float getCoorX() {
		return coorX;
	}
	public void setCoorX(float coorX) {
		this.coorX = coorX;
	}
	public float getCoorY() {
		return coorY;
	}
	public void setCoorY(float coorY) {
		this.coorY = coorY;
	}
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public Integer getId() {
		return id;
	}
	
	

}
