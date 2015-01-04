package edu.pjwstk.kor.model;

public class Sender extends Person{

	private String senderType;

	public Sender(String name, String surname, String phoneNumber,
			String emailAdress, Adress adres, String senderType) {
		super(name, surname, phoneNumber, emailAdress, adres);
		this.senderType = senderType;
	}

	public Sender(Person person, String senderType) {
		super(person.getName(), person.getSurname(), person.getPhoneNumber(), person.getEmailAdress(),person.getAdres());
		this.senderType = senderType;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public String getSurname() {
		return super.getSurname();
	}
	
	public String getCity() {
		return super.getCity();
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
