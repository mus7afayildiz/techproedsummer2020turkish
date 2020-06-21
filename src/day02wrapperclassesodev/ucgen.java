package day02wrapperclassesodev;

import java.util.Scanner;

public class ucgen {

	public static void main(String[] args) {
		/*6)Kenar uzunluklarý kullanýcýdan alýnan bir üçgenin çevresini hesaplayan bir  
		 	Program yazýnýz. 
		 	(byte kullanýnýz) Not 1: Üçgenin Cevresi: a + b + c*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("üçgenin ayrýt uzunluklarýný giriniz:");
		
		byte ayrýt1 = scan.nextByte();
		byte ayrýt2 = scan.nextByte();
		byte ayrýt3 = scan.nextByte();
		
		System.out.println(ayrýt1+ayrýt2+ayrýt3);

	}

}
