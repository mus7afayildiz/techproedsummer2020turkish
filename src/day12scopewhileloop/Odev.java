package day12scopewhileloop;

import java.util.Scanner;

public class Odev {
		public static void main(String[] args) {
		
//	1-While loop kullanarak 3 den 13 e kadar tum tek tamsay�lar� ekrana yazd�r�n�z.
			
//			int num = 3;
//			while(num<=13)	{
//			if(num%3==0) {System.out.print(num+" ");}
//			num++;		};
		
		
//	2-Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
//	biten t�m tamsay�lar� while loop kullanarak ekrana yazd�r�n�z.	
			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("L�tfen ba�lang�� de�erini giriniz");
//			int num1 = scan.nextInt();
//			
//			System.out.println("L�tfen biti� de�erini giriniz");
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
			
			
//	3-Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
//	ba�lay�p biti� de�erinde veya �ncesinde biten t�m �ift tamsay�lar� while loop kullanarak
//	ekrana yazd�r�n�z.
			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("L�tfen ba�lang�� de�erini giriniz");
//			int num1 = scan.nextInt();
//			
//			System.out.println("L�tfen biti� de�erini giriniz");
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
			
//	4-Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
//	biten t�m tamsay�lar�n toplam�n� ekrana yazd�r�n.		
			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("L�tfen ba�lang�� de�erini giriniz");
//			int num1 = scan.nextInt();
//			
//			System.out.println("L�tfen biti� de�erini giriniz");
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
			
//	5-Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
//	biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.
			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("L�tfen ba�lang�� de�erini giriniz");
//			int num1 = scan.nextInt();
//			
//			System.out.println("L�tfen biti� de�erini giriniz");
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
			
			
//	6-Kullan�c�dan ba�lang�� ve biti� harflerini al�n ve ba�lang�� harfinden ba�lay�p biti� harfinde
//	biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n. Kullan�c�n�n hata yapmad���n� farz edin.
			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("L�tfen ba�lang�� harfini giriniz");
//			char ch1 = scan.next().toUpperCase().charAt(0);
//			
//			System.out.println("L�tfen biti� harfini giriniz");
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
//			}else {System.out.println("Hatal� Character girdiniz!");}
//			scan.close();
			
			
//	7-Kullan�c�dan bir rakam al�n ve bu rakam icin �arp�m tablosunu ekrana yazd�r�n.
//	Kullan�c�n�n hata yapmad���n� farz edin.
//	Ornegin kullan�c� 3 girerse;
//	3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
//			
//			Scanner scan =new Scanner(System.in);
//			System.out.println("L�tfen bir rakam giriniz");
//				int num = scan.nextInt();
//				if(num>=0 && num<=9) {
//					int num2 = 1;
//					while(num2<=10) {
//			System.out.print(num+"x"+num2+"="+(num2*num)+" ");
//					num2++;		}
//				}else { System.out.println("Hatal� rakam girdiniz! Rakamlar 0 ile ba�lar ve 9 da biter.");};
//			scan.close();
			
					
		}			

}
