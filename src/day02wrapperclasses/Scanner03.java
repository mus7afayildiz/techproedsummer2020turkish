package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//Kullanýcýsdan alýnan bir sayýnýn küpünü hesaplayýn 
		//Not:a'nýn küpü a*a*a
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz");
		int sayý= scan.nextInt();
		System.out.println(sayý*sayý*sayý);
				
		

	}

}
