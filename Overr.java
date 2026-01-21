public class Person {
	void showRole() {
		System.out.println("Student...");
	}
}
class Student extends Person {
	
	void showRole() {
		System.out.println("Student role...");
	}
}

public class Overr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.showRole();
	}

}
