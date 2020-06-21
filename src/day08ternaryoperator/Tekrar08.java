package day08ternaryoperator;

import java.util.Scanner;

public class Tekrar08 {

	public static void main(String[] args) {
//	01	Kullanicidan bir sayi aliniz
//      Sayi pozitif veya 0 ise ekrana "Pozitif veya 0" yaziniz.
//      Sayi negatif ise ekrana "Negatif" yaziniz.
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int num = scan.nextInt();
		String result = num>=0?	"Pozitif"	:"Negatif";
		System.out.println(num + " sayýsý " + result );		
		scan.close();	*/
		
	
//	02	Kullanicidan iki sayi alin
//      Bu sayilar birbirine esit ise toplamlarini ekrana yazdirin
//      Bu sayilar birbirinden farkli ise carpimlarini ekrana yazdirin

	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bir sayý daha giriniz");
		int num2 = scan.nextInt();
		
		int result = num1==num2? num1+num2 : num1*num2;
		System.out.println(result);		*/
		
		
		
//	03	Kullanicidan iki sayi aliniz
//      Kucuk sayiyi ekrana yazdiriniz
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bir sayý daha giriniz");
		int num2 = scan.nextInt();
		int result= num1<num2? num1:num2;
		System.out.println(result);
		scan.close();	*/
		
		
//		Kullanicidan bir sayi aliniz
//      Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
//      10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
//      Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int num = scan.nextInt();
		String result = num>=0? num<10? "Rakam": "Pozitif sayý"	:"Negatif sayý";
		System.out.println(result);
		scan.close();	*/
		
		
//		Kullanicidan bir character girmesini isteyiniz
//      Character harf ise kucuk harf olup olmadigini kontrol ediniz
//      Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
//      Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
//      Harf degilse ekrana "Harf degil" yazdiriniz
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir character giriniz");
		char cha = scan.next().charAt(0);
		String result = (cha>='a' && cha<='z')?  "Kucuk Harf" : (cha>='A' && cha<='Z')? "Buyuk Harf" :	"Harf degil";
		System.out.println(result);
		scan.close();		*/
		
		

//		Kullanicidan bir sayi aliniz 
//      cift ise 10a bolunup bolunmedigini kontrol ediniz
//      sayi 10a bolunuyorsa "woww 10"yazdiriniz
//      10 bolunmuyorsa "yazik 10" yazdiriniz
//      sayi tek ise 5e bolunup bolunmedigini kontrol ediniz
//      sayi 5e bolunurse "woow5"
//      5bolunmuyorsa "yazik5" yazdiriniz
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int num = scan.nextInt();
		String result = num%2==0? num%10==0? "woow 10 " : "yazýk 10"  :num%5==0? "woow 5" : "yazýk 5";
		System.out.println(result);
		scan.close();		*/
	}

}
