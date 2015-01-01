package edu.pjwstk.kor.model;
import java.util.Date;
import java.util.ArrayList;

public class Shipment {

	private Packagement pckg;
	private Payment pymnt;
	private Employee emplyReceiving;
	private Employee emplyDelivering;
	private Sender sndr;
	private Receiver rcvr;
	
	private Date sendDate;
	private Date deliveredDate;
	private Boolean isDelivered;
	private Boolean isLost;
	private Boolean isComplaint;
	
	private ArrayList<Status> statusList;

	public Shipment(Packagement pckg, Payment pymnt, Employee emplyReceiving,
			Employee emplyDelivering, Sender sndr, Receiver rcvr,
			Date sendDate, Date deliveredDate, Boolean isDelivered,
			Boolean isLost, Boolean isComplaint, ArrayList<Status> statusList) {
		super();
		this.pckg = pckg;
		this.pymnt = pymnt;
		this.emplyReceiving = emplyReceiving;
		this.emplyDelivering = emplyDelivering;
		this.sndr = sndr;
		this.rcvr = rcvr;
		this.sendDate = sendDate;
		this.deliveredDate = deliveredDate;
		this.isDelivered = isDelivered;
		this.isLost = isLost;
		this.isComplaint = isComplaint;
		this.statusList = statusList;
	}

	public Packagement getPckg() {
		return pckg;
	}

	public void setPckg(Packagement pckg) {
		this.pckg = pckg;
	}

	public Payment getPymnt() {
		return pymnt;
	}

	public void setPymnt(Payment pymnt) {
		this.pymnt = pymnt;
	}

	public Employee getEmplyReceiving() {
		return emplyReceiving;
	}

	public void setEmplyReceiving(Employee emplyReceiving) {
		this.emplyReceiving = emplyReceiving;
	}

	public Employee getEmplyDelivering() {
		return emplyDelivering;
	}

	public void setEmplyDelivering(Employee emplyDelivering) {
		this.emplyDelivering = emplyDelivering;
	}

	public Sender getSndr() {
		return sndr;
	}

	public void setSndr(Sender sndr) {
		this.sndr = sndr;
	}

	public Receiver getRcvr() {
		return rcvr;
	}

	public void setRcvr(Receiver rcvr) {
		this.rcvr = rcvr;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public Date getDeliveredDate() {
		return deliveredDate;
	}

	public void setDeliveredDate(Date deliveredDate) {
		this.deliveredDate = deliveredDate;
	}

	public Boolean getIsDelivered() {
		return isDelivered;
	}

	public void setIsDelivered(Boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

	public Boolean getIsLost() {
		return isLost;
	}

	public void setIsLost(Boolean isLost) {
		this.isLost = isLost;
	}

	public Boolean getIsComplaint() {
		return isComplaint;
	}

	public void setIsComplaint(Boolean isComplaint) {
		this.isComplaint = isComplaint;
	}

	public ArrayList<Status> getStatusList() {
		return statusList;
	}

	public void setStatusList(ArrayList<Status> statusList) {
		this.statusList = statusList;
	}

	@Override
	public String toString() {
		return "Shipment [pckg=" + pckg + ", pymnt=" + pymnt
				+ ", emplyReceiving=" + emplyReceiving + ", emplyDelivering="
				+ emplyDelivering + ", sndr=" + sndr + ", rcvr=" + rcvr
				+ ", sendDate=" + sendDate + ", deliveredDate=" + deliveredDate
				+ ", isDelivered=" + isDelivered + ", isLost=" + isLost
				+ ", isComplaint=" + isComplaint 
				//+ ", statusList=" + statusList
				 + "]" + "\n" ;
	}
	
	
}
