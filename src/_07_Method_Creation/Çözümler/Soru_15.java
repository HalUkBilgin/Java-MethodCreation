package _07_Method_Creation.Çözümler;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru_15 {
 /*
        Problem Tanımı :
        getSum isminde bir method oluşturun.
        Parametresi ArrayList'tir.
        Dizideki tüm $ ları kaldır ve tüm sayıları topla
        return yaptğımız veri tipi 'int' olmalıdır.
        sonuç 0'dan küçükse, -1 yazdırın.

        Örnek1:
        ArrayList = $13, $15, $20
        Cevap = 48 olmalı

        Örnek 2 :
        ArrayList= $-13, $0, $0
        Cevap = -1 olmalı.
         */


    public static void main(String[] args) {

          ArrayList<String >arrayList = new ArrayList<>(Arrays.asList("$13","$15","$20"));

        //ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("$-13", "$0", "$0"));

        System.out.println(getSum(arrayList));


    }

    public static int getSum(ArrayList<String> arrayList) {

        int sum = 0;
        for (String str : arrayList) {//for each
            String str2 = str.replace("$", "");//her bir str deki $ "" hiçliğe çevir str2 ye ata
            sum += Integer.parseInt(str2);//str2 deki elemanları int cevir ve sum a ekle
        }
        if (sum < 0) {//yukarıdaki toplam - ise -1 ver.
            return -1;
        } else {
            return sum;//değilse toplamı
        }
    }

}
