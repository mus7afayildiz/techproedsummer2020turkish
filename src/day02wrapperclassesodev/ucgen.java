package day02wrapperclassesodev;

import java.util.Scanner;

public class ucgen {

	public static void main(String[] args) {
		/*6)Kenar uzunluklar� kullan�c�dan al�nan bir ��genin �evresini hesaplayan bir  
		 	Program yaz�n�z. 
		 	(byte kullan�n�z) Not 1: ��genin Cevresi: a + b + c*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��genin ayr�t uzunluklar�n� giriniz:");
		
		byte ayr�t1 = scan.nextByte();
		byte ayr�t2 = scan.nextByte();
		byte ayr�t3 = scan.nextByte();
		
		System.out.println(ayr�t1+ayr�t2+ayr�t3);

	}

}
