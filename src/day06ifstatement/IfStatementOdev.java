package day06ifstatement;

import java.util.Scanner;

public class IfStatementOdev {

	public static void main(String[] args) {
		
		/*If Statement Sorular�
		
	/*1)Kullan�c�dan bir tamsay� al�n e�er tamsay� 3 ile b�l�nebiliyorsa ekrana �3��n kat�� yazd�r�n.
		3 ile b�l�nemiyorsa ekrana �3��n kat� de�ildir� yazd�r�n.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz");
		int num = scan.nextInt();
		if(num%3==0) {System.out.println("3��n kat�");
		}else{System.out.println("3��n kat� de�ildir");};	*/
		
	/*2)Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
		�b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf  giriniz");
		String harf = scan.next();
		if(harf.equals("a") ||harf.equals("e") ||harf.equals("i") ||harf.equals("o") ||harf.equals("u"))
		{System.out.println("Sesli harf");};
		if(harf.equals("b") ||harf.equals("c") ||harf.equals("d") ||harf.equals("f"))
		{System.out.println("Sessiz harf");
		}else{System.out.println("listede olmayan hatal� harf girdiniz");};			*/
		
	/*3)Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
		�Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n. �Pazar� ise ekrana
		�H�ristiyanlar icin kutsal g�n� yazd�r�n	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir g�n  giriniz");
		String g�n = scan.next();
		if(g�n.equals("Cuma")) {System.out.println("M�sl�manlar icin kutsal g�n");};
		if(g�n.equals("Cumartesi")) {System.out.println("Yahudiler icin kutsal g�n");};
		if(g�n.equals("Pazar")) {System.out.println("H�ristiyanlar icin kutsal g�n");};			*/
	
	/*4)Kullan�c�dan iki say� al�n e�er say�lar�n i�aretleri ayn� ise ekrana �Ayn� i�aretli� yazd�r�n.
		Say�lar�n i�aretleri farkl� ise ekrana �Farkl� i�aretli� yazd�r�n.	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say�  giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bir say� daha giriniz");
		int num2 = scan.nextInt();
		if(num1<0 && num2<0 || num1>0 && num2>0  ) {System.out.println("Ayn� i�aretli");
		}else{ System.out.println("Farkl� i�aretli");}   */
		
		
		
		
		/*If-else Statement Sorular�
		
	/*1)Kullan�c�dan bir tamsay� al�n e�er tamsay� 10 dan kucuk ve 0�dan b�y�k e�it ise ekrana
		�Rakam� yazd�r�n. Di�er durumlarda ekrana �Say�� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say�  giriniz");
		int num = scan.nextInt();
		if(num>=0 && num<10) {System.out.println("Rakam");
		}else{System.out.println("Say�");}	*/	
		
		
	/*2)Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
		�E�kenar ��gen� yazd�r�n. Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��genin bir kenar�n� giriniz");
		int num1 = scan.nextInt();
		System.out.println("��genin ikinci kenar�n� giriniz");
		int num2 = scan.nextInt();
		System.out.println("��genin ���nc� kenar�n� giriniz");
		int num3 = scan.nextInt();
		if(num1==num2 && num2==num3 && num1==num3) {System.out.println("E�kenar ��gen");
		}else {System.out.println("E�kenar de�il");}  	*/
		
		
	/*3)Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. E�er urun miktar� 1000 den fazla ise
		Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n. Di�er durumlarda
		�demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n.*) 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alaca��n�z �r�n miktar�n� giriniz");
		double miktar = scan.nextDouble();
		System.out.println("Alaca��n�z �r�n�n birim fiyat�n� giriniz");
		double fiyat = scan.nextDouble();
		if(miktar>1000) {System.out.println(miktar*fiyat*9/10);
		}else{System.out.println(miktar*fiyat);};	*/
		
		
	/*4)Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n.
		Di�er durumlarda ekrana �Harf de�il� yazd�r�n.	
		
		Uzun yolu
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character giriniz");
		String character = scan.next();
		if(character.equals("a")||character.equals("b")||character.equals("c")||character.equals("�")||
		character.equals("d")||character.equals("e")||character.equals("f")||character.equals("g")||
		character.equals("�")||character.equals("h")||character.equals("�")||character.equals("i")||
		character.equals("j")||character.equals("k")||character.equals("l")||character.equals("m")||
		character.equals("n")||character.equals("o")||character.equals("�")||character.equals("p")||
		character.equals("r")||character.equals("s")||character.equals("�")||character.equals("t")||
		character.equals("u")||character.equals("�")||character.equals("v")||character.equals("y")||
		character.equals("z")||character.equals("x")||character.equals("q")||
		character.equals("A")||character.equals("B")||character.equals("C")||character.equals("�")||
		character.equals("D")||character.equals("E")||character.equals("F")||character.equals("G")||
		character.equals("�")||character.equals("H")||character.equals("I")||character.equals("�")||
		character.equals("J")||character.equals("K")||character.equals("L")||character.equals("M")||
		character.equals("N")||character.equals("O")||character.equals("�")||character.equals("P")||
		character.equals("R")||character.equals("S")||character.equals("�")||character.equals("T")||
		character.equals("U")||character.equals("�")||character.equals("V")||character.equals("Y")||
		character.equals("Z")||character.equals("X")||character.equals("Q")) 
		{System.out.println("Harf");
		}else{System.out.println("Harf de�il");};
		
				
		//Bu �ok uzun oldu...
		 
		K�sa yolu.... 
		
	
		Scanner scan =  new  Scanner(System.in);
		System.out.println("L�tfen bir character giriniz");
		char character = scan.next().charAt(0); 
		boolean harf =Character.isAlphabetic(character);  
		if(harf == true) {System.out.println("Harf");
		}else {System.out.println("Harf de�il");}  */

		
		
		
		//If-else if() Statement Sorular�
		
	/*1)Kullan�c�dan bir tamsay� al�n e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n.
		0 ise ekrana �N�tr� yazd�r�n. 0 dan b�y�k ise ekrana �Pozitif� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay�  giriniz");
		int num = scan.nextInt();
		if(num<0) {System.out.println("Negatif");
		}else if(num==0) {System.out.println("n�tr");
		}else if(num>0) {System.out.println("Pozitif");}	*/
		
		
		
	/*2)Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
		�E�kenar ��gen� yazd�r�n. Sadece iki kenar uzunlu�u birbirine e�it ise ekrana �Ikizkenar ��gen�
		yazd�r�n. T�m kenar uzunluklar� birbirinden farkl� ise ��e�itkenar ��gen yazd�r�n�
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��genin bir kenar�n� giriniz");
		int num1 = scan.nextInt();
		System.out.println("��genin ikinci kenar�n� giriniz");
		int num2 = scan.nextInt();
		System.out.println("��genin ���nc� kenar�n� giriniz");
		int num3 = scan.nextInt();
		if(num1==num2 && num2==num3 && num1==num3) {System.out.println("E�kenar ��gen");
		}else if(num1!=num2 && num2!=num3 && num1!=num3){System.out.println("�e�itkenar ��gen yazd�r�n");
		}else {System.out.println("Ikizkenar ��gen");} 		*/
		
		
	/*3)Kullan�c�dan notunu al�n ve a�a��daki kurallara g�re ekrana A, B, C veya D yazd�r�n.
		1. 50 den az - D 2. 50(dahil) ile 60 aras� - C 3. 60(dahil) ile 80 aras� - B. 4. 80(dahil) ustu- A	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu giriniz");
		int not = scan.nextInt();
		if(not<0) {System.out.println("Yanl�� bir not girdiniz L�tfen d�zeltiniz");
		}else if(not<50) {System.out.println("Notunuz D");
		}else if(not<60) {System.out.println("Notunuz C");
		}else if(not<80) {System.out.println("Notunuz B");
		}else if(not<=100) {System.out.println("Notunuz A");
		}else if(not>100) {System.out.println("Yanl�� bir not girdiniz L�tfen d�zeltiniz");}		*/
		
		
		
	/*4)Kullan�c�dan bir y�l al�n e�er y�l 1000�e b�lunuyorsa ekrana �Milenyum� yazd�r�n.
		E�er y�l 100�e b�lunuyorsa ekrana �Y�zy�l� yazd�r�n.
		E�er y�l 10�a b�lunuyorsa ekrana �Ony�l� yazd�r�n.	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir y�l giriniz");
		int year = scan.nextInt();
		if(year%1000==0) {System.out.println("Milenyum");
		}else if(year%100==0) {System.out.println("Y�zy�l");
		}else if(year%10==0) {System.out.println("Ony�l");}			*/

	}}
