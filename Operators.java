package week1.day3;

public class Operators {

	public static void main(String[] args)
	{
		int a=20, b=10;
			//Arithmetic operations
		System.out.println("Sum of a+b is:"+(a+b));
		System.out.println("Subtraction of a-b is:"+(a-b));
		System.out.println("Multiplication of a*b is:"+(a*b));
		System.out.println("quotient of a/b is:"+(a/b));
		System.out.println("Remainder of a%b:"+(a%b));
			//Increment and decrement operation
		System.out.println("Increment of a,b is:"+(++a)+" "+(++b));
		System.out.println("Decrement of a,b is:"+(--a)+" "+(--b));
		System.out.println("Post-incre of a,b is:"+(a++)+" "+(b++));
			//Relational operations
		System.out.println("a>b:"+(a>b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a==b:"+(a==b));
			//Logical operations
		boolean c=(20>10), d=true, e=(10>20);
		System.out.println("c&&d:"+(c&&d));
		System.out.println("c||e:"+(c||e));
		System.out.println("!d:"+(!d));
		System.out.println((3>4)||(5>2));	
			//Assignment operators
		System.out.println((a+=5)+" "+(a-=2)+" "+(b*=2)+" "+(b/=2));
		System.out.println(a==b);
			//Ternary operator or conditional operator
	    int f=(b<a)? a:b;
		System.out.println(f);
	}
}

				

