package edu.pjwstk.kor.model;

public class Person {

	private String name;
	private String surname;
	private String phoneNumber;
	private String emailAdress;
	private Adress adres;
	
	public Person(String name, String surname, String phoneNumber,
			String emailAdress, Adress adres) {
		super();
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.emailAdress = emailAdress;
		this.adres = adres;
	}
	
	public String getCity() {
		return adres.getCity();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public Adress getAdres() {
		return adres;
	}

	public void setAdres(Adress adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname
				+ ", phoneNumber=" + phoneNumber + ", emailAdress="
				+ emailAdress + ", adres=" + adres + "]";
	}
	
	
	
}
