package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
	byte by = 101;
	int say� = by;// K���k data tipini b�y�k data tipine �evirmek i�in ekstra bir kod yazmaya 
				  //gerek yok java bunu otomatik olarak yapar. (Auto Widening)
	
	System.out.println(say�);//101
	
	int say�2 = 53;
	byte by2 = (byte)say�2;/*B�y�k data tipini k���k data tipine �evirmek java taraf�ndan yap�lmaz 
							�rnekteki gibi sa� tarafa d�n��t�rmek istedi�imiz data tipini parantez 
							i�inde yazmal�y�z.*/
			
	System.out.println(by2);
	double say�3 = 23.9;
	int by3 = (int)say�3;
	
	System.out.println(by3);
	
	
	float say�4 = -23.9f;
	short by4 = (short)say�4;
	System.out.println(by4);
	
	double say�5 = 4.8;
	double say�6 = 1.4;
	double sonu�1 = say�5/say�6;
	System.out.println(sonu�1);
	
	int sonu�2 = (int)(say�5/say�6);
	System.out.println(sonu�2);		
	
	
	int say�7 = 5;
	int say�8 = 3;
	
	int sonu�3 = say�7/say�8;
	System.out.println(sonu�3);   //Normalde 5/3=1.6666... 
								  // ama data type int yaparsanz sadece tam k�sm� g�r�rs�n�z.

	
	
	int say�9 = 255;
	byte by5 = (byte) say�9;
	
	System.out.println(by5);// normalde byte ta (-128...-1 0 1.....127) 256 say� var.
							//255 bir tane eksik oldu�u i�in  -1 ekrana yaz�l�r.
	
	
	
	
	}

}
