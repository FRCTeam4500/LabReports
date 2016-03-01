package main;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window {

	private JFrame frmPhysicsLabHelper;
	private JTable table;
	
	public static double[] xValue;
	public static double[] yValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmPhysicsLabHelper.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPhysicsLabHelper = new JFrame();
		frmPhysicsLabHelper.setTitle("Physics Lab Helper");
		frmPhysicsLabHelper.setBounds(100, 100, 497, 344);
		frmPhysicsLabHelper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhysicsLabHelper.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(0), new Integer(0)},
				{new Integer(0), new Integer(0)},
				{new Integer(0), new Integer(0)},
				{new Integer(0), new Integer(0)},
				{new Integer(0), new Integer(0)},
				{new Integer(0), new Integer(0)},
				{new Integer(0), new Integer(0)},
				{new Integer(0), new Integer(0)},
				{"0", "0"},
				{"0", "0"},
			},
			new String[] {
				"X", "Y"
			}
		));
		table.setBounds(0, 46, 142, 160);
		frmPhysicsLabHelper.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(26, 22, 22, 28);
		frmPhysicsLabHelper.getContentPane().add(lblNewLabel);
		
		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblY.setBounds(94, 22, 22, 28);
		frmPhysicsLabHelper.getContentPane().add(lblY);
		
		JButton btnNewButton = new JButton("Submit Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//String numone = "" + table.getValueAt(2, 1);
				//System.out.println(numone);
				xValue = new double[table.getRowCount()];
				yValue = new double[table.getRowCount()];
				for(int i = 0; i < xValue.length; i++)
				{
					String placeholderX = "" + table.getValueAt(i, 0);
					xValue[i] = Double.parseDouble(placeholderX);
					String placeholderY = "" + table.getValueAt(i, 1);
					xValue[i] = Double.parseDouble(placeholderY);
				}
			}
		});
		btnNewButton.setBounds(10, 217, 115, 23);
		frmPhysicsLabHelper.getContentPane().add(btnNewButton);
	}
}
