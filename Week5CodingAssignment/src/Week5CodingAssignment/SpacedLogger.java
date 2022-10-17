package Week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(log.replaceAll(".","$0 ").trim());
	}

	@Override
	public void error(String error) {
		System.out.println("ERROR: " + error.replaceAll(".","$0 ").trim());
	}

}
