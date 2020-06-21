package day17constructors;

public class Constructors02 {

	
	//buyume() methodu bu class'da degil Constructors01 class'inda. 
	//O yuzden Java kullanmama musaade etmiyor.
	//Eger siz baska bir class'daki methodu kullanmak istiyorsaniz o class'dan bir tane object
	//olusturup o object sayesinde istediginiz methodu kullanabilirsiniz.
	
	public static void main(String[] args) {
		
		Constructors01 obj1 = new Constructors01();
		
		//buyume() methodu static oldugundan Java object kullanarak buyume() methodunu
		//cagirmamizi istemez ve kodun altini sari renkle cizer.
		obj1.buyume(33);
		Constructors01.buyume(45);//46
		//isimDegistir() methodu static oldugundan Java object kullanarak isimDegistir() methodunu
		//cagirmamizi istemez ve kodun altini sari renkle cizer.
		obj1.isimDegistir("Kemal Can");
		Constructors01.isimDegistir("Merhaba Naci");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		
		//Bir variable veya method static olarak olusturulmussa, o variable veya methods
		//object olusturmadan sadece class ismini kullanarak ulasabilirsiniz.
		System.out.println(Constructors03.ad);//Ali Can
		System.out.println(Constructors03.kilo);//33
		Constructors03.artirma(45);//46
		Constructors03.degistirme("Merhaba Naci");//Merhaba Naci
	}
}