class Casio {

	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public void add(int i, int j, int k) {
		System.out.println(i + j + k);
	}

}

// For constructor overloading
class CasioCons {
	int num1;
	int num2;
	String operation;

	public CasioCons() {
		num1 = 0;
		num2 = 0;
		operation = "Nothing";

	}

	public CasioCons(int i, int j) {
		num1 = i;
		num2 = j;
		operation = "Nothing";
	}

	public CasioCons(int i, int j, String op) {
		num1 = i;
		num2 = j;
		operation = op;
	}
}

// For static keyword
class Emp {
	int eid;
	int salary;
	// static variables are not for particular object but for all the objects
	// as making ceo static it is no more in heap memory but goes in class loader
	// memory
	static String ceo;

	//static block to initialize static variable
	//when you load a class
	static {
		ceo = "Larry";
		System.out.println("In static");
	}
	//when you create an object
	public Emp() {
		System.out.println("In constructor");
		eid = 1;
		salary = 3000;
	}

	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio obj = new Casio();
		obj.add(4, 5);
		obj.add(2, 4, 4);

		CasioCons obj1 = new CasioCons(4, 5);

		Emp vis = new Emp();
//		vis.eid = 8;
//		vis.salary = 4000;
		// vis.ceo = "Mahesh";
		// as ceo is same for all the objects you can use class name because of static
		// variable
//		Emp.ceo = "Mahesh";// we don't need object to access static variables therefore the main method is
							// static

		Emp may = new Emp();
//		may.eid = 9;
//		may.salary = 40700;
		// may.ceo = "Rohan";
//		Emp.ceo = "Rohan";

		vis.show();
		may.show();
	}
}
