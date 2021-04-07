package _07_Method_Creation.Çözümler;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_04 {
    public static void main(String[] args) {
        /*
        Problem Tanımı :
        kullanıcıdan 5 elemanlı bir dizi oluşturup tek
        elemanları 0 ile çift elemanları 1 değiştirip yazdıran bir method yazınız.
        */
        int[] dizi = new int[5];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayi giriniz = ");
            dizi[i] = scn.nextInt();
        }
        System.out.println("Önce  : " + Arrays.toString(dizi));
        System.out.println("Sonra : " + Arrays.toString(teklere0Ciftlere1Ata(dizi)));
    }

    public static int[] teklere0Ciftlere1Ata(int[] dizi) {
        // eğer dizinin elemanı tek ise 0  çift ise 1 atanıyor
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                dizi[i] = 0;   }
            else dizi[i]=1;

        }

        return dizi;
    }

}
