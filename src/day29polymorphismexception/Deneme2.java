package day29polymorphismexception;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme2 {
//	Bir arrayi tersine çeviren  method yazýnýz.
    
	public static void main(String[] args) { 
		int arr[]= {1, 2, 3, 4};
		System.out.println(Arrays.toString(arr));
		int arr2[] = reverse(arr);
		System.out.println(Arrays.toString(arr2));
		
		
		
	}
	
	public static int[] reverse(int[] arr) {
		
		// write your code here
		for (int i = 0; i < arr.length; i++) {
		
			for (int j = arr.length-1; j >= 0; j--) {
		arr[i]= arr[j];
		}
		}	
			return arr;
		}
	
	    
}    
	    
	
	    	
