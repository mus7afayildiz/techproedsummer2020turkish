package day02wrapperclassesodev;

import java.util.Scanner;

public class km_mil {

	public static void main(String[] args) {
		/*7)Mil�i kilometreye �eviren bir program yaz�n�z. 
			(double kullan�n�z) Not 1: km = mile x 1.6*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mil olarak uzunlu�u giriniz:");
		
		double mil = scan.nextDouble();
		
		System.out.println(mil*1.6);
		
		
		

	}

}
