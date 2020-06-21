package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
	     Kullanýcýdan dikdörtgenin boyutlarýný alan ve sonra diktörtgenin alan ve 
	     cevresini hesaplayýp ekrana yazdýran bir program yazýnýz. 
	     Not: Alan: Boy x En
	     Not: Çevre: 2x (Boy + En)
	*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki kenar uzunluðu giriniz");
		int sayý1= scan.nextInt();
		int sayý2= scan.nextInt();
		System.out.println((sayý1+sayý2)*2);
		System.out.println((sayý1*sayý2));
	}

}
