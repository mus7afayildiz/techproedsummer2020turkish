package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		//kullan�c�dan ad ve soyad al�p ekrana yazd�ran bir program yaz�n.
		//(String kullan�n�z)

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ad�n�z� ve soyad�n�z� giriniz:");
		String isim = scan.nextLine();
		//Stringleri almak i�in 
		//next() veya nextLine() kullan�r�z.
		//next() tek kelimelik Stringler i�in  kullan�l�r.
		//nextLine() girilen t�m String'i almak i�in kullan�l�r.	
		System.out.println(isim);
	
	
	}

}
