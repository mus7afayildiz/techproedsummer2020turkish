package day32abstraction;

public class AileOdasi extends Otel {

	public static void main(String[] args) {
		AileOdasi m�steri2 = new AileOdasi();
		m�steri2.kahvalti();
		System.out.println("Wifi �creti: " + m�steri2.wifi(6));
		
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvalt�n�z cafeteria da olacakt�r");		
	}

}
