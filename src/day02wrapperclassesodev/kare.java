package day02wrapperclassesodev;

import java.util.Scanner;

public class kare {
	/* 1)Kullanýcýdan karenin kenar uzunluðunu alan ve sonra bu 
	  	karenin alan ve  çevresini hesaplayýp ekrana yazdýran bir program yazýnýz. 
	  	Not: Alan: Boy x En Not: Çevre: 2x (Boy + En)*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Karenin kenar uzunlugunu giriniz lütfen:");
		
		int kareninKenari=scan.nextInt();
		
		System.out.println(kareninKenari*4);
		
		System.out.println(kareninKenari*kareninKenari);

	}

}
