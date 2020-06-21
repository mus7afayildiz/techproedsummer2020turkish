package day06ifstatement;

import java.util.Scanner;

public class Tekrar {
	public static void main(String[] args) {
		
	/*1.	
        //Bir int variable olusturun ve ona bir deger atayin.
        //Eger atadiginiz deger pozitif ise ekrana pozitif yazdirin
        //Eger atadiginiz deger negatif ise ekrana negatif yazdirin
        //0 isaretsiz bir sayidir 
		int num = 0;
		if (num==0) {System.out.println("nötr");}else
		if (num>0) {System.out.println("pozitif");}else{System.out.println("negatif");};
		//if (num<0) {System.out.println("negatif");}	*/
	
	
	/*2.  
		// Bir integer variable olusturun deger atayin
    	// Deger cift sayi ise ekrana "cift" yazdirin 
		// Deger tek sayi ise ekrana "tek" yazdirin    
	
		int num = 30;
		if(num%2==0) {System.out.println("çift");};
		if(num%2!=0) {System.out.println("tek");}; 		 */
		
		
	/*3.
	  	// Bir char variable olusturun ve bir buyuk harf deger atayin
        // Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi ise o gunleri yazdirin
        // Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi degil ise 
        // ekrana "Boyle bir gun yok" yazdirin.
        // Pazar, Pazartesi, Persembe <-> Sali <-> Carsamba, Cuma, Cumartesi		
		
		char harf = 'M';
		if(harf=='P') {System.out.println("pazar,pazartesi,perþembe");};
		if(harf=='S') {System.out.println("salý");};
		if(harf=='C') {System.out.println("çarþamba,cuma,cumartesi");
		}else {System.out.println("Böyle bir gün yok");};		*/
		
	/*4.
	 	// Bir tane String variable olusturun ve bir gun ismini kucuk harflerle deger olarak atayin
        // Eger atadiginiz deger hafta ici gunlerinden biri ise
        // ekrana "hafta ici" yazdirin.
        // Eger atadiginiz deger hafta sonu gunlerinden biri ise
        // ekrana "hafta sonu" yazdirin.
        // Hafta Ici:pazartesi, sali, carsamba, persembe, cuma
        // Hafta Sonu: cumartesi, pazar			
	 
	 	String gün = "a" ;
	 	if (gün==("cumartersi") || gün=="pazar") {System.out.println("hafta sonu");}
	 	if (gün==("pazartesi")  || gün=="salý" || gün=="çarþamba"|| gün=="persembe"|| gün=="cuma") 
	 	{System.out.println("hafta içi");}		*/
		
		
	/*5 // Kullanicidan bir dikdortgenin en ve boyunu alin.
        // En ve boy esit ise ekrana "Bu bir karedir" yazdirin
        // En ve boy farkli ise ekrana "Bu bir dikdortgendir" yazdirin			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("dikdörtgenin enini giriniz");
		double en = scan.nextDouble();
		
		System.out.println("dikdörtgenin boyunu giriniz");
		double boy = scan.nextDouble();
		
		if(en==boy) {System.out.println("Bu bir karedir");}
		if(en!=boy) {System.out.println("Bu bir dikdörtgendir");}		*/
		
		
	/*	//Kullanicidan password girmesini isteyin
        //password dogru ise ekrana "Password dogru" yazdirin
        //password yanlis ise ekrana "Password yanlis tekrar deneyin" yazdirin
        //Dogru password = Java2020		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Password giriniz");
		String password = scan.next();
		if(password.equals("Java2020")){System.out.println("password doðru");
		}else{System.out.println("Password yanlis tekrar deneyin");};		*/
		
	
	/*6.
	 	// Kullanicidan bir tamsayi isteyin ve o tamsayinin
        // mutlak degerini ekrana yazdirin
        // mutlak deger bir sayinin kendi isareti ile carpilmasi demektir
        // Ornek: -3 un mutlak degeri: -1.-3 = 3
        // Ornek: +5 in mutlak degeri: +1.+5 = 5
        // Ornek: 0 in mutlak degeri 0 dir.					
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayýyazýnýz");
		int num = scan.nextInt();
		if(num<0) {System.out.println(num*(-1));}else{System.out.println(num*1);};		*/
		
		
	/*7.// Kullanicidan alacagi urun miktarini ve fiyatini alalim
        // Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
        // ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
        // Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
        // ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
        // Para konularinda "double" kullanin
        // Ornek: 60TL ye %20 indirim ==> 60*80 /100			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alacaðýnýz ürün miktarýný giriniz");
		double miktar = scan.nextDouble();
		System.out.println("Alacaðýnýz ürünün birim fiyatýný giriniz");
		double fiyat = scan.nextDouble();
		if(miktar>1000) {System.out.println(miktar*fiyat*8/10);
		}else{System.out.println(miktar*fiyat);};		*/
		
		
	/*8.//Kullanicidan yasini alin
        //Yas 13 den az ise ekrana "Calisamaz" yazdirin
        //Yas 13 den 65 e kadar ise ekrana "Calisabilir" yazdirin
        //Yas 65 den buyuk ise ekrana "Emekli" yazdirin
        //Negatif sayi girerse "Yas negatif olamaz"		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasýnýzý giriniz");
		int yas = scan.nextInt();
		if(yas<0) {System.out.println("Yas negatif olamaz");
		
		}else if(yas<13) {System.out.println("çalýþamaz");
		
		}else if(yas<=65) {System.out.println("çalýþabir");
		
		}else if(yas>65) {System.out.println("emekli");};		*/
		
		
	/*9.//Kullanicidan sinav notunu tamsayi olarak girmesini isteyin
		//Negatif girerse ekrana "Yanlis deger girdiniz" yazdirin
		//0 dan buyuk ve esit 50 den kucuk girerse ekrana "kaldiniz" yazdirin
		//50 den buyuk ve esit 80 den kucuk ise ekrana "Gectiniz" yazdirin
		//80 den buyuk ve esit 100 den kucuk ise ekrana "Tebrikler" yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sinav notunuzu tamsayi olarak giriniz");
		double not = scan.nextDouble();
		
		if(not<0) {System.out.println("Yanlis deger girdiniz");
		}else if(not<50) {System.out.println("kaldiniz");
		}else if(not<80) {System.out.println("Gectiniz");
		}else if(not<=100) {System.out.println("Tebrikler");
		}else {System.out.println("100 den büyük sayý giremezsiniz");}			*/
		
		
	/*  //Kullanicidan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir
        //Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan bir 
        //jackpot oyunu icin program yaziniz.
        //000000-000001-000002-....-999998-999999 ==>1000000
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("6 basamaklý bir sayý giriniz");
		int num = scan.nextInt(); 
		if(num<0) {System.out.println("negatif sayý giremezsiniz");
		}else if(num<200000) {System.out.println("Kazandýnýz");
		}else if(num<500000) {System.out.println("tekrar deneyiniz");
		}else if(num>999999) {System.out.println("sayý 6 basamaktan fazla");
		}else {System.out.println("kaybettiniz");}		*/	
		
		
		
				
		
		}
		
	} 