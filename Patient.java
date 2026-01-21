

public class Patient {
	String name;
	double height;
	double weight;
	Patient(String name,double height,double weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	double computeBMI() {
		double result=weight/(height*height);
		return result;
	}
	public static void main(String[] args) {
		Patient p=new Patient("sravani",4.5,50);
		System.out.println(p.computeBMI());
		
	}

}
