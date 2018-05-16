
public class HelloWorld {
	
	/*
	 * Arithmetic +,-,*,/,%
	 * Bitwise
	 * Relational
	 * Logical
	 */
	
//	ternary operator
//	?: -> condition?expr1:expr2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5; // 4 bytes -> 32 bits
		short s = 5; //2 bytes -> 32 bits 
		byte b = 5; //1 byte -> 8 bits -> -128 to 127
		float f = 4.2f;
		double d = 98.8;
		char c= 'A';
		c= 66; //ASCII
		
		double d1 = 5;//implicit conversion
		int k = (int) 5.5; // Explicit type cast
		
		int m=6, n=4;
		int r1 = m+n; //8 // n+= m shorthand operator
		int r2 = m-n; //4
		int r3 = m*n; //12
		double r4 =(double) m/n; //3
		int r5 = m%n;
		
		int pr = 4;
		int po = 5;
		
		// ++n; pre increment
		//n++; post increment
		pr = po++; 
		
		pr = po>5?1:2;
		
		System.out.println(pr);
		 
		System.out.println("Hello world!"+ a + " " + f +" "+ d +" "+c+" "+k);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
		System.out.println(pr);
		System.out.println(po);
		
		
	}

}
