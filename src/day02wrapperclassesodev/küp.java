package day02wrapperclassesodev;

import java.util.Scanner;

public class k�p {

	public static void main(String[] args) {
		/*2)Kullan�c�dan al�nan bir say�n�n k�p�n� 
		 	hesaplayan bir program yaz�n�z. Not: a� n�n k�p�: a x a x a*/

		System.out.println("Bir say� giriniz: ");
		
		Scanner scan = new Scanner(System.in);
		
		int say� = scan.nextInt();
		
		System.out.println(say�*say�*say�);
		
	}

}
