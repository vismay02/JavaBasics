// When you make a class abstract you cannot make object of it (abstract class
// cannot be instantiated)
// If you have abstract method in class, your class needs to be abstract
// It is not compulsory to make abstract method in to create a abstract class
// If another class extends abstracts class then method declared in abstract
// class should be defined in the class which is extending it.

//Interface
//You cannot define method in interface
//One cannot create object of interface, one can only create a reference of it.


abstract class Human {
	public abstract void eat();

	public void walk(Man m) {

	}
}

class Man extends Human { // Concrete class
	public void beard() {
		System.out.println("");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Men eat");

	}
}

class Women extends Human {
	public void longhair() {

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Women eat");
	}
}

interface Writer {
	void write(); // No need to use 'public' and 'abstract' as it is assumed by default
}

class pen implements Writer {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Pen writes");
	}
}

class pencil extends Human implements Writer {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Pencil wirtes");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Pencil is held by human");
	}

}

class Printer {
	public void show(Integer i) {
		System.out.println(i);
	}

	public void show(Double i) {
		System.out.println(i);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human m = new Man(); // Reference can be of abstract class but object cannot.
		Human w = new Women();

		m.eat();
		w.eat();

		Writer inter = new pencil(); // Reference can be of interface but object cannot.
		Human p = new pencil();
		inter.write();
		p.eat();

		Printer obj1 = new Printer();
		obj1.show(5.6);

	}

}