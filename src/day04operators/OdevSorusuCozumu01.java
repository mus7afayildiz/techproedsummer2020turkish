package day04operators;
import java.util.Scanner;
public class OdevSorusuCozumu01 {
    public static void main(String[] args) {
        
        //Kullanicidan Integer aldiktan sonra String alamiyoruz.
        
        Scanner scan = new Scanner(System.in);
        
        //Java'da nextInt() kullandiktan sonra nextLine() kullanirsak kod calismiyor.
        //nextInt() yerine nextLine() kullan sonra elde ettigin String'i
        //Integer.parseInt()kullanarak integer'a cevir.
        
        /*System.out.println("Yasinizi giriniz");
        String yas = scan.nextLine();
        int yeniYas = Integer.parseInt(yas);//String;i tamsayiya cevirme metodu
                                            //Integer.parseInt() sadece rakam iceren Stringler icin calisir.
        System.out.println(yeniYas + 1); //34
        
        System.out.println("Adinizi ve soyadinizi giriniz");
        String isim = scan.nextLine();  
        System.out.println(isim);*/
        
       System.out.println("ya��n�z� giriniz");
       String ya� = scan.nextLine();
       int yya� = Integer.parseInt(ya�);
       System.out.println(yya�+1);
       System.out.println("ad�n�z� giriniz");
       String ad = scan.nextLine();
       System.out.println(ad);
       
       
      
        
        
        
    }
}
