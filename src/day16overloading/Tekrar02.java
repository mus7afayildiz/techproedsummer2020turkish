package day16overloading;

import java.util.Scanner;

public class Tekrar02 {
	public static void main(String[] args) {
	//1-	
		/*
		 Kullanýcýya sayý girmesini söyleyin. 
		 Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný ekrana 
	    yazdýran bir program yazýn.
		*/
	
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Bir sayý giriniz");
//	int num = scan.nextInt();
//	toplama(num);
//	scan.close();
//	}
//	public static void toplama(int num) {
//		int sum = 0;
//		while(num!=0) {
//		sum = sum+num%10;
//		num/=10;
//		}
//		System.out.println("Rakamalarýn toplamý :"+sum);
//	
		
		
		
	//2-	
	/*
		 Kullanýcýdan isim ve soyismini alýn. 
		 Kullanýcýnýn isim ve soyisminin ilk harflerini büyük
         diðer harflerini küçük harf olarak ekrana yazdýran programý yazýnýz.
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Adýnýzý giriniz");
		String name = scan.next().toLowerCase();
		System.out.println("Soyadýnýzý giriniz");
		String surname = scan.next().toLowerCase();
		ad (name, surname);
	
	}
		public static void ad(String name, String surname) {
			String ilkName = name.substring(0,1).toUpperCase()+name.substring(1);
			String ilkSurname = surname.substring(0,1).toUpperCase()+surname.substring(1);
			System.out.println(ilkName+" "+ilkSurname);
		}








}
