package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
	// Kullýnýcýdan 3 basamaklý bir tamsayý alýn bu sayýnýn rakamlarý toplamýný bulun.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Üçbasamklý bir tamsayý giriniz");
		
		int sayý = scan.nextInt();
		int sonRakam =sayý % 10;
		int v = sayý / 10;
		int ortaRakam = v % 10;
		int ilkRakam = sayý / 100;//3 basamaklý sayýlarýn ilk rakamýný
								  //bulmak için sayý 100 e bölünür.
								  //4 basamaklý sayýlarýn ilk rakamýný
		                          //bulmak için sayý 1000 e bölünür.	
		System.out.println(ilkRakam + ortaRakam + sonRakam);
		
		
		

	}

}
