package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//Kullan�c�sdan al�nan bir say�n�n k�p�n� hesaplay�n 
		//Not:a'n�n k�p� a*a*a
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz");
		int say�= scan.nextInt();
		System.out.println(say�*say�*say�);
				
		

	}

}
