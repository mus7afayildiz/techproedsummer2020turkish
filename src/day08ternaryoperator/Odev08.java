package day08ternaryoperator;

import java.util.Scanner;

public class Odev08 {

	public static void main(String[] args) {
		
//		1- Kullan�c�dan bir tamsay� girmesini isteyin, tamsay� �ift ise ekrana ��ift� tek ise ekrana �Tek�
//		yazd�r�n.
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� giriniz");
		int num = scan.nextInt();
		String result = num%2==0? "�ift" : "tek";
		System.out.println(num+" say�s� "+result);
		scan.close();    */
		
//		2-	Kullan�c�dan iki tamsay� girmesini isteyin, ekrana her zaman b�y�k olan�n� yazd�r�n	
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bir tamsay� giriniz");
		int num2 = scan.nextInt();
		int result= num1<num2? num2:num1;
		System.out.println("B�y�k say�: "+result);
		scan.close();	*/
		
		
		
		
//		3-	Kullan�c�dan bir tamsay� girmesini isteyin, ekrana o tamsay�n�n mutlak degerini yazd�r�n.		
	 
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� giriniz");
		int num = scan.nextInt();
		int result = num<0? num*(-1) : num;
		System.out.println(result);		
		scan.close();	*/
		
		
//		4-	Kullan�c�dan bir dikd�rtgenin en ve boyunu girmesini isteyin. En ve boy e�it ise ekrana �Kare�
//		farkl� ise ekrana �Dikd�rtgen� yazd�r�n.    
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("dikd�rtgenin enini giriniz");
		int en = scan.nextInt();
		System.out.println("dikd�rtgenin boyunu giriniz");
		int boy = scan.nextInt();
		String result = en==boy? "kare" : "dikd�rtgen";
		System.out.println("Bu bir "+result+"dir");	
		scan.close();		*/
		
//		5-	Kullan�c�dan bir tamsay� girmesini isteyin, o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
//		3 basamakl� degilse �ift olup olmadigini kontrol edin. �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
//		�ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�		
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� giriniz");
		int num = scan.nextInt();
		String result = num<1000 && num>99?	"3 basamakl�" : 
		(num%2==0? "3 basamakl� olmayan �ift say�" :	"3 basamakl� olmayan tek say� ");	
		System.out.println(num+" say�s� "+result+"d�r.");	
		scan.close();		*/
		
	
//		6-	Kullan�c�dan bir y�l girmesini isteyin, y�l art�k y�l ise ekrana �Art�k y�l� degilse ekrana �Art�k y�l degil�
//		yazd�r�n.	
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir y�l giriniz");
		int year = scan.nextInt();
		String result = (year%100==0 && year%400==0)?	"Art�k y�l" : 
		(year%100!=0 && year%4==0? "Art�k y�l" : "Art�k y�l degil");
		System.out.println(result); 	
		scan.close();		*/
		
		
		
	}
}
