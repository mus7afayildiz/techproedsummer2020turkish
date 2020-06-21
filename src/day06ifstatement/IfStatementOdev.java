package day06ifstatement;

import java.util.Scanner;

public class IfStatementOdev {

	public static void main(String[] args) {
		
		/*If Statement Sorularý
		
	/*1)Kullanýcýdan bir tamsayý alýn eðer tamsayý 3 ile bölünebiliyorsa ekrana “3’ün katý” yazdýrýn.
		3 ile bölünemiyorsa ekrana “3’ün katý deðildir” yazdýrýn.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz");
		int num = scan.nextInt();
		if(num%3==0) {System.out.println("3’ün katý");
		}else{System.out.println("3’ün katý deðildir");};	*/
		
	/*2)Kullanýcýdan bir harf alýn eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
		“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn.	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf  giriniz");
		String harf = scan.next();
		if(harf.equals("a") ||harf.equals("e") ||harf.equals("i") ||harf.equals("o") ||harf.equals("u"))
		{System.out.println("Sesli harf");};
		if(harf.equals("b") ||harf.equals("c") ||harf.equals("d") ||harf.equals("f"))
		{System.out.println("Sessiz harf");
		}else{System.out.println("listede olmayan hatalý harf girdiniz");};			*/
		
	/*3)Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
		“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. “Pazar” ise ekrana
		“Hýristiyanlar icin kutsal gün” yazdýrýn	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gün  giriniz");
		String gün = scan.next();
		if(gün.equals("Cuma")) {System.out.println("Müslümanlar icin kutsal gün");};
		if(gün.equals("Cumartesi")) {System.out.println("Yahudiler icin kutsal gün");};
		if(gün.equals("Pazar")) {System.out.println("Hýristiyanlar icin kutsal gün");};			*/
	
	/*4)Kullanýcýdan iki sayý alýn eðer sayýlarýn iþaretleri ayný ise ekrana “Ayný iþaretli” yazdýrýn.
		Sayýlarýn iþaretleri farklý ise ekrana “Farklý iþaretli” yazdýrýn.	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý  giriniz");
		int num1 = scan.nextInt();
		System.out.println("Bir sayý daha giriniz");
		int num2 = scan.nextInt();
		if(num1<0 && num2<0 || num1>0 && num2>0  ) {System.out.println("Ayný iþaretli");
		}else{ System.out.println("Farklý iþaretli");}   */
		
		
		
		
		/*If-else Statement Sorularý
		
	/*1)Kullanýcýdan bir tamsayý alýn eðer tamsayý 10 dan kucuk ve 0’dan büyük eþit ise ekrana
		“Rakam” yazdýrýn. Diðer durumlarda ekrana “Sayý” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý  giriniz");
		int num = scan.nextInt();
		if(num>=0 && num<10) {System.out.println("Rakam");
		}else{System.out.println("Sayý");}	*/	
		
		
	/*2)Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
		“Eþkenar üçgen” yazdýrýn. Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("üçgenin bir kenarýný giriniz");
		int num1 = scan.nextInt();
		System.out.println("üçgenin ikinci kenarýný giriniz");
		int num2 = scan.nextInt();
		System.out.println("üçgenin üçüncü kenarýný giriniz");
		int num3 = scan.nextInt();
		if(num1==num2 && num2==num3 && num1==num3) {System.out.println("Eþkenar üçgen");
		}else {System.out.println("Eþkenar deðil");}  	*/
		
		
	/*3)Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. Eðer urun miktarý 1000 den fazla ise
		Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana yazdýrýn. Diðer durumlarda
		ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn.*) 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alacaðýnýz ürün miktarýný giriniz");
		double miktar = scan.nextDouble();
		System.out.println("Alacaðýnýz ürünün birim fiyatýný giriniz");
		double fiyat = scan.nextDouble();
		if(miktar>1000) {System.out.println(miktar*fiyat*9/10);
		}else{System.out.println(miktar*fiyat);};	*/
		
		
	/*4)Kullanýcýdan bir character alýn eðer character bir harf ise ekrana “Harf” yazdýrýn.
		Diðer durumlarda ekrana “Harf deðil” yazdýrýn.	
		
		Uzun yolu
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character giriniz");
		String character = scan.next();
		if(character.equals("a")||character.equals("b")||character.equals("c")||character.equals("ç")||
		character.equals("d")||character.equals("e")||character.equals("f")||character.equals("g")||
		character.equals("ð")||character.equals("h")||character.equals("ý")||character.equals("i")||
		character.equals("j")||character.equals("k")||character.equals("l")||character.equals("m")||
		character.equals("n")||character.equals("o")||character.equals("ö")||character.equals("p")||
		character.equals("r")||character.equals("s")||character.equals("þ")||character.equals("t")||
		character.equals("u")||character.equals("ü")||character.equals("v")||character.equals("y")||
		character.equals("z")||character.equals("x")||character.equals("q")||
		character.equals("A")||character.equals("B")||character.equals("C")||character.equals("Ç")||
		character.equals("D")||character.equals("E")||character.equals("F")||character.equals("G")||
		character.equals("Ð")||character.equals("H")||character.equals("I")||character.equals("Ý")||
		character.equals("J")||character.equals("K")||character.equals("L")||character.equals("M")||
		character.equals("N")||character.equals("O")||character.equals("Ö")||character.equals("P")||
		character.equals("R")||character.equals("S")||character.equals("Þ")||character.equals("T")||
		character.equals("U")||character.equals("Ü")||character.equals("V")||character.equals("Y")||
		character.equals("Z")||character.equals("X")||character.equals("Q")) 
		{System.out.println("Harf");
		}else{System.out.println("Harf deðil");};
		
				
		//Bu Çok uzun oldu...
		 
		Kýsa yolu.... 
		
	
		Scanner scan =  new  Scanner(System.in);
		System.out.println("Lütfen bir character giriniz");
		char character = scan.next().charAt(0); 
		boolean harf =Character.isAlphabetic(character);  
		if(harf == true) {System.out.println("Harf");
		}else {System.out.println("Harf deðil");}  */

		
		
		
		//If-else if() Statement Sorularý
		
	/*1)Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
		0 ise ekrana “Nötr” yazdýrýn. 0 dan büyük ise ekrana “Pozitif” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayý  giriniz");
		int num = scan.nextInt();
		if(num<0) {System.out.println("Negatif");
		}else if(num==0) {System.out.println("nötr");
		}else if(num>0) {System.out.println("Pozitif");}	*/
		
		
		
	/*2)Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
		“Eþkenar üçgen” yazdýrýn. Sadece iki kenar uzunluðu birbirine eþit ise ekrana “Ikizkenar üçgen”
		yazdýrýn. Tüm kenar uzunluklarý birbirinden farklý ise “Çeþitkenar üçgen yazdýrýn”
		
		Scanner scan = new Scanner(System.in);
		System.out.println("üçgenin bir kenarýný giriniz");
		int num1 = scan.nextInt();
		System.out.println("üçgenin ikinci kenarýný giriniz");
		int num2 = scan.nextInt();
		System.out.println("üçgenin üçüncü kenarýný giriniz");
		int num3 = scan.nextInt();
		if(num1==num2 && num2==num3 && num1==num3) {System.out.println("Eþkenar üçgen");
		}else if(num1!=num2 && num2!=num3 && num1!=num3){System.out.println("Çeþitkenar üçgen yazdýrýn");
		}else {System.out.println("Ikizkenar üçgen");} 		*/
		
		
	/*3)Kullanýcýdan notunu alýn ve aþaðýdaki kurallara göre ekrana A, B, C veya D yazdýrýn.
		1. 50 den az - D 2. 50(dahil) ile 60 arasý - C 3. 60(dahil) ile 80 arasý - B. 4. 80(dahil) ustu- A	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu giriniz");
		int not = scan.nextInt();
		if(not<0) {System.out.println("Yanlýþ bir not girdiniz Lütfen düzeltiniz");
		}else if(not<50) {System.out.println("Notunuz D");
		}else if(not<60) {System.out.println("Notunuz C");
		}else if(not<80) {System.out.println("Notunuz B");
		}else if(not<=100) {System.out.println("Notunuz A");
		}else if(not>100) {System.out.println("Yanlýþ bir not girdiniz Lütfen düzeltiniz");}		*/
		
		
		
	/*4)Kullanýcýdan bir yýl alýn eðer yýl 1000’e bölunuyorsa ekrana “Milenyum” yazdýrýn.
		Eðer yýl 100’e bölunuyorsa ekrana “Yüzyýl” yazdýrýn.
		Eðer yýl 10’a bölunuyorsa ekrana “Onyýl” yazdýrýn.	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yýl giriniz");
		int year = scan.nextInt();
		if(year%1000==0) {System.out.println("Milenyum");
		}else if(year%100==0) {System.out.println("Yüzyýl");
		}else if(year%10==0) {System.out.println("Onyýl");}			*/

	}}
