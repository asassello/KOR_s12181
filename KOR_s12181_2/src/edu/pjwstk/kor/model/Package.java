package edu.pjwstk.kor.model;

public class Package {

	private float weight;
	private String sizeType;
	private PaymentType packagePayment;
	
	public Package(float weight, String sizeType, PaymentType packagePayment) {
		super();
		this.weight = weight;
		this.sizeType = sizeType;
		this.packagePayment = packagePayment;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getSizeType() {
		return sizeType;
	}

	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
	}

	public PaymentType getPackagePayment() {
		return packagePayment;
	}

	public void setPackagePayment(PaymentType packagePayment) {
		this.packagePayment = packagePayment;
	}

	@Override
	public String toString() {
		return "Package [weight=" + weight + ", sizeType=" + sizeType
				+ ", packagePayment=" + packagePayment + "]";
	}
	
	
	
}
