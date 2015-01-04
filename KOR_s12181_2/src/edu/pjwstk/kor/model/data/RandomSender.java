package edu.pjwstk.kor.model.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.pjwstk.kor.model.Person;
import edu.pjwstk.kor.model.Sender;

public class RandomSender {

public static ArrayList<Sender> getSenders(List<Person> persons){
		
		ArrayList<Sender> senders = new ArrayList<Sender>();
		
		List<String> senderTypes = new ArrayList<String>();
		senderTypes.add("Klient standardowy");
		senderTypes.add("Klient firmowy");
		senderTypes.add("Klient VIP");
		senderTypes.add("Klient VIP");
		
		for (int i=0; i<60; i++) {
			Random rnd = new Random();
			int idx1 = rnd.nextInt(senderTypes.size());
			int idx2 = rnd.nextInt(persons.size());
			senders.add(new Sender(persons.get(idx2),senderTypes.get(idx1)));
		}
		
		return senders;
		
	}
		
}
