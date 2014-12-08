package edu.pjwstk.kor.model;
import java.util.Date;

public class Payment {

	private PaymentType paymentType;
	private Date paymentDate;
	private Boolean isPaied;
	private Boolean isDelayed;
	
	public Payment(PaymentType paymentType, Date paymentDate, Boolean isPaied,
			Boolean isDelayed) {
		super();
		this.paymentType = paymentType;
		this.paymentDate = paymentDate;
		this.isPaied = isPaied;
		this.isDelayed = isDelayed;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Boolean getIsPaied() {
		return isPaied;
	}

	public void setIsPaied(Boolean isPaied) {
		this.isPaied = isPaied;
	}

	public Boolean getIsDelayed() {
		return isDelayed;
	}

	public void setIsDelayed(Boolean isDelayed) {
		this.isDelayed = isDelayed;
	}

	@Override
	public String toString() {
		return "Payment [paymentType=" + paymentType + ", paymentDate="
				+ paymentDate + ", isPaied=" + isPaied + ", isDelayed="
				+ isDelayed + "]";
	}
	
	
}
