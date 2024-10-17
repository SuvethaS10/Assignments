package week2.day1;

public class reversestring {

	public static void main(String[] args) {
	String s="Welcome";
	String rev="";
	System.out.println("The enetered string is:" +s);
	for(int i=s.length()-1; i>=0; i--) {
	rev= rev +s.charAt(i);
	}
	System.out.println("The reverse string is:" +rev);
	}
 }

