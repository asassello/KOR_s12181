package edu.pjwstk.kor.model.data;

import java.util.ArrayList;
import java.util.List;


import edu.pjwstk.kor.model.PaymentType;

public class RandomPaymentType {
	
	public static ArrayList<PaymentType> getPaymentTypes(){
		
		ArrayList<PaymentType> paymentTypes = new ArrayList<PaymentType>();
		
		List<String> paymentTypeNames = new ArrayList<String>();
		paymentTypeNames.add("Paczka krajowa ma³a");
		paymentTypeNames.add("Paczka krajowa œrednia");
		paymentTypeNames.add("Paczka krajowa du¿a");
		paymentTypeNames.add("Paczka krajowa ponadgabarytowa");
		paymentTypeNames.add("Dop³ata za paczkê delikatn¹ krajow¹");
		paymentTypeNames.add("Paczka miêdzynarodowa ma³a");
		paymentTypeNames.add("Paczka miêdzynarodowa œrednia");
		paymentTypeNames.add("Paczka miêdzynarodowa du¿a");
		paymentTypeNames.add("Paczka miêdzynarodowa ponadgabarytowa");
		paymentTypeNames.add("Dop³ata za paczkê delikatn¹ miêdzynarodow¹");
		paymentTypeNames.add("List krajowy ma³y");
		paymentTypeNames.add("List krajowy œredni");
		paymentTypeNames.add("List krajowy du¿y");
		
		paymentTypeNames.add("Opakowanie ma³e");
		paymentTypeNames.add("Opakowanie œrednie");
		paymentTypeNames.add("Opakowanie du¿e");
		paymentTypeNames.add("Opakowanie max");
		paymentTypeNames.add("Koperta ma³a");
		paymentTypeNames.add("Koperta œrednia");
		paymentTypeNames.add("Koperta du¿a");
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
