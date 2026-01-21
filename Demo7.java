

import java.util.*;

class Demo7{
public static void main(String args[]) throws Exception{
	int marks=200;
	try{
		if(marks<0 || marks>100){
			throw validateMarks(marks);
		}
	}
	catch(Exception e){
		System.out.println("Error occured");
	}
}

private static Exception validateMarks(int marks) {
	// TODO Auto-generated method stub
	return null;
}
}