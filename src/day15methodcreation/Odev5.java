package day15methodcreation;

import java.util.Scanner;

public class Odev5 {

	public static void main(String[] args) {
		
//	5-	Kullan�c�ya bir String girmesini s�yleyin ve bu String�i yukar�dan a�a��ya do�ru yazd�ran
//		Program yaz�n�z. Ornegin; CAN ==> C
//		A
//		N
		
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Bir kelime veya c�mle giriniz");
	String str = scan.nextLine().toUpperCase();
	
	int i = 0;  
	int length = str.length()-1;
		write (str, i, length);
	scan.close();}
	
	public static void write (String str, int i, int length) {
		
		while(i<=length) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
}
