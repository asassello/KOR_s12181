package edu.pjwstk.kor.appgui;

import javax.swing.JTable;

import pl.wcislo.sbql4j.java.model.runtime.Struct;

public class boolToJTable {

	public static JTable convert (Boolean aL, String name){
		
		

		String[][] stringTable = new String[1][1];
		String[] headTable = new String[1];

			headTable[0] = name;
		
			stringTable[0][0] = String.valueOf(aL);

		JTable table = new JTable(stringTable,headTable);
		return table;
	}
	
}
