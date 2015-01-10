package edu.pjwstk.kor.appgui;

import java.util.List;

import javax.swing.JTable;

import edu.pjwstk.kor.model.Employee;
import edu.pjwstk.kor.model.Packagement;

public class packagementToJTable {
	
public static JTable convert (List<Packagement> aL){
		
		Integer liczbaPol = aL.size();
//		System.out.println(liczbaPol);

		String[] headTable = new String[]{"Nazwa","Waga"};
		String[][] stringTable = new String[liczbaPol][headTable.length];


		for(int i=0;i<liczbaPol;i++){

			stringTable[i][0] = aL.get(i).getSizeType();
			stringTable[i][1] = String.valueOf(aL.get(i).getWeight());
			
		}

		JTable table = new JTable(stringTable,headTable);
//		JTable table = new JTable();
		return table;
	}

}
