package Week5CodingAssignment;

public class App {

	public static void main(String[] args) {
				Logger asteriskLogger = new AsteriskLogger();
				asteriskLogger.log("Hello");
				asteriskLogger.error("Hello");
				
				Logger spacedLogger = new SpacedLogger();
				spacedLogger.log("Hello");
				spacedLogger.error("Hello");

	}

}
