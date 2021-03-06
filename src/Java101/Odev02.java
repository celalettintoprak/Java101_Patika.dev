package Java101;// Patika.dev Java 101 Ödev 2

/*
  KDV Tutarı Hesaplayan Program
  Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
  KDV tutarını hesaplayıp ekrana bastıran programı yazın.
  (Not : KDV tutarını 18% olarak alın)

  KDV'siz Fiyat = 10;
  KDV'li Fiyat = 11.8;
  KDV tutarı = 1.8;

  Ödev
  Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18,
  tutar 1000 TL'den büyük ise KDV oranını %8 olarak
  KDV tutarı hesaplayan programı yazınız.
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Odev02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir tutar giriniz: ");
        float inputDeger = input.nextFloat();

        if (inputDeger <= 1000 && inputDeger >= 0) {
            kdv18Hesapla(inputDeger);
        }
        else if (inputDeger > 1000 || inputDeger < 0) {
            kdv8Hesapla(inputDeger);
        }
        else {
            System.out.println("Lütfen geçerli bir değer giriniz.");
        }
    }

    public static void kdv8Hesapla (float kdvsiz) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("KDV'siz Fiyat = " + df.format(kdvsiz));
        System.out.println("KDV'li Fiyat = " + (float) Math.round(kdvsiz * 100.0) / 100.0 * 1.08);
        System.out.println("KDV Tutarı = " + df.format(kdvsiz * 0.08));
    }

    public static void kdv18Hesapla (float kdvsiz) {
        String decimalFormat = "%.2f";
        System.out.println("KDV'siz Fiyat = " + String.format(decimalFormat, kdvsiz));
        System.out.print("KDV'li Fiyat = ");
        System.out.format(decimalFormat, kdvsiz * 1.18);
        System.out.println("\n" + "KDV Tutarı = " + String.format(decimalFormat, kdvsiz * 0.18));
    }
}