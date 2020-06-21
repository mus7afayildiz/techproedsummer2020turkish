package day11stringmethods;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		
//		Aþaðýdaki kodlarýn ekran çýktýsý alýnýrsa ne olur diye once dusunun 
//		sonra kodlarý yazarak  ekran çýktýlarýna bakýn.
//		
//		String str = "Cat, caterpillar"; 
//		
//		System.out.println(str.substring(0));  //Cat, caterpillar
//		System.out.println(str.substring(3));  //, caterpillar
//		System.out.println(str.substring(4));  // caterpillar
//		System.out.println(str.substring(15)); //r
//		System.out.println(str.substring(16)); //
//		
//		System.out.println(str.substring(5,8)); //cat
//		System.out.println(str.substring(3,4)); //,
//		System.out.println(str.substring(5,5)); //
//		System.out.println(str.substring(8,5));	//hata
//		
//		System.out.println(str.startsWith("C")); //true
//		System.out.println(str.startsWith("c")); //false
//		System.out.println(str.startsWith("B")); //false
//		System.out.println(str.startsWith("Cat")); //true
//		System.out.println(str.startsWith("c",5)); //true 
//		System.out.println(str.startsWith("ter",7)); //true
//		System.out.println(str.startsWith("p", 11)); //false
//		System.out.println(str.startsWith("")); //true
//		
//		System.out.println(str.endsWith("r")); // true
//		System.out.println(str.endsWith("C")); //false 
//		System.out.println(str.endsWith("")); //true 
//		System.out.println(str.endsWith(" ")); //false 
//		System.out.println(str.endsWith("lar")); //true 
//		System.out.println(str.endsWith("caterpillar")); //true
//		
////		Aþaðýdaki kodlarýn ekran çýktýsý alýnýrsa ne olur diye once dusunun 
////		sonra kodlarý yazarak  ekran çýktýlarýna bakýn.
//		
//		String str = "Cat, caterpillar"; 
		
//		System.out.println(str.replace('t', 'm'));  //Cam, camerpillar
//		System.out.println(str.replace("t", "m"));  //Cam, camerpillar
//		System.out.println(str.replace("x", "y"));  //Cat, caterpillar 
//		System.out.println(str.replace("", "|"));   //|C|a|t| |c|a|t|e|r|p|i|l|l|a|r|
//		System.out.println(str.replace("a", ""));   //Ct, cterpillr
//
//		System.out.println(str.replace("at", "amel")); //Camel, camelerpillar
//		System.out.println(str.replace("at", "e"));  //Ce, ceerpillar
//		System.out.println(str.replaceFirst("c", "C"));  //Cat, Caterpillar
//		System.out.println(str.replaceFirst("at", "amel")); //Camel, caterpillar
//		System.out.println(str.replaceFirst("Cat, caterpillar", "Deve"));//Deve
//		
//		String str1 = "900"; 
//		String str2 = "1000"; 
//		int str3 = 900; 
//		int str4 = 1000;
//		
//		System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); //1900
//		System.out.println(String.valueOf(str3) + String.valueOf(str4)); //9001000
		
//		Integer.valueOf() methodu ile String.valueOf() methodunun farkýný açýklayýnýz.
//		Integer.valueOf(): sayý olan String deðerini integer a çevirir
//		String.valueOf(): integer ý String e çevirir
		
		
//		Ödev Sorularý
//		
//	1-Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden baþlayýp 
//	bitiþ deðerinde biten tüm tamsayýlarý ekrana yazdýrýn.	
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen baþlangýç deðerini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("Lütfen bitiþ deðerini giriniz");
//		int num2 = scan.nextInt();
//		for(int i= num1; i<=num2; i++) {
//			System.out.print(i+" , ");}
//		scan.close();
			
			
//	2-Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan   
//	baþlayýp bitiþ deðerinde veya öncesinde  biten tüm çift tamsayýlarý ekrana yazdýrýn.	
			
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen baþlangýç deðerini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("Lütfen bitiþ deðerini giriniz");
//		int num2 = scan.nextInt();	
//		System.out.print("Baþlangýç sayýnýzdan itibaren çift sayýlar : ");
//		
//		if(num1%2==0) {
//		int i= num1;
//		for (i=num1; i<=num2; i=i+2) {
//				System.out.print(i+" , ");		};
//		}else {
//		int i= num1+1;
//		for (i=num1+1; i<=num2; i=i+2) {
//					System.out.print(i+" , ");		};	
//		};
//		scan.close();
		
//	3-Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan   
//	baþlayýp bitiþ deðerinde veya öncesinde  biten tüm 3 ile bölünebilen tamsayýlarý ekrana yazdýrýn
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen baþlangýç deðerini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("Lütfen bitiþ deðerini giriniz");
//		int num2 = scan.nextInt();	
//		System.out.print("Baþlangýç sayýnýzdan itibaren 3 ile bölünebilen sayýlar : ");
//		
//			if(num1%3==0) {
//			int i= num1;
//			for (i=num1; i<=num2; i=i+3) {
//					System.out.print(i+" , ");		};
//			}else if((num1+1)%3==0){
//			int i= num1+1;
//			for (i=num1+1; i<=num2; i=i+3) {
//					System.out.print(i+" , ");		};	
//			}else if((num1+2)%3==0) {
//				int i= num1+2;
//				for (i=num1+2; i<=num2; i=i+3) {
//					System.out.print(i+" , ");		};	
//			};
//		scan.close();
		
		
//	4-Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde biten 
//	tüm tamsayýlarýn toplamýný ekrana yazdýrýn.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen baþlangýç deðerini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("Lütfen bitiþ deðerini giriniz");
//		int num2 = scan.nextInt();	
//		System.out.print("Baþlangýç sayýnýzdan itibaren sayýlarýnýzýn toplamý : ");
//		int sum = 0;
//		for (int i = num1; i<=num2; i++) {
//			sum=sum+i;}
//		System.out.println(sum);
//		scan.close();
//				
		
//	5-Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten 
//	tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen baþlangýç deðerini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("Lütfen bitiþ deðerini giriniz");
//		int num2 = scan.nextInt();	
//		System.out.print("Baþlangýç sayýnýzdan itibaren sayýlarýnýzýn çarpýmý : ");
//		int product = 1;
//		for (int i = num1; i<=num2; i++) {
//			product=product*i;}
//		System.out.println(product);
//		scan.close();
//		
	
//	6-Kullanýcýdan baþlangýç ve bitiþ  harflerini alýn ve baþlangýç harfinden baþlayýp bitiþ harfinde  biten 
//	tüm harfleri büyük harf olarak ekrana yazdýrýn.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen baþlangýç harfini giriniz");
//		char ch1 = scan.next().charAt(0);
//		System.out.println("Lütfen bitiþ harfini giriniz");
//		char ch2 = scan.next().charAt(0);
//		System.out.print("Baþlangýç harfinizden itibaren harfleriniz : ");
//		for (char i = ch1; i<=ch2; i++) {
//				System.out.print( String.valueOf(i).toUpperCase() + " ");}
//		scan.close();
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen baþlangýç deðerini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("Lütfen bitiþ deðerini giriniz");
//		int num2 = scan.nextInt();	
//		System.out.print("Baþlangýç sayýnýzdan itibaren 3 ile bölünebilen sayýlar : ");
//		
//		if(num1%3==0) {
//			int i= num1;
//			for (i=num1; i<=num2; i=i+1) {
//					System.out.print(i+" , ");		};
//			}else if((num1+1)%3==0){
//			int i= num1+1;
//			for (i=num1+1; i<=num2; i=i+3) {
//					System.out.print(i+" , ");		};	
//			}else if((num1+2)%3==0) {
//				int i= num1+2;
//				for (i=num1+2; i<=num2; i=i+3) {
//					System.out.print(i+" , ");		};	
//			};
//		scan.close();
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lütfen baslangic degerini giriiz..");
//		int num1 = scan.nextInt();
//		
//		System.out.println("Lütfen bitis degerini giriniz..");
//		int num2 = scan.nextInt();
//		
// if(num1<=num2){
//	          for(int i = num1;i<=num2;i++){
//	        	  if(i%3==0){
//	        		  System.out.print(i+" ");
//	        	  }
//	          }
//	 
// }else{
//	         for(int i =num1;i>=num2;i--){
//	        	 if(i%3==0){
//	        		 System.out.print(i+" ");
//	        	 }
//	         }
// }
//		
//	scan.close();	
//	}

	}

}
