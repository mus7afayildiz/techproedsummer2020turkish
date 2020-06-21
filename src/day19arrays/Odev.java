package day19arrays;

public class Odev {

	public static void main(String[] args) {
		//1-
		
//		int arr[] = {10, 20, 30, 40, 50};
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(" "+arr[i]);		}

		
		//2-
		
//		int arr[2];
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		
		//3-
		
//		int arr[] = new int[2];
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		
		//4-
		
//		int arr1[]= {1,2,3};
//		int arr2[]= {1,2,3};
//		
//		if(arr1==arr2) {
//			System.out.println("Same");
//		}else {
//			System.out.println("Not Same");		}
		
		//5-
		
//		String cities[] = {"London","Paris","Rome","New York"};
//		System.out.println(cities[cities.length-2]);
		
		
//		//6-Bir array’de herhangi iki elemanýn ayný olup olmadýðýný kontrol
//		eden bir program yazýnýz.Ayný eleman varsa “Ayný eleman var” yoksa
//		“Ayný eleman yok” yazdýrýnýz.
//	1.yol	
		int num[]= {1,2,1,2,3,4,5,6,7,1,2,3,4,5,6,3,4,2,3};
		int count = 0;
		for(int i = 0; i<num.length-1; i++) {
			for (int l=i+1; l<num.length; l++) {
				if(num[i]==num[l]) {
					count++;}
				}
		}
		if(count>0) {System.out.println(count+" Ayný eleman var");
		}else {System.out.println("Ayný eleman yok");}
		
//		2. yol
//	int arr[]= {5,6,5,22,5,1,-6,70,4,16};
//		
//		int count=0;
//		for (int i=0; i<arr.length-1; i++) {
//		for (int m=i+1; m<arr.length; m++) {
//			if (arr[i]==arr[m]) {
//				count++;
//			}
//		}	
//		}
//		
//		if (count>0) {
//			System.out.println(count+" Ayný eleman vardir");
//		}else {
//			System.out.println("Ayný eleman yoktur");
//		}			
	}				

		
		
	}


