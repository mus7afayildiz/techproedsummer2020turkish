package day12scopewhileloop;

import java.util.Scanner;

public class Odev {
		public static void main(String[] args) {
		
//	1-While loop kullanarak 3 den 13 e kadar tum tek tamsayýlarý ekrana yazdýrýnýz.
			
//			int num = 3;
//			while(num<=13)	{
//			if(num%3==0) {System.out.print(num+" ");}
//			num++;		};
		
		
//	2-Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
//	biten tüm tamsayýlarý while loop kullanarak ekrana yazdýrýnýz.	
			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("Lütfen baþlangýç deðerini giriniz");
//			int num1 = scan.nextInt();
//			
//			System.out.println("Lütfen bitiþ deðerini giriniz");
//			int num2 = scan.nextInt();
//			if(num1<=num2) {
//			while(num1<=num2) {
//				System.out.print(num1+" ");
//				num1++;	 };
//			}else {
//			while(num1>=num2) 
//				{System.out.print(num1+" ");
//				num1--;	 };
//			scan.close();}
			
			
//	3-Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
//	baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift tamsayýlarý while loop kullanarak
//	ekrana yazdýrýnýz.
			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("Lütfen baþlangýç deðerini giriniz");
//			int num1 = scan.nextInt();
//			
//			System.out.println("Lütfen bitiþ deðerini giriniz");
//			int num2 = scan.nextInt();
//			if(num1<=num2) {
//			while(num1<=num2) {
//				if(num1%2==0) {System.out.print(num1+" ");}
//				num1++;	 };
//			}else {
//			while(num1>=num2) {
//				if (num1%2==0) {System.out.print(num1+" ");}
//				num1--;	 };
//			scan.close();}
			
//	4-Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
//	biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn.		
			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("Lütfen baþlangýç deðerini giriniz");
//			int num1 = scan.nextInt();
//			
//			System.out.println("Lütfen bitiþ deðerini giriniz");
//			int num2 = scan.nextInt();
//			if(num1<=num2) {
//				int sum = 0; 
//				while(num1<=num2) {
//					sum = sum+num1;
//					num1++;}
//				System.out.println(sum);
//				
//			}else{
//				int sum = 0; 
//				while(num1>=num2) {
//					sum = sum+num1;
//					num1--;}
//				System.out.println(sum);
//			scan.close();};
			
//	5-Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
//	biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("Lütfen baþlangýç deðerini giriniz");
//			int num1 = scan.nextInt();
//			
//			System.out.println("Lütfen bitiþ deðerini giriniz");
//			int num2 = scan.nextInt();
//			if(num1<=num2) {
//				int product = 1; 
//				while(num1<=num2) {
//					product = product*num1;
//					num1++;}
//				System.out.println(product);
//				
//			}else{
//				int product = 1; 
//				while(num1>=num2) {
//					product = product*num1;
//					num1--;}
//				System.out.println(product);
//			scan.close();};
			
			
//	6-Kullanýcýdan baþlangýç ve bitiþ harflerini alýn ve baþlangýç harfinden baþlayýp bitiþ harfinde
//	biten tüm harfleri büyük harf olarak ekrana yazdýrýn. Kullanýcýnýn hata yapmadýðýný farz edin.
			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("Lütfen baþlangýç harfini giriniz");
//			char ch1 = scan.next().toUpperCase().charAt(0);
//			
//			System.out.println("Lütfen bitiþ harfini giriniz");
//			char ch2 = scan.next().toUpperCase().charAt(0);
//			if(('a'<ch1 && ch1<'z')||('A'<ch1 && ch1<'Z') ) {
//			if(ch1<=ch2) {
//				while(ch1<=ch2) {
//					System.out.print(ch1+" ");
//					ch1++;		};
//			}else {
//				while(ch1>=ch2) {
//					System.out.print(ch1+" ");
//					ch1--;		};		}
//			}else {System.out.println("Hatalý Character girdiniz!");}
//			scan.close();
			
			
//	7-Kullanýcýdan bir rakam alýn ve bu rakam icin çarpým tablosunu ekrana yazdýrýn.
//	Kullanýcýnýn hata yapmadýðýný farz edin.
//	Ornegin kullanýcý 3 girerse;
//	3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
//			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("Lütfen bir rakam giriniz");
//				int num = scan.nextInt();
//				if(num>=0 && num<=9) {
//					int num2 = 1;
//					while(num2<=10) {
//			System.out.print(num+"x"+num2+"="+(num2*num)+" ");
//					num2++;		}
//				}else { System.out.println("Hatalý rakam girdiniz! Rakamlar 0 ile baþlar ve 9 da biter.");};
//			scan.close();
			
					
		}			

}
