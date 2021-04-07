package _07_Method_Creation.Çözümler;

public class Soru_03 {
    public static void main(String[] args) {
	/*
        Interview sorusu...
        Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
        (Büyük harf-küçük harf ayrımına dikkat ediniz)
        Test data:
        Input = AAABBCDD
        output = A3B2C1D2
                */
        String str="AAABBCDD";
        frekans(str);
    }
    public static void frekans(String str) {
        int count=0;
        String sonuc="";

        for (int i = 0; i < str.length(); i++) {//i : kıyas edilen harf
            for (int j = i; j < str.length(); j++) {//j : kıyas eden harf onun  için i den başlayacak
                if (str.substring(i, i+1).equals(str.substring(j, j+1))) {//charAt(i) kullanmadık çünkü .method gelmez
                    count++;
                }

            }
            if (!sonuc.contains(str.substring(i, i+1))) {//eğer kıyas edilen harf yeni str de yoksa count ile concanite et
                sonuc+=str.substring(i, i+1)+count;
            } else count=0;  // değilse count =0 olsun çünkü o harf tekrar etmiyordur.


        } System.out.println(sonuc);
    }
}
