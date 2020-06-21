package day33interface;

public class LuxHonda extends Araba implements IcAraba, DisAraba{

	public static void main(String[] args) {
		LuxHonda luxHonda = new LuxHonda();
		luxHonda.benzin();
		luxHonda.direksiyon();
		luxHonda.kapi();
		luxHonda.klima();
		luxHonda.koltuk();
		luxHonda.move();
		System.out.println("Ic Araba Interface'inden price: " + IcAraba.price);
		System.out.println("Dis Araba Interface'inden price: " + DisAraba.price);
		System.out.println(old);// Iki tane old isimli variable olmadýgýndan
		//interface adini kullanmaya gerek yok
		luxHonda.doseme();
	}

	@Override
	public void move() {
		System.out.println("3 saniye de 100km'lik hýza ulaþýr");
		
	}

	@Override
	public void kapi() {
		System.out.println("Parmak izi ayarlý kapi");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Isýtmalý deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Dijital Klima");
		
	}

}
