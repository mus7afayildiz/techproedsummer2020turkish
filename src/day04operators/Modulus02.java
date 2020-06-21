package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaziniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamaklý bir tamsayý giriniz");
		int s = scan.nextInt();//bir tam sayýnýn birler basamaðýný bulmak için 10 a böleriz.
		int sonRakam = s%10;
		int ilkRakam = s/1000;
		
		System.out.println(sonRakam+ilkRakam);//1+4=5
		
		
		
		
		
		
		
	}

}
