package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		 // int data type'inda bir variable olusturun.
		 // bu variable nýn deðerini çarpma ve bölme kullanarak
		 //artýrýn ve azaltýn
		
		int num1 = 12;
		
		//Uzun yol ile çarpma yaparak increment
		
		num1 = num1*3;//num1=36
		System.out.println(num1);//36
		
		//kýsa yol
		num1*=3; //36*3=108
		System.out.println(num1);//108
		
		//Uzun yol ile bölme yaparak decrement
		num1 = num1/9;// 108/9=12
		System.out.println(num1);
		
		//Kýsa yol
		
		num1/=2;//12/2=6
		System.out.println(num1);//6
		
	}

}
