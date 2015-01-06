package edu.pjwstk.kor.queries;

import java.util.*;
import com.db4o.ObjectContainer;
import edu.pjwstk.kor.model.*;
import edu.pjwstk.kor.model.data.*;
import java.sql.Struct;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyQuery {
    private static DataGenerator data;
    private static ObjectContainer dataBase;
    
    public static void main(String[] args) {
        try {
            MyQuery mainOb = new MyQuery();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    public MyQuery() throws Exception {
        super();
        data = new DataGenerator();
        dataBase = data.getConnection();
        _query01();
        _query02();
        _query03();
        _query04();
        _query15();
        _query14();
        _query13();
        _query12();
        _query11();
        _query10();
        _query09();
        _query08();
        _query07(5000);
        _query06();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date_param = format.parse("2010-10-31");
        _query05(date_param);
        _query04();
        _query03();
        _query02();
        _query01();
        System.out.println("Koniec");
        dataBase.close();
    }
    
    public void query21() {
        Collection<String> avgWeight = new MyQuery_SbqlQuery0(dataBase).executeQuery();
        System.out.println(avgWeight);
    }
    
    public void query22() {
        Collection<Packagement> avgWeight = new MyQuery_SbqlQuery1(dataBase).executeQuery();
        System.out.println(avgWeight);
    }
    
    public void query23() {
        Collection<Double> avgWeight = new MyQuery_SbqlQuery2(dataBase).executeQuery();
        System.out.println(avgWeight);
    }
    
    public void query24() {
        Double avgWeight = new MyQuery_SbqlQuery3(dataBase).executeQuery();
        System.out.println(avgWeight);
    }
    
    public void query15() {
        Double avgWeight = new MyQuery_SbqlQuery4(dataBase).executeQuery();
        System.out.println(avgWeight);
    }
    
    public void query14() {
        Integer countComplained = new MyQuery_SbqlQuery5(dataBase).executeQuery();
        System.out.println(countComplained);
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> complainedShipment = new MyQuery_SbqlQuery6(dataBase).executeQuery();
        System.out.println(complainedShipment);
    }
    
    public void query13() {
        Integer tmpEmpByPckg = new MyQuery_SbqlQuery7(dataBase).executeQuery();
        Integer nonTmpEmpByPckg = new MyQuery_SbqlQuery8(dataBase).executeQuery();
        System.out.println(tmpEmpByPckg);
        System.out.println(nonTmpEmpByPckg);
    }
    
    public void query12() {
        Collection<Receiver> rcvrsWithSecAdress = new MyQuery_SbqlQuery9(dataBase).executeQuery();
        System.out.println(rcvrsWithSecAdress);
    }
    
    public void query11() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> empsWithDelayedPckgs = new MyQuery_SbqlQuery10(dataBase).executeQuery();
        System.out.println(empsWithDelayedPckgs);
    }
    
    public void query10() {
        Double dealyedPymnts = new MyQuery_SbqlQuery11(dataBase).executeQuery();
        System.out.println(dealyedPymnts);
    }
    
    public void query09() {
        Double avgShpmnt = new MyQuery_SbqlQuery12(dataBase).executeQuery();
        Double avgPckgmnt = new MyQuery_SbqlQuery13(dataBase).executeQuery();
        System.out.println(avgShpmnt);
        System.out.println(avgPckgmnt);
    }
    
    public void query08() {
        Collection<String> citiesByNumberOfReceivers = new MyQuery_SbqlQuery14(dataBase).executeQuery();
        System.out.println(citiesByNumberOfReceivers);
    }
    
    public void query07(Integer param) {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> emplWithSalaryOver = new MyQuery_SbqlQuery15(dataBase,param).executeQuery();
        System.out.println(emplWithSalaryOver);
    }
    
    public void query06() {
        Double avgNumberOfPackagesPerSender = new MyQuery_SbqlQuery16(dataBase).executeQuery();
        System.out.println(avgNumberOfPackagesPerSender);
    }
    
    public void query05(Date param) {
        Double pymntSumsFromDate2 = new MyQuery_SbqlQuery17(dataBase,param).executeQuery();
        System.out.println(pymntSumsFromDate2);
    }
    
    public void query04() {
        Integer statusPrzyjeta = new MyQuery_SbqlQuery18(dataBase).executeQuery();
        Integer statusWDrodzeDoSortowni = new MyQuery_SbqlQuery19(dataBase).executeQuery();
        Integer statusWSortowni = new MyQuery_SbqlQuery20(dataBase).executeQuery();
        Integer statusWDrodzeDoKlienta = new MyQuery_SbqlQuery21(dataBase).executeQuery();
        Integer statusDostarczona = new MyQuery_SbqlQuery22(dataBase).executeQuery();
        Integer statusNiedostarczonaCzekaWPunkcie = new MyQuery_SbqlQuery23(dataBase).executeQuery();
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
        Double avgDaysOfDelivery = new MyQuery_SbqlQuery24(dataBase).executeQuery();
        Double minDaysOfDelivery = new MyQuery_SbqlQuery25(dataBase).executeQuery();
        Double maxDaysOfDelivery = new MyQuery_SbqlQuery26(dataBase).executeQuery();
        Map<String, Double> query03yMap = new HashMap<String, Double>();
        query03yMap.put("avgDaysOfDelivery", avgDaysOfDelivery);
        query03yMap.put("minDaysOfDelivery", minDaysOfDelivery);
        query03yMap.put("maxDaysOfDelivery", maxDaysOfDelivery);
        System.out.println(query03yMap);
    }
    
    public void query02() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> lostPckgsWithSendrAndAdress = new MyQuery_SbqlQuery27(dataBase).executeQuery();
        System.out.println(lostPckgsWithSendrAndAdress);
    }
    
    public void query01() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> employeesBySupervisor = new MyQuery_SbqlQuery28(dataBase).executeQuery();
        System.out.println(employeesBySupervisor);
    }
    
    public static Double _query15() {
        Double avgWeight = new MyQuery_SbqlQuery29(dataBase).executeQuery();
        return avgWeight;
    }
    
    public static Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _query14() {
        Integer countComplained = new MyQuery_SbqlQuery30(dataBase).executeQuery();
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> complainedShipment = new MyQuery_SbqlQuery31(dataBase).executeQuery();
        return complainedShipment;
    }
    
    public static Map<String, Integer> _query13() {
        Integer tmpEmpByPckg = new MyQuery_SbqlQuery32(dataBase).executeQuery();
        Integer nonTmpEmpByPckg = new MyQuery_SbqlQuery33(dataBase).executeQuery();
        Map<String, Integer> query13yMap = new HashMap<String, Integer>();
        query13yMap.put("tmpEmpByPckg", tmpEmpByPckg);
        query13yMap.put("nonTmpEmpByPckg", nonTmpEmpByPckg);
        return query13yMap;
    }
    
    public static Collection<Receiver> _query12() {
        Collection<Receiver> rcvrsWithSecAdress = new MyQuery_SbqlQuery34(dataBase).executeQuery();
        return rcvrsWithSecAdress;
    }
    
    public static Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _query11() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> empsWithDelayedPckgs = new MyQuery_SbqlQuery35(dataBase).executeQuery();
        return empsWithDelayedPckgs;
    }
    
    public static Double _query10() {
        Double dealyedPymnts = new MyQuery_SbqlQuery36(dataBase).executeQuery();
        return dealyedPymnts;
    }
    
    public static Map<String, Double> _query09() {
        Double avgShpmnt = new MyQuery_SbqlQuery37(dataBase).executeQuery();
        Double avgPckgmnt = new MyQuery_SbqlQuery38(dataBase).executeQuery();
        Map<String, Double> query09yMap = new HashMap<String, Double>();
        query09yMap.put("avgShpmnt", avgShpmnt);
        query09yMap.put("avgPckgmnt", avgPckgmnt);
        return query09yMap;
    }
    
    public static Collection<String> _query08() {
        Collection<String> citiesByNumberOfReceivers = new MyQuery_SbqlQuery39(dataBase).executeQuery();
        return citiesByNumberOfReceivers;
    }
    
    public static Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _query07(Integer param) {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> emplWithSalaryOver = new MyQuery_SbqlQuery40(dataBase,param).executeQuery();
        return emplWithSalaryOver;
    }
    
    public static Double _query06() {
        Double avgNumberOfPackagesPerSender = new MyQuery_SbqlQuery41(dataBase).executeQuery();
        return avgNumberOfPackagesPerSender;
    }
    
    public static Double _query05(Date param) {
        Double pymntSumsFromDate2 = new MyQuery_SbqlQuery42(dataBase,param).executeQuery();
        return pymntSumsFromDate2;
    }
    
    public static Map<String, Integer> _query04() {
        Integer statusPrzyjeta = new MyQuery_SbqlQuery43(dataBase).executeQuery();
        Integer statusWDrodzeDoSortowni = new MyQuery_SbqlQuery44(dataBase).executeQuery();
        Integer statusWSortowni = new MyQuery_SbqlQuery45(dataBase).executeQuery();
        Integer statusWDrodzeDoKlienta = new MyQuery_SbqlQuery46(dataBase).executeQuery();
        Integer statusDostarczona = new MyQuery_SbqlQuery47(dataBase).executeQuery();
        Integer statusNiedostarczonaCzekaWPunkcie = new MyQuery_SbqlQuery48(dataBase).executeQuery();
        Map<String, Integer> query04yMap = new HashMap<String, Integer>();
        query04yMap.put("statusPrzyjeta", statusPrzyjeta);
        query04yMap.put("statusWDrodzeDoSortowni", statusWDrodzeDoSortowni);
        query04yMap.put("statusWSortowni", statusWSortowni);
        query04yMap.put("statusWDrodzeDoKlienta", statusWDrodzeDoKlienta);
        query04yMap.put("statusDostarczona", statusDostarczona);
        query04yMap.put("statusNiedostarczonaCzekaWPunkcie", statusNiedostarczonaCzekaWPunkcie);
        return query04yMap;
    }
    
    public static Map<String, Double> _query03() {
        Double avgDaysOfDelivery = new MyQuery_SbqlQuery49(dataBase).executeQuery();
        Double minDaysOfDelivery = new MyQuery_SbqlQuery50(dataBase).executeQuery();
        Double maxDaysOfDelivery = new MyQuery_SbqlQuery51(dataBase).executeQuery();
        Map<String, Double> query03yMap = new HashMap<String, Double>();
        query03yMap.put("avgDaysOfDelivery", avgDaysOfDelivery);
        query03yMap.put("minDaysOfDelivery", minDaysOfDelivery);
        query03yMap.put("maxDaysOfDelivery", maxDaysOfDelivery);
        return query03yMap;
    }
    
    public static Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _query02() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> lostPckgsWithSendrAndAdress = new MyQuery_SbqlQuery52(dataBase).executeQuery();
        return lostPckgsWithSendrAndAdress;
    }
    
    public static Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> _query01() {
        Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> employeesBySupervisor = new MyQuery_SbqlQuery53(dataBase).executeQuery();
        return employeesBySupervisor;
    }
}