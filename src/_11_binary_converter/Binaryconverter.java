package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binaryconverter implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel3 = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JTextField textfield = new JTextField(20);
	JButton button = new JButton("Convert");
	JLabel label = new JLabel();
	
	public void binary() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Binary Converter");
		frame.add(panel3);
		panel.add(textfield);
		panel.add(button);
		panel2.add(label);
		panel3.add(panel);
		panel3.add(panel2);
		
		frame.setSize(500, 150);
		
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button) {
				
			   label.setText("The corresponding ASCII character is " + convert(textfield.getText()));
			   
			   frame.setSize(500,150);
		}
		
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
}

