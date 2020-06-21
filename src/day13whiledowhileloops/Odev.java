package day13whiledowhileloops;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
	
//		Aþaðýdaki sorularý hem for loop hem de while loop kullanarak çözünüz.
		
//	1- 8 den 180 e kadar 5 in kati olan tum tamsayýlarý ekrana yazdýrýnýz.
		
//		for(int i = 8; i<=180; i++) {
//			if (i%5==0) {System.out.print(i+" ");}		}
//		
//		int num = 8;
//		while(num<=180) {
//			if (num%5==0) {System.out.print(num+" ");}		
//		num++;		};
		
//	2- Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
//	biten 3 ve 5 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz.
		
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen baþlangýç deðerini giriniz");
//		int num1 = scan.nextInt();
//	
//		System.out.println("Lütfen bitiþ deðerini giriniz");
//		int num2 = scan.nextInt();
//			
//		//for döngüsü ile çözümü
//		
//		if(num1<=num2) {
//		for(int i = num1; i<=num2; i++) {
//			if(i%3==0 && i%5==0) {
//				System.out.print(i+" ");}	}
//		}else {
//		for(int i = num1; i>=num2; i--) {
//			if(i%3==0 && i%5==0) {
//				System.out.print(i+" ");	
//				scan.close();	}		}
//		}
//		
//		//while  döngüsü ile çözümü
//		
//		if(num1<=num2) {
//			while(num1<=num2) {
//				if(num1%3==0 && num1%5==0) {
//					System.out.print(num1+" ");}
//				num1++;}
//		}else {
//			while(num1>=num2) {
//				if(num1%3==0 && num1%5==0) {
//					System.out.print(num1+" ");	}	
//				num1--;}
//			scan.close();	
//		}
		
		
//	3- Kullanýcýdan bir sayý alýn ve bu sayýnýn bölenlerini ekrana yazdýrýnýz.
//	Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.	
		
			
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen bir sayý giriniz");
//		int num = scan.nextInt();
//		
//		//for döngüsü ile çözümü
//		
//		if(num>=0) {
//		for(int i=1; i<=num; i++) {
//			if(num%i==0) {
//			System.out.print(i+" ");	}
//		}}else {
//			for(int i=-1; i>=num; i--) {
//				if(num%i==0) {
//			System.out.print(i+" ");	}
//		}}	scan.close();
//			}
//		}
//
//		//while döngüsü ile çözümü
//		
//		if(num>=0) {
//			int i = 1;
//			while(i<=num) {
//				if(num%i==0) {
//					System.out.print(i+" ");}
//				i++;}
//		}else {
//			int i = -1;
//			while(i>=num) {
//				if(num%i==0) {
//					System.out.print(i+" ");	}	
//				i--;}
//			scan.close();	
//		}
		
	
//	4- Kullanýcýdan uzunluðu çift sayý olan bir String alýn ve bu String’in ilk yarýsýný ekrana yazdýrýn.
//	Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl” yazdýracaksýnýz.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Uzunluðu çift sayý olan bir kelime giriniz");
//		String word =scan.nextLine();
//		int length = word.length()/2;
//		System.out.println(word.substring(0, length));
		
		
		
//	5- Kullanýcýdan bir String alýn ve bu String’in ilk harfi ile son harfinin yerlerini deðiþtirerek
//	ekrana yazdýrýn.
//	Ornegin; Kullanýcý “Java” girerse ekrana “aavJ” yazdýracaksýnýz.	
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir kelime giriniz");
//		String word =scan.nextLine();
//		System.out.print(word.charAt(word.length()-1));
//		
//		for(int i=1; i<=word.length()-2; i++) {
//			System.out.print(word.charAt(i));
//		}
//		
//		System.out.print(word.charAt(0));
//		scan.close();
		
		
		
		
		
//	6- Kullanýcýdan bir String alýn ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün
//	indexini ekrana yazdýrýn. “a” harfi yoksa ekrana “a harfi yok” yazdýrýn.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir kelime giriniz");
//		String word =scan.nextLine();
//		if(word.contains("a")) {
//			System.out.println(word.indexOf('a'));
//		}else {System.out.println("a harfi yok");}
//		scan.close();
		
		
	}}