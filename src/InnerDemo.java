/*
 * Inner class
 * Member class
 * Static class
 * Anonymous class
 */
class Outer {
	static int a;

	public static void show() {

	}

	class NonStaticInner {
		public void display() {
			System.out.println("In non static display");
		}
	}

	static class Inner { // Outer$Inner.class (filename)
		public void display() {
			System.out.println("In static display");
		}
	}
}

public class InnerDemo {

	// variable, method

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj = new Outer();
		obj.show();

		Outer.NonStaticInner obj1 = obj.new NonStaticInner();
		obj1.display();

		// Member class object
		Outer.Inner obj2 = new Outer.Inner();
		obj2.display();

	}

}
