package math;

import java.awt.EventQueue;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 500, 275, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBounds(184, 161, 55, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("9");
		button.setBounds(131, 118, 55, 43);
		frame.getContentPane().add(button);
		
		JButton btnCe = new JButton("C/E");
		btnCe.setBounds(23, 75, 55, 43);
		frame.getContentPane().add(btnCe);
		
		JButton btnX = new JButton("x");
		btnX.setBounds(184, 118, 55, 43);
		frame.getContentPane().add(btnX);
		
		JButton button_3 = new JButton("7");
		button_3.setBounds(23, 118, 55, 43);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.setBounds(77, 118, 55, 43);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("+");
		button_5.setBounds(184, 204, 55, 43);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.setBounds(77, 204, 55, 43);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.setBounds(23, 161, 55, 43);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.setBounds(77, 161, 55, 43);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.setBounds(131, 161, 55, 43);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.setBounds(131, 204, 55, 43);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.setBounds(23, 204, 55, 43);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("<-");
		button_12.setBounds(77, 75, 55, 43);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("-/+");
		button_13.setBounds(131, 75, 55, 43);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.setBounds(184, 75, 55, 43);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("0");
		button_15.setBounds(23, 246, 109, 43);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton(".");
		button_16.setBounds(131, 246, 55, 43);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("=");
		button_17.setBounds(184, 246, 55, 43);
		frame.getContentPane().add(button_17);
		
		textField = new JTextField();
		textField.setBounds(23, 21, 216, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
