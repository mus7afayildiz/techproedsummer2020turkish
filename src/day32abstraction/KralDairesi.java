package day32abstraction;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
		KralDairesi m�steri3 = new KralDairesi();
		m�steri3.kahvalti();
		System.out.println("International Tv �creti: " + m�steri3.tv("international", 12));
		System.out.println("Wifi �creti: "+ m�steri3.wifi(11)); 
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvalt�n�z teras kat Kral Restaurant'dad�r");
		
	}
	public int tv (String international, int saat) {
		if(international.equals("international")) {
			return saat*5;
		}else {
			return 0;
		}

}
}