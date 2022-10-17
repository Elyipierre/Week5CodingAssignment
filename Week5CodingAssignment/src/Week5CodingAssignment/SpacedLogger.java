package Week5CodingAssignment;

//3b.	Create AsteriskLogger class that implement the Logger interface
public class SpacedLogger implements Logger {

//	6a	The SpacedLogger adds spaces between each character of the String 
//	    argument passed into it's methods.
	@Override
	public void Log(String log) {
		System.out.println(log.replaceAll(".","$0 ").trim());
	}

//	6b  The Error method also adds spaces between each character of the sting 
//	    argument passed into it's method
	@Override
	public void Error(String error) {
		System.out.println("ERROR: " + error.replaceAll(".","$0 ").trim());
	}

}
