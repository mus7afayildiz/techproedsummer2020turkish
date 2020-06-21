package day02wrapperclassesodev;

import java.util.Scanner;

public class dikdörtgenlerprizmasi {

	public static void main(String[] args) {
		
		/*Boyutlarý kullanýcýdan alýnan bir dikdörtgenler 
		 prizmasýnýn hacmini hesaplayan bir program yazýnýz. 
		 Not: Dikdörtgenler Prizmasýnýn Hacmi:  En x Boy x Yükseklik */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hacim hesaplamak için en, boy, ve yükseklik giriniz:");
		
		int en = scan.nextInt();
		
		int boy = scan.nextInt();
		
		int yükseklik= scan.nextInt();
		
		System.out.println(en*boy*yükseklik);

	}

}
