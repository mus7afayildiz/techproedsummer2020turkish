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

// Sa�l���n i�in "Evde Kal".
System.out.println("Sa�l���n i�in \"Evde Kal\".");

//Would you like 'coffee' or 'tea'?
System.out.println("Would you like 'coffee' or 'tea'?");

//double 10.231 i int e �eviripekrana yazd�r�n�z.
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

//Dikd�rtgenin alan� ve �evresini bukunuz.
double en = 5.6;
double boy = 8.5;

System.out.println("alan= "+en*boy);
System.out.println("�evre= "+(en+boy)*2);


/*Kullan�c�dan Dikd�rtgenin kenar uzunlu�unu alan ve sonra bu karenin alan ve
	�evresini hesaplay�p ekrana yazd�ran bir program yaz�n�z.
	integer kullan�n�z
	Not: Alan: Boy x En
	Not: �evre: 2x (Boy + En)*/
Scanner scan = new Scanner(System.in);
System.out.println("Dikd�rtgenin uzun kenar�n� giriniz");
double uzunKenar = scan.nextDouble();
System.out.println("Dikd�rtgenin k�sa kenar�n� giriniz");
double k�saKenar = scan.nextDouble();
System.out.println("�evresi= "+2*(uzunKenar + k�saKenar));
System.out.println("Alan= "+uzunKenar*k�saKenar);


//Scanner ile kullan�c�dan 3 say� girmesini isteyin ve bu say�lar�n toplam�n� yazd�r�n�z.

System.out.println("L�tfen �� say� giriniz");
Scanner scan1 = new Scanner(System.in);
int say�1 = scan1.nextInt();
int say�2 = scan1.nextInt();
int say�3 = scan1.nextInt();
System.out.println(say�1+say�2+say�3);
}
}
