package edu.pjwstk.kor.appgui;

import java.util.Map;
import java.util.Set;

import javax.swing.JTable;

public class mapLongDoubleToJTable {

public static JTable convert (Map<String,Double> aL){
		
		Set<String> o = aL.keySet();
//		System.out.println(o);
		Integer liczbaPol = o.size();
//		System.out.println(liczbaPol);
//		System.out.println(aL.size());
		String[] headTable = new String[liczbaPol];
		String[][] stringTable = new String[1][liczbaPol];
		
		int i = 0;
		for(String x: o){
			headTable[i++] = x; 
		}
		
		int j = 0;
		for(String x: o){
			stringTable[0][j++] = String.valueOf(aL.get(x)); 
		}
		
//
//		for(int i=0; i<stringTable.length; i++){
//			for(int j=0; j<stringTable[i].length;j++){
//				System.out.println(stringTable[i][j]);
//			}
//		}
//		
		JTable table = new JTable(stringTable,headTable);
		return table;
}
}
