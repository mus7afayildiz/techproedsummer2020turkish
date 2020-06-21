package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class Odev {

	public static void main(String[] args) {
//		For-each loop Soru 1:
		
//			Bir integer array olu�turunuz ve bu array�deki tum say�lar�n �arp�m�n�
//			For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.

		int arr[] = {1,3,5,7,9};
		int carp�m = 1;
		for(int w : arr) {
			 carp�m = carp�m*w;
		 }
		 System.out.println(carp�m);
		
		
//		 For-each loop Soru 2:
		
//			Bir integer list olu�turunuz ve bu list�deki tum say�lar�n karesinin toplam�n�
//		 	For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		
		int sum = 0;
		for(int w : list2) {
			sum = sum + w*w;
		}
		System.out.println(sum);
		
		
//		For-each loop Soru 3:
		
//		�ki String array olu�turunuz ve bu array�lerdeki ortak elemanlar�
//		For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.
//		Ortak eleman yoksa ekrana �Ortak eleman yok� yazd�r�n�z
		
		
		String arr3[] = {"Ali", "Can", "Ahmet", "Cem"};
		String arr4[] = { "Ali", "Can", "Veli", };
			int count = 0;
			List<String> list3 = new ArrayList<>(); 
		for(String w: arr3) {
			for(String x: arr4) {
				if(w.equals(x)) {
					count++;
				list3.add(w);	
				}
			}
		}
		if(count==0) {
			System.out.println("Ortak eleman yok");
		}else {System.out.println(list3);}
		
		
		
		
//		For-each loop Soru 4:
		
//		Bir String olu�turunuz, bu String�deki character�leri yukar�dan a�a��ya
//		for-each loop kullanarak yazd�r�n�z.
//		�pucu: split()
		
		String str = "Cin Ali okulda.";
		String strAr[] = str.split("");
		for(String w :strAr) {
			System.out.println(w);
		};
		
	}

}
