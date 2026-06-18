package MULTITHREADING;

class A extends Thread {
	public void run() {
		for (int i=0; i < 10 ;i++) {
			System.out.println("Hey hello");
			try	{
				Thread.sleep(10);
			
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread {
	public void run() {
		for(int i = 0; i < 10 ;i++) {
			System.out.println("okay, bye");
			try	{
				Thread.sleep(10);
			
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}

public class PRACTICE {
	public static void main(String[] args) {
		A a1 = new A();
		 
		B b1 = new B();
		a1.start();
		b1.start();
		b1.setPriority(10);
		a1.setPriority(2);
	}

}
