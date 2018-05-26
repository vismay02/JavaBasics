
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5; // Primitive dataTypes
		Integer a = new Integer(2); // Wrapper Class
		Integer b = new Integer(5); // Boxing/Wrapping -> putting a primitive value inside a object

		int j = b.intValue(); // unBoxing/unwrapping -> Fetching the value from an object

		Integer value = i; // AutoBoxing

		int k = value; // AutoUnboxing

		String str = "123" + 2;
		int n = Integer.parseInt(str); // as parseInt is static method we need Class name to access it.
		System.out.println(n);

		String s = "2" + (2 - 2);
		System.out.println(s);
	}

}
