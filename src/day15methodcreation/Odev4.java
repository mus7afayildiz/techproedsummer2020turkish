package day15methodcreation;

import java.util.Scanner;

public class Odev4 {

	public static void main(String[] args) {
//	4-	Kullan�c�ya paralelkenar, dikd�rtgen ve ��gen kelimelerinden birini ve iki say� se�mesini s�yleyin.
//		Hangi �ekli se�erse, o �eklin alan�n� ve �evresini ekrana yazd�ran program� yaz�n�z.
	
	Scanner scan = new Scanner(System.in);
		System.out.println("paralelkenar, dikd�rtgen ve ��gen �ekillerinin birisini se�in");
		String sekil = scan.next();
		
		System.out.println("Alan� ve �evresini hesaplamak i�in birinci say�y� giriniz");
		double num1 =scan.nextDouble();
		
		System.out.println("Alan� ve �evresini hesaplamak i�in ikinci say�y� giriniz");
		double num2 =scan.nextDouble();
			hesaplama (num1,num2,sekil);
		scan.close();
	}
	public static void hesaplama(double num1, double num2, String sekil) {
		
		switch(sekil) {
		case "paralelkenar":
			System.out.println("paralelkenar�n alan� : " +num1*num2);
			System.out.println("paralelkenar�n �evresi : "+(num1+num2)*2);
			break;
			
		case "dikd�rtgen":
			System.out.println("dikd�rtgenin alan� : "+num1*num2);
			System.out.println("dikd�rtgen �evresi : "+(num1+num2)*2);
			break;
			
		case "��gen":
			System.out.println("��genin alan� : "+num1*num2/2);
			System.out.println("��genin �evresi : "+num1*3);
			break;
			
		default:
			System.out.println("Yanl�� giri� yapt�n�z");
	}
	}	
}
