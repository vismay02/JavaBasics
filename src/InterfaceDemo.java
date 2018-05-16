//Abstract class -> define and declare methods
//Interface -> Only declare methods till(1.7)
//1.8 can define methods in interface

@FunctionalInterface
interface Demo {

	// Variable declared inside a interface becomes a constant
	int num = 8;

	void abc();

	// Do define methods in interface
	default void show() {
		System.out.println("In Demo show");
	}

	static void showStatic() {
		System.out.println("In static method of interface");
	}
}

interface MyDemo {
	default void show() {
		System.out.println("In MyDemo show");
	}
}

 class DemoImp implements Demo, MyDemo {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("in abc");

	}
	/*
	 * public void show() { System.out.println("In DemoImp show"); }
	 */

	@Override
	public void show() {
		// TODO Auto-generated method stub
		MyDemo.super.show();
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();
		Demo.showStatic();

	}

}
