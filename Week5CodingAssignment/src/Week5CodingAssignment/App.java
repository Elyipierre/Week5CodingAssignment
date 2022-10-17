package Week5CodingAssignment;

//9.	Create a class named App that has a main method
public class App {

//10.	instantiate an instance of each of your logger classes that implement the Logger interface.
	public static void main(String[] args) {
				Logger asteriskLogger = new AsteriskLogger();
				asteriskLogger.Log("Hello");
				asteriskLogger.Error("Hello");
				
				Logger spacedLogger = new SpacedLogger();
				spacedLogger.Log("Hello");
				spacedLogger.Error("Hello");

	}

}
