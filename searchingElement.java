package week1.day5;

import java.util.Scanner;
public class searchingElement {

	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5};
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		System.out.println("Enter the element to be found:" +num);
		for(int i=0; i<a.length; i++) {
			if(a[i]==num) {
				System.out.println("Element found");
			}
		}
	}
                             
}
