package day15methodcreation;

import java.util.Random;
import java.util.Scanner;

public class Odev6 {

	public static void main(String[] args) {
		
//	6- do_while kullanarak bir oyun tasarlayýn

		//1 den 5 e kadar bir sayý girerek doðru sayýyý tahmin etme oyunu...
		
		int num1 = 6 ;
		
		Random random= new Random();
	    int num2 = random.nextInt(5);
	    // System.out.println(num2);
		game (num1,num2);
			}
	public static void game(int num1, int num2) {
		
		do {
			
			if(num1!=num2) {
				Scanner scan = new Scanner(System.in);
			System.out.println("1'den 5'ye kadar bir sayý girerek tahminde bulununuz");
				num1 = scan.nextInt();}			
		}while(num1!=num2);
			System.out.println(num2);
			System.out.println("Doðru tahmin ettiniz 100 puan kazandýnýz");

		}

	}
