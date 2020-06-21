package day09switchoperator;

import java.util.Scanner;

public class Tekrar {

	public static void main(String[] args) {
		// Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl” degilse 
        // ekrana “Artık yıl degil” yazdırın.
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir yıl giriniz");
		int year = scan.nextInt();
		String result = year%100==0? (year%400==0? "Artık yıl" :  "Artık yıl değil" ): year%4==0? "Artık yıl" : "Artık yıl değil"  ;
		System.out.println(result); 	*/
		
		
		
		// Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
        
     /*   Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayı giriniz");
        int num = scan.nextInt();
  
        String result = (num>99 && num<1000)? "3 Basamaklı"  : num%2==0? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı";
		System.out.println(result);	*/
		
		
		
		// A harfini bulunca "Ilk harf", B harfini bulunca "Ikinci harf"
        // C harfini bulunca "Ucuncu harf", D harfini bulunca "Dorduncu harf"
        // yazdiran programi if else if() ve switch() kullanarak yaziniz.
        // digerleri icin "Bilmiyorum"
	
//		 char ch= 'x';
//		 if(ch=='A') {
//			 System.out.println("Ilk harf");
//		 }else if(ch=='B') {
//			 System.out.println("Ikinci harf");
//		 }else if(ch=='C') {
//			 System.out.println("Ucuncu harf");
//		 }else if(ch=='D') {
//			 System.out.println("Dorduncu harf");
//		 }else {
//			 System.out.println("Bilmiyorum");
//		 }
			 
		
		
		
		
//		 char ch= 'E';
//		 switch(ch) {
//			case  'A':
//				System.out.println("Ilk harf");
//			break;
//			case  'B':
//				System.out.println("Ikinci harf");
//			break;
//			case 'C':
//				System.out.println("Ucuncu harf");
//			break;
//			case  'D':
//				System.out.println("Dördüncü harf");
//			break;
//			default :
//				System.out.println("Bilmiyorum");	
//			}
		
		
		
		// Kullanici haftanin gun numarasini girsin
        // Programiniz gunun ismini yazsin
        // Yanlis gun sayisi girerse "Gecerli gun sayisi giriniz"
        // switch() kullanarak yapiniz.
		
		
//		Scanner scan = new Scanner(System.in);
//		int day = scan.nextInt();
//		
//		switch(day) {
//		case 1 :
//			System.out.println("Pazartesi");
//		break;
//		case 2 :
//			System.out.println("Salı");
//		break;
//		case 3 :
//			System.out.println("Çarşamba");
//		break;
//		case 4 :
//			System.out.println("Perşembe");
//		break;
//		case 5 :
//			System.out.println("Cuma");
//		break;
//		case 6 :
//			System.out.println("Cumartesi");
//		break;
//		case 7 :
//			System.out.println("Pazar");
//		break;
//		default:
//			System.out.println("Gecerli gun sayisi giriniz");
//		scan.close();		}
		
		
		
		
		// Kullanici ay ismini girsin
        // Program kacinci ay oldugunu ekrana yazsin
        // Buyuk harf kucuk harf hepsi icin calissin
        // Yanlis ay ismi girerse ekrana "Gecerli ay ismi giriniz" yazsin
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir ay ismi giriniz");
//		String ay = scan.next();
//		ay=ay.toLowerCase();
//		switch(ay) {
//		case "ocak":
//			System.out.println("1. ay");
//			break;
//		case "subat":
//			System.out.println("2. ay");
//			break;
//		case "mart":
//			System.out.println("3. ay");
//			break;
//		case "nisan":
//			System.out.println("4. ay");
//			break;
//		case "mayıs":
//			System.out.println("5. ay");
//			break;
//		case "haziran":
//			System.out.println("6. ay");
//			break;
//		case "temmuz":
//			System.out.println("7. ay");
//			break;
//		case "ağustos":
//			System.out.println("8. ay");
//			break;
//		case "eylül":
//			System.out.println("9. ay");
//			break;
//		case "ekim":
//			System.out.println("10. ay");
//			break;
//		case "kasım":
//			System.out.println("11. ay");
//			break;
//		case "aralık":
//			System.out.println("12. ay");
//			break;
//		default:
//			System.out.println("Gecerli ay ismi giriniz");
//			}
		
		
		
		
		// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D   2. 50(dahil) ile 60 arası - C   3. 60(dahil) ile 80 arası - B  4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Notunuzu giriniz");
//		int not = scan.nextInt();
//		
//		if(not<50 && not>=0) {
//			not=0;	
//		}else if(not<60 && not>=50) {
//			not=50;
//		}else if(not<80 && not>=60) {
//			not=60;
//		}else if(not<=100 && not>=80) {
//			not=80;
//		}
//		 
//		switch(not) {
//		case 0:
//			System.out.println("D");
//		break;
//		case 50:
//			System.out.println("C");
//		break;
//		case 60:
//			System.out.println("B");
//		break;
//		case 80:
//			System.out.println("A");
//		break;	
//			default:
//			System.out.println("Gecerli not giriniz");	
//		scan.close();     	}
		
		
		
//		hesap makinesı
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("İşlem yapmak istediğiniz 1. sayıyı giriniz");
//		double num1 = scan.nextDouble();
//		System.out.println("yapmak istediğiniz işlemi(\" + , - , * , /\") giriniz");
//		char islem = scan.next().charAt(0);
//		if(islem=='+' || islem=='-' || islem=='*' || islem=='/') 
//		{System.out.println("İşlem yapmak istediğiniz 2. sayıyı giriniz");
//		}else{
//		System.out.println("Hatalı işaret girdiniz");};
//		double num2 = scan.nextDouble();
//		System.out.print(num1+""+islem+""+num2+" = ");
//		
//		switch(islem) {
//		case '+' :
//			System.out.println(num1+num2);
//			break;	
//		case '-' :
//			System.out.println(num1-num2);
//			break;		
//		case '*' :
//			System.out.println(num1*num2);
//			break;		
//		case '/' :
//			System.out.println(num1/num2);
//			break;	
//		default:
//			System.out.println("hatalı işlem girdiniz");
//			scan.close();		}
	
	
	
	}

}
		