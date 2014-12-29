package edu.pjwstk.kor.model;

public class PaymentType {

	private String paymentTypeName;
	private double paymentPrice;
	
	public PaymentType(String paymentTypeName, double paymentPrice) {
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

	public double getPaymentPrice() {
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
