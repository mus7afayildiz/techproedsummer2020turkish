package day15methodcreation;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		
//	2-Kullan�c�dan iki say� al�n bu say�lar e�it ise ekrana �E�it�, birinci say� b�y�k ise ekrana
//	�Birinci say� b�y�k�, ikinci say� b�y�k ise ekrana �Ikinci say� b�y�k� yazd�r�n�z.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci say�y� giriniz");
		int num1 = scan.nextInt();
		
		System.out.println("�kinci say�y� giriniz");
		int num2 = scan.nextInt();
		
		kars�last�rma (num1,num2);
		scan.close();
	}

	public static void kars�last�rma (int num1, int num2) {
		
		if(num1==num2) {System.out.println("E�it");
		}else if(num1>num2) {System.out.println("Birinci say� b�y�k");
		}else if(num1<num2) {System.out.println("�kinci say� b�y�k");}
		
	}	
}
