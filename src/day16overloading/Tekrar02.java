package day16overloading;

import java.util.Scanner;

public class Tekrar02 {
	public static void main(String[] args) {
	//1-	
		/*
		 Kullan�c�ya say� girmesini s�yleyin. 
		 Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n� ekrana 
	    yazd�ran bir program yaz�n.
		*/
	
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Bir say� giriniz");
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
//		System.out.println("Rakamalar�n toplam� :"+sum);
//	
		
		
		
	//2-	
	/*
		 Kullan�c�dan isim ve soyismini al�n. 
		 Kullan�c�n�n isim ve soyisminin ilk harflerini b�y�k
         di�er harflerini k���k harf olarak ekrana yazd�ran program� yaz�n�z.
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Ad�n�z� giriniz");
		String name = scan.next().toLowerCase();
		System.out.println("Soyad�n�z� giriniz");
		String surname = scan.next().toLowerCase();
		ad (name, surname);
	
	}
		public static void ad(String name, String surname) {
			String ilkName = name.substring(0,1).toUpperCase()+name.substring(1);
			String ilkSurname = surname.substring(0,1).toUpperCase()+surname.substring(1);
			System.out.println(ilkName+" "+ilkSurname);
		}








}
