class Varcal {
	public int add(int ... n) { //{1,2,34,55,212,1,12} // Variable length Arguments (Varargs)
		int sum = 0;
		for(int i : n) {
			sum += i;
		}
		return sum;
	}
}
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Varcal obj = new Varcal();
		System.out.println(obj.add(1,2,34,55,212,1,12));

		// 1D array
		int nums[] = { 8, 12, 15, 29 };
		System.out.println();
		for (int i = 0; i < 4; i++) {
			System.out.println(" "+nums[i]);
		}

		// 2D array

		int a[][] = { { 1, 2, 3, 4 }, { 2, 4, 6, 8 }, { 5, 6, 7, 8 } };
		System.out.println();
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
//		Jagged array
		
		int b[][] = { { 1, 2, 3, 4 }, { 2, 4, 8 }, { 5, 6, 7, 8, 9 } };
		System.out.println();
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
	}
}
