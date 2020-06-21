package day08ternaryoperator;

import java.util.Scanner;

public class Odev08 {

	public static void main(String[] args) {
		
//		1- Kullanýcýdan bir tamsayý girmesini isteyin, tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek”
//		yazdýrýn.
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayý giriniz");
		int num = scan.nextInt();
		String result = num%2==0? "çift" : "tek";
		System.out.println(num+" sayýsý "+result);
		scan.close();    */
		
//		2-	Kullanýcýdan iki tamsayý girmesini isteyin, ekrana her zaman büyük olanýný yazdýrýn	
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayý giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bir tamsayý giriniz");
		int num2 = scan.nextInt();
		int result= num1<num2? num2:num1;
		System.out.println("Büyük sayý: "+result);
		scan.close();	*/
		
		
		
		
//		3-	Kullanýcýdan bir tamsayý girmesini isteyin, ekrana o tamsayýnýn mutlak degerini yazdýrýn.		
	 
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayý giriniz");
		int num = scan.nextInt();
		int result = num<0? num*(-1) : num;
		System.out.println(result);		
		scan.close();	*/
		
		
//		4-	Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin. En ve boy eþit ise ekrana “Kare”
//		farklý ise ekrana “Dikdörtgen” yazdýrýn.    
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("dikdörtgenin enini giriniz");
		int en = scan.nextInt();
		System.out.println("dikdörtgenin boyunu giriniz");
		int boy = scan.nextInt();
		String result = en==boy? "kare" : "dikdörtgen";
		System.out.println("Bu bir "+result+"dir");	
		scan.close();		*/
		
//		5-	Kullanýcýdan bir tamsayý girmesini isteyin, o tamsayý 3 basamaklý ise ekrana “3 Basamaklý” yazdýrýn.
//		3 basamaklý degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklý olmayan çift sayý” yazdýrýn.
//		Çift sayý degilse “3 basamaklý olmayan tek sayý yazdýrýn.”		
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayý giriniz");
		int num = scan.nextInt();
		String result = num<1000 && num>99?	"3 basamaklý" : 
		(num%2==0? "3 basamaklý olmayan çift sayý" :	"3 basamaklý olmayan tek sayý ");	
		System.out.println(num+" sayýsý "+result+"dýr.");	
		scan.close();		*/
		
	
//		6-	Kullanýcýdan bir yýl girmesini isteyin, yýl artýk yýl ise ekrana “Artýk yýl” degilse ekrana “Artýk yýl degil”
//		yazdýrýn.	
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Bir yýl giriniz");
		int year = scan.nextInt();
		String result = (year%100==0 && year%400==0)?	"Artýk yýl" : 
		(year%100!=0 && year%4==0? "Artýk yýl" : "Artýk yýl degil");
		System.out.println(result); 	
		scan.close();		*/
		
		
		
	}
}
