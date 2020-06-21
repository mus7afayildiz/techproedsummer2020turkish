package day32abstraction;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
		KralDairesi müsteri3 = new KralDairesi();
		müsteri3.kahvalti();
		System.out.println("International Tv Ücreti: " + müsteri3.tv("international", 12));
		System.out.println("Wifi Ücreti: "+ müsteri3.wifi(11)); 
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltýnýz teras kat Kral Restaurant'dadýr");
		
	}
	public int tv (String international, int saat) {
		if(international.equals("international")) {
			return saat*5;
		}else {
			return 0;
		}

}
}