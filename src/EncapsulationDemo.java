// Encapsulation -> Binding data with methods
// Always bind data with methods and make variable(data) private and methods public.
class Student {
	private int rollno;
	private String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getters and Setters

}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setRollno(2);
		s1.setName("Vismay");
		System.out.println(s1.getRollno() + "\n" + s1.getName());
	}

}
