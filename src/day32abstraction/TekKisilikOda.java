package day32abstraction;

public class TekKisilikOda extends Otel{

	public static void main(String[] args) {
		TekKisilikOda m�steri1 = new TekKisilikOda();
		m�steri1.kahvalti();
		System.out.println("Tv �creti: " + m�steri1.tv(5));
		System.out.println("Wifi �creti: " + m�steri1.wifi(1));
	}
	
	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz sandvictir");
	}
	
	public int tv(int saat) {
		return saat*2;
	}

}
