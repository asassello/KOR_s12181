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
import java.util.Random;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.Configuration;
import com.db4o.config.ObjectClass;
import com.db4o.ext.ExtObjectContainer;

import edu.pjwstk.kor.model.Address;
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
	private ArrayList<Status> statuses;
	
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
		
		//kolejnoœæ istotna
		adresses = RandomAdress.getAdresses();
		persons = RandomPerson.getPersons(adresses);
		employees = RandomEmployee.getEmployees(persons);
		paymentTypes = RandomPaymentType.getPaymentTypes();
		packages = RandomPackage.getPackages(paymentTypes);
		receivers = RandomReceiver.getReceivers(persons,adresses);
		senders = RandomSender.getSenders(persons);
		statuses = RandomStatuse.getStatuses(); //uwaga! statusy maj¹ niezainicjalizowan¹ listê przesy³ek
		payments = RandomPayment.getPayments(paymentTypes);
		
		shimpents = RandomShipment.getShipments(packages,payments,employees,employees,senders,receivers,statuses);
		
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
	public static <T> T random(List<T> col) {
		int randomIndex = (int)(Math.random()*col.size());
		return col.get(randomIndex);
	}
	public static String randomZip() {
        int r = (int)(Math.random() * 100000);
        DecimalFormat df = new DecimalFormat("00000");
        StringBuilder sb = new StringBuilder(df.format(r));
        sb.insert(2, "-");
        return sb.toString();
	}
	public static int randomInt(int min, int max) {
		return (int)(Math.random() * (max-min+1)) + min;
	}
	public static Date randomDate() {
		return randomDate(1900, 2000);
	}
	public static Date randomDate(int minYear, int maxYear) {
		int year = randomInt(minYear, maxYear);
        int month = randomInt(0, 11);

        GregorianCalendar gc = new GregorianCalendar(year, month, 1);

        int day = randomInt(1, gc.getActualMaximum(gc.DAY_OF_MONTH));

        gc.set(year, month, day);

        return gc.getTime();
	}
	public static boolean randomBoolean() {
		int r = (int)(Math.random() * 2);
		return r > 0 ? true : false;		
	}
}
