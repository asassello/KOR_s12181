package edu.pjwstk.kor.appgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JButton;

import java.awt.FlowLayout;

import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

import java.awt.Color;

import javax.swing.JScrollPane;

//import antlr.collections.impl.Vector;











import org.apache.commons.lang3.StringUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.pjwstk.kor.model.Employee;
import edu.pjwstk.kor.queries.*;


public class mainJFrame {
	
	public MyQuery mainOb = new MyQuery();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public mainJFrame(){
		mainJFrameDraw frame = new mainJFrameDraw();
		frame.setVisible(true);
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args){
		mainJFrame app = new mainJFrame();
	}
	

public class mainJFrameDraw extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnZapytanie;
	private JButton btnZapytanie_1;
	private JButton btnZapytanie_2;
	private JButton btnZapytanie_3;
	private JButton btnZapytanie_4;
	private JButton btnZapytanie_5;
	private JButton btnZapytanie_6;
	private JButton btnZapytanie_7;
	private JButton btnZapytanie_8;
	private JButton btnZapytanie_9;
	private JButton btnZapytanie_10;
	private JButton btnZapytanie_11;
	private JButton btnZapytanie_12;
	private JButton btnZapytanie_13;
	private JButton btnZapytanie_14;
	private JTable table = new JTable();
	private JScrollPane scrollPane;
	
//	public MyQuery mainOb;

	/**
	 * Launch the application.
	 */
//	public void start() {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					mainJFrameDraw frame = new mainJFrameDraw();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public mainJFrameDraw() {
		
//		mainOb = new MyQuery();
//		mainOb.polacz();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
//		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
//		table.setDefaultRenderer(String.class, centerRenderer);
		final DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(toolBar);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		

		
		btnNewButton = new JButton("Zapytanie 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				List<Employee> res_query01 = (List<Employee>) mainOb._query01();
				table = employeeToJTable.convert(res_query01);
				scrollPane.setViewportView(table);
				//table.setForeground(Color.WHITE);
			}
		});
		toolBar.add(btnNewButton);
		
	
		btnZapytanie = new JButton("Zapytanie 2");
		btnZapytanie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList res_query02 = (ArrayList<?>) mainOb._query02();
				table = arrayListToJTable.convert(res_query02);
				scrollPane.setViewportView(table);
				//table.setForeground(Color.WHITE);
			}
		});
		toolBar.add(btnZapytanie);
		
		btnZapytanie_1 = new JButton("Zapytanie 3");
		btnZapytanie_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String,Double> res_query03 = (Map<String,Double>) mainOb._query03();
				table = mapDoubleToJTable.convert(res_query03);
				scrollPane.setViewportView(table);
			}
		});
		toolBar.add(btnZapytanie_1);
		
		btnZapytanie_2 = new JButton("Zapytanie 4");
		btnZapytanie_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String,Integer> res_query04 = (Map<String,Integer>) mainOb._query04();
				table = mapIntToJTable.convert(res_query04);
				scrollPane.setViewportView(table);
			}
		});
		toolBar.add(btnZapytanie_2);
		
		btnZapytanie_3 = new JButton("Zapytanie 5");
		btnZapytanie_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date date_param = null;
				try {
					date_param = format.parse( "2010-10-31" );
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
				Map<String,Double> res_query05 = (Map<String,Double>) mainOb._query05(date_param);
				table = mapDoubleToJTable.convert(res_query05);
				scrollPane.setViewportView(table);
				table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
			}
		});
		toolBar.add(btnZapytanie_3);
		
		btnZapytanie_4 = new JButton("Zapytanie 6");
		btnZapytanie_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String,Double> res_query06 = (Map<String,Double>) mainOb._query06();
				table = mapDoubleToJTable.convert(res_query06);
				scrollPane.setViewportView(table);
				table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
			}
		});
		toolBar.add(btnZapytanie_4);
		
		btnZapytanie_5 = new JButton("Zapytanie 7");
		btnZapytanie_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList res_query07 = (ArrayList<?>) mainOb._query07(5000);
				table = arrayListToJTable.convert(res_query07);
				scrollPane.setViewportView(table);
			}
		});
		toolBar.add(btnZapytanie_5);
		
		btnZapytanie_6 = new JButton("Zapytanie 8");
		btnZapytanie_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String,Integer> res_query08 = (Map<String,Integer>) mainOb._query08();
				table = mapIntToJTable.convert(res_query08);
				scrollPane.setViewportView(table);
				//table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
			}
		});
		toolBar.add(btnZapytanie_6);
		
		btnZapytanie_7 = new JButton("Zapytanie 9");
		btnZapytanie_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String,Double> res_query09 = (Map<String,Double>) mainOb._query09();
				table = mapDoubleToJTable.convert(res_query09);
				scrollPane.setViewportView(table);
				table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
			}
		});
		toolBar.add(btnZapytanie_7);
		
		btnZapytanie_8 = new JButton("Zapytanie 10");
		btnZapytanie_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String,Double> res_query10 = (Map<String,Double>) mainOb._query10();
				table = mapDoubleToJTable.convert(res_query10);
				scrollPane.setViewportView(table);
				table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
			}
		});
		toolBar.add(btnZapytanie_8);
		
		btnZapytanie_9 = new JButton("Zapytanie 11");
		btnZapytanie_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList res_query11 = (ArrayList<?>) mainOb._query11();
				table = arrayListToJTable.convert(res_query11);
				scrollPane.setViewportView(table);
			}
		});
		toolBar.add(btnZapytanie_9);
		
		btnZapytanie_10 = new JButton("Zapytanie 12");
		btnZapytanie_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList res_query12 = (ArrayList<?>) mainOb._query12();
				table = arrayListToJTable.convert(res_query12);
				scrollPane.setViewportView(table);
			}
		});
		toolBar.add(btnZapytanie_10);
		
		btnZapytanie_11 = new JButton("Zapytanie 13");
		btnZapytanie_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String,Integer> res_query13 = (Map<String,Integer>) mainOb._query13();
				table = mapIntToJTable.convert(res_query13);
				scrollPane.setViewportView(table);
				table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
			}
		});
		toolBar.add(btnZapytanie_11);
		
		btnZapytanie_12 = new JButton("Zapytanie 14");
		btnZapytanie_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList res_query14 = (ArrayList<?>) mainOb._query14();
				table = arrayListToJTable.convert(res_query14);
				scrollPane.setViewportView(table);
			}
		});
		toolBar.add(btnZapytanie_12);
		
		btnZapytanie_13 = new JButton("Zapytanie 15");
		btnZapytanie_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String,Double> res_query15 = (Map<String,Double>) mainOb._query15();
				table = mapDoubleToJTable.convert(res_query15);
				scrollPane.setViewportView(table);
				table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
			}
		});
		toolBar.add(btnZapytanie_13);
		
		btnZapytanie_14 = new JButton("Zapytanie 16");
		btnZapytanie_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> res_query00 = (List<String>) mainOb._query00();
				table = listToJTable.convert(res_query00,"Statusy");
				scrollPane.setViewportView(table);
				table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
			}
		});
		toolBar.add(btnZapytanie_14);
		
		
	}
	
}

}
