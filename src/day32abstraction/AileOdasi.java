package day32abstraction;

public class AileOdasi extends Otel {

	public static void main(String[] args) {
		AileOdasi müsteri2 = new AileOdasi();
		müsteri2.kahvalti();
		System.out.println("Wifi Ücreti: " + müsteri2.wifi(6));
		
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltýnýz cafeteria da olacaktýr");		
	}

}
