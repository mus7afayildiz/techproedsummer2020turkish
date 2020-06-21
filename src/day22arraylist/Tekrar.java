package day22arraylist;

public class Tekrar {

	public static void main(String[] args) {
		int arr[] = {12,21,13,43};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		
		for(int w : arr) {
			System.out.println(w);
		}
		

		//String iceren bir array olusturun, elemanlarini yanyana aralarina bosluk koyarak
		//for each loop ile ekrana yazdirin.
		
		String arr1[] = {"Ali", "Can","Mahmud"}; 
		for(String w : arr1) {
			System.out.print(w+" ");
		};
			
		
		
	}

}
