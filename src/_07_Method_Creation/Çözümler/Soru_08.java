package _07_Method_Creation.Çözümler;

public class Soru_08 {

    public static void main(String[] args) {

 /*
    Problem Tanımı :
    int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane sayi oldugunu return eden  methodu yazdiriniz
    --> kac tane tek sayi oldugunu return eden methodu yazdiriniz
    --> kac tane cift sayi oldugunu return eden methodu yazdiriniz
    -->en buyuk sayi
    -->en kucuk sayi
    */
        int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        sayibul(array);

    }

    public static void sayibul(int[][] arr){

        int say=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                say++;
            }

        }

        System.out.println(say);
    }
}
