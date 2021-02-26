package app;

import java.sql.SQLException;

import javax.xml.soap.SOAPException;

import java.lang.NumberFormatException;
import java.lang.NullPointerException;
import java.io.IOException;
import java.lang.IndexOutOfBoundsException;

public class ErrorHandling {
	
	//Tagit hjälp av labbledare
	
	public String handleException(Exception ex) {
		String errorMessage;

		if (ex instanceof NullPointerException) {
			errorMessage = "Put in valid information in fields";
		}

		else if (ex instanceof IndexOutOfBoundsException) {
			errorMessage = "Could not find what you are looking for";
		}

		else if (ex instanceof NumberFormatException) {
			errorMessage = "Wrong format inserted - please enter numbers";
		}
		
		else if (ex instanceof IOException) {
			errorMessage = "Could not read file";
		}
		else if (ex instanceof SOAPException) {
			errorMessage = "Could not reach provider";
		}
		
		else if (ex instanceof SQLException) {
			int errorCode = ((SQLException) ex).getErrorCode();
			switch (errorCode) {

			case 2627:
				errorMessage = "The object you are trying to add already exist";
				break;

			case 17:
				errorMessage = "Database can not be reached";
				break;

			case 0:
				errorMessage = "The connection failed, timelimit reached";
				break;
			default:
				errorMessage = "An unexpected error ocurred";
				break;
			}
		} else {
			errorMessage = "An unexpected error ocurred";
		}
		return errorMessage;
	}


}
