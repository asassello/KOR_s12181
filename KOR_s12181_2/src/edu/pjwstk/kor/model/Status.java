package edu.pjwstk.kor.model;
import java.util.ArrayList;
import java.util.Date;

public class Status {

	private String statusName;
	private Date statusDateSet;
	
	private ArrayList<Shipment> shipmentByStatusList;

	public Status(String statusName, Date statusDateSet,
			ArrayList<Shipment> shipmentByStatusList) {
		super();
		this.statusName = statusName;
		this.statusDateSet = statusDateSet;
		this.shipmentByStatusList = shipmentByStatusList;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public Date getStatusDateSet() {
		return statusDateSet;
	}

	public void setStatusDateSet(Date statusDateSet) {
		this.statusDateSet = statusDateSet;
	}

	public ArrayList<Shipment> getShipmentByStatusList() {
		return shipmentByStatusList;
	}

	public void setShipmentByStatusList(ArrayList<Shipment> shipmentByStatusList) {
		this.shipmentByStatusList = shipmentByStatusList;
	}

	@Override
	public String toString() {
		return "Status [statusName=" + statusName + ", statusDateSet="
				+ statusDateSet + ", shipmentByStatusList="
				+ shipmentByStatusList + "]";
	}
	
	
	
	
}
