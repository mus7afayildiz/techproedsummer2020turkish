package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//kullanýcý iki tamsayý versin
		//program bu tamsayýlarýn toplamýný ve çarpýmýný ekrana yazsýn.
		
		Scanner scan = new Scanner(System.in);// Scanner class ýný import ettik.
		System.out.println("Lütfen iki tamsayý giriniz.");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		System.out.println(sayi1+sayi2);
		System.out.println(sayi1*sayi2);
		
		
		//Kullanýcý karenin bir kenar uzunluðunu girsin
		//Karenin çevresini ve alanýný ekrana yazdýralým
		//Karenin çevresi a+a+a+a alaný a*a dýr
	
		
	}

}
