package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import org.tempuri.WebServiceAssignment3Soap;
import org.tempuri.WebServiceAssignment3SoapProxy;


public class Controller {
	
	
	private WebServiceAssignment3Soap proxy;
	private View view;
	private ErrorHandling error;
	public Controller(View view) {
		
		this.error = new ErrorHandling();
		this.view= view;
		this.proxy = new WebServiceAssignment3SoapProxy();
		initialize();
		
	}
	
	public void initialize () {
	
	view.getAddButton().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			view.getLblErrorMessage().setText("");
			
			try {
				int firstNbr = Integer.parseInt(view.getTextFieldFirstNbr().getText());
				int secondNbr = Integer.parseInt(view.getTextFieldSecondNbr().getText());
				int sum = proxy.addNumbers(firstNbr, secondNbr);
				view.getTextFieldSum().setText(Integer.toString(sum));
				
			} catch (Exception e1) {
				
				view.getLblErrorMessage().setText(error.handleException(e1));
			}
		}
	});
}
	}
