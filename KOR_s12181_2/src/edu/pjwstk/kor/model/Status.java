package edu.pjwstk.kor.model;
import java.util.ArrayList;
import java.util.Date;

public class Status {

	private String statusName;
	
	private ArrayList<Shipment> shipmentByStatusList;

	public Status(String statusName, 
			ArrayList<Shipment> shipmentByStatusList) {
		super();
		this.statusName = statusName;
		this.shipmentByStatusList = shipmentByStatusList;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public ArrayList<Shipment> getShipmentByStatusList() {
		return shipmentByStatusList;
	}

	public void setShipmentByStatusList(ArrayList<Shipment> shipmentByStatusList) {
		this.shipmentByStatusList = shipmentByStatusList;
	}

	@Override
	public String toString() {
		return "Status [statusName=" + statusName + ", shipmentByStatusList="
				+ shipmentByStatusList + "]";
	}
	
	
	
	
}
