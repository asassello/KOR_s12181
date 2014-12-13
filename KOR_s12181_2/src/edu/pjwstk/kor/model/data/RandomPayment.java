package edu.pjwstk.kor.model.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import edu.pjwstk.kor.model.Payment;
import edu.pjwstk.kor.model.PaymentType;
import edu.pjwstk.kor.model.Sender;

public class RandomPayment {

public static ArrayList<Payment> getPayments(List<PaymentType> paymentTypes){
		
		ArrayList<Payment> payments = null;
		
		List<Date> paymentDates = new ArrayList<Date>();
		for (int i=0; i<100; i++) {
			paymentDates.add(DataGenerator.randomDate());
		}
		
		List<Boolean> isPaieds = new ArrayList<Boolean>();
		isPaieds.add(new Boolean(true));
		isPaieds.add(new Boolean(false));
		
		List<Boolean> isDelayeds = new ArrayList<Boolean>();
		isDelayeds.add(new Boolean(true));
		isDelayeds.add(new Boolean(false));
		
		for (int i=0; i<100; i++) {
			Random rnd = new Random();
			int idx1 = rnd.nextInt(paymentTypes.size());
			int idx2 = rnd.nextInt(paymentDates.size());
			int idx3 = rnd.nextInt(isPaieds.size());
			int idx4 = rnd.nextInt(isDelayeds.size());
			payments.add(new Payment(paymentTypes.get(idx1),paymentDates.get(idx2),isPaieds.get(idx3),isDelayeds.get(idx4)));
		}
		
		return payments;
		
	}
}
