package Java_Review;

import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {
		// verilen iki say�n�n yerlerini de�i�tiriniz    
//        int num1 = 11; // ==>33
//        int num2 = 33;// ==>11
//        
//        System.out.println("---De�i�iklik �ncesi---");
//        System.out.println("1. Say�= "+num1);
//        System.out.println("2. Say�= "+ num2);
        
//        //ilk �nce 1. say� de�erini temp(Ge�ici de�er) i�erisine at�yoruz
//        int temp =num1;
//        
//        //2. say� de�erini 1. say�'ya at�yoruz
//        num1= num2;
//        
//        // ve son olarak temp i�indeki de�eri 2. say�ya e�itliyoruz
//        num2= temp;
//        
//        System.out.println("---De�i�iklik sonras�---");
//        System.out.println("1. Say�= "+num1);
//        System.out.println("2. Say�= "+num2);
//
//        
//        
        
        
		
//     //*** interview question***
//     // Verilen iki de�eri ���nc� bir de�er kullanmadan yerlerini de�i�tiriniz
//                int  x = 50; //=>10
//                int  y  = 10; //=>50
//             System.out.println("---De�i�iklik �ncesi---");
//             System.out.println("x de�eri= "+x);
//             System.out.println("y de�eri= "+y);
//               
//                x=x+y;
//                y=x-y;
//                x=x-y;
//                
//              System.out.println("---De�i�iklik sonras�---");
//              System.out.println("x de�eri= "+x);
//              System.out.println("y de�eri= "+y);

              
//		0 ile 1000 aras�nda random bir say� olu�turarak bu say�n�n rakamlar� toplam�n� veren java algoritma kodunu yaz�n�z ?	
//		random sayi= 185  toplamlar� = 14   
		
//		int ramdomSayi= (int)(Math.random()*1000);// 0 ile 1000 aras� say�
//		int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 aras� de�erler
//		        
//		        Random random= new Random();
//		        
//		     int randomSayi = random.nextInt(1000);
 
//              
//           0 ile 1000 aras� say�
//           int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 aras� de�erler
//           Random random= new Random();
                    
//                	  int randomSayi = random.nextInt(1000);
//                    int randomSayi= (int)(Math.random()*1000);
//                    System.out.println("Random say�="+randomSayi);
//                int birler = randomSayi%10; // birler basama��
//                
//                  randomSayi= randomSayi/10;
//                
//                int onlar = randomSayi%10; // onlar basama��
//                int yuzler= randomSayi/10; // y�zler basama��
//                
//                System.out.println("Toplamlar�= "+(birler+onlar+yuzler));

              
                
       /* 
        scanner kullanarak a�a��daki sorulara cevaplar isteyiniz
        1.Ad�m: 3 adet String tan�mlay�n�z. ad, soyad, rapor
        2.Ad�m: 2 adet integer tan�mlay�n�z  do�um y�l�, �imdiki y�l
        3.Ad�m: Kullan�c�dan; "L�tfen ad�n�z� ve soy ad�n�z� giriniz:" isteyin
                 Harun
                 Ekinci
        4.Ad�m: Kullan�c�dan;"L�tfen do�um y�l�n�z� ve �imdiki y�l� giriniz:" isteyin
                 1983
                 2020        
        5.Ad�m Raporu a�a��daki gibi yazd�r�n�z      
                "Ad�n�z: Harun, Soy ad�n�z: Ekinci, Ya��n�z: 37"
        6. Ad�m: Ya��n�z,Ad�n�z�n ilk harfi, soyad�n�z�n ilk ve son harfi, isim ve soyisim karakter uzunluklar�n� i�eren bir �ifre olu�turunuz
           //�ifre= 37HEi56        
        */
			
//		Scanner sc= new Scanner(System.in);
//        String ad,soyAd,rapor;
//        int d_y�l,b_y�l;
//        
//        System.out.println("L�tfen Ad�n�z� Giriniz:");
//        ad= sc.nextLine();
//        System.out.println("L�tfen Soyad�n�z� Giriniz");
//        soyAd= sc.nextLine();
//        System.out.println("L�tfen Do�um y�l�n�z� giriniz");
//        d_y�l= sc.nextInt();
//        System.out.println("L�tfen �imdiki y�l� giriniz");
//        b_y�l= sc.nextInt();
//        int yas=(b_y�l-d_y�l);
//        rapor="Ad�n�z: "+ad+ " Soyad�n�z: "+soyAd+" Ya��n�z: "+yas;
//        
//        System.out.println(rapor);
//        String sifre=yas+ad.substring(0,1)+soyAd.charAt(0)
//        +soyAd.charAt(soyAd.length()-1)+ad.length()+soyAd.length();
//        System.out.println("�ifreniz: "+sifre);

        
        // Scanner kullanarak kullan�c�dan saat, dakika ve saniye bilgilerini alarak sonucu yazd�r�nz
        // saat,dakika, saniye -->int
        // PM veya AM--> String
        // �rn: 11:25:33 PM
        
        
//        int  saat, dakika, saniye;
//              
//        String  aMorPm="";
//        
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Saat giriniz");
//        saat=scan.nextInt();
//        System.out.println("Dakika giriniz");
//        dakika=scan.nextInt();
//        System.out.println("Saniye giriniz");
//        saniye=scan.nextInt();
//        System.out.println("AM-PM giriniz");
//        aMorPm = scan.next();
//        
//        
//        System.out.println(saat+ ":" + dakika + ":" + saniye + " "+aMorPm);
//        
//        
//        Scanner scan=new Scanner(System.in);
//		System.out.println("Saati giriniz");
//		int saat=scan.nextInt();
//		System.out.println("DAkikayi giriniz");
//		int dakika=scan.nextInt();
//				System.out.println("Saniyeyi giriniz");
//		int saniye= scan.nextInt();
//		System.out.println("am veya pm girniz");
//		String gun= scan.next();
//		System.out.println(saat +":"+dakika+":"+saniye+" "+gun);
        
		
		
		// Kullan�c�dan bir say� girmesini isteyiniz
		// Say� tek say� ise "Say�n�z tek say�d�r."
		// Say� �ift say� ise "Say�n�z �ift say�d�r." yazd�r�n�z
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int num = scan.nextInt();
		if(num%2==0) {System.out.println("Say�n�z �ift say�d�r");
		}else {System.out.println("say�n�z tek say�d�r");}
		
		
		
		System.out.println("Kontrol edilecek say�y� giriniz");
      Scanner sc= new Scanner(System.in);
      int x = sc.nextInt();
        //x=sc.nextInt();
        
       if(x%2==0) {
            System.out.println("Say�n�z �ift say�d�r");
        }else {
            System.out.println("Say�n�z tek say�d�r");       
            scan.close();}
	}
}

