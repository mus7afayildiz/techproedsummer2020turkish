package day15methodcreation;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		
//	2-Kullanýcýdan iki sayý alýn bu sayýlar eþit ise ekrana “Eþit”, birinci sayý büyük ise ekrana
//	“Birinci sayý büyük”, ikinci sayý büyük ise ekrana “Ikinci sayý büyük” yazdýrýnýz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayýyý giriniz");
		int num1 = scan.nextInt();
		
		System.out.println("Ýkinci sayýyý giriniz");
		int num2 = scan.nextInt();
		
		karsýlastýrma (num1,num2);
		scan.close();
	}

	public static void karsýlastýrma (int num1, int num2) {
		
		if(num1==num2) {System.out.println("Eþit");
		}else if(num1>num2) {System.out.println("Birinci sayý büyük");
		}else if(num1<num2) {System.out.println("Ýkinci sayý büyük");}
		
	}	
}
