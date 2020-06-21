package day02wrapperclassesodev;

import java.util.Scanner;

public class daire {

	public static void main(String[] args) {
		/*5)Yarýçapý kullanýcýdan alýnan bir dairenin çevresini ve 
		 	alanýný hesaplayan  bir program yazýnýz. (float kullanýnýz) 
		 	Not 1: pi sayýsý: 3.14159 
			Not 2: Alan: 3.14159 x radius x radius Not 3: Cevre: 2 x 3.14159 x radius*/
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dairenin yarýçapýný giriniz: ");
		
		float yarýçap = scan.nextFloat();
		
		System.out.println(2 *  3.14159 * yarýçap);
		
		System.out.println(3.14159 * yarýçap * yarýçap);
		
	
	
	}

}
