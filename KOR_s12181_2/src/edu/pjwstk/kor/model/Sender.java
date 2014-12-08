package edu.pjwstk.kor.model;

public class Sender extends Person{

	private String senderType;

	public Sender(String name, String surname, String phoneNumber,
			String emailAdress, Adress adres, String senderType) {
		super(name, surname, phoneNumber, emailAdress, adres);
		this.senderType = senderType;
	}

	public String getSenderType() {
		return senderType;
	}

	public void setSenderType(String senderType) {
		this.senderType = senderType;
	}

	@Override
	public String toString() {
		return "Sender [senderType=" + senderType + "]";
	}
}
