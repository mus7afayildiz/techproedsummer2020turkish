package day13whiledowhileloops;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
	
//		A�a��daki sorular� hem for loop hem de while loop kullanarak ��z�n�z.
		
//	1- 8 den 180 e kadar 5 in kati olan tum tamsay�lar� ekrana yazd�r�n�z.
		
//		for(int i = 8; i<=180; i++) {
//			if (i%5==0) {System.out.print(i+" ");}		}
//		
//		int num = 8;
//		while(num<=180) {
//			if (num%5==0) {System.out.print(num+" ");}		
//		num++;		};
		
//	2- Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
//	biten 3 ve 5 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z.
		
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("L�tfen ba�lang�� de�erini giriniz");
//		int num1 = scan.nextInt();
//	
//		System.out.println("L�tfen biti� de�erini giriniz");
//		int num2 = scan.nextInt();
//			
//		//for d�ng�s� ile ��z�m�
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
//		//while  d�ng�s� ile ��z�m�
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
		
		
//	3- Kullan�c�dan bir say� al�n ve bu say�n�n b�lenlerini ekrana yazd�r�n�z.
//	Ornegin; 12'nin b�lenleri 1, 2, 3, 4, 6, 12 dir.	
		
			
//		Scanner scan = new Scanner(System.in);
//		System.out.println("L�tfen bir say� giriniz");
//		int num = scan.nextInt();
//		
//		//for d�ng�s� ile ��z�m�
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
//		//while d�ng�s� ile ��z�m�
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
		
	
//	4- Kullan�c�dan uzunlu�u �ift say� olan bir String al�n ve bu String�in ilk yar�s�n� ekrana yazd�r�n.
//	Ornegin; Kullan�c� �Hollanda� girerse ekrana �Holl� yazd�racaks�n�z.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Uzunlu�u �ift say� olan bir kelime giriniz");
//		String word =scan.nextLine();
//		int length = word.length()/2;
//		System.out.println(word.substring(0, length));
		
		
		
//	5- Kullan�c�dan bir String al�n ve bu String�in ilk harfi ile son harfinin yerlerini de�i�tirerek
//	ekrana yazd�r�n.
//	Ornegin; Kullan�c� �Java� girerse ekrana �aavJ� yazd�racaks�n�z.	
		
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
		
		
		
		
		
//	6- Kullan�c�dan bir String al�n ve bu String�in icinde �a� harfi varsa �a� harfinin ilk g�r�n�m�n�n
//	indexini ekrana yazd�r�n. �a� harfi yoksa ekrana �a harfi yok� yazd�r�n.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir kelime giriniz");
//		String word =scan.nextLine();
//		if(word.contains("a")) {
//			System.out.println(word.indexOf('a'));
//		}else {System.out.println("a harfi yok");}
//		scan.close();
		
		
	}}