package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrar01 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan kaç elemanlý bir array girmesini  isteyin. 
        Bu array’i olusturup tum elemanlarýný ekrana yazdýrýn.
        Bu array'ýn ilk elemanýný son eleman yapýn ve tum elemanlarýný ekrana yazdýrýn.
        Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazdýrýn.
		*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Kaç elemanlý bir array oluþturmak istersiniz?");
		int arrLength = scan.nextInt();
		int arr[] = new int[arrLength];	
			System.out.println("Array elemanlarýný giriniz");
			
		for(int i=0; i<arrLength; i++) {
			arr[i] = scan.nextInt();
			}
		System.out.println(Arrays.toString(arr));
		
		int arrSon[] = new int[arrLength];
		
		for(int i=1; i<arrLength; i++) {
			arrSon[i-1]=arr[i];
		
		}
		arr[arrLength-1]=arr[0];
		System.out.println(Arrays.toString(arr));
	}

}
