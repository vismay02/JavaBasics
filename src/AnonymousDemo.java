//Types of interface
//1. Normal
//2. Single Abstract Method - Functional Interface->(Java 8) -> Lambda Expression
//3. marker interface (Interface with no method eg: Serializable)

@FunctionalInterface
interface Abc {
	void show();
}

class Ano {
	public void show() {
		System.out.println("In A show");
	}
}

public class AnonymousDemo {

	public static void main(String[] args) {
		// AnonymousInner
		Ano ano = new Ano() {
			@Override
			public void show() {
				System.out.println("I am the best");
			}
		};
		ano.show();

		// lambda Expression (Only possible with functional interface)
		Abc obj = () -> System.out.println("I am the best interface");
		obj.show();
	}

}