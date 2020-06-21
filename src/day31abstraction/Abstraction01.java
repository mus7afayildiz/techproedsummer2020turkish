package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		
		//öðrenci notu:
//      class abstract olunca obje uretmez.
		
//	method abstract olunca body si olmaz.
	
//	concrete class ýn icine abstract method konmaz,sadece concrete konur.
//	abstract class ýn içine iki tür method da konur
	
//	abstarct methoda body koymaya calýsýrsam CompiletimeError
//	concrete methoda body koymazsam CompiletimeError.
	
//abstract class ýn cocugu olur bu cocuk concrete da olur abstract da
//ama child i concrete yaparsak parentte abstract olan metodlari child içinden override
//	edip body koymak zorundayýz, yani concrete yapmak zorundayýz..
//	bunun bir faydasý var parentdaki abstract methodu almak zorunda kalýyoruz her child da.
//	mesela bir kural getirdin abstract methoda koydun. bunu mecbur her child override etmek için çaðýracak
		
		
	}
	// Abstract class'lardan obje uretilemez.
			// Constractor'lari yoktur.
			// Abstract class'lar concrete(body'li) ve abstract(body'siz) methodlar
			// icerebilir.
			// Abstract class'larin hem concrete class hem de abstract class olan
			// child'lari olabilir.
			// ==> Abstract class'in child'i concrete class ise Abstract class'daki
			// abstract method'lari mutlaka override etmeli ve onlara body eklemelidir.
			//     ==> Bunun faydasi sudur; Child class'larda mecburen olmasi gereken 
			//         methodlari bu sekilde belirlemis oluruz.
			// Abstract class'in child'i abstract class ise Abstract class'daki
			// herhangi bir seyi override etmek zorunda degildir.
		
		
		public void concreteMethod() {
			System.out.println("Ben concrete'im");
		}
		
		public abstract void abstractMethod();
}
