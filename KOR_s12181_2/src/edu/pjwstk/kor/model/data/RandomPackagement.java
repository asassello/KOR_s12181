package edu.pjwstk.kor.model.data;

import java.util.ArrayList;
import java.util.List;

import edu.pjwstk.kor.model.PaymentType;
import edu.pjwstk.kor.model.Packagement;


public class RandomPackagement {

	public static ArrayList<Packagement> getPackages(List<PaymentType> paymentTypes) {
		
		ArrayList<Packagement> packageTypes = new ArrayList<Packagement>();
		
		List<String> sizeTypes = new ArrayList<String>();
		sizeTypes.add("Paczka lekka");
		sizeTypes.add("Paczka œrednia");
		sizeTypes.add("Paczka ciê¿ka");
		sizeTypes.add("Paczka max");
		sizeTypes.add("List lekki");
		sizeTypes.add("List œredni");
		sizeTypes.add("List ciê¿ki");
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
		
		List<Double> weight = new ArrayList<Double>();
		weight.add(Double.parseDouble("2.50"));
		weight.add(Double.parseDouble("10.00"));
		weight.add(Double.parseDouble("25.00"));
		weight.add(Double.parseDouble("100.00"));
		weight.add(Double.parseDouble("0.15"));
		weight.add(Double.parseDouble("0.35"));
		weight.add(Double.parseDouble("0.99"));
		weight.add(Double.parseDouble("1.99"));
		
		List<PaymentType> packagePaymentTypes = getPackagePaymentTypes(paymentTypes);
		
		for (int i=0; i<8; i++) {
			
			packageTypes.add(new Packagement(weightLessThan.get(i), sizeTypes.get(i), packagePaymentTypes.get(i), weight.get(i)));
		}
		
		return packageTypes;
		
	}
	
	private static List<PaymentType> getPackagePaymentTypes (List<PaymentType> paymentTypes){
		
		List<PaymentType> tmpPaymentTypes = new ArrayList<PaymentType>();
		
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Opakowanie ma³e")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Opakowanie œrednie")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Opakowanie du¿e")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Opakowanie max")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Koperta ma³a")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Koperta œrednia")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Koperta du¿a")) {tmpPaymentTypes.add(singlePaymentType);}
		for(PaymentType singlePaymentType: paymentTypes) if(singlePaymentType.getPaymentTypeName().equals("Koperta max")) {tmpPaymentTypes.add(singlePaymentType);}
		
		return tmpPaymentTypes;
	}
}
