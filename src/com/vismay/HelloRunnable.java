package com.vismay;

class UsingRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from runnable");
	}
}

class UsingThread extends Thread {
	public void run() {
		System.out.println("Hello from thread");
	}
}

class SleepMessages extends Thread {
	public void run() {
		String importantInfo[] = {
				"Vismay Patil",
				"Rushi Patil",
				"Tejas Hande"
		};
		
		for (int i=0; i<importantInfo.length;i++) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(importantInfo[i]);
		}
	}
}

public class HelloRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Thread(new UsingRunnable())).start();

		(new UsingThread()).start();
		
		(new SleepMessages()).start();
	}
}