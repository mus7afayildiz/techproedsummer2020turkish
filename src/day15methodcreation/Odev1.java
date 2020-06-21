package day15methodcreation;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		
//		Aþaðýdaki sorularý çözerken metodlarý main methodun dýþýnda oluþturup main methodun icinden çaðýrýnýz.

//	1-Kullanýcýdan isim ve soyismini alýn. Kullanýcýnýn isim ve soyisminin ilk harflerini büyük
//	diðer harflerini küçük harf olarak ekrana yazdýran programý yazýnýz.
//	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adýnýzý giriniz");
		String name = scan.nextLine().toLowerCase();
		
		System.out.println("Soyadýnýzý giriniz");
		String surname = scan.nextLine().toLowerCase();
		
		harfBüyütme(name,surname);
		scan.close();	
	}
	
	public static void harfBüyütme(String name, String surname) {
		
		System.out.println(name.toUpperCase().charAt(0)+name.substring(1));
		System.out.println(surname.toUpperCase().charAt(0)+surname.substring(1));
}
}
