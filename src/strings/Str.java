package strings;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		
		Scanner ui=new Scanner(System.in);
		
		System.out.println("Please enter a String:");
		String a=ui.nextLine();
		String b= a.toUpperCase();
		System.out.println(b);
		System.out.println(b.length());
		String c=b.replace('O', 'Z');
		System.out.println(c);
		System.out.println(c.charAt(c.length()-1));
		System.out.println(a.concat(" test"));
		System.out.println("-------------------");

	}

}
