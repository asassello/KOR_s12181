package edu.pjwstk.kor.model;
import java.util.Date;

public class Status {

	private String statusName;
	private Date statusDateSet;
	
	public Status(String statusName, Date statusDateSet) {
		super();
		this.statusName = statusName;
		this.statusDateSet = statusDateSet;
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

	@Override
	public String toString() {
		return "Status [statusName=" + statusName + ", statusDateSet="
				+ statusDateSet + "]";
	}
	
	
}
