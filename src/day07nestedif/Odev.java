package day07nestedif;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		/*
		Kullanýcýdan cinsiyetini girmesini isteyin.
		Erkek ise yaþýný kontrol edin. Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn.
		Yaþý 18 den büyük eþit ise ekrana “Adam” yazdýrýn.
		Kadin ise yasini kontrol edin. Yaþý 18 den küçük ise ekrana “Kýz çocuk” yazdýrýn.
		Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn.		*/
	
		/*
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cinsiyetinizi giriniz");
		String cinsiyet = scan.next();
		
		if(cinsiyet.equalsIgnoreCase("erkek")){System.out.println("Yaþýnýzý giriniz");
		int age1 = scan.nextInt();
		
		if(age1<18) {System.out.println("Erkek çocuk");
		
		}else if(age1>=18) {System.out.println("Adam");
		
		}
		}else if(cinsiyet.equalsIgnoreCase("kadýn")){System.out.println("Yaþýnýzý giriniz");
		
		int age2 = scan.nextInt();
		
		if(age2<18) {System.out.println("Kýz çocuk");
		
		}else if(age2>=18) {System.out.println("Kadýn");}}	*/

		
		
		/*
		Kullanýcýdan bir harf girmesini isteyin.
		Girdiði küçük harf ise harfin “a” olup olmadýðýný kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdýrýn.
		“a” deðil ise ekrana “Ilk küçük harf deðil” yazdýrýn.
		Girdiði büyük harf ise harfin “Z” olup olmadýðýný kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdýrýn.
		“Z” deðil ise ekrana “Son büyük harf deðil” yazdýrýn.	*/
		
		/*

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		if(harf<=122 && harf>=97) {
			
		if(harf=='a') {System.out.println("Ilk küçük harf");}
		
		else {System.out.println("Ilk küçük harf deðil");
		
		}}else if(harf<=90 && harf>=65) {
			
		if(harf=='Z') {System.out.println("Son büyük harf");
		
		}else {System.out.println("Son büyük harf deðil");}
		}		*/
		
		
		/*
		Kullanýcýdan password girmesini isteyin.
		Girdiði password 5’e bölünüyorsa son rakamýný kontrol edin. Son rakamý 0 ise ekrana “5’e bölünen çift sayý” yazdýrýn.
		Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.
		Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.		*/
	
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir password giriniz");
		int password = scan.nextInt();
		
		if(password%5==0) {if(password%10==0) 
		{System.out.println("5’e bölünen çift sayý");
		
		}else if(password%10!=0) 
		{System.out.println("5’e bölünen tek sayý");
		
		}}else if(password%5!=0) 
		{System.out.println("Tekrar deneyin");}	
		
		scan.close();
	}}


