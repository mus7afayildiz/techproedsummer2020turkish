package day02wrapperclassesodev;

import java.util.Scanner;

public class dikd�rtgen {

	public static void main(String[] args) {
		
	/*1)Kullan�c�dan dikd�rtgenin boyutlar�n� alan ve sonra 
		dikt�rtgenin alan ve  cevresini hesaplay�p ekrana 
		yazd�ran bir program yaz�n�z. 
		Not: Alan: Boy x En Not: �evre: 2x (Boy + En)*/
		
		System.out.println("Dikd�rtgenin en ve boyunu giriniz:");
		
		Scanner scan  = new Scanner(System.in);
		
		int en = scan.nextInt();
		
		int boy = scan.nextInt();
		
		System.out.println((en + boy)*2);
		
		System.out.println(en*boy);
		
		
		
	}

}
