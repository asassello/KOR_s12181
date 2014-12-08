package edu.pjwstk.kor.model;

public class Receiver extends Person {

	private Adress secondaryAdress;

	public Receiver(String name, String surname, String phoneNumber,
			String emailAdress, Adress adres, Adress secondaryAdress) {
		super(name, surname, phoneNumber, emailAdress, adres);
		this.secondaryAdress = secondaryAdress;
	}

	public Adress getSecondaryAdress() {
		return secondaryAdress;
	}

	public void setSecondaryAdress(Adress secondaryAdress) {
		this.secondaryAdress = secondaryAdress;
	}

	@Override
	public String toString() {
		return "Receiver [secondaryAdress=" + secondaryAdress + "]";
	}
}
