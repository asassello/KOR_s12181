package edu.pjwstk.kor.appgui;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTable;

import org.apache.commons.lang3.StringUtils;

import pl.wcislo.sbql4j.java.model.runtime.Struct;
import java.sql.*;

public class structToJTable {
	
	public static JTable convert (Struct aL){
		
		
//		System.out.println(aL);
		Integer liczbaPol = aL.size();
//		System.out.println(liczbaPol);
		String[][] stringTable = new String[1][liczbaPol];
		String[] headTable = new String[liczbaPol];

		for (int j=0; j<liczbaPol; j++) {
			headTable[j] = aL.get(j).toString();
		}
		
		for(int i=0; i<liczbaPol; i++){
				stringTable[0][i] = aL.get(headTable[i]).toString();
		}

		JTable table = new JTable(stringTable,headTable);
		return table;
	}

}
