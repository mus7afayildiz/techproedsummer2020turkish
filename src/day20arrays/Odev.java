package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		//1-
//		Kullanýcýya kaç elemanlý bir array gireceðini sorun.
//		Kullanýcýdan array’in elemanlarýný girmesini isteyin.
//		a) Bu array’in tum elemanlarýný ekrana yazdýrýn.
//		b) Bu arayýn son elemanýný ilk eleman yapýn ve tum elemanlarýný ekrana yazdýrýn.
//		Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdýrýn.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Gireceðiniz array kaç elemanlý olacak?");
//		int length = scan.nextInt();
//		
//		System.out.println("Array in elemanlarýný giriniz");
//		int arr[] = new int[length];
//		
//		for(int i=0; i<length; i++) {
//			arr[i]=scan.nextInt();
//				}
//		System.out.println(Arrays.toString(arr));
//		
//		int arrSon[] = new int[length];
//		for(int i=0; i<length-1; i++) {
//			arrSon[i+1]=arr[i];
//				}
//			arrSon[0]=arr[length-1];
//		System.out.println(Arrays.toString(arrSon));
			
			
		//2-	
//		Kullanýcýya kaç elemanlý bir array gireceðini sorun.
//		Kullanýcýdan array’in elemanlarýný girmesini isteyin.
//		a) Bu array’in icinde herhangi bir elemanýn var olup olmadigini kontrol edin.
//		b) Bu arayýn tum elemanlarýný tersten yazdýrýn.
//		Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdýrýn.	
			
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Gireceðiniz array kaç elemanlý olacak?");
//		int length = scan.nextInt();
//		
//		System.out.println("Array in elemanlarýný giriniz");
//		int arr[] = new int[length];
//		
//		for(int i=0; i<length; i++) {
//			arr[i]=scan.nextInt();			
//			}
//			Arrays.sort(arr);
//		System.out.println("Kontrol etmek istediðiniz sayýyý giriniz");
//			int num = scan.nextInt();
//		System.out.println(Arrays.binarySearch(arr, num));
//		
//		if(Arrays.binarySearch(arr, num)<0) {
//			System.out.println("Girdiðiniz deðer array de bulunmamaktadýr");
//		
//		}else {System.out.println("index "+Arrays.binarySearch(arr, num)+" de bulunmaktadýr");}
//		System.out.println("Array iniz :"+Arrays.toString(arr));
//		int arr2[]=new int[length];
//		
//		System.out.print("Array inizin tersten yazýlýþý :");
//		for(int i=length-1; i>=0; i--) {
//			arr2[i]=arr[(length-1)-i];
//			}
//		System.out.println(Arrays.toString(arr2));	
		
		
		
//		int arr[]= {2,1,7,6};
//		Arrays.sort(arr);
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");}//1,2,6,7
		
		
		
//		String str[]= {"Ali","Ahmet","Kemal","Can"};
//		Arrays.sort(str);
//		for(int i=0; i<str.length; i++) {
//			System.out.print(str[i]+" ");}//Ahmet Ali Can Kemal
		
		
		
//		int arr[]= {2,1,7,6};
//		Arrays.sort(arr);
//		System.out.println(Arrays.binarySearch(arr, 2));//1
//		System.out.println(Arrays.binarySearch(arr, 7));//3
//		System.out.println(Arrays.binarySearch(arr, 3));//-3
//		System.out.println(Arrays.binarySearch(arr, 9));//-5
//		
		
//		
//		String str[]= {"A","C","B","D"};
//		Arrays.sort(str);
//		System.out.println(Arrays.binarySearch(str, "A"));//0
//		System.out.println(Arrays.binarySearch(str, "C"));//2
//		System.out.println(Arrays.binarySearch(str, "E"));//-5
//		System.out.println(Arrays.binarySearch(str, "G"));//-5
		
		
		
//		int arr1[]= {2,1,7,6};
//		int arr2[]= {2,1,7,6};
//		System.out.println(Arrays.equals(arr1, arr2));
//		
		
//		int arr3[]= {3,2,8,7,11};
//		int arr4[]= {7,8,3,11,2};
//		System.out.println(Arrays.equals(arr3, arr4));
//		
		
//		int arr5[]= {4,5,9,8,10};
//		int arr6[]= {8,9,4,10,5};
//		Arrays.sort(arr5);
//		Arrays.sort(arr6);
//		System.out.println(Arrays.equals(arr5, arr6));
		
		
		
//		int arr[]= {10,20,30,40,50};
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(" "+arr[i]);
//		}
		
		
		
//		int arr[] = new int[2];
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		
		
//		int arr[][]=new int[4][];
//		
//		arr[0]=new int[1];
//		arr[1]=new int[2];
//		arr[2]=new int[3];
//		arr[3]=new int[4];
//		
//		int i, j, k=0;
//		for (i = 0; i < 4; i++) {
//			for (j = 0; j < i+1; j++) {
//				arr[i][j]=k;
//				k++;
//			}
//		}
//		for (i = 0; i < 4; i++) {
//			for (j = 0; j < i+1; j++) {
//				System.out.println(" "+arr[j]);
//				k++;
//		}System.out.println();
//		}
		
//		int arr1[]= {1,2,3};
//		int arr2[]= {1,2,3};
//		if(arr1==arr2) {
//			System.out.println("Same");
//		}else {
//			System.out.println("Not Same");
//		}
		
//		
//		int arr1[]= {1,2,3};
//		int arr2[]= {1,2,3};
//		if(Arrays.equals(arr1, arr2)) {
//			System.out.println("Same");
//		}else {
//			System.out.println("Not Same");
//		}
		
//		Program çalýþtýrýldýktan sonra “i” nin degeri ne olur?
		
//		int x[]= {2,1,4,5,7};
//		int limit = 3;
//		int i = 0;
//		int sum = 0;
//		while((sum<limit)&&(i<x.length)) {
//			i++;
//			sum = sum + x[i]; 
//		}
//		System.out.println(i);
		
//		Program çalýþtýrýldýktan sonra “x” in elemanlarý ne olur?
//		int[] x = {0,1,2,3};
//		int temp;
//		int i = 0;
//		int j = x.length-1;
//		while(i<j) {
//			temp = x[i];
//			x[i] = x[j];
//			x[j] = 2* temp;
//			i++;
//			j--;
//		}
//		System.out.println(Arrays.toString(x));//
		
		
//		Program çalýþtýrýldýktan sonra “count” un degeri ne olur?
//		int[] x1 = {0,1,2,3};
//		int[] x2 = {1,2,2,3};
//		
//		int i1 = 0;
//		int i2 = 0;
//		int count = 0;
//		while((i1<x1.length) && (i2<x2.length)) {
//			if(x1[i1]==x2[i2]) {
//			count++;
//			i2++;
//			}else if(x1[i1]<x2[i2]) {
//				i1++;
//			}else {
//				//x1[i1>x2[i2]]
//				i2++;
//			}
//		}System.out.println(count);
		
		
		
		
		
	}

}
