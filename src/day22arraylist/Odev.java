package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class Odev {

	public static void main(String[] args) {
//		For-each loop Soru 1:
		
//			Bir integer array oluþturunuz ve bu array’deki tum sayýlarýn çarpýmýný
//			For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.

		int arr[] = {1,3,5,7,9};
		int carpým = 1;
		for(int w : arr) {
			 carpým = carpým*w;
		 }
		 System.out.println(carpým);
		
		
//		 For-each loop Soru 2:
		
//			Bir integer list oluþturunuz ve bu list’deki tum sayýlarýn karesinin toplamýný
//		 	For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
		
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
		
//		Ýki String array oluþturunuz ve bu array’lerdeki ortak elemanlarý
//		For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
//		Ortak eleman yoksa ekrana “Ortak eleman yok” yazdýrýnýz
		
		
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
		
//		Bir String oluþturunuz, bu String’deki character’leri yukarýdan aþaðýya
//		for-each loop kullanarak yazdýrýnýz.
//		Ýpucu: split()
		
		String str = "Cin Ali okulda.";
		String strAr[] = str.split("");
		for(String w :strAr) {
			System.out.println(w);
		};
		
	}

}
