package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tekrar {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		System.out.println(list);
		
		list.add("Can");
		System.out.println(list);
		
		list.add(1, "Veli");
		System.out.println(list);
		
		//list01'i [Han, Ali, Kemal, Veli, Can, Ayse] sekline getirin
		
		list.add(0, "Han");
		System.out.println(list);
		
		list.add(2, "Kemal");
		System.out.println(list);
		
		list.add("Ayse");
		System.out.println(list);
		
		int elemanSayısı = list.size();
		System.out.println("Listenin Eleman Sayısı : "+elemanSayısı);
		
		
		List<Integer> list01 = new ArrayList<>();
		System.out.println(list01.isEmpty());//true
		
		list01.add(123);
		System.out.println(list01.isEmpty());//false
		
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);
		
		list01.remove(1);
		System.out.println(list01);
		
		list01.remove(list01.size()-1);
		System.out.println(list01);
		
		
		
		list01.set(0, 521);
		System.out.println(list01.set(0, 521));
		
		list01.clear();
		System.out.println(list01);
		System.out.println(list01.isEmpty());
		
		List<String> list02 = new ArrayList<>();
		list02.add("A");
		list02.add("C");
		list02.add("B");
		list02.add("C");
		System.out.println(list02);
		
		System.out.println(list02.contains("B"));
		System.out.println(list02.contains("Z"));
		
		Collections.sort(list02);
		System.out.println(list02);
	
		
	}

}
