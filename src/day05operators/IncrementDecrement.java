package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		 // int data type'inda bir variable olusturun.
		 // bu variable n�n de�erini �arpma ve b�lme kullanarak
		 //art�r�n ve azalt�n
		
		int num1 = 12;
		
		//Uzun yol ile �arpma yaparak increment
		
		num1 = num1*3;//num1=36
		System.out.println(num1);//36
		
		//k�sa yol
		num1*=3; //36*3=108
		System.out.println(num1);//108
		
		//Uzun yol ile b�lme yaparak decrement
		num1 = num1/9;// 108/9=12
		System.out.println(num1);
		
		//K�sa yol
		
		num1/=2;//12/2=6
		System.out.println(num1);//6
		
	}

}
