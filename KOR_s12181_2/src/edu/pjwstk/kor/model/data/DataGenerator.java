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

import edu.pjwstk.kor.model.Packagement;
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
	private List<Packagement> packages;
	private List<Payment> payments;
	private List<PaymentType> paymentTypes;
	private List<Person> persons;
	private List<Receiver> receivers;
	private List<Sender> senders;
	private List<Shipment> shipments;
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
		System.out.println(exampleData.shipments);
		System.out.println(exampleData.statuses);
	
		exampleData.shipments.get(0).getStatusList().size();
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
		packages = RandomPackagement.getPackages(paymentTypes);
		receivers = RandomReceiver.getReceivers(persons,adresses);
		senders = RandomSender.getSenders(persons);
		statuses = RandomStatuse.getStatuses(); //uwaga! statusy maj¹ niezainicjalizowan¹ listê przesy³ek
		payments = RandomPayment.getPayments(paymentTypes);
		
		shipments = RandomShipment.getShipments(packages,payments,employees,employees,senders,receivers,statuses);
		
	}
	private void saveData() {
		//config
		ExtObjectContainer con = getConnection().ext();
    	Configuration config = con.configure();
    	{
	    	ObjectClass objectClass = config.objectClass(Adress.class);
			//objectClass.objectField("city").indexed(true);
    	}
    	{
	    	ObjectClass objectClass = config.objectClass(Employee.class);
			//objectClass.objectField("position").indexed(true);
    	}
    	{
	    	ObjectClass objectClass = config.objectClass(Packagement.class);
			//objectClass.objectField("sizeType").indexed(true);
    	}
    	{
	    	ObjectClass objectClass = config.objectClass(PaymentType.class);
			//objectClass.objectField("paymentTypeName").indexed(true);
    	}

    	{
	    	ObjectClass objectClass = config.objectClass(Person.class);
			//objectClass.objectField("surname").indexed(true);
    	}
    	{
	    	ObjectClass objectClass = config.objectClass(Receiver.class);
    	}
    	{
	    	ObjectClass objectClass = config.objectClass(Sender.class);
			//objectClass.objectField("senderType").indexed(true);
    	}
    	{
	    	ObjectClass objectClass = config.objectClass(Shipment.class);
			//objectClass.objectField("sendDate").indexed(true);
    	}
    	{
	    	ObjectClass objectClass = config.objectClass(Status.class);
			//objectClass.objectField("statusName").indexed(true);
    	}
    	
    	//add
    	ObjectSet<Adress> adress = con.query(Adress.class);
    	if(adress.isEmpty()) {
    		for(Adress c : this.adresses) {
    			con.store(c);
    		}
    	}
    	ObjectSet<Employee> employee = con.query(Employee.class);
    	if(employee.isEmpty()) {
    		for(Employee f : this.employees) {
    			con.store(f);
    		}
    	}
    	ObjectSet<Packagement> packagess = con.query(Packagement.class);
    	if(packagess.isEmpty()) {
    		for(Packagement p : this.packages) {
    			con.store(p);
    		}
    	}
    	ObjectSet<Payment> payment = con.query(Payment.class);
    	if(payment.isEmpty()) {
    		for(Payment r : this.payments) {
    			con.store(r);
    		}
    	}
    	ObjectSet<PaymentType> paymentType = con.query(PaymentType.class);
    	if(paymentType.isEmpty()) {
    		for(PaymentType r : this.paymentTypes) {
    			con.store(r);
    		}
    	}
    	ObjectSet<Person> person = con.query(Person.class);
    	if(person.isEmpty()) {
    		for(Person r : this.persons) {
    			con.store(r);
    		}
    	}
    	ObjectSet<Receiver> receiver = con.query(Receiver.class);
    	if(receiver.isEmpty()) {
    		for(Person r : this.receivers) {
    			con.store(r);
    		}
    	}
    	ObjectSet<Sender> sender = con.query(Sender.class);
    	if(sender.isEmpty()) {
    		for(Sender r : this.senders) {
    			con.store(r);
    		}
    	}
    	ObjectSet<Shipment> shipment = con.query(Shipment.class);
    	if(shipment.isEmpty()) {
    		for(Shipment r : this.shipments) {
    			con.store(r);
    		}
    	}
    	ObjectSet<Status> status = con.query(Status.class);
    	if(status.isEmpty()) {
    		for(Status r : this.statuses) {
    			con.store(r);
    		}
    	}
    	
    	con.commit();		
	}
	
	
    public List<Adress> getAdresses() {
		return adresses;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public List<Packagement> getPackages() {
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
		return shipments;
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
	
	public static Date randomDatePresent() {
		return randomDate(2010, 2014);
	}
	
	public static Date randomDateDelivery() {
		return randomDate(2014, 2014);
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
