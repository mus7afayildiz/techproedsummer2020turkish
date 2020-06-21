package day16overloading;

public class Tekrar01 {
	
//	int price = 20000;
//	int year = 2020;
//	String make = "Honda";
//	String Type = "Civic";	
	
	
	String name = "Ali Can";
	int years = 28;
	int boy = 175;
	String meslek = "Tester";
	int maaþ = 5000;
	boolean emekli = false;
	
	
	Tekrar01 (String name, int years, int boy){
	this.name = name;
	this.years = years;
	this.boy = boy;
	}
	public static void main(String[] args) {
//		Tekrar araba = new Tekrar();
//		System.out.println("price :"+araba.price);
//		System.out.println("year :"+araba.year);
//		System.out.println("make :"+araba.make);
//		System.out.println("Type :"+araba.Type);
//
//		System.out.println("price :"+(araba.price+100));
//		System.out.println("year :"+(araba.year-1));
//		System.out.println("make :"+araba.make.replace("Honda", "Toyota"));
//		System.out.println("Type :"+araba.Type.replace("Civic","Camry"));
		

		Tekrar01 human01 = new Tekrar01("ahmet yýlmaz", 32, 185 );
		System.out.println(human01.name);
		System.out.println(human01.years);
		System.out.println(human01.boy);
		System.out.println(human01.emekli);
		
	}

}
