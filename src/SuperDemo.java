class A {
	public A() {
		System.out.println("In A");
	}

	public A(int i) {
		System.out.println("In A int");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("In B");
	}

	public B(int i) {
		super();
		System.out.println("In B int");
	}
}

// Super keyword is a reference variable which is used to refer immediate parent
// class object
// super can be used to invoke immediate parent class method.
// super() can be used to invoke immediate parent class constructor.
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1 = new B(2);
	}
}
