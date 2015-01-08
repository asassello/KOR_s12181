package edu.pjwstk.kor.appgui;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JTable;

import edu.pjwstk.kor.model.Employee;

public class employeeToJTable {

	public static JTable convert (List<Employee> aL){
		
		Integer liczbaPol = aL.size();
//		System.out.println(liczbaPol);

		String[] headTable = new String[]{"Name","Surname","Pensja","Stanowisko","Czy tymczasowy"};
		String[][] stringTable = new String[liczbaPol][headTable.length];


		for(int i=0;i<liczbaPol;i++){

			stringTable[i][0] = aL.get(i).getName();
			stringTable[i][1] = aL.get(i).getSurname();
			stringTable[i][2] = String.valueOf(aL.get(i).getSalary());
			stringTable[i][3] = aL.get(i).getPosition();
			stringTable[i][4] = String.valueOf(aL.get(i).getIsTemporary());
		}

		JTable table = new JTable(stringTable,headTable);
//		JTable table = new JTable();
		return table;
	}
}
