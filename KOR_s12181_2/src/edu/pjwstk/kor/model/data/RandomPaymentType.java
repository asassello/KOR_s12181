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
		
		List<Double> paymentPrices = new ArrayList<Double>();
		paymentPrices.add(Double.parseDouble("12.99"));
		paymentPrices.add(Double.parseDouble("16.99"));
		paymentPrices.add(Double.parseDouble("25.99"));
		paymentPrices.add(Double.parseDouble("69.99"));
		paymentPrices.add(Double.parseDouble("10"));
		paymentPrices.add(Double.parseDouble("25.99"));
		paymentPrices.add(Double.parseDouble("33.99"));
		paymentPrices.add(Double.parseDouble("51.99"));
		paymentPrices.add(Double.parseDouble("129.99"));
		paymentPrices.add(Double.parseDouble("25"));
		paymentPrices.add(Double.parseDouble("5.99"));
		paymentPrices.add(Double.parseDouble("7.99"));
		paymentPrices.add(Double.parseDouble("11.99"));
		
		paymentPrices.add(Double.parseDouble("8.99"));
		paymentPrices.add(Double.parseDouble("12.99"));
		paymentPrices.add(Double.parseDouble("19.99"));
		paymentPrices.add(Double.parseDouble("0.0"));		
		paymentPrices.add(Double.parseDouble("2.99"));
		paymentPrices.add(Double.parseDouble("3.99"));
		paymentPrices.add(Double.parseDouble("4.99"));
		paymentPrices.add(Double.parseDouble("0.0"));
		
		for (int i=0; i<21; i++) {
			
			paymentTypes.add(new PaymentType(paymentTypeNames.get(i),paymentPrices.get(i)));
		}
		
		return paymentTypes;
		
	}

}
