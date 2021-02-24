package weekFiveAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		 String s = log;
	        s = String.join(" ", s.split(""));
	        System.out.println(s);
		
	}

	@Override
	public void error(String error) {
		String a = error;
        a = String.join(" ", a.split(""));
        System.out.println("ERROR : " + a);
		
	}

}
