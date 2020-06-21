package day02wrapperclassesodev;

import java.util.Scanner;

public class km_mil {

	public static void main(String[] args) {
		/*7)Mil’i kilometreye çeviren bir program yazýnýz. 
			(double kullanýnýz) Not 1: km = mile x 1.6*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mil olarak uzunluðu giriniz:");
		
		double mil = scan.nextDouble();
		
		System.out.println(mil*1.6);
		
		
		

	}

}
