package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Odev01 {

	public static void main(String[] args) {
		
//		Multi Dimensional Array Sorular�
		
//		1) A�a��daki multi dimensional array�in tum elemanlar�n�n �arp�m�n� ekrana yazd�ran bir program yaz�n�z.
//	{ {1,2,3}, {4,5,6} }
		
		int arr[][]= { {1,2,3}, {4,5,6} };
		int carp�m = 1;
		
	
 		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				carp�m= carp�m*arr[i][j];
			}
		}
 		System.out.println(carp�m);
 	 		
 		
// 		2) A�a��daki multi dimensional array�in i� array�lerindeki son elemanlar�n �arp�m�n� ekrana yazd�ran
// 		bir program yaz�n�z { {1,2,3}, {4,5}, {6} }
 		
 		int arr1[][] = { {1,2,3}, {4,5}, {6} };
 		
 		int carp�m1 = 1;
 		for(int i=0;i<arr1.length;i++) {
 			carp�m1 = carp�m1*arr1[i][arr1[i].length-1];
 		}
 		
 		System.out.println(carp�m1);
 		
 		
//		3) A�a��daki multi dimensional array�lerin i� array�lerinde ayn� index�e sahip elemanlar�n toplam�n�
// 	ekrana yazd�ran bir program yaz�n�z
// 	arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }Bir program yaz�n�z 
		
		
		
		int arr2 [][] = { {1,2}, {3,4,5}, {6} };
		int arr3 [][] = { {7,8,9}, {10,11}, {12} };
		int sum3= 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					for (int l = 0; l < arr3[k].length; l++) {
						if (i==k && j==l) {
							sum3 = sum3 + arr2[i][j] + arr3[k][l];
		}		}		}		}		}
		System.out.println(sum3); 

 		
// 		4) A�a��daki multi dimensional array�in i� array�lerindeki tum elemanlar�n toplam�n� birer birer bulan
// 	ve herbir sonucu yeni bir array�in eleman� yapan ve yeni array�i ekrana yazd�ran bir program yaz�n�z
// 	{ {1,2,3}, {4,5}, {6,7} }
// 	Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

		int arr4[][] = { {1,2,3}, {4,5}, {6,7} };
		int sum4=0;
		int sum5=0;
		int sum6=0;
		
			for(int j=0; j<arr4[0].length; j++) {
				sum4 = sum4 + arr4[0][j];
			}
			System.out.println(sum4);
			
			for(int j=0; j<arr4[1].length; j++) {
				sum5 = sum5 + arr4[1][j];
			}
			System.out.println(sum5);
			
			for(int j=0; j<arr4[2].length; j++) {
				sum6 = sum6 + arr4[2][j];
			}
			System.out.println(sum6);
		
		int arrSon1[] = {sum4,sum5,sum6};	
		
		System.out.println(Arrays.toString(arrSon1));
		
	}

}
