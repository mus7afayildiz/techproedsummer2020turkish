package day04operators;

import java.util.Scanner;

public class OdevTekrar {

	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Yer de�i�tirmek i�in bir say� girniz");
		int say�1 = scan.nextInt();
		System.out.println("Yer de�i�tirmek i�in di�er say�y� giriniz");
		int say�2 = scan.nextInt();
		System.out.println("Yer de�i�tirmeden �nce");
		System.out.println(say�1);
		System.out.println(say�2);
		int say�3 = 0;
		say�3 = say�1;
		say�1 = say�2;
		say�2 = say�3;
		System.out.println("Yer de�i�tirdikten sonra");
		System.out.println(say�1);
		System.out.println(say�2);*/
		
		/*Scanner scan  = new Scanner(System.in);
		System.out.println("D�rt basamakl� bir say� giriniz");
		int say�1 = scan.nextInt();
		System.out.println(say�1/1000);
		System.out.println((say�1%1000)/100);
		System.out.println((say�1%100)/10);
		System.out.println(say�1%10);*/
		
		
		
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
		
		
		/*1. �dev
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamakl� bir say� giriniz");
		
		int say�1 = scan.nextInt();
		int ilkRakam = say�1%10;
		int sonRakam = say�1/1000;
		
		System.out.println(ilkRakam+sonRakam);*/
		
		//2. �dev
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("D�rt basamakl� bir say� giriniz");
		
		int say�1 = scan.nextInt();
		System.out.println(say�1/1000);
		System.out.println((say�1%1000)/100);
		System.out.println((say�1%100)/10);
		System.out.println(say�1%10);
		
		
		
		int birinciBasamak = say�1 % 10;
		int ikinciBasamak = (say�1%100)/10;
		int ���nc�Basamak = (say�1%1000)/100;
		int d�rd�nc�Basamak = say�1/1000;
		
		System.out.println(birinciBasamak + ikinciBasamak + ���nc�Basamak + d�rd�nc�Basamak);
				
		
		

		
		
		
	}

}
