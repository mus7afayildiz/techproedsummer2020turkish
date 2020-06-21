package day14dowhileloop;

import java.util.Scanner;

public class Tekrar {

	public static void main(String[] args) {
//	1-
//	
//	//10 ile 20 arasindaki tek tamsayilari ekrana do-while loop ile yazdirin.
//		int num = 10;
//		do {
//			if(num%2==1)System.out.print(num+" ");
//			num++;
//		}while(num<=20);
		
		
//	3-
			// Kullanicidan sayi alin
			// Sayi 10 dan kucuk ise ekrana "Kazandiniz" yazdirin
			// Sayi 10 veya 10 dan buyuk ise ekrana "Bir sayi giriniz" yazdirin.
//		int num;
//		do {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir sayý giriniz");
//		num = scan.nextInt();
//		}while( num>=10);
//		System.out.println("Kazandýnýz");
//		
		
		
//	4-	// Kullanicidan bir String alin
//		// Bu String'in indexi tek sayi olan character'lerini ekrana yazdirin
//		// Almanya ==> l, a, y ==> yazdirmali
				
//				Scanner scan = new Scanner(System.in);		
//				System.out.println("Bir kelime veya cümle giriniz");
//				String str = scan.nextLine();
//				int i=1;
//				int length = str.length()-1;
//				do {
//					System.out.print(str.charAt(i)+" ");
//				i = i+2;
//				}while(i<=length);
//		
		
		// Kullanicidan ismini alin
		// Ilk harf buyuk harf ise "Dogru giris yaptiniz"
		// Ilk harf kucuk harf ise "Ilk harfi buyuk harf olarak giriniz"

		
//		Scanner scan = new Scanner(System.in);	
//		String str;
//			do {
//		System.out.println("Ýsminizi giriniz");
//		str = scan.nextLine();
//		str.charAt(0);
//	
//			if(str.charAt(0)>='A' && str.charAt(0)<='Z') {System.out.println("Dogru giris yaptiniz");
//			}else {
//			System.out.println("Ýlk harfi büyük harf olarak giriniz");}
//		}while(!(str.charAt(0)>='A' && str.charAt(0)<='Z'));
		
		
		
//		Kullanýcýdan bir String alýn ve bu String’in ilk harfi ile son harfinin 
//		yerlerini deðiþtirerek ekrana yazdýrýn.
//      Ornegin; Kullanýcý “Java” girerse ekrana “aavJ” yazdýracaksýnýz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String str = scan.nextLine();
		int length = str.length()-1;
		System.out.println(str.charAt(str.length()-1)+str.substring(1, str.length()-1)+str.charAt(0)+"");
	}

}
