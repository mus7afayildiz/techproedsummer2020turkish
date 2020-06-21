package day02wrapperclassesodev;

import java.util.Scanner;

public class küp {

	public static void main(String[] args) {
		/*2)Kullanýcýdan alýnan bir sayýnýn küpünü 
		 	hesaplayan bir program yazýnýz. Not: a’ nýn küpü: a x a x a*/

		System.out.println("Bir sayý giriniz: ");
		
		Scanner scan = new Scanner(System.in);
		
		int sayý = scan.nextInt();
		
		System.out.println(sayý*sayý*sayý);
		
	}

}
