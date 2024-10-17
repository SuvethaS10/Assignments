package week1.day5;

public class array {

	public static void main(String[] args) {
	
		//declaration 1
	  /*int a[]=new int [5];
	  a[0]=100;
	  a[1]=200;
	  a[2]=300;
	  a[3]=400;
	  a[4]=500;*/
		//declaration 2
		int a[]= {100,200,300,400,500};
	  // To get array length
	  System.out.println("length of array:" +a.length);
	  // To print specific value in array
	  System.out.println(a[3]);	
	  // To print entire array
	  for(int i=0; i<=a.length-1; i++) {
		System.out.print(a[i] +" ");
		System.out.println();
       }
	}

}
