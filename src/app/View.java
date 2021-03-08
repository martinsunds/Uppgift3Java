package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class View {

	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	private JTextField textFieldEnterFilePath;
	public JTextField getTextFieldEnterFilePath() {
		return textFieldEnterFilePath;
	}

	public void setTextFieldEnterFilePath(JTextField textFieldEnterFilePath) {
		this.textFieldEnterFilePath = textFieldEnterFilePath;
	}

	public JButton getBtnReadFile() {
		return btnReadFile;
	}

	public void setBtnReadFile(JButton btnReadFile) {
		this.btnReadFile = btnReadFile;
	}

	public JTextField getTextFieldFirstNbr() {
		return textFieldEnterFilePath;
	}
	public JLabel getLblErrorMessage() {
		return lblErrorMessage;
	}

	public void setLblErrorMessage(JLabel lblErrorMessage) {
		this.lblErrorMessage = lblErrorMessage;
	}
	private JButton btnReadFile;
	private JLabel lblErrorMessage;

	public JButton getAddButton() {
		return btnReadFile;
	}

	public void setAddButton(JButton addButton) {
		this.btnReadFile = addButton;
	}


	public View() {
		

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldEnterFilePath = new JTextField();
		textFieldEnterFilePath.setBounds(98, 25, 86, 19);
		frame.getContentPane().add(textFieldEnterFilePath);
		textFieldEnterFilePath.setColumns(10);
		
		btnReadFile = new JButton("Read file");
		btnReadFile.setBounds(147, 222, 189, 21);
		frame.getContentPane().add(btnReadFile);
		
		lblErrorMessage = new JLabel("");
		lblErrorMessage.setBounds(29, 198, 291, 13);
		frame.getContentPane().add(lblErrorMessage);
		
		JTextArea textAreaReadFile = new JTextArea();
		textAreaReadFile.setEditable(false);
		textAreaReadFile.setBounds(194, 11, 213, 177);
		frame.getContentPane().add(textAreaReadFile);
		
		JLabel lblEnterFilePath = new JLabel("Enter file path:");
		lblEnterFilePath.setBounds(10, 28, 86, 14);
		frame.getContentPane().add(lblEnterFilePath);
	}
}
