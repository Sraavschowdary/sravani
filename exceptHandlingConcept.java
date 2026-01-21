
public class exceptHandlingConcept {
	public static void main(String args[]) {
		int a[]= {1,2,3,4};
		int num=0;
		try {
			System.out.print(a[6]);
			try {
				System.out.print(100/num);
			}
			catch(ArithmeticException e) {
				System.out.print("Division by zero error");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("ArrayIndexOutOfBoundsException error");
		}
		
	}
}
