package day05operators;
public class Odev03 {
public static void main(String[] args) {
		
int numA = 2;
int numB = 3;
String str1 = "Study";
String str2 = "Hard";

/*	Yukar�daki variable�lari kullanarak ekrana �61 Study-1�
yazd�ran bir program yaz�n�z.*/
		
System.out.println((numA*numB)+""+(numB-numA)+" "+str1+(numA-numB));
		


System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1/9) - (1/11)));
//2.8952380952380956
System.out.println(4 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1/9) - (1/11)));
//2.8952380952380956
//Why the result changes when we change 4.0 to 4?

		

	}

}
