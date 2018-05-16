//final with variables, classes and methods
 class A2 {
	final int DAY; // final becomes a constant

	public A2() {
		DAY = 10; // It becomes constant once value is assigned
	}

	public final void show() {
		System.out.println("In A show");
	}
}

class B2 extends A2 {
//  public void show() {
//		System.out.println("In B show");
//	}
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A2 obj = new A2();
		System.out.println(obj.DAY);

		B2 obj1 = new B2();
		obj1.show();

	}
}