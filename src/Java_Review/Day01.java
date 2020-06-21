package Java_Review;

import java.util.Scanner;

public class Day01 {

public static void main(String[] args) {
System.out.println("Hello World");
		/*    1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1*/
		
/*System.out.println("  1    ");
System.out.println("   1 1   ");	
System.out.println("  1 2 1  ");	
System.out.println(" 1 3 3 1 ");	
System.out.println("1 4 6 4 1");	*/


System.out.println("     A      ");
System.out.println("    B B     ");
System.out.println("  D     D   ");
System.out.println(" E       E  ");
System.out.println("F         F ");
System.out.println(" E       E  ");
System.out.println("  D     D   ");
System.out.println("   C   C    ");
System.out.println("    B B     ");
System.out.println("     A      ");

// Saðlýðýn için "Evde Kal".
System.out.println("Saðlýðýn için \"Evde Kal\".");

//Would you like 'coffee' or 'tea'?
System.out.println("Would you like 'coffee' or 'tea'?");

//double 10.231 i int e çeviripekrana yazdýrýnýz.
double num1 =10.231;
int num2 = (int)num1;
System.out.println(num2);

/*a*b=?
a*pi=?
b/a=?
a*b/pi=?
a+b+pi=?
a+b=?
a-b=?
-pi/a=?
(a+b)/pi=?
(b/pi)*a=?*/

int a=11;
int b=5;
double pi=3.14;

System.out.println("a*b= "+a*b);
System.out.println("a*pi= "+a*pi);
System.out.println("b/a= "+b/a);
System.out.println("a*b/pi= "+a*b/pi);
System.out.println("a+b+pi= "+a+b+pi);
System.out.println("a+b= "+a+b);
System.out.println("-pi/a= "+-pi/a);
System.out.println("(a+b)/pi= "+(a+b)/pi);
System.out.println("(b/pi)*a= "+(b/pi)*a);


System.out.println("hi "+ 21);
System.out.println("hi "+ "Harun");
System.out.println(5+"TechProEd"+203);
System.out.println("TechProEd"+305);
System.out.println(7+"TechProEd"+305);
/*
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3   */

System.out.println(-5 + 8 * 6);
System.out.println((55+9) % 9);
System.out.println(20 + -3*5 / 8);
System.out.println( 5 + 15 / 3 * 2 - 8 % 3);

int num=10;
num+=100;
System.out.println(num);

System.out.println(Math.pow(3, 2));
System.out.println(Math.sqrt(144));
System.out.println(Math.round(2.7));

//Dikdörtgenin alaný ve çevresini bukunuz.
double en = 5.6;
double boy = 8.5;

System.out.println("alan= "+en*boy);
System.out.println("çevre= "+(en+boy)*2);


/*Kullanýcýdan Dikdörtgenin kenar uzunluðunu alan ve sonra bu karenin alan ve
	çevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
	integer kullanýnýz
	Not: Alan: Boy x En
	Not: Çevre: 2x (Boy + En)*/
Scanner scan = new Scanner(System.in);
System.out.println("Dikdörtgenin uzun kenarýný giriniz");
double uzunKenar = scan.nextDouble();
System.out.println("Dikdörtgenin kýsa kenarýný giriniz");
double kýsaKenar = scan.nextDouble();
System.out.println("Çevresi= "+2*(uzunKenar + kýsaKenar));
System.out.println("Alan= "+uzunKenar*kýsaKenar);


//Scanner ile kullanýcýdan 3 sayý girmesini isteyin ve bu sayýlarýn toplamýný yazdýrýnýz.

System.out.println("Lütfen üç sayý giriniz");
Scanner scan1 = new Scanner(System.in);
int sayý1 = scan1.nextInt();
int sayý2 = scan1.nextInt();
int sayý3 = scan1.nextInt();
System.out.println(sayý1+sayý2+sayý3);
}
}
