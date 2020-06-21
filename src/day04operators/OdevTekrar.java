package day04operators;

import java.util.Scanner;

public class OdevTekrar {

	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Yer deðiþtirmek için bir sayý girniz");
		int sayý1 = scan.nextInt();
		System.out.println("Yer deðiþtirmek için diðer sayýyý giriniz");
		int sayý2 = scan.nextInt();
		System.out.println("Yer deðiþtirmeden önce");
		System.out.println(sayý1);
		System.out.println(sayý2);
		int sayý3 = 0;
		sayý3 = sayý1;
		sayý1 = sayý2;
		sayý2 = sayý3;
		System.out.println("Yer deðiþtirdikten sonra");
		System.out.println(sayý1);
		System.out.println(sayý2);*/
		
		/*Scanner scan  = new Scanner(System.in);
		System.out.println("Dört basamaklý bir sayý giriniz");
		int sayý1 = scan.nextInt();
		System.out.println(sayý1/1000);
		System.out.println((sayý1%1000)/100);
		System.out.println((sayý1%100)/10);
		System.out.println(sayý1%10);*/
		
		
		
		/*Scanner scan  = new Scanner(System.in);
		int x = 1;
		int y = 2;
		
		System.out.println(x);
		System.out.println(y);
		x = x+y;
		y = x-y;
		
		x =	x-y;	
				
		System.out.println(x);
		System.out.println(y);*/
		
		
		/*1. ödev
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamaklý bir sayý giriniz");
		
		int sayý1 = scan.nextInt();
		int ilkRakam = sayý1%10;
		int sonRakam = sayý1/1000;
		
		System.out.println(ilkRakam+sonRakam);*/
		
		//2. ödev
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Dört basamaklý bir sayý giriniz");
		
		int sayý1 = scan.nextInt();
		System.out.println(sayý1/1000);
		System.out.println((sayý1%1000)/100);
		System.out.println((sayý1%100)/10);
		System.out.println(sayý1%10);
		
		
		
		int birinciBasamak = sayý1 % 10;
		int ikinciBasamak = (sayý1%100)/10;
		int üçüncüBasamak = (sayý1%1000)/100;
		int dördüncüBasamak = sayý1/1000;
		
		System.out.println(birinciBasamak + ikinciBasamak + üçüncüBasamak + dördüncüBasamak);
				
		
		

		
		
		
	}

}
