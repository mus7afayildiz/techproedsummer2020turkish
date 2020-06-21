package day08ternaryoperator;

import java.util.Scanner;

public class TerneryOperator06 {

	public static void main(String[] args) {
		
		//Kullanicidan bir sayi aliniz 
        //cift ise 10a bolunup bolunmedigini kontrol ediniz
        //sayi 10a bolunuyorsa "woww 10"yazdiriniz
        //10 bolunmuyorsa "yazik 10" yazdiriniz
        //sayi tek ise 5e bolunup bolunmedigini kontrol ediniz
        //sayi 5e bolunurse "woow5"
        //5bolunmuyorsa "yazik5" yazdiriniz
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Bir sayý giriniz");
		
		int num = scan.nextInt();
		
	String result= num%2==0 ? (num%10==0? "woow 10" : "Yazýk 10"): num%5==0 ? "woow 5" : "Yazýk 5";
		
	System.out.println(result);
		
	}}


