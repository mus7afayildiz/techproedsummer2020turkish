package Java_Review;

public class Day01Ders {

	public static void main(String[] args) {
		System.out.println("Hello World");
	/*	//************************************************************************************      
		    Soru1:  A�a��daki pascal ��genini ekrana yazd�ran bir program yaz�n�z
		        1
		      1   1
		    1   2   1
		  1   3   3   1
		1   4   6   4   1
		        System.out.println("        1");
		        System.out.println("       1  1");
		        System.out.println("      1  2  1");
		        System.out.println("     1  3  3 1");
		        System.out.println("    1  4  6  4 1");
		        
		        
		//****************************************************************************      
		Soru 2: A�a��daki �ekli ekrana yazd�ran bir program yaz�n�z
		         A
		        B B
		       C   C
		      D     D
		     E       E
		    F         F
		     E       E
		      D     D
		       C   C
		        B B
		         A
		    
		        System.out.println("      A");
		        System.out.println("     B  B");
		        System.out.println("    C    C");
		        System.out.println("   D      D");
		        System.out.println("  E        E");
		        System.out.println(" F          F");
		        System.out.println("  E        E");
		        System.out.println("   D      D");
		        System.out.println("    C    C");
		        System.out.println("     B  B");
		        System.out.println("      A");
		    //************************************************************************* 
		    Soru 3:  Sa�l���n i�in "Evde Kal". c�mlesini ekranda yazd�r�n�z
		        
		        System.out.println("Sa�l���n i�in \"Evde Kal\".");
		    //**************************************************************************    
		     Soru 4:
		        Would you like 'coffee' or 'tea' ? c�mlesini ekrana yazd�r�n�z
		        
		        System.out.println("Would you like \'coffee\' or \'tea\' ?");
		    //***********************************************************************   
		    Soru 5: double 10.231 i int�e �evirip ekrana yazdiriniz.
		        
		        double db= 10.231;
		        int i= (int) db;
		        System.out.println(i);
		        
		    //*******************************************************************
		        Soru 6: Asag�daki i�lemleri cevaplay�n�z
		        int a=11;
		        int b=5;
		        double pi=3.14;
		        a*b=?
		        a*pi=?
		        b/a=?
		        a*b/pi=?
		        a+b+pi=?
		        a+b=?
		        a-b=?
		        -pi/a=?
		        (a+b)/pi=?
		        (b/pi)*a=?
		        
		        System.out.println("a*b= "+a*b);
		        System.out.println("a*pi= "+a*pi);
		        System.out.println("b/a= "+b/a);
		        System.out.println("a*b/pi= "+ a*b/pi);
		        System.out.println("a+b+pi= "+(a+b+pi));
		        System.out.println("a+b= "+(a+b));
		        System.out.println("a-b="+(a-b));
		        System.out.println("-pi/a= "+(-pi/a));
		        System.out.println("(a+b)/pi= "+(a+b)/pi);
		        System.out.println("(b/pi)*a= "+(b/pi)*a);
		        
		    //************************************************************* 
		    Soru 7: A�a��da yaz�lanlar� ekranda g�steriniz
		    
		        hi 21 
		        hi Harun
		        5TechProEd203
		        TechProEd305
		        7TechProEd305
		        
		        
		        System.out.println("hi "+21);
		        System.out.println("hi "+"Harun");
		        System.out.println(2+0+3+"TechProEd"+2+0+3);
		        System.out.println("TechProEd"+3+0+5);
		        System.out.println(2+0+5+"TechProEd"+"305");
		        
		    //*************************************************
		        Soru 8: A�a��daki sorular� cevaplay�n�z
		        a. -5 + 8 * 6
		          b. (55+9) % 9
		          c. 20 + -3*5 / 8
		          d. 5 + 15 / 3 * 2 - 8 % 3
		          
		          Beklenen cevaplar:
		          43
		          1
		          19
		          13
		        
		        
		    System.out.println(-5 + 8 * 6);
		        System.out.println((55+9) % 9);
		        System.out.println(20 + -3*5 / 8);
		        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		        
		        int num=10;
		        num+=100;
		        System.out.println(num);
		        
		    System.out.println(Math.pow(2,3));
		    System.out.println(Math.sqrt(144));
		    System.out.println(Math.round(2.7));
		//**********************************************************************    
		    Soru 9: Dikd�rtgenin alan�n� ve �evresini bulunuz
		    �evre = 2*(boy + en)
		    alan = en * boy
		    double en = 5.6;
		    double boy = 8.5;
		    double cevre=2*(boy+en);
		    double alan = en*boy;
		    
		    System.out.println("�evre= "+cevre);
		    System.out.println("Alan= "+alan);
		//****************************************************************************
		    Soru 10: Kullan�c�dan Dikd�rtgenin kenar uzunluklar�n� al�n ve sonra bu dikd�rtgenin alan ve
		    �evresini hesaplay�p ekrana yazd�ran bir program yaz�n�z.
		    integer kullan�n�z
		    Not: Alan: Boy x En
		    Not: �evre: 2x (Boy + En)
		    
		    
		    Scanner klavye = new Scanner(System.in);
		        System.out.println("L�tfen Dikd�rtgenin Boy uzunlu�unu giriniz: ");
		        double boy=klavye.nextDouble();
		        System.out.println("L�tfen Dikd�rtgenin En uzunlu�ununu giriniz: ");
		        int en= klavye.nextInt();
		        double alan=boy*en;
		        double cevre=2*(boy+en);
		        System.out.println("Alan= "+alan);
		        System.out.println("�evre= "+cevre);
		        
		//*******************************************************************************************       
		        Soru 11: Scanner ile kullan�c�dan 3 say� girmesini isteyin ve bu say�lar�n toplam�n� yazd�r�n�z.
		        integer kullan�n�z
		        
		    
		        System.out.println("L�tfen 3 adet tam say� giriniz");
		        Scanner scan =new Scanner(System.in);
		        int num1,num2,num3,toplam;
		        System.out.println("L�tfen birinci say�y� giriniz");
		        num1=scan.nextInt();
		        System.out.println("L�tfen ikinci say�y� giriniz");
		        num2=scan.nextInt();
		        System.out.println("L�tfen ���nc� say�y� giriniz");
		        num3=scan.nextInt();
		        toplam=num1+num2+num3;
		        System.out.println("�� Say�n�n Toplam�= "+toplam);
*/
	}

}
