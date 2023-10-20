package in.ashokit.beans;

public class Test {
	
	public static void main(String[] args) {
		Greeting greeting = new EnglishGreeting();
		greeting.greet();
		
		greeting = new HindiGreeting();
		greeting.greet();
	}

}
