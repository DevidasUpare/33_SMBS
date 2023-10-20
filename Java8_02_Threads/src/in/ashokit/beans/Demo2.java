package in.ashokit.beans;

public class Demo2 {
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i=11; i <= 20; i++) {
					System.out.println(i);
				}
			}
		};
		Thread thread =new Thread(runnable);
		thread.start();
	}

}
