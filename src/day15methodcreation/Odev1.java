package day15methodcreation;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		
//		A�a��daki sorular� ��zerken metodlar� main methodun d���nda olu�turup main methodun icinden �a��r�n�z.

//	1-Kullan�c�dan isim ve soyismini al�n. Kullan�c�n�n isim ve soyisminin ilk harflerini b�y�k
//	di�er harflerini k���k harf olarak ekrana yazd�ran program� yaz�n�z.
//	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ad�n�z� giriniz");
		String name = scan.nextLine().toLowerCase();
		
		System.out.println("Soyad�n�z� giriniz");
		String surname = scan.nextLine().toLowerCase();
		
		harfB�y�tme(name,surname);
		scan.close();	
	}
	
	public static void harfB�y�tme(String name, String surname) {
		
		System.out.println(name.toUpperCase().charAt(0)+name.substring(1));
		System.out.println(surname.toUpperCase().charAt(0)+surname.substring(1));
}
}
