package day14dowhileloop;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		
//		Aþaðýdaki sorularý do-while loop kullanarak çözünüz.
		
//	1- 9 den 190 e kadar 7 nin kati olan tüm tamsayýlarý ekrana yazdýrýnýz.
		
//		int num = 9;
//		do {
//			if(num%7==0) {
//				System.out.print(num+" ");
//			}num++;
//		}while(num<=190);
		
//	2- Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
//	biten 4 ve 6 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz.	
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Baþlangýç deðerini giriniz : ");
//			int num1 = scan.nextInt();
//				
//		System.out.println("Bitiþ deðerini giriniz : ");
//			int num2 = scan.nextInt();
//		
//		do {
//			if(num1%4==0 && num1%6==0) {
//				System.out.print(num1+" ");
//			}
//			num1++;
//		}while(num1<=num2);
		
		
//	3- Kullanýcýya sayý girmesini söyleyin. Kullanýcý sýfýr girdiðinde, ekrana o ana kadar girmiþ olduðu
//	tüm sayýlarýn toplamýný yazdýrýnýz.
//	Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdýrýn	

//			int num = 0;
//			int sum = 0;
//		do {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir sayý giriniz : ");
//			num = scan.nextInt();
//			
//			sum = sum+num;
//		scan.close();
//		}while(num!=0);
//		System.out.println(sum);
		
		
//	4- Kullanýcýya iki sayý girmesini söyleyin. Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn.
//	Eþit deðilse tekrar iki sayý girmesini söyleyin.
		
//		int num1, num2;
//		do {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("iki sayý giriniz");
//			num1=scan.nextInt();
//			num2=scan.nextInt();
//		
//		if(num1==num2) {System.out.println("Kare oluþturdunuz. ");}
//		scan.close();
//		}while(num1!=num2);
		
		
//	5- Kullanýcýya bir String girmesini söyleyin ve bu String’in ilk harfi ile son harfi ayný ise
//	ekrana “Simetrik” yazdýrýn. Ayný deðilse tekrar bir String girmesini isteyin.
		
//			String str;
//			int length;
//			char first, last;
//			
//			do {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir kelime veya bir cümle giriniz");
//		str = scan.nextLine();
//		
//			length = str.length()-1;
//			first = str.charAt(0);
//			last = str.charAt(length);
//		
//		if(first==last) {System.out.println("Simetrik");}
//		scan.close();
//		}while(first!=last);
		
		
//	6-Kullanýcýdan bir String alýn ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdýrýn.
//	“a” harfi yoksa tekrar bir String girmesini isteyin.
		
//		String str;
//		do {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir kelime veya bir cümle giriniz");
//		str = scan.nextLine();
//		
//		if(str.contains("a")){
//			System.out.println("a harfi var");
//		}
//		scan.close();
//		}while(!(str.contains("a")));
		
		
		
	}

}
