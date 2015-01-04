package edu.pjwstk.kor.model;

public class Receiver extends Person {

	private Adress secondaryAdress;

	public Receiver(String name, String surname, String phoneNumber,
			String emailAdress, Adress adres, Adress secondaryAdress) {
		super(name, surname, phoneNumber, emailAdress, adres);
		this.secondaryAdress = secondaryAdress;
	}
	
	public Receiver(Person person, Adress secondaryAdress) {
		super(person.getName(), person.getSurname(), person.getPhoneNumber(), person.getEmailAdress(), person.getAdres());
		this.secondaryAdress = secondaryAdress;
	}

	public Adress getSecondaryAdress() {
		return secondaryAdress;
	}

	public void setSecondaryAdress(Adress secondaryAdress) {
		this.secondaryAdress = secondaryAdress;
	}
	
	public String getCity() {
		return super.getCity();
	}

	@Override
	public String toString() {
		return "Receiver [secondaryAdress=" + secondaryAdress + "]";
	}
}
