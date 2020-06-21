package day02wrapperclassesodev;

import java.util.Scanner;

public class dikdörtgen {

	public static void main(String[] args) {
		
	/*1)Kullanýcýdan dikdörtgenin boyutlarýný alan ve sonra 
		diktörtgenin alan ve  cevresini hesaplayýp ekrana 
		yazdýran bir program yazýnýz. 
		Not: Alan: Boy x En Not: Çevre: 2x (Boy + En)*/
		
		System.out.println("Dikdörtgenin en ve boyunu giriniz:");
		
		Scanner scan  = new Scanner(System.in);
		
		int en = scan.nextInt();
		
		int boy = scan.nextInt();
		
		System.out.println((en + boy)*2);
		
		System.out.println(en*boy);
		
		
		
	}

}
