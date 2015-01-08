package edu.pjwstk.kor.appgui;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTable;

import org.apache.commons.lang3.StringUtils;

public class arrayListToJTable {

public static JTable convert (ArrayList<?> aL){
	
//	System.out.println(aL);
//	for(Object printer: res_query01){
//		System.out.println(printer);
//		String x = printer.toString();
//		System.out.println(x);
//	}
	
	String o = aL.get(0).toString();
//	System.out.println(o);
	Integer liczbaPol = StringUtils.countMatches(o,"=");
//	System.out.println(liczbaPol);
//	System.out.println(aL.size());
	String[][] stringTable = new String[aL.size()][liczbaPol];
	String[] headTable = new String[liczbaPol];
	
	o = o.replace("{", ",");
	o = o.replace("}", ",");
	String regexString_head = Pattern.quote(",") + "(.*?)" + Pattern.quote("=");
	Pattern pattern_head = Pattern.compile(regexString_head);
	Matcher matcher_head = pattern_head.matcher(o);
	for (int j=0; j<liczbaPol; j++) {
		matcher_head.find();
		headTable[j] = matcher_head.group(1);
	}
//	System.out.println("OK");
	
	for(int i=0;i<aL.size();i++){
		o = aL.get(i).toString();
		o = o.replace("{", ",");
		o = o.replace("}", ",");
//		System.out.println(o);
		
		String regexString = Pattern.quote("=") + "(.*?)" + Pattern.quote(",");
		Pattern pattern = Pattern.compile(regexString);
		Matcher matcher = pattern.matcher(o);
		for (int j=0; j<liczbaPol; j++) {
			matcher.find();
			stringTable[i][j] = matcher.group(1);
		}
	}

//	for(int i=0; i<stringTable.length; i++){
//		for(int j=0; j<stringTable[i].length;j++){
//			System.out.println(stringTable[i][j]);
//		}
//	}
	
	JTable table = new JTable(stringTable,headTable);
	return table;
}
}
