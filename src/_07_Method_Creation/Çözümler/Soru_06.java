package _07_Method_Creation.Çözümler;

public class Soru_06 {

    public static void main(String[] args) {
         /*
        Problem tanımı :
        Bir String içinde kaç kelime olduğunu yazdıran bir method yazınız.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */


        int sonuc = 0;

     sonuc = cumle("javacı arkadaşlar zehir gibi maaşallah en kısa zamanda çok bin $'lı iş bulurlar");

        System.out.println("Girilen String kelime sayısı : "+sonuc);

    }

    public static int cumle(String str) {
        int count = 0;

        char space = ' ';//bu satırı tanımlamak yerine if şartını ==' ' şeklinde de tanımlayabilirdik.

        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a) == space) {
                count ++;

            }
        }

        return count+1;//niye count+1 çünki for içinde a<str.length e kadar ama eşit değil 1 eksik verir


//
//        	   String[] words=str.split(" ");
//
//
//
//        	   return words.length;


    }

}
