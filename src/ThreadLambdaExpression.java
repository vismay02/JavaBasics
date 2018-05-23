

public class ThreadLambdaExpression {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// This '->' represents an lambada expression
		Thread t1 = new Thread(() -> {
			for(int i=1; i<=5;i++) {
				System.out.println("Hi");
				try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
			}
		});
		
		Thread t2 = new Thread(() ->  
		{
			for(int i=1; i<=5;i++) {
				System.out.println("Hello");
				try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
			}
		});
		
		t1.start();
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		t2.start();
		
		//Tests if this thread is alive.
		System.out.println(t1.isAlive());
		
		//Waits at most (milliseconds) for this thread to die. A timeout of 0 means to wait forever.
		// Try commenting the join() method below.
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Bye");
 
	}
}