package _07_Method_Creation.Sorular;

public class Soru_17 {
    /*
        Problem Tanımı :
        farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
        yazdıran parametreli method yazınız
         */

    public static void main(String[] args) {

        ortlamabul("ali", 56, 67, 78, 89, 76, 54);
        ortlamabul("ayşe", 56, 67, 76, 54);
        ortlamabul("ahmet", 56, 67, 78);
        ortlamabul("veli", 67, 78, 89, 76, 54);


    }

    public static void ortlamabul(String name, double... notlar) {

        double toplam = 0;
        for (double top : notlar) {
toplam+=top;
        }
        System.out.println(name+" "+toplam/ notlar.length);
    }


}
