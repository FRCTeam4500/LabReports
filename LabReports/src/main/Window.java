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
		frmPhysicsLabHelper.setBounds(100, 100, 450, 300);
		frmPhysicsLabHelper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhysicsLabHelper.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"X", "Y"
			}
		));
		table.setBounds(0, 46, 142, 128);
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
				String numone = "" + table.getValueAt(2, 1);
				System.out.println(numone);
			}
		});
		btnNewButton.setBounds(10, 185, 115, 23);
		frmPhysicsLabHelper.getContentPane().add(btnNewButton);
	}
}
