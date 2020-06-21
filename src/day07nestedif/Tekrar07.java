package day07nestedif;

import java.util.Scanner;

public class Tekrar07 {
	public static void main(String[] args) { 
		// Kullanicidan yil girmesini isteyin
        // Girilen yil artik yil ise ekrana "Artik Yil" yazdirin
        // Girilen yil artik yil degil ise ekrana "Artik Yil Degil" yazdirin.
        
        // Artik yil 1) Yil 100 e bolunurse 400 e de bolunmeli ==> 1300 artik yil degil cunku 100 e bolundugu halde 400 e bolunmuyor.
        //                                                     ==> 1200 artik yildir cunku 100 e bolunuyor ve 400 e de bolunuyor.
        //           2) Yil 100 e bolunmezse 4 e bolunmeli 
		
		/*
	 	Scanner scan = new Scanner(System.in);
		 
		System.out.println("Bir yıl giriniz");
		int year = scan.nextInt();
		if(year%100==0 && year%400==0) {
			System.out.println(year+" Artık yıl");	
			
		}else if(year%100!=0 && year%400!=0){
			System.out.println(year+" Artık yıl değil");
			
		}else {
			System.out.println(year+" Artık yıl değil");
		}
		
		scan.close();		*/
		
		
		
		
		// Kullanicidan  bir sayi alin
        // Bu sayi pozitif veya sifir ise 9 dan buyuk mu diye kontrol edin, 9 dan buyuk ise ekrana "Sayi" yazdirin
        // 9 dan kucuk esit ve 0'dan buyuk esit ise ekrana "Rakam" yazdirin
        // Bu sayi negatif ise ekrana "Sayi" yazdirin
		
	/*	Scanner scan = new Scanner(System.in);
		 
		System.out.println("Bir sayı giriniz");
		int num = scan.nextInt();
		if(num>=0) {
			if(num>9) {
				System.out.println("Sayi");
				
			}else if(num>=0 && num<=9) {
		System.out.println("Rakam");
		}
	}else if(num<0) {System.out.println("Sayi");
	}			*/

		
		// Kullanicidan password girmesini isteyin
        // Password 4 basamakli bir sayi ise cift olup olmadigini kontrol edin
        // Cift sayi ise ekrana "Password tamam" yazdirin, Tek sayi ise "Tekrar deneyin ilk" yazdirin
        // Password 4 basamakli degil ise "Tekrar deneyin son" yazdirin
        
        // 4 basamakli demek 999 dan buyuk 10000 den kucuk demektir.
        
        //0123 Java icin 123 demektir
		
		/*
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Bir password giriniz");
		int password = scan.nextInt();
		
		if(password>999 && password<10000) {
		if(password%2==0) {System.out.println("password tamam");
			
		}else if(password%2!=0) {System.out.println("Tekrar deneyin ilk");
		}
		}else  {System.out.println("Tekrar deneyin son");
		}			
		scan.close(); 	*/
		
		
		
		
		
				
		// Kullanicidan yil girmesini isteyin
        // Girilen yil artik yil ise ekrana "Artik Yil" yazdirin
        // Girilen yil artik yil degil ise ekrana "Artik Yil Degil" yazdirin.
        
        // Artik yil 1) Yil 100 e bolunurse 400 e de bolunmeli ==> 1300 artik yil degil cunku 100 e bolundugu halde 400 e bolunmuyor.
        //                                                     ==> 1200 artik yildir cunku 100 e bolunuyor ve 400 e de bolunuyor.
        //           2) Yil 100 e bolunmezse 4 e bolunmeli 
		
		/*
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Bir yıl giriniz");
		int year = scan.nextInt();
		if(year%100==0 ) {
			if(year%400==0){
			System.out.println(year+" Artik Yil");
			
		}else {System.out.println(year+" Artik Yil Degil");
		
		}}else 	if(year%100!=0) {
				
			if(year%4==0){System.out.println(year+" Artik Yil");
		}
			
		}else {System.out.println(year+" Artik Yil Degil");
		}		
		scan.close();	*/
		
		
		
		
		//Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
		//Diğer durumlarda ekrana “Harf değil” yazdırın.
		/*
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Bir character giriniz");
		
		char character = scan.next().charAt(0);
		if ((character>=65 && character<=90) || (character>=97 && character<=122)) 
		{System.out.println("Harf");
			
		}else {
		{System.out.println("Harf değil");	
		}}		*/
		
		
		
		
		// Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
        //“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. 
        //“Pazar” ise ekrana “Hıristiyanlar icin kutsal gün” yazdırın.
        // Diger gunler icin ekrana "Kutsal gun degil" yazdirin.
		
		/*
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Bir gün giriniz");
		
		String day = scan.next();
		
		if(day.equalsIgnoreCase("cuma")){System.out.println(day+" Müslümanlar icin kutsal gün");
			
		}else if(day.equalsIgnoreCase("cumartesi")){System.out.println(day+" Yahudiler icin kutsal gün");
		
		}else if(day.equalsIgnoreCase("pazar")){System.out.println(day+" Hıristiyanlar icin kutsal gün");
		}else {System.out.println(day+" kutsal gün değildir");
				}		*/
		
		
		
		// Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
        //“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
		
		/*
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		if(harf=='a' || harf=='e' ||harf=='i' ||harf=='o' ||harf=='u') {
			System.out.println("Sesli harf");
		}else if(harf=='b' || harf=='c' ||harf=='d' ||harf=='f') {
			System.out.println("Sessiz harf");
		}else {System.out.println("Yanlış harf girdiniz");} 	*/
		
		
		
		
	}
	}
