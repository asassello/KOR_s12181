package edu.pjwstk.kor.model.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.pjwstk.kor.model.Employee;
import edu.pjwstk.kor.model.Person;
import edu.pjwstk.kor.model.Adress;


public class RandomEmployee {
	
	public static ArrayList<Employee> getEmployees(List<Person> persons){
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		ArrayList<Employee> bossess = new ArrayList<Employee>();
		
		ArrayList<Adress> bossessAdresses = null;
		bossessAdresses = RandomAdress.getAdresses(5);
		ArrayList<Person> bossessPersons = null;
		bossessPersons = RandomPerson.getPersons(bossessAdresses,5);
		for (int i=0; i<5; i++) {
			Random rnd = new Random();
			int idx1 = rnd.nextInt(bossessPersons.size());			
			bossess.add(new Employee(bossessPersons.get(idx1),null, Integer.parseInt("10000"),"Kierownik",new Boolean(false)));
		}
		
		List<Integer> salaries = new ArrayList<Integer>();
		for(int i=0; i<100; i++) {
			Random rnd = new Random();
			Integer n = 1750 + rnd.nextInt(8000);
			salaries.add(n);
		}
		
		List<String> positions = new ArrayList<String>();
		positions.add("Kurier");
		positions.add("M³odszy Kurier");
		positions.add("Starszy Kurier");
		positions.add("Magazynier");
		positions.add("M³odszy Magazynier");
		positions.add("Starszy Magazynier");
		positions.add("Logistyk");
		positions.add("M³odszy Logistyk");
		positions.add("Starszy Logistyk");
		
		List<Boolean> isTemporarys = new ArrayList<Boolean>();
		isTemporarys.add(new Boolean(true));
		isTemporarys.add(new Boolean(false));
		
		for (int i=0; i<100; i++) {
			Random rnd = new Random();
			int idx1 = rnd.nextInt(persons.size());
			int idx2 = rnd.nextInt(salaries.size());
			int idx3 = rnd.nextInt(positions.size());
			int idx4 = rnd.nextInt(isTemporarys.size());
			int idx5 = rnd.nextInt(bossess.size());
			
			employees.add(new Employee(persons.get(idx1),bossess.get(idx5),salaries.get(idx2),positions.get(idx3),isTemporarys.get(idx4)));
		}
		
		return employees;
	}

}
