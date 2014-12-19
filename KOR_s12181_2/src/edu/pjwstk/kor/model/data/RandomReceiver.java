package edu.pjwstk.kor.model.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.pjwstk.kor.model.Adress;
import edu.pjwstk.kor.model.Receiver;
import edu.pjwstk.kor.model.Person;

public class RandomReceiver {

	public static ArrayList<Receiver> getReceivers(List<Person> persons, List<Adress> adresses){
		
		ArrayList<Receiver> receivers = new ArrayList<Receiver>();
		
		for(int i=0; i<100; i++){
			Random rnd = new Random();
			int idx1 = rnd.nextInt(persons.size());
			int idx2 = rnd.nextInt(adresses.size());
			receivers.add(new Receiver(persons.get(idx1),adresses.get(idx2)));
		}
		
		return receivers;
	}
	
}