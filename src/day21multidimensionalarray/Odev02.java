package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Odev02 {

	public static void main(String[] args) {
//		ArrayList Method�lar� �deleri
		
//		1) Elemanlar� A, C, E, ve F olan bir String ArrayList olu�turup ekrana yazd�r�n�z.

	List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");
	System.out.println(list);
	
	
//		2) �ndexsiz add() methodunu kullanarak, B�yi ekleyiniz.
//	�ndex�li add() methodunu kullanarak, L�yi 1 numaral� index�e ekleyiniz.
//	ArrayList�i ekrana yazd�r�n�z, list ��yle olmal�; A, L, C, E, F, B.
	
		list.add("B");
		list.add(1, "L");
		System.out.println(list);
		
//		3) set() methodu kullanarak, E�yi D yap�n�z.
//	ArrayList�i ekrana yazd�r�n�z, list ��yle olmal�; A, L, C, D, F, B.
		
		list.set(3,"D");
		System.out.println(list);
		
//		4) remove() methodu kullanarak, F�yi siliniz.
//	ArrayList�i ekrana yazd�r�n�z, list ��yle olmal�; A, L, C, D, B.
		
		list.remove(4);
		System.out.println(list);
		
//		5) sort() methodu kullanarak, elemanlar� alfabetik s�raya diziniz.
//	ArrayList�i ekrana yazd�r�n�z, list ��yle olmal�; A, B, C, D, L.
		
		Collections.sort(list);
		System.out.println(list);
		
//		6) contains() methodu kullanarak, L�nin list�de var oldugunu ve M�nin list�de
//	var olmad���n� do�rulay�n�z.
		
		System.out.println(list.contains("L"));
		System.out.println(list.contains("M"));
		
//		7) size() methodu kullanarak, list�in ka� eleman oldu�unu ekrana yazd�r�n�z.
	
		System.out.println(list.size());
	
//		8) clear() methodu kullanarak, list�deki tum elemanlar� siliniz.
	
		list.clear();
		System.out.println(list);
		
//		9) isEmpty() methodu kullanarak, list�deki tum elemanlar�n silindi�ini do�rulay�n�z.
	
		System.out.println(list.isEmpty());
	
	}

}
