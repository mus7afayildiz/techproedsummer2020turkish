package Java_Review;

import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {
		// verilen iki sayýnýn yerlerini deðiþtiriniz    
//        int num1 = 11; // ==>33
//        int num2 = 33;// ==>11
//        
//        System.out.println("---Deðiþiklik öncesi---");
//        System.out.println("1. Sayý= "+num1);
//        System.out.println("2. Sayý= "+ num2);
        
//        //ilk önce 1. sayý deðerini temp(Geçici deðer) içerisine atýyoruz
//        int temp =num1;
//        
//        //2. sayý deðerini 1. sayý'ya atýyoruz
//        num1= num2;
//        
//        // ve son olarak temp içindeki deðeri 2. sayýya eþitliyoruz
//        num2= temp;
//        
//        System.out.println("---Deðiþiklik sonrasý---");
//        System.out.println("1. Sayý= "+num1);
//        System.out.println("2. Sayý= "+num2);
//
//        
//        
        
        
		
//     //*** interview question***
//     // Verilen iki deðeri üçüncü bir deðer kullanmadan yerlerini deðiþtiriniz
//                int  x = 50; //=>10
//                int  y  = 10; //=>50
//             System.out.println("---Deðiþiklik öncesi---");
//             System.out.println("x deðeri= "+x);
//             System.out.println("y deðeri= "+y);
//               
//                x=x+y;
//                y=x-y;
//                x=x-y;
//                
//              System.out.println("---Deðiþiklik sonrasý---");
//              System.out.println("x deðeri= "+x);
//              System.out.println("y deðeri= "+y);

              
//		0 ile 1000 arasýnda random bir sayý oluþturarak bu sayýnýn rakamlarý toplamýný veren java algoritma kodunu yazýnýz ?	
//		random sayi= 185  toplamlarý = 14   
		
//		int ramdomSayi= (int)(Math.random()*1000);// 0 ile 1000 arasý sayý
//		int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 arasý deðerler
//		        
//		        Random random= new Random();
//		        
//		     int randomSayi = random.nextInt(1000);
 
//              
//           0 ile 1000 arasý sayý
//           int ramdomSayi= (int)(Math.random()*10)+10; // 10 ile 20 arasý deðerler
//           Random random= new Random();
                    
//                	  int randomSayi = random.nextInt(1000);
//                    int randomSayi= (int)(Math.random()*1000);
//                    System.out.println("Random sayý="+randomSayi);
//                int birler = randomSayi%10; // birler basamaðý
//                
//                  randomSayi= randomSayi/10;
//                
//                int onlar = randomSayi%10; // onlar basamaðý
//                int yuzler= randomSayi/10; // yüzler basamaðý
//                
//                System.out.println("Toplamlarý= "+(birler+onlar+yuzler));

              
                
       /* 
        scanner kullanarak aþaðýdaki sorulara cevaplar isteyiniz
        1.Adým: 3 adet String tanýmlayýnýz. ad, soyad, rapor
        2.Adým: 2 adet integer tanýmlayýnýz  doðum yýlý, þimdiki yýl
        3.Adým: Kullanýcýdan; "Lütfen adýnýzý ve soy adýnýzý giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adým: Kullanýcýdan;"Lütfen doðum yýlýnýzý ve þimdiki yýlý giriniz:" isteyin
                 1983
                 2020        
        5.Adým Raporu aþaðýdaki gibi yazdýrýnýz      
                "Adýnýz: Harun, Soy adýnýz: Ekinci, Yaþýnýz: 37"
        6. Adým: Yaþýnýz,Adýnýzýn ilk harfi, soyadýnýzýn ilk ve son harfi, isim ve soyisim karakter uzunluklarýný içeren bir þifre oluþturunuz
           //Þifre= 37HEi56        
        */
			
//		Scanner sc= new Scanner(System.in);
//        String ad,soyAd,rapor;
//        int d_yýl,b_yýl;
//        
//        System.out.println("Lütfen Adýnýzý Giriniz:");
//        ad= sc.nextLine();
//        System.out.println("Lütfen Soyadýnýzý Giriniz");
//        soyAd= sc.nextLine();
//        System.out.println("Lütfen Doðum yýlýnýzý giriniz");
//        d_yýl= sc.nextInt();
//        System.out.println("Lütfen þimdiki yýlý giriniz");
//        b_yýl= sc.nextInt();
//        int yas=(b_yýl-d_yýl);
//        rapor="Adýnýz: "+ad+ " Soyadýnýz: "+soyAd+" Yaþýnýz: "+yas;
//        
//        System.out.println(rapor);
//        String sifre=yas+ad.substring(0,1)+soyAd.charAt(0)
//        +soyAd.charAt(soyAd.length()-1)+ad.length()+soyAd.length();
//        System.out.println("Þifreniz: "+sifre);

        
        // Scanner kullanarak kullanýcýdan saat, dakika ve saniye bilgilerini alarak sonucu yazdýrýnz
        // saat,dakika, saniye -->int
        // PM veya AM--> String
        // Örn: 11:25:33 PM
        
        
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
        
		
		
		// Kullanýcýdan bir sayý girmesini isteyiniz
		// Sayý tek sayý ise "Sayýnýz tek sayýdýr."
		// Sayý çift sayý ise "Sayýnýz çift sayýdýr." yazdýrýnýz
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int num = scan.nextInt();
		if(num%2==0) {System.out.println("Sayýnýz çift sayýdýr");
		}else {System.out.println("sayýnýz tek sayýdýr");}
		
		
		
		System.out.println("Kontrol edilecek sayýyý giriniz");
      Scanner sc= new Scanner(System.in);
      int x = sc.nextInt();
        //x=sc.nextInt();
        
       if(x%2==0) {
            System.out.println("Sayýnýz çift sayýdýr");
        }else {
            System.out.println("Sayýnýz tek sayýdýr");       
            scan.close();}
	}
}

