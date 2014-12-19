package edu.pjwstk.kor.model.data;

import java.util.ArrayList;
import java.util.List;


import edu.pjwstk.kor.model.PaymentType;

public class RandomPaymentType {
	
	public static ArrayList<PaymentType> getPaymentTypes(){
		
		ArrayList<PaymentType> paymentTypes = new ArrayList<PaymentType>();
		
		List<String> paymentTypeNames = new ArrayList<String>();
		paymentTypeNames.add("Paczka krajowa ma�a");
		paymentTypeNames.add("Paczka krajowa �rednia");
		paymentTypeNames.add("Paczka krajowa du�a");
		paymentTypeNames.add("Paczka krajowa ponadgabarytowa");
		paymentTypeNames.add("Dop�ata za paczk� delikatn� krajow�");
		paymentTypeNames.add("Paczka mi�dzynarodowa ma�a");
		paymentTypeNames.add("Paczka mi�dzynarodowa �rednia");
		paymentTypeNames.add("Paczka mi�dzynarodowa du�a");
		paymentTypeNames.add("Paczka mi�dzynarodowa ponadgabarytowa");
		paymentTypeNames.add("Dop�ata za paczk� delikatn� mi�dzynarodow�");
		paymentTypeNames.add("List krajowy ma�y");
		paymentTypeNames.add("List krajowy �redni");
		paymentTypeNames.add("List krajowy du�y");
		
		paymentTypeNames.add("Opakowanie ma�e");
		paymentTypeNames.add("Opakowanie �rednie");
		paymentTypeNames.add("Opakowanie du�e");
		paymentTypeNames.add("Opakowanie max");
		paymentTypeNames.add("Koperta ma�a");
		paymentTypeNames.add("Koperta �rednia");
		paymentTypeNames.add("Koperta du�a");
		paymentTypeNames.add("Koperta max");
		
		List<Float> paymentPrices = new ArrayList<Float>();
		paymentPrices.add(Float.parseFloat("12.99"));
		paymentPrices.add(Float.parseFloat("16.99"));
		paymentPrices.add(Float.parseFloat("25.99"));
		paymentPrices.add(Float.parseFloat("69.99"));
		paymentPrices.add(Float.parseFloat("10"));
		paymentPrices.add(Float.parseFloat("25.99"));
		paymentPrices.add(Float.parseFloat("33.99"));
		paymentPrices.add(Float.parseFloat("51.99"));
		paymentPrices.add(Float.parseFloat("129.99"));
		paymentPrices.add(Float.parseFloat("25"));
		paymentPrices.add(Float.parseFloat("5.99"));
		paymentPrices.add(Float.parseFloat("7.99"));
		paymentPrices.add(Float.parseFloat("11.99"));
		
		paymentPrices.add(Float.parseFloat("8.99"));
		paymentPrices.add(Float.parseFloat("12.99"));
		paymentPrices.add(Float.parseFloat("19.99"));
		paymentPrices.add(Float.parseFloat("0.0"));		
		paymentPrices.add(Float.parseFloat("2.99"));
		paymentPrices.add(Float.parseFloat("3.99"));
		paymentPrices.add(Float.parseFloat("4.99"));
		paymentPrices.add(Float.parseFloat("0.0"));
		
		for (int i=0; i<21; i++) {
			
			paymentTypes.add(new PaymentType(paymentTypeNames.get(i),paymentPrices.get(i)));
		}
		
		return paymentTypes;
		
	}

}
