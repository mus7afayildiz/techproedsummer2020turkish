package day14dowhileloop;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		
//		A�a��daki sorular� do-while loop kullanarak ��z�n�z.
		
//	1- 9 den 190 e kadar 7 nin kati olan t�m tamsay�lar� ekrana yazd�r�n�z.
		
//		int num = 9;
//		do {
//			if(num%7==0) {
//				System.out.print(num+" ");
//			}num++;
//		}while(num<=190);
		
//	2- Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
//	biten 4 ve 6 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z.	
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Ba�lang�� de�erini giriniz : ");
//			int num1 = scan.nextInt();
//				
//		System.out.println("Biti� de�erini giriniz : ");
//			int num2 = scan.nextInt();
//		
//		do {
//			if(num1%4==0 && num1%6==0) {
//				System.out.print(num1+" ");
//			}
//			num1++;
//		}while(num1<=num2);
		
		
//	3- Kullan�c�ya say� girmesini s�yleyin. Kullan�c� s�f�r girdi�inde, ekrana o ana kadar girmi� oldu�u
//	t�m say�lar�n toplam�n� yazd�r�n�z.
//	Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazd�r�n	

//			int num = 0;
//			int sum = 0;
//		do {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir say� giriniz : ");
//			num = scan.nextInt();
//			
//			sum = sum+num;
//		scan.close();
//		}while(num!=0);
//		System.out.println(sum);
		
		
//	4- Kullan�c�ya iki say� girmesini s�yleyin. Bu say�lar e�it ise ekrana �Kare olu�turdunuz� yazd�r�n.
//	E�it de�ilse tekrar iki say� girmesini s�yleyin.
		
//		int num1, num2;
//		do {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("iki say� giriniz");
//			num1=scan.nextInt();
//			num2=scan.nextInt();
//		
//		if(num1==num2) {System.out.println("Kare olu�turdunuz. ");}
//		scan.close();
//		}while(num1!=num2);
		
		
//	5- Kullan�c�ya bir String girmesini s�yleyin ve bu String�in ilk harfi ile son harfi ayn� ise
//	ekrana �Simetrik� yazd�r�n. Ayn� de�ilse tekrar bir String girmesini isteyin.
		
//			String str;
//			int length;
//			char first, last;
//			
//			do {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir kelime veya bir c�mle giriniz");
//		str = scan.nextLine();
//		
//			length = str.length()-1;
//			first = str.charAt(0);
//			last = str.charAt(length);
//		
//		if(first==last) {System.out.println("Simetrik");}
//		scan.close();
//		}while(first!=last);
		
		
//	6-Kullan�c�dan bir String al�n ve bu String�in icinde �a� harfi varsa ekrana �a harfi var� yazd�r�n.
//	�a� harfi yoksa tekrar bir String girmesini isteyin.
		
//		String str;
//		do {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir kelime veya bir c�mle giriniz");
//		str = scan.nextLine();
//		
//		if(str.contains("a")){
//			System.out.println("a harfi var");
//		}
//		scan.close();
//		}while(!(str.contains("a")));
		
		
		
	}

}
