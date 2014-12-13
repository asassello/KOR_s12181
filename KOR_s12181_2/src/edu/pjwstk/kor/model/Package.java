package edu.pjwstk.kor.model;

public class Package {

	private float weightLessThan;
	private String sizeType;
	private PaymentType packagePayment;
	
	public Package(float weightLessThan, String sizeType, PaymentType packagePayment) {
		super();
		this.weightLessThan = weightLessThan;
		this.sizeType = sizeType;
		this.packagePayment = packagePayment;
	}

	public float getweightLessThan() {
		return weightLessThan;
	}

	public void setweightLessThan(float weightLessThan) {
		this.weightLessThan = weightLessThan;
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
		return "Package [weightLessThan=" + weightLessThan + ", sizeType=" + sizeType
				+ ", packagePayment=" + packagePayment + "]";
	}
	
	
	
}
