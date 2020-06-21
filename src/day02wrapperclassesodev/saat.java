package day02wrapperclassesodev;

import java.util.Scanner;

public class saat {

	public static void main(String[] args) {
		/* 8)Saati saniyeye çeviren bir program yazýnýz. 
			(long kullanýnýz) Not 1: Saniye = Saat x 60 x 60 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Saniyeye çevirmek istediðiniz saati yazýnýz:");
		
		long saat = scan.nextLong();
		
		System.out.println(saat*60*60);
		
		

	}

}
