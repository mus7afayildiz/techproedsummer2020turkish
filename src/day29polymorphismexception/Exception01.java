package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		// Exception: Istisnai hata
		// Temelde kac tur exception var?
		// Temelde iki tur exception var; 1) Compile Time Exception (Checked)
		//                                2) Run Time Exception
		// Compile Time Exception'a ornek verebilir misiniz?
		// Tabii ki; 1)FileNotFoundException ==> Dosya bulunamadigi zaman ortaya cikar
		//           2)IOException(Input Output Exception) Input veya Output yapilirken olusan problem-
		//           lerde ortaya cikar.
		// Not: FileNotFoundException, IOException'in child'idir.
		// Not: Compile Time Exception'lar mutlaka Handle edilmelidir (Halledilmelidir)
		// Checked Exception'lar iki turlu handle edilir:
		//         1) Method isminden sonra "throws" keyword kullanilir
		//         2) try-catch block kullanilir. try-catch block kullanmak daha iyidir; cunku readable'dir.	
		
		//****************Checked exceptionlar nas�l handle edilir?**********
				// iki t�rl� yap�yoruz:
				// 1*) throws yazmak: javaya: "problem varsa yard�m iste demektir."
				// 2-)try-catch blocks. try: dene, catch= yakala demketir.
				// 3-) dene- hata c�karsa -yakala-yapamazsan-bana mesaj at. readable d�r.
				//aradaki fark: try catch �nce dener. olmazsa mesaj atar.
				//ama throw da haz�r mesajlar� ekrana atar problem hakk�nda.
				//try da ayr�nt� ve hatan�n yerini �zetleyen bir mesaj yazabilirz. bu y�zden readable dir.
		
		
		
		
		
		
		
}}