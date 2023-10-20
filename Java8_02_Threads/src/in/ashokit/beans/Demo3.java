package in.ashokit.beans;

public class Demo3 {
	public static void main(String[] args) {
		 
		Runnable runnable = () -> {
			
			for (int i= 21; i <= 30; i++)
			{
				System.out.println(i);
			}
		};
		Thread thread =new Thread(runnable);
		thread.start();
	}

}
