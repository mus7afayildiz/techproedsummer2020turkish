package day02wrapperclassesodev;

import java.util.Scanner;

public class dikd�rtgenlerprizmasi {

	public static void main(String[] args) {
		
		/*Boyutlar� kullan�c�dan al�nan bir dikd�rtgenler 
		 prizmas�n�n hacmini hesaplayan bir program yaz�n�z. 
		 Not: Dikd�rtgenler Prizmas�n�n Hacmi:  En x Boy x Y�kseklik */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hacim hesaplamak i�in en, boy, ve y�kseklik giriniz:");
		
		int en = scan.nextInt();
		
		int boy = scan.nextInt();
		
		int y�kseklik= scan.nextInt();
		
		System.out.println(en*boy*y�kseklik);

	}

}
