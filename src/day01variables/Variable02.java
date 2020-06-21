package day01variables;

public class Variable02 {

	public static void main(String[] args) {
		
		char harf1='a';//a nýn deðeri 97
		char harf2='b';//b nýn deðeri 98
		//syso yazýp sonra ctrl+space
		System.out.println(harf1+harf2);//ab mi? ==>97+98=195
		System.out.println(harf1);//a
		System.out.println(harf2);//b
		//ab yazdýrmak için aþaðýdaki yöntem kullanýlabilir
		System.out.print(harf1);
		System.out.print(harf2);
		
		//Bir char ýn ASCII tablo kullanmadan nasýl bulunur?
		//
		//'a' // 97==> 97 bir tamsayý
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
