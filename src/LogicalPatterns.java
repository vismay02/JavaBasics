/*
 * * * *
 * * * *
 * * * *
 * * * * 
 */
class Calc {
	int num1, num2, result;

	public Calc() {
		// Default constructor
		System.out.println("In default constructor");
	}

	public Calc(int num1, int num2) {
		// Parameterized constructor
		//this keyword is used to refer instance variables
		this.num1 = num1; // current object
		this.num2 = num2;
		System.out.println("In Parameterized constructor");
	}

	public void perform() {
		result = num1 + num2;
		System.out.println(result);
	}

}

public class LogicalPatterns {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc obj = new Calc(5,4); // knows something and does something(Object) // Constructor
		System.out.println(obj.num1);
		System.out.println("In cal");
		obj.perform();
		System.out.println();
		/*
		 * for(int i=1; i<=4; i++) {
		 * 
		 * for(int j=1; j<=4; j++) { System.out.print(" *"); } System.out.println(); }
		 */

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j); // System.out.print("* ");
			}
			System.out.println();
		}

		for (char i = 65; i <= 67; i++) {
			for (char j = 65; j <= i; j++) {
				System.out.print(" " + j); // System.out.print("* ");
			}
			System.out.println();
		}
		int j = 0;
		for (int i = 1; i <= 4; i++) {
			for (j = 1; j <= 4; j++) {
				if (i == 1 || j == 1 || i == 4 || j == 4) {
					System.out.print(" *"); // System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		// break and continue

		for (int i = 1; i <= 5; i++) {
			if (i == 2) {
				// continue skips the current iteration if condition is true.
				// continue;
				// break breaks the loop no further statements are printed/executed
				break;
			}
			System.out.println(i);
		}
	}
}
