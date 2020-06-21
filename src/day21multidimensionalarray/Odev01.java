package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Odev01 {

	public static void main(String[] args) {
		
//		Multi Dimensional Array Sorularý
		
//		1) Aþaðýdaki multi dimensional array’in tum elemanlarýnýn çarpýmýný ekrana yazdýran bir program yazýnýz.
//	{ {1,2,3}, {4,5,6} }
		
		int arr[][]= { {1,2,3}, {4,5,6} };
		int carpým = 1;
		
	
 		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				carpým= carpým*arr[i][j];
			}
		}
 		System.out.println(carpým);
 	 		
 		
// 		2) Aþaðýdaki multi dimensional array’in iç array’lerindeki son elemanlarýn çarpýmýný ekrana yazdýran
// 		bir program yazýnýz { {1,2,3}, {4,5}, {6} }
 		
 		int arr1[][] = { {1,2,3}, {4,5}, {6} };
 		
 		int carpým1 = 1;
 		for(int i=0;i<arr1.length;i++) {
 			carpým1 = carpým1*arr1[i][arr1[i].length-1];
 		}
 		
 		System.out.println(carpým1);
 		
 		
//		3) Aþaðýdaki multi dimensional array’lerin iç array’lerinde ayný index’e sahip elemanlarýn toplamýný
// 	ekrana yazdýran bir program yazýnýz
// 	arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }Bir program yazýnýz 
		
		
		
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

 		
// 		4) Aþaðýdaki multi dimensional array’in iç array’lerindeki tum elemanlarýn toplamýný birer birer bulan
// 	ve herbir sonucu yeni bir array’in elemaný yapan ve yeni array’i ekrana yazdýran bir program yazýnýz
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
