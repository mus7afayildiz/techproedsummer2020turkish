package Java_Review;

import java.util.Scanner;

public abstract class Day02Tekrar {

	public static void main(String[] args) {
		// verilen iki say�n�n yerlerini de�i�tiriniz   
		
      int num1 = 11; // ==>33
      int num2 = 33;// ==>11

//      		1.durum
//		System.out.println("---De�i�imden �nceki durum---");
//		System.out.println("1. say� :"+ num1);
//		System.out.println("2. say� :"+ num2);
//	
//	  int num3 = num1;
//	  num1 = num2;
//	  num2 = num3;
//	 
//	 	System.out.println("---De�i�imden sonraki durum---");
//		System.out.println("1. say� :"+ num1);
//		System.out.println("2. say� :"+ num2);
      
// 			   2.durum
//      	System.out.println("---De�i�imden �nceki durum---");
//		System.out.println("1. say� :"+ num1);
//		System.out.println("2. say� :"+ num2);
//		
//      num1 = num1 + num2;
//      num2 = num1 - num2;
//      num1 = num1 - num2;
//
//	 	System.out.println("---De�i�imden sonraki durum---");
//		System.out.println("1. say� :"+ num1);
//		System.out.println("2. say� :"+ num2);
    
      
//      0 ile 1000 aras�nda random bir say� olu�turarak bu say�n�n rakamlar� toplam�n� veren java algoritma kodunu yaz�n�z ?	
//    			random sayi= 185  toplamlar� = 14   
//      	random say� atama 1. yol
      	
//      Random random = new Random();
//      int randomSay� = random.nextInt(1000);
      
//  		random say� atama 2. yol
//      int randomSay� = (int)(Math.random()*1000);
//      
//      int birler = randomSay�%10;
//      int onlar = randomSay�%100/10;
//      int yuzler = randomSay�/100;
//      System.out.println("Random say�n�z :"+randomSay�);
//      System.out.println("Basamak toplamlar� :"+(birler+onlar+yuzler));
      
      
//      scanner kullanarak a�a��daki sorulara cevaplar isteyiniz
//      1.Ad�m: 3 adet String tan�mlay�n�z. ad, soyad, rapor
//      2.Ad�m: 2 adet integer tan�mlay�n�z  do�um y�l�, �imdiki y�l
//      3.Ad�m: Kullan�c�dan; "L�tfen ad�n�z� ve soy ad�n�z� giriniz:" isteyin
//               Harun
//               Ekinci
//      4.Ad�m: Kullan�c�dan;"L�tfen do�um y�l�n�z� ve �imdiki y�l� giriniz:" isteyin
//               1983
//               2020        
//      5.Ad�m Raporu a�a��daki gibi yazd�r�n�z      
//              "Ad�n�z: Harun, Soy ad�n�z: Ekinci, Ya��n�z: 37"
//      6. Ad�m: Ya��n�z,Ad�n�z�n ilk harfi, soyad�n�z�n ilk ve son harfi, isim ve soyisim 
//      karakter uzunluklar�n� i�eren bir �ifre olu�turunuz
//         //�ifre= 37HEi56        
   
      
//      String ad, soyad, rapor;
//      int dogumY�l�, simdikiY�l;
//      System.out.println("L�tfen Ad�n�z� giriniz");
//      Scanner scan = new Scanner(System.in);
//      ad=scan.nextLine();
//      System.out.println("L�tfen Soyad�n�z� giriniz");
//      soyad=scan.nextLine();
//      System.out.println("L�tfen do�um y�l�n�z� giriniz");
//      dogumY�l�=scan.nextInt();
//      System.out.println("L�tfen do�um �imdiki y�l� giriniz");
//      simdikiY�l=scan.nextInt();
//      rapor ="Ad�n�z :"+ad+" ,"+"Soyad�n�z :"+soyad+" , "+"Ya��n�z :"+(simdikiY�l-dogumY�l�);
//      System.out.println(rapor);
//      System.out.println("Sifreniz : "+ (simdikiY�l-dogumY�l�)+ad.charAt(0)+soyad.charAt(0)+ad.length()+soyad.length());
//	
      // Scanner kullanarak kullan�c�dan saat, dakika ve saniye bilgilerini alarak sonucu yazd�r�nz
      // saat,dakika, saniye -->int
      // PM veya AM--> String
      // �rn: 11:25:33 PM
      
//      Scanner scan = new Scanner(System.in);
//      System.out.println("L�tfen saat giriniz");
//      int saat = scan.nextInt();
//      System.out.println("L�tfen dakika giriniz");
//      int dakika = scan.nextInt();
//      System.out.println("L�tfen saniye giriniz");
//      int saniye = scan.nextInt();
//      System.out.println("L�tfen AM-PM giriniz");
//      String aMpm = scan.next();
//      System.out.println("Saat :  "+saat+" : "+dakika+" : "+saniye+" "+aMpm);
	
      	// Kullan�c�dan bir say� girmesini isteyiniz
   		// Say� tek say� ise "Say�n�z tek say�d�r."
   		// Say� �ift say� ise "Say�n�z �ift say�d�r." yazd�r�n�z
	
      Scanner scan = new Scanner(System.in);
      System.out.println("Bir say� giriniz");
      int num = scan.nextInt();
      String result = num%2==0?  "Say�n�z �ift say�d�r" : "Say�n�z tek say�d�r";
      System.out.println(result);
      scan.close();    	}
      

}
