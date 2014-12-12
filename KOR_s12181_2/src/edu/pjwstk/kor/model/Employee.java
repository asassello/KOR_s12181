package edu.pjwstk.kor.model;

public class Employee extends Person {

	private Employee superior;
	private Float salary;
	private String position;
	private Boolean isTemporary;
	
	public Employee(String name, String surname, String phoneNumber,
			String emailAdress, Adress adres, Employee superior, Float salary,
			String position, Boolean isTemporary) {
		super(name, surname, phoneNumber, emailAdress, adres);
		this.superior = superior;
		this.salary = salary;
		this.position = position;
		this.isTemporary = isTemporary;
	}
	
	public Employee(Person person, Employee superior, Float salary,
			String position, Boolean isTemporary) {
		super(person.getName(), person.getSurname(), person.getPhoneNumber(), person.getEmailAdress(), person.getAdres());
		this.superior = superior;
		this.salary = salary;
		this.position = position;
		this.isTemporary = isTemporary;
	}
	
	public Employee getSuperior() {
		return superior;
		//mo¿e zwracañ null
	}

	public void setSuperior(Employee superior) {
		this.superior = superior;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Boolean getIsTemporary() {
		return isTemporary;
	}

	public void setIsTemporary(Boolean isTemporary) {
		this.isTemporary = isTemporary;
	}

	@Override
	public String toString() {
		return "Employee [superior=" + superior + ", salary=" + salary
				+ ", position=" + position + ", isTemporary=" + isTemporary
				+ "]";
	}
	
	
	
}
