
public class StatementsLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char n = 6;
		//Switch does not support double and supports switch in and above jdk1.7 
		switch(n) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
	    case 4:
	    	System.out.println("Four");
	    	break;
		case 5:
			System.out.println("Five");
			break;
			
		default:
			System.out.println("No match");
		}
		//while ,do while, for, for-each
		int i = 1;
		while(i<=5)
		{
		System.out.println("For code redundancy");
		i++;
		}
		
		for( i=1; i<=5; i++) {
			System.out.println("For code redundancy");
		}
	}
}
