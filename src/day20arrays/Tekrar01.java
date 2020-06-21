package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrar01 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan ka� elemanl� bir array girmesini  isteyin. 
        Bu array�i olusturup tum elemanlar�n� ekrana yazd�r�n.
        Bu array'�n ilk eleman�n� son eleman yap�n ve tum elemanlar�n� ekrana yazd�r�n.
        Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazd�r�n.
		*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Ka� elemanl� bir array olu�turmak istersiniz?");
		int arrLength = scan.nextInt();
		int arr[] = new int[arrLength];	
			System.out.println("Array elemanlar�n� giriniz");
			
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
