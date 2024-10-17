package week1.day3;

public class Incre_decre_indetail {

	public static void main(String[] args) {
		
		int a=20, b=10;
		//Increment and decrement operation
		System.out.println("Increment of a is:"+(++a)); //Here a value is 20. Increment occurs before for (++a)so the result is 21
		System.out.println("Post-incre of a is:"+(a++)); //Here a value is 21. Increment occurs after for (a++) so the result is 21. And now the a=22.
		System.out.println("Pre-incre of b is:"+(++b)); //Here b=10.Increment occurs before for (++b) so result is 11.
		System.out.println("Pre-decre of a is:"+(--a)); //Here a=22. decrement occurs before for (--a). result is 21.
		System.out.println("Post-decre of a is:"+(a--)); //Here a=21.decrement occurs after for (a--). result is 21.
		System.out.println("Post-decre of b is:"+(b--)); //Here b=11. decrement occurs after for (b--). result is 11.
		
	}

}
