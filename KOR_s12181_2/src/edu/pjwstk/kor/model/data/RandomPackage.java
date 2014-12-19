package edu.pjwstk.kor.model.data;

import java.util.ArrayList;
import java.util.List;

import edu.pjwstk.kor.model.PaymentType;
import edu.pjwstk.kor.model.Package;


public class RandomPackage {

	public static ArrayList<Package> getPackages(List<PaymentType> paymentTypes) {
		
		ArrayList<Package> packageTypes = new ArrayList<Package>();
		
		List<String> sizeTypes = new ArrayList<String>();
		sizeTypes.add("Paczka lekka");
		sizeTypes.add("Paczka �rednia");
		sizeTypes.add("Paczka ci�ka");
		sizeTypes.add("Paczka max");
		sizeTypes.add("List lekki");
		sizeTypes.add("List �redni");
		sizeTypes.add("List ci�ki");
		sizeTypes.add("List max");
		
		List<Float> weightLessThan = new ArrayList<Float>();
		weightLessThan.add(Float.parseFloat("2.50"));
		weightLessThan.add(Float.parseFloat("10.00"));
		weightLessThan.add(Float.parseFloat("25.00"));
		weightLessThan.add(Float.parseFloat("100.00"));
		weightLessThan.add(Float.parseFloat("0.15"));
		weightLessThan.add(Float.parseFloat("0.35"));
		weightLessThan.add(Float.parseFloat("0.99"));
		weightLessThan.add(Float.parseFloat("1.99"));
		
		List<PaymentType> packagePaymentTypes = getPackagePaymentTypes(paymentTypes);
		
		for (int i=0; i<8; i++) {
			
			packageTypes.add(new Package(weightLessThan.get(i), sizeTypes.get(i), packagePaymentTypes.get(i)));
		}
		
		return packageTypes;
		
	}
	
	private static List<PaymentType> getPackagePaymentTypes (List<PaymentType> paymentTypes){
		
		List<PaymentType> tmpPaymentTypes = new ArrayList<PaymentType>();
		
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Opakowanie ma�e")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Opakowanie �rednie")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Opakowanie du�e")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Opakowanie max")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Koperta ma�a")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Koperta �rednia")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Koperta du�a")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Koperta max")) {tmpPaymentTypes.add(singlePaymentType);}
		
		return tmpPaymentTypes;
	}
}
