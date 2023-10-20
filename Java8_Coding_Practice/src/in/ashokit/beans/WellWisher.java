package in.ashokit.beans;

public class WellWisher {
	
	//+++++++++++++++++++++++++Scenario:1++++++++++++++++++
//	public static void wish(Greeting greeting) 
//	{
//		greeting.greet();
//	}
//	public static void main(String[] args) {
//		
//		Greeting hindiGreeting = new HindiGreeting();
//		wish(hindiGreeting);
//		
//		Greeting englishGreeting = new EnglishGreeting();
//		wish(englishGreeting);
//	}
//
//} +++++++++++++++++++++++++Scenario:2++++++++++++++++++
//	public static void wish(Greeting greeting)
//	{
//		greeting.greet();
//	}
//		public static void main(String[] args) 
//		{
//			wish(new Greeting() {
//				@Override
//				public void greet()
//				{
//					System.out.println("Hello, Good Morning....!!!!");
//				}
//			});
//			
//			wish(new Greeting() {
//				@Override
//				public void greet() {
//					System.out.println("Namaskar....!!!!");
//				}
//			});
//		}
//}
//+++++++++++++++++++++++++Scenario:3++++++++++++++++++
	public static void main(String[] args) {
	Greeting hindi = ()	-> System.out.println("Namaskar....!!!!");
		hindi.greet();
	Greeting english = ()	-> System.out.println("Hello, Good Morning....!!!!");
		english.greet();
	}
}

