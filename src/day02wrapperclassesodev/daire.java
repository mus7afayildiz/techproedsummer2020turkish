package day02wrapperclassesodev;

import java.util.Scanner;

public class daire {

	public static void main(String[] args) {
		/*5)Yar��ap� kullan�c�dan al�nan bir dairenin �evresini ve 
		 	alan�n� hesaplayan  bir program yaz�n�z. (float kullan�n�z) 
		 	Not 1: pi say�s�: 3.14159 
			Not 2: Alan: 3.14159 x radius x radius Not 3: Cevre: 2 x 3.14159 x radius*/
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dairenin yar��ap�n� giriniz: ");
		
		float yar��ap = scan.nextFloat();
		
		System.out.println(2 *  3.14159 * yar��ap);
		
		System.out.println(3.14159 * yar��ap * yar��ap);
		
	
	
	}

}
