package day02wrapperclassesodev;

import java.util.Scanner;

public class saat {

	public static void main(String[] args) {
		/* 8)Saati saniyeye �eviren bir program yaz�n�z. 
			(long kullan�n�z) Not 1: Saniye = Saat x 60 x 60 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Saniyeye �evirmek istedi�iniz saati yaz�n�z:");
		
		long saat = scan.nextLong();
		
		System.out.println(saat*60*60);
		
		

	}

}
