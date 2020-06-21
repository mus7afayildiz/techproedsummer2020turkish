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
		System.out.println(old);// Iki tane old isimli variable olmad�g�ndan
		//interface adini kullanmaya gerek yok
		luxHonda.doseme();
	}

	@Override
	public void move() {
		System.out.println("3 saniye de 100km'lik h�za ula��r");
		
	}

	@Override
	public void kapi() {
		System.out.println("Parmak izi ayarl� kapi");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Is�tmal� deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Dijital Klima");
		
	}

}
