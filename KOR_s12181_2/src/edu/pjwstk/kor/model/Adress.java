package edu.pjwstk.kor.model;

public class Adress {
	private String postCode;
	private String street;
	private String country;
	
	public Adress(String city, String postCode, String street, String country) {
		super();
		this.city = city;
		this.postCode = postCode;
		this.street = street;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Adress [postCode=" + postCode + ", street=" + street
				+ ", country=" + country + ", city=" + city + "]";
	}

	private String city;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
