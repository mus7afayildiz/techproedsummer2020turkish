package day24varargsaccessmodifiers;

public class Tekrar01 {

	public static void main(String[] args) {
		countNum(1,2,3,3,4,5,5);
		countNum(2,3,4);
		
		sumNums(2,3);
		sumNums(2,3,5,7,9,5);
		
		printName("Ahmet");
		printName("Ahmet","Ali");
		printName("Ahmet","Can");
	}

	public static void countNum (int... a) {
		System.out.println(a.length);
	}
	
	public static void sumNums (double... b) {
		double sum = 0;
		for(double w : b) {
			sum = sum+w;
			
		}
		System.out.println(sum);
	}
	
	public static void printName(String... c) {
		for(String w : c) {
			System.out.print(w+" ");
		}
	};
	
	
	
	
	
}
