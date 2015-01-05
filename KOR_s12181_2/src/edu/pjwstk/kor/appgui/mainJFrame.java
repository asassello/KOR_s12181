package edu.pjwstk.kor.appgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import edu.pjwstk.kor.queries.*;

public class mainJFrame extends JFrame {

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
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainJFrame frame = new mainJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(toolBar);
		
		btnNewButton = new JButton("Zapytanie 1");
		toolBar.add(btnNewButton);
		
		btnZapytanie = new JButton("Zapytanie 2");
		toolBar.add(btnZapytanie);
		
		btnZapytanie_1 = new JButton("Zapytanie 3");
		toolBar.add(btnZapytanie_1);
		
		btnZapytanie_2 = new JButton("Zapytanie 4");
		toolBar.add(btnZapytanie_2);
		
		btnZapytanie_3 = new JButton("Zapytanie 5");
		toolBar.add(btnZapytanie_3);
		
		btnZapytanie_4 = new JButton("Zapytanie 6");
		toolBar.add(btnZapytanie_4);
		
		btnZapytanie_5 = new JButton("Zapytanie 7");
		toolBar.add(btnZapytanie_5);
		
		btnZapytanie_6 = new JButton("Zapytanie 8");
		toolBar.add(btnZapytanie_6);
		
		btnZapytanie_7 = new JButton("Zapytanie 9");
		toolBar.add(btnZapytanie_7);
		
		btnZapytanie_8 = new JButton("Zapytanie 10");
		toolBar.add(btnZapytanie_8);
		
		btnZapytanie_9 = new JButton("Zapytanie 11");
		toolBar.add(btnZapytanie_9);
		
		btnZapytanie_10 = new JButton("Zapytanie 12");
		toolBar.add(btnZapytanie_10);
		
		btnZapytanie_11 = new JButton("Zapytanie 13");
		toolBar.add(btnZapytanie_11);
		
		btnZapytanie_12 = new JButton("Zapytanie 14");
		toolBar.add(btnZapytanie_12);
		
		btnZapytanie_13 = new JButton("Zapytanie 15");
		btnZapytanie_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyQuery._query15();
			}
		});
		toolBar.add(btnZapytanie_13);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setForeground(Color.WHITE);
	}

}
