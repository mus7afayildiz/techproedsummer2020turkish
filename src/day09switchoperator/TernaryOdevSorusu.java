package day09switchoperator;
import java.util.Scanner;
public class TernaryOdevSorusu {
    public static void main(String[] args) {
        // Kullan�c�dan bir pozitif tamsay� girmesini isteyin, o pozitif tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
        // 3 basamakl� degilse �ift olup olmadigini kontrol edin. �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
        // �ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Sayi giriniz");
        int num = scan.nextInt();
        
        //3 basamakli pozitif olma 9 dan buyuk 1000 den kucuk olmaktir.
        
        String result = (num>99 && num<1000) ? ("3 basamakli") : (num%2==0 ? "3 basamakl� olmayan �ift say�" : "3 basamakl� olmayan tek say�");
        System.out.println(result);     
        
    }
}
