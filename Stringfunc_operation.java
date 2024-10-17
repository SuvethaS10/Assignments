package week2.day1;

public class Stringfunc_operation {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "Suvetha";
		
		//To find length of string
		System.out.println("Length of string s1 and s2 is:" +s1 +" "+ s2);
		//To concatenate the string
		System.out.println("Concatenate of s1 and S2 is:" +(s1+s2));
		System.out.println(s1.concat(s2));
		//To trim the spaces
		String s3= "  Java  ";
		System.out.println("string trim:" +s3.trim());
		//To read the character in string s1
		System.out.println("character at 3rd index of string s1 is:" +s1.charAt(3));
		// To find a letter in string
		System.out.println("Is letter S present in string s2:" +s2.contains("S"));
		//To Compare string s1 and s2
		System.out.println("Is s1 equal to s2:" +s1==s2);
		// To replace the a letter in string
		System.out.println("To replace uv letter with w in string s2:" +s2.replace("uv", "w"));
		//To extract the substring from s1
		System.out.println("To extract a word from string s1:" +s1.substring(3,7));
		//To change the upper and lower case
		System.out.println("s1 Upper case:" +s1.toUpperCase());
		System.out.println("s2 lower case:" +s2.toLowerCase());
		//To spilt
		String s4= "suvetha.12@gmail.com";
		String s[]= s4.split("@");
		System.out.println("spilt the string s4:" +s[0]+" "+s[1]);
		System.out.println("spilt the string s[0]:" +s[0].split("."));
		
	}

}
