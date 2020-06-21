package Java_Review;

import java.util.Scanner;

public abstract class Day02Tekrar {

	public static void main(String[] args) {
		// verilen iki sayýnýn yerlerini deðiþtiriniz   
		
      int num1 = 11; // ==>33
      int num2 = 33;// ==>11

//      		1.durum
//		System.out.println("---Deðiþimden önceki durum---");
//		System.out.println("1. sayý :"+ num1);
//		System.out.println("2. sayý :"+ num2);
//	
//	  int num3 = num1;
//	  num1 = num2;
//	  num2 = num3;
//	 
//	 	System.out.println("---Deðiþimden sonraki durum---");
//		System.out.println("1. sayý :"+ num1);
//		System.out.println("2. sayý :"+ num2);
      
// 			   2.durum
//      	System.out.println("---Deðiþimden önceki durum---");
//		System.out.println("1. sayý :"+ num1);
//		System.out.println("2. sayý :"+ num2);
//		
//      num1 = num1 + num2;
//      num2 = num1 - num2;
//      num1 = num1 - num2;
//
//	 	System.out.println("---Deðiþimden sonraki durum---");
//		System.out.println("1. sayý :"+ num1);
//		System.out.println("2. sayý :"+ num2);
    
      
//      0 ile 1000 arasýnda random bir sayý oluþturarak bu sayýnýn rakamlarý toplamýný veren java algoritma kodunu yazýnýz ?	
//    			random sayi= 185  toplamlarý = 14   
//      	random sayý atama 1. yol
      	
//      Random random = new Random();
//      int randomSayý = random.nextInt(1000);
      
//  		random sayý atama 2. yol
//      int randomSayý = (int)(Math.random()*1000);
//      
//      int birler = randomSayý%10;
//      int onlar = randomSayý%100/10;
//      int yuzler = randomSayý/100;
//      System.out.println("Random sayýnýz :"+randomSayý);
//      System.out.println("Basamak toplamlarý :"+(birler+onlar+yuzler));
      
      
//      scanner kullanarak aþaðýdaki sorulara cevaplar isteyiniz
//      1.Adým: 3 adet String tanýmlayýnýz. ad, soyad, rapor
//      2.Adým: 2 adet integer tanýmlayýnýz  doðum yýlý, þimdiki yýl
//      3.Adým: Kullanýcýdan; "Lütfen adýnýzý ve soy adýnýzý giriniz:" isteyin
//               Harun
//               Ekinci
//      4.Adým: Kullanýcýdan;"Lütfen doðum yýlýnýzý ve þimdiki yýlý giriniz:" isteyin
//               1983
//               2020        
//      5.Adým Raporu aþaðýdaki gibi yazdýrýnýz      
//              "Adýnýz: Harun, Soy adýnýz: Ekinci, Yaþýnýz: 37"
//      6. Adým: Yaþýnýz,Adýnýzýn ilk harfi, soyadýnýzýn ilk ve son harfi, isim ve soyisim 
//      karakter uzunluklarýný içeren bir þifre oluþturunuz
//         //Þifre= 37HEi56        
   
      
//      String ad, soyad, rapor;
//      int dogumYýlý, simdikiYýl;
//      System.out.println("Lütfen Adýnýzý giriniz");
//      Scanner scan = new Scanner(System.in);
//      ad=scan.nextLine();
//      System.out.println("Lütfen Soyadýnýzý giriniz");
//      soyad=scan.nextLine();
//      System.out.println("Lütfen doðum yýlýnýzý giriniz");
//      dogumYýlý=scan.nextInt();
//      System.out.println("Lütfen doðum þimdiki yýlý giriniz");
//      simdikiYýl=scan.nextInt();
//      rapor ="Adýnýz :"+ad+" ,"+"Soyadýnýz :"+soyad+" , "+"Yaþýnýz :"+(simdikiYýl-dogumYýlý);
//      System.out.println(rapor);
//      System.out.println("Sifreniz : "+ (simdikiYýl-dogumYýlý)+ad.charAt(0)+soyad.charAt(0)+ad.length()+soyad.length());
//	
      // Scanner kullanarak kullanýcýdan saat, dakika ve saniye bilgilerini alarak sonucu yazdýrýnz
      // saat,dakika, saniye -->int
      // PM veya AM--> String
      // Örn: 11:25:33 PM
      
//      Scanner scan = new Scanner(System.in);
//      System.out.println("Lütfen saat giriniz");
//      int saat = scan.nextInt();
//      System.out.println("Lütfen dakika giriniz");
//      int dakika = scan.nextInt();
//      System.out.println("Lütfen saniye giriniz");
//      int saniye = scan.nextInt();
//      System.out.println("Lütfen AM-PM giriniz");
//      String aMpm = scan.next();
//      System.out.println("Saat :  "+saat+" : "+dakika+" : "+saniye+" "+aMpm);
	
      	// Kullanýcýdan bir sayý girmesini isteyiniz
   		// Sayý tek sayý ise "Sayýnýz tek sayýdýr."
   		// Sayý çift sayý ise "Sayýnýz çift sayýdýr." yazdýrýnýz
	
      Scanner scan = new Scanner(System.in);
      System.out.println("Bir sayý giriniz");
      int num = scan.nextInt();
      String result = num%2==0?  "Sayýnýz çift sayýdýr" : "Sayýnýz tek sayýdýr";
      System.out.println(result);
      scan.close();    	}
      

}
