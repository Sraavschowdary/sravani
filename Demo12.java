


import java.util.*;

class Demo12{
public static void main(String args[]) throws Exception{
	String password="1234";
	try{
		if(password.length()<8){
			throw InvalidPasswordException(password);
		}
	}
	catch(Exception e){
		System.out.println("Invalidpassword");
	}
}

private static Exception InvalidPasswordException(String password) {
	// TODO Auto-generated method stub
	return null;
}
}