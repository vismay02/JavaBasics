package com.vismay;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int i = 9;
			int j = 7;
			int k = i / j;

			System.out.println("Answer " + k);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		} 
		
		finally {
			System.out.println("Bye");
		}
	}
}
