package edu.pjwstk.kor.model.data;

import java.io.File;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.Configuration;
import com.db4o.config.ObjectClass;
import com.db4o.ext.ExtObjectContainer;

import edu.pjwstk.kor.model.Adress;
import edu.pjwstk.kor.model.Employee;
import edu.pjwstk.kor.model.Package;
import edu.pjwstk.kor.model.Payment;
import edu.pjwstk.kor.model.PaymentType;
import edu.pjwstk.kor.model.Person;
import edu.pjwstk.kor.model.Receiver;
import edu.pjwstk.kor.model.Sender;
import edu.pjwstk.kor.model.Shipment;
import edu.pjwstk.kor.model.Status;

public class DataGenerator {

	public static final String DB_FILENAME = "korData.db";
	private ObjectContainer dbConn;
	
	private List<Adress> adresses;
	private List<Employee> employees;
	private List<Package> packages;
	private List<Payment> payments;
	private List<PaymentType> paymentTypes;
	private List<Person> persons;
	private List<Receiver> receivers;
	private List<Sender> senders;
	private List<Shipment> shimpents;
	private List<Status> statuses;
	
	public static void main(String[] args) {
		DataGenerator exampleData = new DataGenerator();
		System.out.println(exampleData.adresses);
		System.out.println(exampleData.employees);
		System.out.println(exampleData.packages);
		System.out.println(exampleData.payments);
		System.out.println(exampleData.paymentTypes);
		System.out.println(exampleData.persons);
		System.out.println(exampleData.receivers);
		System.out.println(exampleData.senders);
		System.out.println(exampleData.shimpents);
		System.out.println(exampleData.statuses);
	}

	public DataGenerator() {
		initData();
		saveData();
	}
	private void initData() {
		
	}
	private void saveData() {
		
	}
	
	
    public List<Adress> getAdresses() {
		return adresses;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public List<Package> getPackages() {
		return packages;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public List<PaymentType> getPaymentTypes() {
		return paymentTypes;
	}
	public List<Person> getPersons() {
		return persons;
	}
	public List<Receiver> getReceivers() {
		return receivers;
	}
	public List<Sender> getSenders() {
		return senders;
	}
	public List<Shipment> getShimpents() {
		return shimpents;
	}
	public List<Status> getStatuses() {
		return statuses;
	}


	public ObjectContainer getConnection() {
    	if(dbConn == null) {
    		File dbFile = new File(DB_FILENAME);
    		dbFile.delete();
    		dbConn = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DB_FILENAME);
    	}
    	return dbConn;
    }
}
