                                                                          
import java.util.Scanner;                                                                      
                                                                                               
public class Alpha {                                                                           
	public static void main(String[] args) {                                                   
		// TODO Auto-generated method stub                                                     
		Scanner sc=new Scanner(System.in);                                                     
		char ch=sc.next().charAt(0);
		if(Character.isDigit(ch)){
		System.out.println("Digit");}
		else if(Character.isUpperCase(ch) || Character.isLowerCase(ch)){
		System.out.println("Alphabet");
		}  
		else{
		System.out.println("Special");                                                                                  
		                                                                                       
		}   
}                                                                                       
                                                                                               
}                                                                                              
                                                                                               