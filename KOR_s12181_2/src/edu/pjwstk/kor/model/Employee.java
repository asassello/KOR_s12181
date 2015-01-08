package edu.pjwstk.kor.model;

public class Employee extends Person {

	private Employee superior;
	private Integer salary;
	private String position;
	private Boolean isTemporary;
	
	public Employee(String name, String surname, String phoneNumber,
			String emailAdress, Adress adres, Employee superior, Integer salary,
			String position, Boolean isTemporary) {
		super(name, surname, phoneNumber, emailAdress, adres);
		this.superior = superior;
		this.salary = salary;
		this.position = position;
		this.isTemporary = isTemporary;
	}
	
	public Employee(Person person, Employee superior, Integer salary,
			String position, Boolean isTemporary) {
		super(person.getName(), person.getSurname(), person.getPhoneNumber(), person.getEmailAdress(), person.getAdres());
		this.superior = superior;
		this.salary = salary;
		this.position = position;
		this.isTemporary = isTemporary;
	}
	
	public Employee getSuperior() {
		return superior;
		//mo¿e zwracaæ null
	}

	public void setSuperior(Employee superior) {
		this.superior = superior;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
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
	
	public String getName() {
		return super.getName();
	}

	
	
	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return super.getSurname();
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return super.getPhoneNumber();
	}

	@Override
	public String getEmailAdress() {
		// TODO Auto-generated method stub
		return super.getEmailAdress();
	}

	@Override
	public Adress getAdres() {
		// TODO Auto-generated method stub
		return super.getAdres();
	}

	@Override
	public String toString() {
		return "Employee [name=" + this.getName() + ", surname=" + this.getSurname() + ", salary=" + salary
				+ ", position=" + position + ", isTemporary=" + isTemporary
				+ "]";
	}
	
	
	
}
