package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		//Kullanýcý karenin bir kenar uzunluðunu girsin
		//Karenin çevresini ve alanýný ekrana yazdýralým
		//Karenin çevresi a+a+a+a alaný a*a dýr
				
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen karenin bir kenar uzunluðunu giriniz");
		int kenarUzunlugu = scan.nextInt();
		System.out.println(kenarUzunlugu + kenarUzunlugu + kenarUzunlugu + kenarUzunlugu);
		System.out.println(kenarUzunlugu * kenarUzunlugu);
		
		
		
		

	}

}
