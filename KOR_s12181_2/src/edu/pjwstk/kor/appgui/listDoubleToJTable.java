package edu.pjwstk.kor.appgui;

import java.util.List;

import javax.swing.JTable;

public class listDoubleToJTable {
	
public static JTable convert (List<Double> aL){
		

//		System.out.println(aL);
		Integer liczbaPol = aL.size();
//		System.out.println(liczbaPol);

		String[] headTable = new String[] {"Wartosc srednia","Wartosc minimalna","Wartosc maksymalna"};
		String[][] stringTable = new String[liczbaPol][2];


		for(int j = 0;j<liczbaPol;j++){
			stringTable[j][0] = String.valueOf(j); 
			stringTable[j][1] = String.valueOf(aL.get(j)); 
		}
		
		JTable table = new JTable(stringTable,headTable);
		return table;
	}
}
