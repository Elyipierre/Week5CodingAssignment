package Week5CodingAssignment;

//3a.	Create AsteriskLogger class that implement the Logger interface
public class AsteriskLogger implements Logger {

//	4.	The log method on the AsteriskLogger prints out the String it receives between
//	    3 asterisks on either side of the String 
	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***" );
	}

//	5.	The error method on the AsteriskLogger prints the String it receives inside a 
//	     box of asterisks, with the String preceded by the word “ERROR:”. 
	@Override
	public void Error(String error) {
		System.out.println("******************");
		System.out.println("***ERROR: " + error + "***");
		System.out.println("******************");
	}

}
