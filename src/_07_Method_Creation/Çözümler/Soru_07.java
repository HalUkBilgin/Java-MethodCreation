package _07_Method_Creation.Çözümler;

public class Soru_07 {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {

        birKereYazdir("javacılar çoook afilli çocuklar");

    }

    public static void birKereYazdir(String str) {

        String sonuc = "";  //string default değeri "" atadık çünkü işleme etki etmemeli.
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i, i + 1))) {//charAt() yapmadık?
                sonuc += str.substring(i, i + 1);
            }
        }


        System.out.println(sonuc);
    }
}
