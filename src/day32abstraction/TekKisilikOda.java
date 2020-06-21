package day32abstraction;

public class TekKisilikOda extends Otel{

	public static void main(String[] args) {
		TekKisilikOda müsteri1 = new TekKisilikOda();
		müsteri1.kahvalti();
		System.out.println("Tv Ücreti: " + müsteri1.tv(5));
		System.out.println("Wifi Ücreti: " + müsteri1.wifi(1));
	}
	
	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz sandvictir");
	}
	
	public int tv(int saat) {
		return saat*2;
	}

}
