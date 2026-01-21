package exam;

import java.util.LinkedHashSet;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,1,2,1,5,6};
		LinkedHashSet<Integer> h=new LinkedHashSet<>();
		for(int num:a) {
			h.add(num);
		}
		System.out.println(h);
	}

}
