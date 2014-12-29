package edu.pjwstk.kor.model;

public class Packagement {

	private float weightLessThan;
	private double weight;
	private String sizeType;
	private PaymentType packagePayment;
	
	public Packagement(float weightLessThan, String sizeType, PaymentType packagePayment) {
		super();
		this.weightLessThan = weightLessThan;
		this.sizeType = sizeType;
		this.packagePayment = packagePayment;
	}
	
	public Packagement(float weightLessThan, String sizeType, PaymentType packagePayment, Double weight) {
		super();
		this.weightLessThan = weightLessThan;
		this.sizeType = sizeType;
		this.packagePayment = packagePayment;
		this.weight= weight;
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
		return "Packagement [weightLessThan=" + weightLessThan + ", weight="
				+ weight + ", sizeType=" + sizeType + ", packagePayment="
				+ packagePayment + "]";
	}

	public float getWeightLessThan() {
		return weightLessThan;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeightLessThan(float weightLessThan) {
		this.weightLessThan = weightLessThan;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
}
