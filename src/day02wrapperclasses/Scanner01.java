package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//kullan�c� iki tamsay� versin
		//program bu tamsay�lar�n toplam�n� ve �arp�m�n� ekrana yazs�n.
		
		Scanner scan = new Scanner(System.in);// Scanner class �n� import ettik.
		System.out.println("L�tfen iki tamsay� giriniz.");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		System.out.println(sayi1+sayi2);
		System.out.println(sayi1*sayi2);
		
		
		//Kullan�c� karenin bir kenar uzunlu�unu girsin
		//Karenin �evresini ve alan�n� ekrana yazd�ral�m
		//Karenin �evresi a+a+a+a alan� a*a d�r
	
		
	}

}
