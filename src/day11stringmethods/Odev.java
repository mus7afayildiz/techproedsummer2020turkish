package day11stringmethods;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		
//		A�a��daki kodlar�n ekran ��kt�s� al�n�rsa ne olur diye once dusunun 
//		sonra kodlar� yazarak  ekran ��kt�lar�na bak�n.
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
////		A�a��daki kodlar�n ekran ��kt�s� al�n�rsa ne olur diye once dusunun 
////		sonra kodlar� yazarak  ekran ��kt�lar�na bak�n.
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
		
//		Integer.valueOf() methodu ile String.valueOf() methodunun fark�n� a��klay�n�z.
//		Integer.valueOf(): say� olan String de�erini integer a �evirir
//		String.valueOf(): integer � String e �evirir
		
		
//		�dev Sorular�
//		
//	1-Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p 
//	biti� de�erinde biten t�m tamsay�lar� ekrana yazd�r�n.	
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("L�tfen ba�lang�� de�erini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("L�tfen biti� de�erini giriniz");
//		int num2 = scan.nextInt();
//		for(int i= num1; i<=num2; i++) {
//			System.out.print(i+" , ");}
//		scan.close();
			
			
//	2-Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan   
//	ba�lay�p biti� de�erinde veya �ncesinde  biten t�m �ift tamsay�lar� ekrana yazd�r�n.	
			
//		Scanner scan = new Scanner(System.in);
//		System.out.println("L�tfen ba�lang�� de�erini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("L�tfen biti� de�erini giriniz");
//		int num2 = scan.nextInt();	
//		System.out.print("Ba�lang�� say�n�zdan itibaren �ift say�lar : ");
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
		
//	3-Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan   
//	ba�lay�p biti� de�erinde veya �ncesinde  biten t�m 3 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("L�tfen ba�lang�� de�erini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("L�tfen biti� de�erini giriniz");
//		int num2 = scan.nextInt();	
//		System.out.print("Ba�lang�� say�n�zdan itibaren 3 ile b�l�nebilen say�lar : ");
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
		
		
//	4-Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde biten 
//	t�m tamsay�lar�n toplam�n� ekrana yazd�r�n.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("L�tfen ba�lang�� de�erini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("L�tfen biti� de�erini giriniz");
//		int num2 = scan.nextInt();	
//		System.out.print("Ba�lang�� say�n�zdan itibaren say�lar�n�z�n toplam� : ");
//		int sum = 0;
//		for (int i = num1; i<=num2; i++) {
//			sum=sum+i;}
//		System.out.println(sum);
//		scan.close();
//				
		
//	5-Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten 
//	t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("L�tfen ba�lang�� de�erini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("L�tfen biti� de�erini giriniz");
//		int num2 = scan.nextInt();	
//		System.out.print("Ba�lang�� say�n�zdan itibaren say�lar�n�z�n �arp�m� : ");
//		int product = 1;
//		for (int i = num1; i<=num2; i++) {
//			product=product*i;}
//		System.out.println(product);
//		scan.close();
//		
	
//	6-Kullan�c�dan ba�lang�� ve biti�  harflerini al�n ve ba�lang�� harfinden ba�lay�p biti� harfinde  biten 
//	t�m harfleri b�y�k harf olarak ekrana yazd�r�n.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("L�tfen ba�lang�� harfini giriniz");
//		char ch1 = scan.next().charAt(0);
//		System.out.println("L�tfen biti� harfini giriniz");
//		char ch2 = scan.next().charAt(0);
//		System.out.print("Ba�lang�� harfinizden itibaren harfleriniz : ");
//		for (char i = ch1; i<=ch2; i++) {
//				System.out.print( String.valueOf(i).toUpperCase() + " ");}
//		scan.close();
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("L�tfen ba�lang�� de�erini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("L�tfen biti� de�erini giriniz");
//		int num2 = scan.nextInt();	
//		System.out.print("Ba�lang�� say�n�zdan itibaren 3 ile b�l�nebilen say�lar : ");
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
//		System.out.println("L�tfen baslangic degerini giriiz..");
//		int num1 = scan.nextInt();
//		
//		System.out.println("L�tfen bitis degerini giriniz..");
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
