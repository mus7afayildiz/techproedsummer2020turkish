package day17constructors;

public class Constructors05 {

	public static void main(String[] args) {
		
		Constructors04 obj1 = new Constructors04();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);//num2 static oldugundan object kullanarak cagirmami Java istemiyor.
		System.out.println(Constructors04.num2);//Class ismi ile cagirmami Java guzel karsiladi.
		
//		kural 1: static ise method ve variable larý class ismiyle cagýrabiliriz
//		kural 2: static medholarda static olmayan variable kullanýlmaz.
//		kural 3: class daki bir variable staticse o variable da yapýlan degisim butun objelerde gecerlidir.(gokdeki ay gibi)
	}

}
