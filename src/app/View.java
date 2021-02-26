package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class View {

	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	

	private JTextField textFieldFirstNbr;
	public JTextField getTextFieldFirstNbr() {
		return textFieldFirstNbr;
	}

	public void setTextFieldFirstNbr(JTextField textFieldFirstNbr) {
		this.textFieldFirstNbr = textFieldFirstNbr;
	}

	public JTextField getTextFieldSecondNbr() {
		return textFieldSecondNbr;
	}

	public void setTextFieldSecondNbr(JTextField textFieldSecondNbr) {
		this.textFieldSecondNbr = textFieldSecondNbr;
	}

	public JTextField getTextFieldSum() {
		return textFieldSum;
	}

	public void setTextFieldSum(JTextField textFieldSum) {
		this.textFieldSum = textFieldSum;
	}

	public JLabel getLblPlus() {
		return lblPlus;
	}

	public void setLblPlus(JLabel lblPlus) {
		this.lblPlus = lblPlus;
	}

	public JLabel getLblEquals() {
		return lblEquals;
	}

	public void setLblEquals(JLabel lblEquals) {
		this.lblEquals = lblEquals;
	}

	public JLabel getLblMathText() {
		return lblMathText;
	}

	public void setLblMathText(JLabel lblMathText) {
		this.lblMathText = lblMathText;
	}

	public JLabel getLblErrorMessage() {
		return lblErrorMessage;
	}

	public void setLblErrorMessage(JLabel lblErrorMessage) {
		this.lblErrorMessage = lblErrorMessage;
	}



	private JTextField textFieldSecondNbr;
	private JTextField textFieldSum;
	private JButton addButton;
	private JLabel lblPlus;
	private JLabel lblEquals;
	private JLabel lblMathText;
	private JLabel lblErrorMessage;

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}


	public View() {
		

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldFirstNbr = new JTextField();
		textFieldFirstNbr.setBounds(45, 83, 96, 19);
		frame.getContentPane().add(textFieldFirstNbr);
		textFieldFirstNbr.setColumns(10);
		
		textFieldSecondNbr = new JTextField();
		textFieldSecondNbr.setBounds(172, 83, 96, 19);
		frame.getContentPane().add(textFieldSecondNbr);
		textFieldSecondNbr.setColumns(10);
		
		 addButton = new JButton("Add");
		addButton.setBounds(115, 128, 85, 21);
		frame.getContentPane().add(addButton);
		
		textFieldSum = new JTextField();
		textFieldSum.setBounds(313, 83, 96, 19);
		frame.getContentPane().add(textFieldSum);
		textFieldSum.setColumns(10);
		
		lblPlus = new JLabel("+");
		lblPlus.setBounds(151, 86, 45, 13);
		frame.getContentPane().add(lblPlus);
		
		lblEquals = new JLabel("=");
		lblEquals.setBounds(281, 86, 45, 13);
		frame.getContentPane().add(lblEquals);
		
		lblMathText = new JLabel("Add two numbers and see what you get");
		lblMathText.setBounds(115, 40, 266, 13);
		frame.getContentPane().add(lblMathText);
		
		lblErrorMessage = new JLabel("");
		lblErrorMessage.setBounds(45, 198, 291, 13);
		frame.getContentPane().add(lblErrorMessage);
	}

}
