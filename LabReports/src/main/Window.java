package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Window {

	private JFrame frmPhysicsLabHelper;

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
	}

}
