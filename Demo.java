package exam;

import java.util.HashSet;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		HashSet<Integer> h=new HashSet<>();
		for(int num:a) {
			h.add(num);
		}
		System.out.println(h);
	}

}
