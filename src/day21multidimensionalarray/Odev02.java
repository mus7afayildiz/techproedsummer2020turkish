package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Odev02 {

	public static void main(String[] args) {
//		ArrayList Method’larý ödeleri
		
//		1) Elemanlarý A, C, E, ve F olan bir String ArrayList oluþturup ekrana yazdýrýnýz.

	List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");
	System.out.println(list);
	
	
//		2) Ýndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
//	Ýndex’li add() methodunu kullanarak, L’yi 1 numaralý index’e ekleyiniz.
//	ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, L, C, E, F, B.
	
		list.add("B");
		list.add(1, "L");
		System.out.println(list);
		
//		3) set() methodu kullanarak, E’yi D yapýnýz.
//	ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, L, C, D, F, B.
		
		list.set(3,"D");
		System.out.println(list);
		
//		4) remove() methodu kullanarak, F’yi siliniz.
//	ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, L, C, D, B.
		
		list.remove(4);
		System.out.println(list);
		
//		5) sort() methodu kullanarak, elemanlarý alfabetik sýraya diziniz.
//	ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, B, C, D, L.
		
		Collections.sort(list);
		System.out.println(list);
		
//		6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de
//	var olmadýðýný doðrulayýnýz.
		
		System.out.println(list.contains("L"));
		System.out.println(list.contains("M"));
		
//		7) size() methodu kullanarak, list’in kaç eleman olduðunu ekrana yazdýrýnýz.
	
		System.out.println(list.size());
	
//		8) clear() methodu kullanarak, list’deki tum elemanlarý siliniz.
	
		list.clear();
		System.out.println(list);
		
//		9) isEmpty() methodu kullanarak, list’deki tum elemanlarýn silindiðini doðrulayýnýz.
	
		System.out.println(list.isEmpty());
	
	}

}
