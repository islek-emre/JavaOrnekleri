import java.util.Scanner;
public class tamSayi {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");

        // nextInt() tam sayı okunur
        int sayi = scan.nextInt();

        // println() ile ekrana yazdırılır.
        System.out.println("Girilen Sayı: " + sayi);

    }
}