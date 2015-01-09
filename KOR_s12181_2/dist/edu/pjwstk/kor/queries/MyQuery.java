package edu.pjwstk.kor.queries;

import java.util.*;
import com.db4o.ObjectContainer;
import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.data.*;
import java.sql.Struct;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyQuery {
    public static DataGenerator data;
    public static ObjectContainer dataBase;
    
    public static void main(String[] args) {
        try {
            MyQuery mainOb = new MyQuery();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    public void polacz() {
        this.dataBase = data.getConnection();
    }
    
    public void rozlacz() {
        this.dataBase.close();
    }
    
    public MyQuery() {
        super();
        data = new DataGenerator();
        dataBase = data.getConnection();
    }
    
    public void query15() {
        Double avgWeight = new MyQuery_SbqlQuery0(dataBase).executeQuery();
        System.out.println(avgWeight);
    }
    
    public void query14() {
        Integer countComplained = new MyQuery_SbqlQuery1(dataBase).executeQuery();
        System.out.println(countComplained);
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> complainedShipment = new MyQuery_SbqlQuery2(dataBase).executeQuery();
        System.out.println(complainedShipment);
    }
    
    public void query13() {
        Integer tmpEmpByPckg = new MyQuery_SbqlQuery3(dataBase).executeQuery();
        Integer nonTmpEmpByPckg = new MyQuery_SbqlQuery4(dataBase).executeQuery();
        System.out.println(tmpEmpByPckg);
        System.out.println(nonTmpEmpByPckg);
    }
    
    public void query12() {
        Collection<Receiver> rcvrsWithSecAdress = new MyQuery_SbqlQuery5(dataBase).executeQuery();
        System.out.println(rcvrsWithSecAdress);
    }
    
    public void query11() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> empsWithDelayedPckgs = new MyQuery_SbqlQuery6(dataBase).executeQuery();
        System.out.println(empsWithDelayedPckgs);
    }
    
    public void query10() {
        Double dealyedPymnts = new MyQuery_SbqlQuery7(dataBase).executeQuery();
        System.out.println(dealyedPymnts);
    }
    
    public void query09() {
        Double avgShpmnt = new MyQuery_SbqlQuery8(dataBase).executeQuery();
        Double avgPckgmnt = new MyQuery_SbqlQuery9(dataBase).executeQuery();
        System.out.println(avgShpmnt);
        System.out.println(avgPckgmnt);
    }
    
    public void query08() {
        Collection<String> citiesByNumberOfReceivers = new MyQuery_SbqlQuery10(dataBase).executeQuery();
        System.out.println(citiesByNumberOfReceivers);
    }
    
    public void query07(Integer param) {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> emplWithSalaryOver = new MyQuery_SbqlQuery11(dataBase,param).executeQuery();
        System.out.println(emplWithSalaryOver);
    }
    
    public void query06() {
        Double avgNumberOfPackagesPerSender = new MyQuery_SbqlQuery12(dataBase).executeQuery();
        System.out.println(avgNumberOfPackagesPerSender);
    }
    
    public void query05(Date param) {
        Double pymntSumsFromDate2 = new MyQuery_SbqlQuery13(dataBase,param).executeQuery();
        System.out.println(pymntSumsFromDate2);
    }
    
    public void query04() {
        Integer statusPrzyjeta = new MyQuery_SbqlQuery14(dataBase).executeQuery();
        Integer statusWDrodzeDoSortowni = new MyQuery_SbqlQuery15(dataBase).executeQuery();
        Integer statusWSortowni = new MyQuery_SbqlQuery16(dataBase).executeQuery();
        Integer statusWDrodzeDoKlienta = new MyQuery_SbqlQuery17(dataBase).executeQuery();
        Integer statusDostarczona = new MyQuery_SbqlQuery18(dataBase).executeQuery();
        Integer statusNiedostarczonaCzekaWPunkcie = new MyQuery_SbqlQuery19(dataBase).executeQuery();
        Map<String, Integer> query04yMap = new HashMap<String, Integer>();
        query04yMap.put("statusPrzyjeta", statusPrzyjeta);
        query04yMap.put("statusWDrodzeDoSortowni", statusWDrodzeDoSortowni);
        query04yMap.put("statusWSortowni", statusWSortowni);
        query04yMap.put("statusWDrodzeDoKlienta", statusWDrodzeDoKlienta);
        query04yMap.put("statusDostarczona", statusDostarczona);
        query04yMap.put("statusNiedostarczonaCzekaWPunkcie", statusNiedostarczonaCzekaWPunkcie);
        System.out.println(query04yMap);
    }
    
    public void query03() {
        Double avgDaysOfDelivery = new MyQuery_SbqlQuery20(dataBase).executeQuery();
        Double minDaysOfDelivery = new MyQuery_SbqlQuery21(dataBase).executeQuery();
        Double maxDaysOfDelivery = new MyQuery_SbqlQuery22(dataBase).executeQuery();
        Map<String, Double> query03yMap = new HashMap<String, Double>();
        query03yMap.put("avgDaysOfDelivery", avgDaysOfDelivery);
        query03yMap.put("minDaysOfDelivery", minDaysOfDelivery);
        query03yMap.put("maxDaysOfDelivery", maxDaysOfDelivery);
        System.out.println(query03yMap);
    }
    
    public void query02() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> lostPckgsWithSendrAndAdress = new MyQuery_SbqlQuery23(dataBase).executeQuery();
        System.out.println(lostPckgsWithSendrAndAdress);
    }
    
    public void query01() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> employeesBySupervisor = new MyQuery_SbqlQuery24(dataBase).executeQuery();
        System.out.println(employeesBySupervisor);
    }
    
    public Map<String, Double> _query15() {
        Double avgPckgWeight = new MyQuery_SbqlQuery25(dataBase).executeQuery();
        Map<String, Double> query15yMap = new HashMap<String, Double>();
        query15yMap.put("avgPckgWeight", avgPckgWeight);
        return query15yMap;
    }
    
    public Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _query14() {
        Integer countComplained = new MyQuery_SbqlQuery26(dataBase).executeQuery();
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> complainedShipment = new MyQuery_SbqlQuery27(dataBase).executeQuery();
        return complainedShipment;
    }
    
    public Map<String, Integer> _query13() {
        Integer tmpEmpByPckg = new MyQuery_SbqlQuery28(dataBase).executeQuery();
        Integer nonTmpEmpByPckg = new MyQuery_SbqlQuery29(dataBase).executeQuery();
        Map<String, Integer> query13yMap = new HashMap<String, Integer>();
        query13yMap.put("tmpEmpByPckg", tmpEmpByPckg);
        query13yMap.put("nonTmpEmpByPckg", nonTmpEmpByPckg);
        return query13yMap;
    }
    
    public Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _query12() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> rcvrsWithSecAdress = new MyQuery_SbqlQuery30(dataBase).executeQuery();
        return rcvrsWithSecAdress;
    }
    
    public Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _query11() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> empsWithDelayedPckgs = new MyQuery_SbqlQuery31(dataBase).executeQuery();
        return empsWithDelayedPckgs;
    }
    
    public Map<String, Double> _query10() {
        Double nmbrDealyedPymnts = new MyQuery_SbqlQuery32(dataBase).executeQuery();
        Map<String, Double> query10yMap = new HashMap<String, Double>();
        query10yMap.put("nmbrDealyedPymnts", nmbrDealyedPymnts);
        return query10yMap;
    }
    
    public Map<String, Double> _query09() {
        Double avgShpmnt = new MyQuery_SbqlQuery33(dataBase).executeQuery();
        Double avgPckgmnt = new MyQuery_SbqlQuery34(dataBase).executeQuery();
        Map<String, Double> query09yMap = new HashMap<String, Double>();
        query09yMap.put("avgShpmnt", avgShpmnt);
        query09yMap.put("avgPckgmnt", avgPckgmnt);
        return query09yMap;
    }
    
    public Map<String, Integer> _query08() {
        Integer warszawa = new MyQuery_SbqlQuery35(dataBase).executeQuery();
        Integer lodz = new MyQuery_SbqlQuery36(dataBase).executeQuery();
        Integer poznan = new MyQuery_SbqlQuery37(dataBase).executeQuery();
        Integer wroclaw = new MyQuery_SbqlQuery38(dataBase).executeQuery();
        Integer krakow = new MyQuery_SbqlQuery39(dataBase).executeQuery();
        Integer gdansk = new MyQuery_SbqlQuery40(dataBase).executeQuery();
        Integer szczecin = new MyQuery_SbqlQuery41(dataBase).executeQuery();
        Integer rzeszow = new MyQuery_SbqlQuery42(dataBase).executeQuery();
        Integer katowice = new MyQuery_SbqlQuery43(dataBase).executeQuery();
        System.out.println(katowice);
        System.out.println(krakow);
        System.out.println(lodz);
        System.out.println(poznan);
        System.out.println(rzeszow);
        System.out.println(szczecin);
        System.out.println(warszawa);
        System.out.println(wroclaw);
        Map<String, Integer> query08yMap = new HashMap<String, Integer>();
        query08yMap.put("Gdansk", gdansk);
        query08yMap.put("Katowice", katowice);
        query08yMap.put("Krakow", krakow);
        query08yMap.put("Lodz", lodz);
        query08yMap.put("Poznan", poznan);
        query08yMap.put("Rzeszow", rzeszow);
        query08yMap.put("Szczecin", szczecin);
        query08yMap.put("Warszawa", warszawa);
        query08yMap.put("Wroclaw", wroclaw);
        return query08yMap;
    }
    
    public Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _query07(Integer param) {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> emplWithSalaryOver = new MyQuery_SbqlQuery44(dataBase,param).executeQuery();
        return emplWithSalaryOver;
    }
    
    public Map<String, Double> _query06() {
        Double avgNumberOfPackagesPerSender = new MyQuery_SbqlQuery45(dataBase).executeQuery();
        Map<String, Double> query06yMap = new HashMap<String, Double>();
        query06yMap.put("avgNumberOfPackagesPerSender", avgNumberOfPackagesPerSender);
        return query06yMap;
    }
    
    public Map<String, Double> _query05(Date param) {
        Double pymntSumsFromDate2 = new MyQuery_SbqlQuery46(dataBase,param).executeQuery();
        Map<String, Double> query05yMap = new HashMap<String, Double>();
        query05yMap.put("pymntSumsFromDate", pymntSumsFromDate2);
        return query05yMap;
    }
    
    public Map<String, Integer> _query04() {
        Integer statusPrzyjeta = new MyQuery_SbqlQuery47(dataBase).executeQuery();
        Integer statusWDrodzeDoSortowni = new MyQuery_SbqlQuery48(dataBase).executeQuery();
        Integer statusWSortowni = new MyQuery_SbqlQuery49(dataBase).executeQuery();
        Integer statusWDrodzeDoKlienta = new MyQuery_SbqlQuery50(dataBase).executeQuery();
        Integer statusDostarczona = new MyQuery_SbqlQuery51(dataBase).executeQuery();
        Integer statusNiedostarczonaCzekaWPunkcie = new MyQuery_SbqlQuery52(dataBase).executeQuery();
        Map<String, Integer> query04yMap = new HashMap<String, Integer>();
        query04yMap.put("statusPrzyjeta", statusPrzyjeta);
        query04yMap.put("statusWDrodzeDoSortowni", statusWDrodzeDoSortowni);
        query04yMap.put("statusWSortowni", statusWSortowni);
        query04yMap.put("statusWDrodzeDoKlienta", statusWDrodzeDoKlienta);
        query04yMap.put("statusDostarczona", statusDostarczona);
        query04yMap.put("statusNiedostarczonaCzekaWPunkcie", statusNiedostarczonaCzekaWPunkcie);
        return query04yMap;
    }
    
    public Map<String, Double> _query03() {
        Double avgDaysOfDelivery = new MyQuery_SbqlQuery53(dataBase).executeQuery();
        Double minDaysOfDelivery = new MyQuery_SbqlQuery54(dataBase).executeQuery();
        Double maxDaysOfDelivery = new MyQuery_SbqlQuery55(dataBase).executeQuery();
        Map<String, Double> query03yMap = new HashMap<String, Double>();
        query03yMap.put("avgDaysOfDelivery", avgDaysOfDelivery);
        query03yMap.put("minDaysOfDelivery", minDaysOfDelivery);
        query03yMap.put("maxDaysOfDelivery", maxDaysOfDelivery);
        return query03yMap;
    }
    
    public Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _query02() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> lostPckgsWithSendrAndAdress = new MyQuery_SbqlQuery56(dataBase).executeQuery();
        return lostPckgsWithSendrAndAdress;
    }
    
    public List<Employee> _query01() {
        List<Employee> employeesBySupervisor = (List<Employee>)new MyQuery_SbqlQuery57(dataBase).executeQuery();
        return employeesBySupervisor;
    }
    
    public List<String> _query00() {
        List<String> allStatuses = new MyQuery_SbqlQuery58(dataBase).executeQuery();
        return allStatuses;
    }
    
    public Collection<Employee> _query0() {
        Collection<Employee> empWithMaxSalary = new MyQuery_SbqlQuery59(dataBase).executeQuery();
        return empWithMaxSalary;
    }
}