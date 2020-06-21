package day15methodcreation;

import java.util.Scanner;

public class Odev3 {

	
	
	public static void main(String[] args) {
		
//	3- Kullanýcýya sayý girmesini söyleyin. Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný ekrana
//	yazdýran bir program yazýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayýyý giriniz");
		int num = scan.nextInt();
		rakamlarýToplamý(num);
		scan.close();
		
	}

	public static void rakamlarýToplamý(int num) {
		int sum = 0;
		while(num!=0){
		
			sum = sum + num%10;
			num/=10;
			
		} 
		System.out.println("Rakamlarý toplamý : "+ sum);
}}
