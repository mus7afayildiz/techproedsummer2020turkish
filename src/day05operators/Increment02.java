package day05operators;

public class Increment02 {

	public static void main(String[] args) {
		
		//int data type inde iki tane variable oluşturun 
		//birinciyi 3 ikinciyi 7 arttırın
		//kısa yol kullanın
		
		int sayı1 = 12;
		//sayı1 = sayı1+3; // increment ==> 2. yol kısa yol
		//+ ile = arasında boşluk bırakmayın
		
		System.out.println(sayı1);//15
		int sayı2= 20;
		sayı2+=7;
		System.out.println(sayı2);
	}

}
