package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		//kullanýcýdan ad ve soyad alýp ekrana yazdýran bir program yazýn.
		//(String kullanýnýz)

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen adýnýzý ve soyadýnýzý giriniz:");
		String isim = scan.nextLine();
		//Stringleri almak için 
		//next() veya nextLine() kullanýrýz.
		//next() tek kelimelik Stringler için  kullanýlýr.
		//nextLine() girilen tüm String'i almak için kullanýlýr.	
		System.out.println(isim);
	
	
	}

}
