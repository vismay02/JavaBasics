class A1 {

	int i;

	protected void show() {
		System.out.println("In A");
	}
}

// super is used to represent parent class object
class B1 extends A1 {
	int i;

	// Annotations
	@Override
	protected void show() {
		super.i = 8;
		// For calling method of super class ie: show() in A class, in this case.
		// super.show();
		System.out.println("In B");
	}
}

class C1 extends A1 {
	@Override
	public void show() {
		System.out.println("In C");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj1 = new B1(); // runtime Polymorphism
		obj1.show();

		obj1 = new C1();
		obj1.show(); // Dynamic Method Dispatch
	}

}
