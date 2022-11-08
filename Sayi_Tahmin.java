/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;import java.util.Random;
public class Sayi_Tahmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz.");
        System.out.println("Lütfen 1 ile 100 Arasınds Bir Sayı Giriniz: ");
        int sayi = input.nextInt();
        int sayi2 = rnd.nextInt(101);
        
        while(sayi != sayi2)
        {
         if(sayi < 0 || sayi > 100)
         {
          System.out.println("Lütfen 1 ile 100 Arasınds Bir Sayı Giriniz:");
          sayi = input.nextInt();
         }
         else if(sayi < sayi2)
         {
          System.out.println("Lütfen Daha Büyük Bir Sayı Giriniz: ");
          sayi = input.nextInt();
         }
         else
         {
          System.out.println("Lütfen Daha Küçük Bir Sayı Giriniz: ");  
          sayi = input.nextInt();
         }
        }
        System.out.println("Tebrikler Sayıyı Doğru Tahmin Ettiniz.");
    }
    
}
