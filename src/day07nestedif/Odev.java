package day07nestedif;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		/*
		Kullan�c�dan cinsiyetini girmesini isteyin.
		Erkek ise ya��n� kontrol edin. Ya�� 18 den k���k ise ekrana �Erkek �ocuk� yazd�r�n.
		Ya�� 18 den b�y�k e�it ise ekrana �Adam� yazd�r�n.
		Kadin ise yasini kontrol edin. Ya�� 18 den k���k ise ekrana �K�z �ocuk� yazd�r�n.
		Ya�� 18 den b�y�k e�it ise ekrana �Kad�n� yazd�r�n.		*/
	
		/*
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cinsiyetinizi giriniz");
		String cinsiyet = scan.next();
		
		if(cinsiyet.equalsIgnoreCase("erkek")){System.out.println("Ya��n�z� giriniz");
		int age1 = scan.nextInt();
		
		if(age1<18) {System.out.println("Erkek �ocuk");
		
		}else if(age1>=18) {System.out.println("Adam");
		
		}
		}else if(cinsiyet.equalsIgnoreCase("kad�n")){System.out.println("Ya��n�z� giriniz");
		
		int age2 = scan.nextInt();
		
		if(age2<18) {System.out.println("K�z �ocuk");
		
		}else if(age2>=18) {System.out.println("Kad�n");}}	*/

		
		
		/*
		Kullan�c�dan bir harf girmesini isteyin.
		Girdi�i k���k harf ise harfin �a� olup olmad���n� kontrol edin. Harf �a� ise ekrana �Ilk k���k harf� yazd�r�n.
		�a� de�il ise ekrana �Ilk k���k harf de�il� yazd�r�n.
		Girdi�i b�y�k harf ise harfin �Z� olup olmad���n� kontrol edin. Harf �Z� ise ekrana �Son b�y�k harf� yazd�r�n.
		�Z� de�il ise ekrana �Son b�y�k harf de�il� yazd�r�n.	*/
		
		/*

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		if(harf<=122 && harf>=97) {
			
		if(harf=='a') {System.out.println("Ilk k���k harf");}
		
		else {System.out.println("Ilk k���k harf de�il");
		
		}}else if(harf<=90 && harf>=65) {
			
		if(harf=='Z') {System.out.println("Son b�y�k harf");
		
		}else {System.out.println("Son b�y�k harf de�il");}
		}		*/
		
		
		/*
		Kullan�c�dan password girmesini isteyin.
		Girdi�i password 5�e b�l�n�yorsa son rakam�n� kontrol edin. Son rakam� 0 ise ekrana �5�e b�l�nen �ift say�� yazd�r�n.
		Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.
		Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.		*/
	
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir password giriniz");
		int password = scan.nextInt();
		
		if(password%5==0) {if(password%10==0) 
		{System.out.println("5�e b�l�nen �ift say�");
		
		}else if(password%10!=0) 
		{System.out.println("5�e b�l�nen tek say�");
		
		}}else if(password%5!=0) 
		{System.out.println("Tekrar deneyin");}	
		
		scan.close();
	}}


