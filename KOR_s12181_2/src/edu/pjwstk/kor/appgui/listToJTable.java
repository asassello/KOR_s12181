package edu.pjwstk.kor.appgui;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JTable;

public class listToJTable {

public static JTable convert (List<String> aL, String name){
		

		System.out.println(aL);
		Integer liczbaPol = aL.size();
//		System.out.println(liczbaPol);

		String[] headTable = new String[] {"Lp.",name};
		String[][] stringTable = new String[liczbaPol][2];


		for(int j = 0;j<liczbaPol;j++){
			stringTable[j][0] = String.valueOf(j); 
			stringTable[j][1] = String.valueOf(aL.get(j)); 
		}
		
		JTable table = new JTable(stringTable,headTable);
		return table;
	}
	
}
