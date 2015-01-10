package edu.pjwstk.kor.appgui;

import java.util.List;

import javax.swing.JTable;

import edu.pjwstk.kor.model.Employee;
import edu.pjwstk.kor.model.Receiver;

public class rcvToJTable {
	
public static JTable convert (List<Receiver> aL){
		
		Integer liczbaPol = aL.size();
//		System.out.println(liczbaPol);

		String[] headTable = new String[]{"Name","Surname","Miasto"};
		String[][] stringTable = new String[liczbaPol][headTable.length];


		for(int i=0;i<liczbaPol;i++){

			stringTable[i][0] = aL.get(i).getName();
			stringTable[i][1] = aL.get(i).getSurname();
			stringTable[i][2] = aL.get(i).getCity();
		}

		JTable table = new JTable(stringTable,headTable);
//		JTable table = new JTable();
		return table;
	}

}
