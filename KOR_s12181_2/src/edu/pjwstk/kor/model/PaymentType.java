package edu.pjwstk.kor.model;

public class PaymentType {

	private String paymentTypeName;
	private float paymentPrice;
	
	public PaymentType(String paymentTypeName, float paymentPrice) {
		super();
		this.paymentTypeName = paymentTypeName;
		this.paymentPrice = paymentPrice;
	}

	public String getPaymentTypeName() {
		return paymentTypeName;
	}

	public void setPaymentTypeName(String paymentTypeName) {
		this.paymentTypeName = paymentTypeName;
	}

	public float getPaymentPrice() {
		return paymentPrice;
	}

	public void setPaymentPrice(float paymentPrice) {
		this.paymentPrice = paymentPrice;
	}

	@Override
	public String toString() {
		return "PaymentType [paymentTypeName=" + paymentTypeName
				+ ", paymentPrice=" + paymentPrice + "]";
	}
	
	
}
