package day01variables;

public class Variable02 {

	public static void main(String[] args) {
		
		char harf1='a';//a n�n de�eri 97
		char harf2='b';//b n�n de�eri 98
		//syso yaz�p sonra ctrl+space
		System.out.println(harf1+harf2);//ab mi? ==>97+98=195
		System.out.println(harf1);//a
		System.out.println(harf2);//b
		//ab yazd�rmak i�in a�a��daki y�ntem kullan�labilir
		System.out.print(harf1);
		System.out.print(harf2);
		
		//Bir char �n ASCII tablo kullanmadan nas�l bulunur?
		//
		//'a' // 97==> 97 bir tamsay�
		int aCharDegeri='a';
		System.out.println(aCharDegeri);
		
		
		int unlemCharDeger='!';
		System.out.println(unlemCharDeger);
		int yuzdeCharDeger='%';
		System.out.println(yuzdeCharDeger);
		int asteriksCharDeger='*';
		System.out.println(asteriksCharDeger);
		
		
	}

}
