package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
	byte by = 101;
	int sayý = by;// Küçük data tipini büyük data tipine çevirmek için ekstra bir kod yazmaya 
				  //gerek yok java bunu otomatik olarak yapar. (Auto Widening)
	
	System.out.println(sayý);//101
	
	int sayý2 = 53;
	byte by2 = (byte)sayý2;/*Büyük data tipini küçük data tipine çevirmek java tarafýndan yapýlmaz 
							örnekteki gibi sað tarafa dönüþtürmek istediðimiz data tipini parantez 
							içinde yazmalýyýz.*/
			
	System.out.println(by2);
	double sayý3 = 23.9;
	int by3 = (int)sayý3;
	
	System.out.println(by3);
	
	
	float sayý4 = -23.9f;
	short by4 = (short)sayý4;
	System.out.println(by4);
	
	double sayý5 = 4.8;
	double sayý6 = 1.4;
	double sonuç1 = sayý5/sayý6;
	System.out.println(sonuç1);
	
	int sonuç2 = (int)(sayý5/sayý6);
	System.out.println(sonuç2);		
	
	
	int sayý7 = 5;
	int sayý8 = 3;
	
	int sonuç3 = sayý7/sayý8;
	System.out.println(sonuç3);   //Normalde 5/3=1.6666... 
								  // ama data type int yaparsanz sadece tam kýsmý görürsünüz.

	
	
	int sayý9 = 255;
	byte by5 = (byte) sayý9;
	
	System.out.println(by5);// normalde byte ta (-128...-1 0 1.....127) 256 sayý var.
							//255 bir tane eksik olduðu için  -1 ekrana yazýlýr.
	
	
	
	
	}

}
