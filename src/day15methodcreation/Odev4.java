package day15methodcreation;

import java.util.Scanner;

public class Odev4 {

	public static void main(String[] args) {
//	4-	Kullanýcýya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayý seçmesini söyleyin.
//		Hangi þekli seçerse, o þeklin alanýný ve çevresini ekrana yazdýran programý yazýnýz.
	
	Scanner scan = new Scanner(System.in);
		System.out.println("paralelkenar, dikdörtgen ve üçgen þekillerinin birisini seçin");
		String sekil = scan.next();
		
		System.out.println("Alaný ve çevresini hesaplamak için birinci sayýyý giriniz");
		double num1 =scan.nextDouble();
		
		System.out.println("Alaný ve çevresini hesaplamak için ikinci sayýyý giriniz");
		double num2 =scan.nextDouble();
			hesaplama (num1,num2,sekil);
		scan.close();
	}
	public static void hesaplama(double num1, double num2, String sekil) {
		
		switch(sekil) {
		case "paralelkenar":
			System.out.println("paralelkenarýn alaný : " +num1*num2);
			System.out.println("paralelkenarýn çevresi : "+(num1+num2)*2);
			break;
			
		case "dikdörtgen":
			System.out.println("dikdörtgenin alaný : "+num1*num2);
			System.out.println("dikdörtgen çevresi : "+(num1+num2)*2);
			break;
			
		case "üçgen":
			System.out.println("üçgenin alaný : "+num1*num2/2);
			System.out.println("üçgenin çevresi : "+num1*3);
			break;
			
		default:
			System.out.println("Yanlýþ giriþ yaptýnýz");
	}
	}	
}
