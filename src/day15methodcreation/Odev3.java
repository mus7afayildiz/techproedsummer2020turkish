package day15methodcreation;

import java.util.Scanner;

public class Odev3 {

	
	
	public static void main(String[] args) {
		
//	3- Kullan�c�ya say� girmesini s�yleyin. Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n� ekrana
//	yazd�ran bir program yaz�n.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say�y� giriniz");
		int num = scan.nextInt();
		rakamlar�Toplam�(num);
		scan.close();
		
	}

	public static void rakamlar�Toplam�(int num) {
		int sum = 0;
		while(num!=0){
		
			sum = sum + num%10;
			num/=10;
			
		} 
		System.out.println("Rakamlar� toplam� : "+ sum);
}}
