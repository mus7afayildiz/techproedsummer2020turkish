package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		//Kullan�c� karenin bir kenar uzunlu�unu girsin
		//Karenin �evresini ve alan�n� ekrana yazd�ral�m
		//Karenin �evresi a+a+a+a alan� a*a d�r
				
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen karenin bir kenar uzunlu�unu giriniz");
		int kenarUzunlugu = scan.nextInt();
		System.out.println(kenarUzunlugu + kenarUzunlugu + kenarUzunlugu + kenarUzunlugu);
		System.out.println(kenarUzunlugu * kenarUzunlugu);
		
		
		
		

	}

}
