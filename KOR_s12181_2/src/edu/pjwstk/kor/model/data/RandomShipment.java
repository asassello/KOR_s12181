package edu.pjwstk.kor.model.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Random;

import org.joda.time.DateTime;
import org.joda.time.Days;

import edu.pjwstk.kor.model.Employee;
import edu.pjwstk.kor.model.Packagement;
import edu.pjwstk.kor.model.Payment;
import edu.pjwstk.kor.model.Receiver;
import edu.pjwstk.kor.model.Sender;
import edu.pjwstk.kor.model.Shipment;
import edu.pjwstk.kor.model.Status;

public class RandomShipment {

	public static ArrayList<Shipment> getShipments(List<Packagement> pckg, List<Payment> pymnt, List<Employee> emplyReceiving,
			List<Employee> emplyDelivering, List<Sender> sndr, List<Receiver> rcvr, List<Status> statusList){
		
		List<Date> sendDate = new ArrayList<Date>();
		for (int i=0; i<100; i++) {
			sendDate.add(DataGenerator.randomDateDelivery());
		}
		
		List<Date> deliveredDate = new ArrayList<Date>();
		for (int i=0; i<100; i++) {
			deliveredDate.add(DataGenerator.randomDateDelivery());
		}
		
		List<Boolean> isDelivered = new ArrayList<Boolean>();
		isDelivered.add(new Boolean(true));
		isDelivered.add(new Boolean(false));
		
		List<Boolean> isLost = new ArrayList<Boolean>();
		isLost.add(new Boolean(true));
		isLost.add(new Boolean(false));
		
		List<Boolean> isComplaint = new ArrayList<Boolean>();
		isComplaint.add(new Boolean(true));
		isComplaint.add(new Boolean(false));
		
		ArrayList<Shipment> shipments = new ArrayList<Shipment>();
		for (int i=0; i<100; i++) {
			Random rnd = new Random();
			int idx1 = rnd.nextInt(pckg.size());
			int idx2 = rnd.nextInt(pymnt.size());
			int idx3 = rnd.nextInt(emplyReceiving.size());
			int idx4 = rnd.nextInt(emplyDelivering.size());
			int idx5 = rnd.nextInt(sndr.size());
			int idx6 = rnd.nextInt(rcvr.size());
			
			int idx7 = rnd.nextInt(statusList.size()+1); //aby nie pomin�� ostatniego statusu
			ArrayList<Status> tmpstatusList = new ArrayList<Status>();
			if(idx7 == 0) tmpstatusList.add(statusList.get(0));
			else
			for (int j=0; j<idx7; j++){
				tmpstatusList.add(statusList.get(j));
			}
			int idx8 = rnd.nextInt(sendDate.size());
			int idx9 = rnd.nextInt(deliveredDate.size());
			int idx10 = rnd.nextInt(isDelivered.size()); 
			int idx11; if(idx10 == 0 && i%4 ==0) idx11 = 1; else idx11 = 0;
			int idx12 = 1;
			if(i%4 ==0) {idx12 = rnd.nextInt(isComplaint.size());}
			else {idx12 = 1;}
			
			Integer chck = Days.daysBetween(new DateTime(sendDate.get(idx8)),new DateTime(deliveredDate.get(idx9))).getDays(); //je�li data dostarczenia wczesniejsza ni� data wys�ania
			if(chck < 0 ) { 
				Date tmpExDate = sendDate.get(idx8); 
				sendDate.set(idx8, deliveredDate.get(idx9)); 
				deliveredDate.set(idx9, tmpExDate);
				}
			
			shipments.add(new Shipment(pckg.get(idx1),pymnt.get(idx2),emplyReceiving.get(idx3),emplyDelivering.get(idx4),sndr.get(idx5),rcvr.get(idx6),
					sendDate.get(idx8), deliveredDate.get(idx9), isDelivered.get(idx10), isLost.get(idx11), isComplaint.get(idx12),
					tmpstatusList));
			
			for (int j=0; j<idx7; j++){
				tmpstatusList.get(j).addShipmentByStatusList(shipments.get(i));
			}
			
		}
		
		
		
		return shipments;
		
	}
}
