package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
	// Kull�n�c�dan 3 basamakl� bir tamsay� al�n bu say�n�n rakamlar� toplam�n� bulun.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��basamkl� bir tamsay� giriniz");
		
		int say� = scan.nextInt();
		int sonRakam =say� % 10;
		int v = say� / 10;
		int ortaRakam = v % 10;
		int ilkRakam = say� / 100;//3 basamakl� say�lar�n ilk rakam�n�
								  //bulmak i�in say� 100 e b�l�n�r.
								  //4 basamakl� say�lar�n ilk rakam�n�
		                          //bulmak i�in say� 1000 e b�l�n�r.	
		System.out.println(ilkRakam + ortaRakam + sonRakam);
		
		
		

	}

}
