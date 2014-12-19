package edu.pjwstk.kor.model.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import edu.pjwstk.kor.model.Shipment;
import edu.pjwstk.kor.model.Status;

public class RandomStatuse {

	
	public static ArrayList<Status> getStatuses(){
		
		ArrayList<Status> statuses = new ArrayList<Status>();
		
		List<String> statusNames = new ArrayList<String>();
		statusNames.add("Przyjêta");
		statusNames.add("W drodze do sortowni");
		statusNames.add("W sortowni");
		statusNames.add("W drodze do klienta");
		statusNames.add("Dostarczona");
		statusNames.add("Niedostarczona - czeka w punkcie odbioru");
		
		ArrayList<Shipment> shipmentByStatusList = new ArrayList<Shipment>();
		
		for (int i=0; i<6; i++) {
			Random rnd = new Random();
			int idx1 = rnd.nextInt(statusNames.size());
			statuses.add(new Status(statusNames.get(idx1),shipmentByStatusList));
		}
		
		return statuses;
	}
}
