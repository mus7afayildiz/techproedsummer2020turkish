package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		//Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n.
		//Di�er durumlarda ekrana �Harf de�il� yazd�r�n.	
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Bir character giriniz");
		char harf = scan.next().charAt(0);//Kullan�c�dan char almak i�in next().charAt(0) kullan�l�r.
		
		if((harf<122 && harf>97) ||(harf<=90 && harf>=65)) {
			System.out.println("Bu bir harftir");
		}else {
			System.out.println("Bu bir harf de�ildir");
		}
		

	}

}
