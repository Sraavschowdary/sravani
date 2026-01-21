

import java.util.HashSet;

public class setSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"Sravani","Kavya","Ammu"};
		HashSet<String> t=new HashSet<>();
		for(String num:s) {
			t.add(num);
		}
		System.out.println(t);
	}

}
