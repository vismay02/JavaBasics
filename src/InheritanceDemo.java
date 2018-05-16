// IS-A, HAS-A 

class Calculator { // Super, Parent, Base Class
	public int add(int i, int j) {
		return i + j;
	}
}

// Single Inheritance
// IS-A relationship with Parent class Eg: Dog IS-A animal
class CalcAdv extends Calculator { // Sub, Child, Derived Class
	public int sub(int i, int j) {
		return i - j;
	}
}

// MultiLevel Inheritance
class CalcVeryAdv extends CalcAdv {
	public int multi(int i, int j) {
		return i * j;
	}
}

// HAS-A relationship with the object
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcVeryAdv obj = new CalcVeryAdv();
		int result = obj.add(6, 3);
		int result1 = obj.sub(6, 3);
		int result2 = obj.multi(6, 3);

		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}
}
