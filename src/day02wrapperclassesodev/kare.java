package day02wrapperclassesodev;

import java.util.Scanner;

public class kare {
	/* 1)Kullan�c�dan karenin kenar uzunlu�unu alan ve sonra bu 
	  	karenin alan ve  �evresini hesaplay�p ekrana yazd�ran bir program yaz�n�z. 
	  	Not: Alan: Boy x En Not: �evre: 2x (Boy + En)*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Karenin kenar uzunlugunu giriniz l�tfen:");
		
		int kareninKenari=scan.nextInt();
		
		System.out.println(kareninKenari*4);
		
		System.out.println(kareninKenari*kareninKenari);

	}

}
