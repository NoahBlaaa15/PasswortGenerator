package de.noahblaaa.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame{

	
private static final long serialVersionUID = -8019192867207677177L;

	private JButton b = new JButton("Generieren");
	private JButton e = new JButton("Reset");
	
	private JLabel t = new JLabel("Anzahl der Zeichen:");
	private JLabel tc = new JLabel("Code:");
	
	private JTextField tf = new JTextField();
	
	private JTextField ft = new JTextField();
	
	@SuppressWarnings("unused")
	public String Gen(int len) {
		SecureRandom r = new SecureRandom();
		String Zeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String Buchstaben = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Zahlen = "1234567890";
		
		StringBuilder pass = new StringBuilder(len);
		
		
		for (int i = 1;i<=len;i++){
			pass.append(Zeichen.charAt(r.nextInt(Zeichen.length())));
		}
		return pass.toString();
	}

	
	public Window() {
		setSize(480,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Code Generator - By NoahBlaaa15");
		setResizable(false);
		setLayout(null);
		
		ft.setBounds(135, 80, 200, 20);
		add(ft);
		
		tf.setBounds(135, 42, 200, 20);
		add(tf);
		
		t.setBounds(182, 20, 200, 25);
		add(t);
		
		tc.setBounds(215, 58, 200, 25);
		add(tc);
		
		b.setBounds(185, 112, 100, 25);
		add(b);
		
		e.setBounds(198, 140, 75, 25);
		add(e);
		
	tf.setText("1");
	
	e.addActionListener(new ActionListener() 
			{
		public void actionPerformed(ActionEvent e)
			{
			tf.setText("1");
			ft.setText(null);
			}
			});
	
	
	b.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent e)
		{
			String laenge = tf.getText();
			Integer ilaenge = Integer.parseInt(laenge);
			String Pass = Gen(ilaenge);
			ft.setText(Pass);
			System.out.println(Pass);
		}
		});
	
		}	
	
}