

import java.util.TreeSet;

public class setimplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"Sravani","Kavya","Ammu"};
		TreeSet<String> t=new TreeSet<>();
		for(String num:s) {
			t.add(num);
		}
		System.out.println(t);
	}

}
