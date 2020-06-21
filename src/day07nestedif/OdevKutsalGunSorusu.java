package day07nestedif;
import java.util.Scanner;
public class OdevKutsalGunSorusu {
    public static void main(String[] args) {
        // Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
        //�Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n. 
        //�Pazar� ise ekrana �H�ristiyanlar icin kutsal g�n� yazd�r�n.
        // Diger gunler icin ekrana "Kutsal gun degil" yazdirin.
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Gun giriniz"); 
        
        String gun = scan.next();
        
        if(gun.equalsIgnoreCase("Cuma")) { //equalsIgnoreCase() buyuk kucuk harf dikkate almadan esitlige bakar
                                           //equalsIgnoreCase() icin cuma = Cuma = CUMA = CuMa ayni kabul edilir.
            System.out.println("Muslumanlar icin Kutsal gun");
            
        }else if(gun.equalsIgnoreCase("Cumartesi")) {
            
            System.out.println("Yahudiler icin kutsal gun");
            
        }else if(gun.equalsIgnoreCase("Pazar")) {
            
            System.out.println("Hristiyanlar icin kutsal gun");
            
        }else {
            
            System.out.println("Kutsal gun degil");
            
        }
    }
}
