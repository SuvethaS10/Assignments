package week1.day3;

public class If_conditions {

	public static void main(String[] args) {
		int a=10, b=2,c=8, d=15;
		// If condition to find a largest number
		if(a>b && a>c && a>d) {
			System.out.println("The larger number is:" +a);
		}else if(b>a && b>c && b>d) {
			System.out.println("The larger number is:" +b);
		}else if(c>a && c>b && c>d) {
			System.out.println("The larger number is:"+c);
		}else
			System.out.println("The larger number is:"+d);
}
}